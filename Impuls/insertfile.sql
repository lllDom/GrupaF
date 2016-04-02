-- Inserty
-- Tabela : Dane_osobowe
-- INSERT 1
INSERT INTO Dane_osobowe VALUES(
	1, -- id_dana_osobowa
	'user1', -- login
	'pass1', -- haslo
	'Wojciech', -- imie
	'Kasprzak', -- nazwisko
	null, -- nazwa firmy
	'0700844999'
);

-- INSERT 2
INSERT INTO Dane_osobowe VALUES(
	2, -- id_dana_osobowa
	'user2', -- login
	'pass2', -- haslo
	'Wojciech', -- imie
	'Gilarski', -- nazwisko
	null, -- nazwa firmy
	'0700844998'
);

-- INSERT 3
INSERT INTO Dane_osobowe VALUES(
	3, -- id_dana_osobowa
	'user3', -- login
	'pass3', -- haslo
	'Mateusz', -- imie
	'Kopko', -- nazwisko
	null, -- nazwa firmy
	'0700844997'
);

-- INSERT 4
INSERT INTO Dane_osobowe VALUES(
	4, -- id_dana_osobowa
	'user4', -- login
	'pass4', -- haslo
	'Dominik', -- imie
	'Kopaczek', -- nazwisko
	null, -- nazwa firmy
	'070084496'
);

-- INSERT 5
INSERT INTO Dane_osobowe VALUES(
	5, -- id_dana_osobowa
	'user5', -- login
	'pass5', -- haslo
	'Adrian', -- imie
	'Kruba', -- nazwisko
	null, -- nazwa firmy
	'070084495'
);

-- INSERT 6
INSERT INTO Dane_osobowe VALUES(
	6, -- id_dana_osobowa
	'user6', -- login
	'pass6', -- haslo
	'Jan', -- imie
	'Kowaski', -- nazwisko
	null, -- nazwa firmy
	'070084494'
);

-- INSERT 7
INSERT INTO Dane_osobowe VALUES(
	7, -- id_dana_osobowa
	'user7', -- login
	'pass7', -- haslo
	'Jaroslaw', -- imie
	'Kaczynski', -- nazwisko
	null, -- nazwa firmy
	'070084493'
);

-- INSERT 8
INSERT INTO Dane_osobowe VALUES(
	8, -- id_dana_osobowa
	'user8', -- login
	'pass8', -- haslo
	'Andzej', -- imie
	'Duda', -- nazwisko
	null, -- nazwa firmy
	'070084492'
);

-- Tabela : Admin
-- INSERT 1
INSERT INTO Admin VALUES(
	1, -- id_admina
	1 -- id_dana_osobowa
);

-- INSERT 2
INSERT INTO Admin VALUES(
	2, -- id_admina
	2 -- id_dana_osobowa
);

-- Tabela : Klienci
-- INSERT 1
INSERT INTO Klienci VALUES(
	1, -- id_klienta
	3 -- id_dana_osobowa
);

-- INSERT 2
INSERT INTO Klienci VALUES(
	2, -- id_klienta
	4 -- id_dana_osobowa
);

-- Tabela : Pracownicy
-- INSERT 1
INSERT INTO Pracownicy VALUES(
	1, -- id_pracownika
	5 -- id_dana_osobowa
);

-- INSERT 2
INSERT INTO Pracownicy VALUES(
	2, -- id_pracownika
	6 -- id_dana_osobowa
);

-- Tabela : Szefowie
-- INSERT 1
INSERT INTO Szefowie VALUES(
	1, --id_szefa
	7 -- id_dana_osobowa
);

-- INSERT 2
INSERT INTO Szefowie VALUES(
	2, --id_szefa
	8 -- id_dana_osobowa
);

-- Tabela : Zlecenia
-- INSERT 1
INSERT INTO Zlecenia VALUES (
	1, -- id_zlecenia
	1, -- id_pracownika
	1, -- id_szefa
	1, -- id_klienta
	'Instalowanie systemu', -- nazwa zlecenia
	'Standardowe instalowanie systemu opeacyjnego', -- opis_zlecenia
	'NOWE', -- status
	CURRENT_DATE, -- data_przyjecia_zlecenia
	date '2016-04-01' + interval '24 hour', -- data_rozpoczecia
	interval '30 day' -- czas_na_zrealizowanie
);

-- INSERT 2
INSERT INTO Zlecenia VALUES (
	2, -- id_zlecenia
	2, -- id_pracownika
	2, -- id_szefa
	2, -- id_klienta
	'Formatowanie kompa', -- nazwa zlecenia
	'Formatowanie kompa standard', -- opis_zlecenia
	'NOWE', -- status
	CURRENT_DATE, -- data_przyjecia_zlecenia
	date '2016-03-31' + interval '24 hour', -- data_rozpoczecia
	interval '30 day' -- czas_na_zrealizowanie
);
