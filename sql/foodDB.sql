CREATE SCHEMA IF NOT EXISTS fooddb;

SET search_path TO fooddb;

CREATE TABLE indirizzo(
    nomeVia VARCHAR(32),
    numeroCivico Integer,
    CAP CHAR(5),
    citta VARCHAR(64),
    provincia CHAR(2),
    codiceIndirizzo SERIAL PRIMARY KEY
);

CREATE TABLE utente(
    nome VARCHAR(32),
    cognome VARCHAR(32),
    email VARCHAR(64) PRIMARY KEY,
    password VARCHAR(32),
    numeroTelefono CHAR(10),
    codiceIndirizzo SERIAL NOT NULL,
    CONSTRAINT fk_indirizzo
    FOREIGN KEY (codiceIndirizzo) REFERENCES indirizzo(codiceIndirizzo)
    ON UPDATE CASCADE
    ON DELETE RESTRICT
);

CREATE TABLE ristorante(
    nome VARCHAR(32),
    descrizione VARCHAR(512),
    numeroTelefono CHAR(10),
    codiceRistorante SERIAL PRIMARY KEY,
    codiceIndirizzo SERIAL NOT NULL,  
    CONSTRAINT fk_indirizzo
    FOREIGN KEY (codiceIndirizzo) REFERENCES indirizzo(codiceIndirizzo)
    ON UPDATE CASCADE
    ON DELETE RESTRICT
);

CREATE TYPE TIPO_PRODOTTO AS ENUM('bevanda', 'cibo');
CREATE TYPE CATEGORIA_PRODOTTO AS ENUM('alcolico', 'analcolico', 'antipasti', 'primi', 'secondi', 'contorni', 'dolci');

CREATE TABLE prodotto(
    nome VARCHAR(32),
    prezzo REAL,
    codiceSeriale SERIAL PRIMARY KEY,
    scadenza DATE,
    pathFoto VARCHAR(64),
    tipoProdotto TIPO_PRODOTTO NOT NULL,
    categoria CATEGORIA_PRODOTTO NOT NULL
);

CREATE TABLE fornitura(
    quantitaProdotto INTEGER NOT NULL CHECK (quantitaProdotto > 0),
    codiceSeriale SERIAL ,
    codiceRistorante SERIAL ,
    PRIMARY KEY (codiceSeriale, codiceRistorante),
    CONSTRAINT fk_prodotto
    FOREIGN KEY (codiceSeriale) REFERENCES prodotto(codiceSeriale)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

CREATE TABLE rider(
    nome VARCHAR(32),
    cognome VARCHAR(32),
    biografia VARCHAR(512),
    pathFoto VARCHAR(64),
    codiceRider SERIAL PRIMARY KEY
);

CREATE TYPE TIPO_VEICOLO AS ENUM ('moto', 'bicicletta');

-- aggiungi descrizione per codiceSeriale
CREATE TABLE veicolo(
    codiceSeriale SERIAL PRIMARY KEY,
    annoImmatricolazione DATE,
    marca VARCHAR(32),
    modello VARCHAR(32),
    tipoVeicolo TIPO_VEICOLO NOT NULL,
    codiceRider SERIAL NOT NULL,
    CONSTRAINT fk_rider FOREIGN KEY(codiceRider) REFERENCES rider(codiceRider)
    ON UPDATE CASCADE
    ON DELETE CASCADE
);

CREATE TABLE corrierePer(
    codiceRistorante SERIAL,
    codiceRider SERIAL,
    CONSTRAINT pk_corriere PRIMARY KEY(codiceRider, codiceRistorante),
    CONSTRAINT fk_rider FOREIGN KEY(codiceRider) REFERENCES rider(codiceRider)
    ON UPDATE CASCADE
    ON DELETE CASCADE,
    CONSTRAINT fk_ristorante FOREIGN KEY(codiceRistorante) REFERENCES ristorante(codiceRistorante)
    ON UPDATE CASCADE
    ON DELETE CASCADE
);

CREATE TABLE carrello(
    data DATE NOT NULL,
    codiceCarrello SERIAL PRIMARY KEY
); 

CREATE TABLE composizioneCarrello(
    codiceCarrello SERIAL,
    codiceSeriale SERIAL,
    quantita INTEGER CHECK(quantita IS NOT NULL AND quantita > 0),
    CONSTRAINT pk_composizioneCarrello PRIMARY KEY(codiceSeriale, codiceCarrello),
    CONSTRAINT fk_prodotto FOREIGN KEY(codiceSeriale) REFERENCES prodotto(codiceSeriale)
    ON UPDATE CASCADE
    ON DELETE CASCADE,
    CONSTRAINT fk_carrello FOREIGN KEY(codiceCarrello) REFERENCES carrello(codiceCarrello)
    ON UPDATE CASCADE
    ON DELETE CASCADE
);

CREATE TABLE ordine(
    codiceCarrello SERIAL,
    email VARCHAR(64),
    codiceRistorante SERIAL,
    codiceRider SERIAL,
    PRIMARY KEY(codiceCarrello, email, codiceRistorante, codiceRider),
    CONSTRAINT fk_carrello FOREIGN KEY(codiceCarrello) REFERENCES carrello(codiceCarrello)
    ON UPDATE CASCADE
    ON DELETE CASCADE,
    CONSTRAINT fk_utente FOREIGN KEY(email) REFERENCES utente(email)
    ON UPDATE CASCADE
    ON DELETE CASCADE,
    CONSTRAINT fk_rider FOREIGN KEY(codiceRider) REFERENCES rider(codiceRider)
    ON UPDATE CASCADE
    ON DELETE CASCADE,
    CONSTRAINT fk_ristorante FOREIGN KEY(codiceRistorante) REFERENCES ristorante(codiceRistorante)
    ON UPDATE CASCADE
    ON DELETE CASCADE
);

CREATE VIEW riderVeicoloView AS 
SELECT R.codiceRider, V.tipoVeicolo
FROM rider AS R NATURAL JOIN veicolo AS V;