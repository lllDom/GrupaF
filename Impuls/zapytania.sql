-- Modul admin
-- Wyciag login gdy haslo sie zgadza
SELECT login FROM Dane_osobowe JOIN Admin USING (id_dana_osobowa) WHERE haslo = '?';
-- Wyciagamy haslo gdy login sie zgadza
SELECT haslo FROM Dane_osobowe JOIN Admin USING (id_dana_osobowa) WHERE login = '?';
-- Wyciagamy login i haslo gdy zgadzaja sie oba parametry
SELECT login, haslo FROM Dane_osobowe JOIN Admin USING (id_dana_osobowa) WHERE login = '?' AND haslo = '?';

-- Modul Szefowie / Kierwonik
-- Wyciagamy login gdy znane jest haslo
SELECT login FROM Dane_osobowe JOIN Szefowie USING (id_dana_osobowa) WHERE haslo = '?';
-- Wyciagnij haslo gdy masz podany login
SELECT haslo FROM Dane_osobowe JOIN Szefowie USING (id_dana_osobowa) WHERE login = '?';
-- Wyciagnij login i haslo podane na starcie
SELECT login, haslo FROM Dane_osobowe JOIN Szefowie USING (id_dana_osobowa) WHERE login = '?' AND haslo = '?';
-- Tabela zamowienia gdzie wyciagamy zamwienia nalezace do pracownikow szefa i danego szefa
SELECT id_zlecenia, id_klienta, nazwa_zlecenia, opis_zlecenia, data_przyjecia_zlecenia, czas_na_realizacje
FROM Dane_osobowe 
JOIN Szefowie USING (id_dana_osobowa)
JOIN Zlecenia USING (id_szefa)
JOIN Pracownicy USING (id_pracownika)
WHERE login = '?';

-- Zamowienia
-- Wyciaganie wszystkich zamowien
SELECT id_zlecenia, id_klienta, nazwa_zlecenia, opis_zlecenia, data_przyjecia_zlecenia, czas_na_realizacje FROM Zamowienia;
-- Dodanie zamowienia
INSERT INTO Zlecenia(id_pracownika, id_szefa, id_klienta, nazwa_zlecenia, opis_zlecenia, status, data_przyjecia_zlecenia,czas_na_realizacje) VALUES (id_pracownika, id_szefa, id_klienta, nazwa_zlecenia, opis_zlecenia, status, data_przyjecia_zlecenia,czas_na_realizacje);
-- Usuwanie Zlecenia o zadanym id
DELETE FROM Zlecenia WHERE id_zlecenia = '';
-- Edytuj zamowienia
UPDATE Zamowienia SET nazwa_zlecenia = '', czas_na_realizacje = '' , opis_zlecenia = '';


