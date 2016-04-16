-- Modul admin
-- Wyciag login gdy haslo sie zgadza
SELECT login FROM Dane_osobowe JOIN Admin USING (id_dana_osobowa) WHERE haslo = '?';
-- Wyciagamy haslo gdy login sie zgadza
SELECT haslo FROM Dane_osobowe JOIN Admin USING (id_dana_osobowa) WHERE login = '?';
-- Wyciagamy login i haslo gdy zgadzaja sie oba parametry
SELECT login, haslo FROM Dane_osobowe JOIN Admin USING (id_dana_osobowa) WHERE login = '?' AND haslo = '?';

-- Modul Szefowie
-- Wyciagamy login gdy znane jest haslo
SELECT login FROM Dane_osobowe JOIN Szefowie USING (id_dana_osobowa) WHERE haslo = '?';
-- Wyciagnij haslo gdy masz podany login
SELECT haslo FROM Dane_osobowe JOIN Szefowie USING (id_dana_osobowa) WHERE login = '?';
-- Wyciagnij login i haslo podane na starcie
SELECT login, haslo FROM Dane_osobowe JOIN Szefowie USING (id_dana_osobowa) WHERE login = '?' AND haslo = '';


