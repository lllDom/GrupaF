-- Table: Admin
CREATE TABLE Admin (
    id_admina int  NOT NULL,
    id_dana_osobowa int  NOT NULL,
    CONSTRAINT Admin_pk PRIMARY KEY (id_admina)
);



-- Table: Dane_osobowe
CREATE TABLE Dane_osobowe (
    id_dana_osobowa int  NOT NULL,
    login varchar(12)  NULL,
    haslo varchar(12)  NULL,
    imie varchar(20)  NULL,
    nazwisko varchar(25)  NULL,
    nazwa_firmy varchar(30)  NULL,
    numer_telefonu varchar(11)  NULL,
    CONSTRAINT Dane_osobowe_pk PRIMARY KEY (id_dana_osobowa)
);



-- Table: Historia_zlecen
CREATE TABLE Historia_zlecen (
    id_zlecenia int  NOT NULL,
    id_pracownika int  NOT NULL,
    id_szefa int  NOT NULL,
    id_klienta int  NOT NULL,
    nazwa_zlecenia varchar(20)  NOT NULL,
    opis_zlecenia varchar(250)  NOT NULL,
    status varchar(15)  NOT NULL,
    data_przyjecia_zlecenia date  NOT NULL,
    data_rozpoczenia timestamp  NOT NULL,
    data_zakonczenia timestamp  NOT NULL,
    czas_realizacji interval  NOT NULL,
    uwagi varchar(250)  NOT NULL,
    CONSTRAINT Historia_zlecen_pk PRIMARY KEY (id_zlecenia,id_pracownika,id_szefa,id_klienta)
);



-- Table: Klienci
CREATE TABLE Klienci (
    id_klienta int  NOT NULL,
    id_dana_osobowa int  NOT NULL,
    CONSTRAINT Klienci_pk PRIMARY KEY (id_klienta)
);



-- Table: Pracownicy
CREATE TABLE Pracownicy (
    id_pracownika int  NOT NULL,
    id_dana_osobowa int  NOT NULL,
    CONSTRAINT Pracownicy_pk PRIMARY KEY (id_pracownika)
);



-- Table: Szefowie
CREATE TABLE Szefowie (
    id_szefa int  NOT NULL,
    id_dana_osobowa int  NOT NULL,
    CONSTRAINT Szefowie_pk PRIMARY KEY (id_szefa)
);



-- Table: Zlecenia
CREATE TABLE Zlecenia (
    id_zlecenia int  NOT NULL,
    id_pracownika int  NOT NULL,
    id_szefa int  NOT NULL,
    id_klienta int  NOT NULL,
    nazwa_zlecenia varchar(20)  NOT NULL,
    opis_zlecenia varchar(250)  NOT NULL,
    status varchar(15)  NOT NULL,
    data_przyjecia_zlecenia date  NOT NULL,
    data_rozpoczenia timestamp  NULL,
    czas_na_realizacje interval  NOT NULL,
    CONSTRAINT Zlecenia_pk PRIMARY KEY (id_zlecenia)
);

-- foreign keys
-- Reference:  Admin_Dane_osobowe (table: Admin)

ALTER TABLE Admin ADD CONSTRAINT Admin_Dane_osobowe
    FOREIGN KEY (id_dana_osobowa)
    REFERENCES Dane_osobowe (id_dana_osobowa)
    NOT DEFERRABLE
    INITIALLY IMMEDIATE
;

-- Reference:  Klienci_Dane_osobowe (table: Klienci)

ALTER TABLE Klienci ADD CONSTRAINT Klienci_Dane_osobowe
    FOREIGN KEY (id_dana_osobowa)
    REFERENCES Dane_osobowe (id_dana_osobowa)
    NOT DEFERRABLE
    INITIALLY IMMEDIATE
;

-- Reference:  Pracownicy_Dane_osobowe (table: Pracownicy)

ALTER TABLE Pracownicy ADD CONSTRAINT Pracownicy_Dane_osobowe
    FOREIGN KEY (id_dana_osobowa)
    REFERENCES Dane_osobowe (id_dana_osobowa)
    NOT DEFERRABLE
    INITIALLY IMMEDIATE
;

-- Reference:  Szefowie_Dane_osobowe (table: Szefowie)

ALTER TABLE Szefowie ADD CONSTRAINT Szefowie_Dane_osobowe
    FOREIGN KEY (id_dana_osobowa)
    REFERENCES Dane_osobowe (id_dana_osobowa)
    NOT DEFERRABLE
    INITIALLY IMMEDIATE
;

-- Reference:  Zlecenia_Klienci (table: Zlecenia)

ALTER TABLE Zlecenia ADD CONSTRAINT Zlecenia_Klienci
    FOREIGN KEY (id_klienta)
    REFERENCES Klienci (id_klienta)
    NOT DEFERRABLE
    INITIALLY IMMEDIATE
;

-- Reference:  Zlecenia_Pracownicy (table: Zlecenia)

ALTER TABLE Zlecenia ADD CONSTRAINT Zlecenia_Pracownicy
    FOREIGN KEY (id_pracownika)
    REFERENCES Pracownicy (id_pracownika)
    NOT DEFERRABLE
    INITIALLY IMMEDIATE
;

-- Reference:  Zlecenia_Szefowie (table: Zlecenia)

ALTER TABLE Zlecenia ADD CONSTRAINT Zlecenia_Szefowie
    FOREIGN KEY (id_szefa)
    REFERENCES Szefowie (id_szefa)
    NOT DEFERRABLE
    INITIALLY IMMEDIATE
;
