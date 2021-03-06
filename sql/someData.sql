SET search_path TO fooddb;

INSERT INTO indirizzo(nomeVia, numeroCivico, CAP, citta, provincia) VALUES
('coolstreet', 3, '84012', 'coolcity', 'SA'),
('dundermifflin', 9, '18512', 'scranton', 'US'),
('nazionale', 29, '84070', 'sangiovanniapiro', 'SA'),
('leopardi', 24, '80125', 'napoli', 'NA'),
('claudio', 21, '80125', 'napoli', 'NA'),
('sucuzzone', 34, '71420', 'maratea', 'PZ'),
('answer', 42, '50003', 'question', 'EN'),
('guercet', 33, '57129', 'vallais', 'CH');

INSERT INTO utente(nome, cognome, email, password, numeroTelefono, codiceIndirizzo) VALUES
('antonio', 'petrillo', 'fakemail@domain.com', 'securepassword', '3333337890', 4),
('michael', 'scoot', 'bestboss@ever.com', 'password', '1231234567', 3),
('dwight', 'schrute', 'assistanttothe@regionalmanager.com', 'beetsfarmer', '4454356760', 3),
('arthur', 'dent', 'dont@panic.com', 'dontpanic', '3456783331', 8),
('achille', 'tartaruga', 'geb@egb.com', 'granchio', '3333333333', 2),
('prof', 'dieti', 'ti@boccio.com', 'forseno', '1231233210', 6),
('isaac', 'asimov', 'sci@fi.com', 'fondazione', '7345689231', 2),
('puja', 'suez', 'papa@pujaz', 'sgap', '4572891206', 4),
('jorge', 'borges', 'book@ofsand.com', 'aleph', '0123456789', 5),
('gregor', 'samsa', 'blatta@vendor.com', 'password', '2344327896', 7);

INSERT INTO prodotto(nome, prezzo, scadenza, pathFoto, tipoProdotto, categoria) VALUES
('margherita', 3.50, '2021-05-23', '/', 'cibo', 'primi'),
('diavola', 4.50, '2021-04-09', '/', 'cibo', 'primi'),
('bianca', 3.00, '2021-04-25', '/', 'cibo', 'primi'),
('spaghetti', 5.00, '2021-04-16', '/', 'cibo', 'primi'),
('fiorentina', 30.00, '2021-03-31', '/', 'cibo', 'secondi'),
('filetto', 35.00, '2021-03-28', '/', 'cibo', 'secondi'),
('tbone', 27.00, '2021-03-30', '/', 'cibo', 'secondi'),
('salmone', 25.00, '2021-03-24', '/', 'cibo', 'secondi'),
('tonno', 26.00, '2021-03-22', '/', 'cibo', 'secondi'),
('falafel', 15.00, '2021-04-18', '/', 'cibo', 'secondi'),
('nuggets', 7.00, '2022-02-13', '/', 'cibo', 'secondi'),
('insalata', 3.00, '2021-03-13', '/', 'cibo', 'contorni'),
('patatine', 4.00, '2021-06-21', '/', 'cibo', 'contorni'),
('pomodori', 3.00, '2021-03-13', '/', 'cibo', 'contorni'),
('zeppole', 5.00, '2021-03-13', '/', 'cibo', 'dolci'),
('torta', 7.00, '2021-03-17', '/', 'cibo', 'dolci'), 
('panettone', 4.50, '2021-03-19', '/', 'cibo', 'dolci'), 
('mare', 7.00, '2021-03-14', '/', 'cibo', 'antipasti'), 
('monti', 6.50, '2021-03-17', '/', 'cibo', 'antipasti'), 
('mare-monti', 10.00, '2021-03-14', '/', 'cibo', 'antipasti'),
('vegano', 6.00, '2021-06-25', '/', 'cibo', 'antipasti'),
('acqua', 1.00, '2028-01-01', '/', 'bevanda', 'analcolico'),
('coca', 2.00, '2022-09-20', '/', 'bevanda', 'analcolico'),
('aranciata', 2.00, '2022-10-27', '/', 'bevanda', 'analcolico'),
('gassosa', 2.00, '2022-08-14', '/', 'bevanda', 'analcolico'),
('succo-frutta', 2.50, '2021-05-20', '/', 'bevanda', 'analcolico'),
('birra', 1.50, '2021-12-25', '/', 'bevanda', 'alcolico'),
('vino-rosso', 2.50, '2021-09-25', '/', 'bevanda', 'alcolico'),
('vino-bianco', 3.50, '2021-07-10', '/', 'bevanda', 'alcolico'),
('mojito', 4.00, '2021-11-03', '/', 'bevanda', 'alcolico');

INSERT INTO magazzino(nome, codiceIndirizzo) VALUES
('darryl', 3),
('solaria', 5),
('trator', 6),
('grande-magazzino', 5),
('douglas', 7);

INSERT INTO ristorante(nome, descrizione, numeroTelefono, codiceIndirizzo) VALUES
('gnab-gib', 'ristorante al termine dell`universo', '0001112229', 7),
('eco', 'il nome sta per economico', '8000774563', 6),
('enigma', 'il nome e` il vero enigma', '2340255363', 3);

INSERT INTO rider(nome, cognome, biografia, pathFoto) VALUES
('abdul', 'alhazred', 'porta sempre con se una copia del necronomicon', '/'),
('philip', 'fry', 'ha paura di cadere nei frigoriferi', '/'),
('gennaro', 'esposito', 'immancabile in ogni database', '/'),
('pasquale', 'esposito', '(quasi) immancabile in ogni database', '/'),
('palmer', 'eldrich', 'consegna anche can-d', '/'),
('wow', 'bagger', 'ha avuto un problema con degli elastici, un pranzo liquido e un acceleratore di particelle', '/'),
('corrado', 'corriere', 'dice di essere predestinato a questo lavoro', '/');

INSERT INTO veicolo(annoImmatricolazione, marca, modello, tipoVeicolo, codiceRider) VALUES
('2016-02-17', 'pezzotta', 'economica', 'bicicletta', 7),
('2012-06-27', 'pezzotta', 'economica_motorizzata', 'moto', 7),
('2018-01-02', 'post', 'gres', 'moto', 3),
('2000-03-12', 'fiat', 'mezza_panda', 'moto', 2),
('2009-12-08', 'piaggio', 'liberty', 'moto', 4),
('2009-12-08', 'piaggio', 'zip', 'moto', 4),
('1997-12-08', 'pedala_che_ti_passa', 'graziella', 'bicicletta', 4),
('2008-04-09', 'pedala_che_ti_passa', 'graziella', 'bicicletta', 5),
('2008-07-11', 'cthulhu', 'squid', 'moto', 1),
('2020-01-18', 'dreaming', 'nightmare', 'bicicletta', 1),
('2020-01-18', 'space', 'invaders', 'bicicletta', 6),
('2020-01-18', 'space', 'milkyway', 'moto', 6),
('2020-01-18', 'volta', 'greenpower', 'bicicletta', 6),
('2020-01-18', 'volta', 'semigreenpower', 'moto', 6);

INSERT INTO disponibilitaMagazzino(codiceMagazzino, codiceSeriale, quantita) VALUES
(1, 21, 33),
(1, 29, 12),
(1, 28, 49),
(1, 7, 20),
(1, 22, 81),
(1, 5, 7),
(1, 6, 16),
(1, 19, 6),
(2, 8, 11),
(2, 9, 21),
(2, 20, 15),
(2, 29, 11),
(2, 30, 46),
(2, 12, 6),
(3, 1, 100),
(3, 2, 47),
(3, 3, 69),
(3, 23, 150),
(3, 24, 80),
(3, 25, 8),
(3, 26, 86),
(3, 27, 48),
(4, 4, 14),
(4, 10, 21),
(4, 11, 32),
(4, 13, 44),
(4, 14, 73),
(4, 18, 89),
(5, 15, 58),
(5, 16, 91),
(5, 17, 8),
(5, 22, 81);

INSERT INTO fornitura(codiceMagazzino, codiceRistorante) VALUES
(1, 1),
(1, 2),
(2, 1),
(2, 2),
(2, 3),
(3, 2),
(3, 3),
(4, 1),
(4, 2),
(4, 3),
(5, 1),
(5, 3);

INSERT INTO corrierePer(codiceRider, codiceRistorante) VALUES
(1, 1),
(1, 2),
(1, 3),
(2, 1),
(2, 3),
(3, 2),
(4, 1),
(4, 2),
(5, 2),
(5, 3),
(6, 1),
(6, 2),
(6, 3),
(7, 1);