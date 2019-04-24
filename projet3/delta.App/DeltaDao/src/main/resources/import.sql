
INSERT INTO `ville` (id, nomVille, codePostal) VALUES (1, '1er arrondissement - Paris', '75001');
INSERT INTO `ville` (id, nomVille, codePostal) VALUES (2, '2ème arrondissement - Paris', '75002');
INSERT INTO `ville` (id, nomVille, codePostal) VALUES (3, '3ème arrondissement - Paris', '75003');
INSERT INTO `ville` (id, nomVille, codePostal) VALUES (4, '4ème arrondissement - Paris', '75004');
INSERT INTO `ville` (id, nomVille, codePostal) VALUES (5, '5ème arrondissement - Paris', '75005');
INSERT INTO `ville` (id, nomVille, codePostal) VALUES (6, '6ème arrondissement - Paris', '75006');
INSERT INTO `ville` (id, nomVille, codePostal) VALUES (7, '7ème arrondissement - Paris', '75007');
INSERT INTO `ville` (id, nomVille, codePostal) VALUES (8, '8ème arrondissement - Paris', '75008');
INSERT INTO `ville` (id, nomVille, codePostal) VALUES (9, '9ème arrondissement - Paris', '75009');
INSERT INTO `ville` (id, nomVille, codePostal) VALUES (10, '10ème arrondissement - Paris', '75010');
INSERT INTO `ville` (id, nomVille, codePostal) VALUES (11, '11ème arrondissement - Paris', '75011');
INSERT INTO `ville` (id, nomVille, codePostal) VALUES (12, '12ème arrondissement - Paris', '75012');
INSERT INTO `ville` (id, nomVille, codePostal) VALUES (13, '13ème arrondissement - Paris', '75013');
INSERT INTO `ville` (id, nomVille, codePostal) VALUES (14, '14ème arrondissement - Paris', '75014');
INSERT INTO `ville` (id, nomVille, codePostal) VALUES (15, '15ème arrondissement - Paris', '75015');
INSERT INTO `ville` (id, nomVille, codePostal) VALUES (16, '16ème arrondissement - Paris', '75016');

INSERT INTO `adherent` (id, nom, prenom, dateDeNaissance, numTelPortable, numTelFixe, adresseMail, adresse, dateInscription, dateDesinscription, login, password, ville_id) VALUES (1, 'DUPOND', 'Jérémie', '1975-01-25','0612325465','0244325465','j.dupond@mail.fr','28 Allée Verte','2018-08-12',null, 'jdupond', 'dupond',1);
INSERT INTO `adherent` (id, nom, prenom, dateDeNaissance, numTelPortable, numTelFixe, adresseMail, adresse, dateInscription, dateDesinscription, login, password, ville_id) VALUES (2, 'BERRA', 'Claire', '1985-10-05','0613325465','0244225465','c.berra@mail.fr','2 Rue du Général Leclerc','2018-08-01',null, 'cberra', 'berra',1);
INSERT INTO `adherent` (id, nom, prenom, dateDeNaissance, numTelPortable, numTelFixe, adresseMail, adresse, dateInscription, dateDesinscription, login, password, ville_id) VALUES (3, 'MARCHAND', 'Michel', '1963-11-15','0614325465','0244125465','m.marchand@mail.fr','28 Rue de la République','2018-07-03',null, 'mmarchand', 'marchand',2);
INSERT INTO `adherent` (id, nom, prenom, dateDeNaissance, numTelPortable, numTelFixe, adresseMail, adresse, dateInscription, dateDesinscription, login, password, ville_id) VALUES (4, 'DUPUIS', 'Mathilde', '1972-08-16','0615325465','0244425465','m.dupuis@mail.fr','28 Rue Vivaldi','2018-07-16',null, 'mdupuis', 'dupuis',2);
INSERT INTO `adherent` (id, nom, prenom, dateDeNaissance, numTelPortable, numTelFixe, adresseMail, adresse, dateInscription, dateDesinscription, login, password, ville_id) VALUES (5, 'Administrateur', '', '1972-08-16','0615325465','0244425465','admin@mail.fr','28 Rue Vivaldi','2018-07-16',null, 'admin', 'admin',null);

INSERT INTO `adherent` (id, nom, prenom, dateDeNaissance, numTelPortable, numTelFixe, adresseMail, adresse, dateInscription, dateDesinscription, login, password, ville_id) VALUES (6, 'Boulanger', 'Romain', '1975-01-25','0618825465','0288325465','r.boulanger@mail.fr','42 Allée Verte','2018-08-12',null, 'rboulanger', 'boulanger',6);
INSERT INTO `adherent` (id, nom, prenom, dateDeNaissance, numTelPortable, numTelFixe, adresseMail, adresse, dateInscription, dateDesinscription, login, password, ville_id) VALUES (7, 'Lechat', 'Cindy', '1986-10-05','0613995465','0144225465','c.lechat@mail.fr','26 Rue Leclerc','2018-08-01',null, 'clechat', 'lechat',5);
INSERT INTO `adherent` (id, nom, prenom, dateDeNaissance, numTelPortable, numTelFixe, adresseMail, adresse, dateInscription, dateDesinscription, login, password, ville_id) VALUES (8, 'Breton', 'Romuald', '1964-11-15','061425465','0144335465','r.breton@mail.fr','8 Rue de la République','2018-07-03',null, 'rbreton', 'breton',6);
INSERT INTO `adherent` (id, nom, prenom, dateDeNaissance, numTelPortable, numTelFixe, adresseMail, adresse, dateInscription, dateDesinscription, login, password, ville_id) VALUES (9, 'Durand', 'Yohann', '1972-08-26','0617825465','0247725465','y.durand@mail.fr','2 Rue Vivaldi','2018-07-16',null, 'ydurand', 'durand',4);
INSERT INTO `adherent` (id, nom, prenom, dateDeNaissance, numTelPortable, numTelFixe, adresseMail, adresse, dateInscription, dateDesinscription, login, password, ville_id) VALUES (10, 'Hoquet', 'Gisèle', '1962-01-16','0615324765','0165425465','g.hoquet@mail.fr','15 Rue Alesia','2018-07-16',null, 'ghoquet', 'hoquet',3);

INSERT INTO `adherent` (id, nom, prenom, dateDeNaissance, numTelPortable, numTelFixe, adresseMail, adresse, dateInscription, dateDesinscription, login, password, ville_id) VALUES (11, 'Moreau', 'Lisa', '1982-12-25','0618825433','0188325115','l.moreau@mail.fr','12 rue des champs','2018-08-12',null, 'lmoreau', 'moreau',7);
INSERT INTO `adherent` (id, nom, prenom, dateDeNaissance, numTelPortable, numTelFixe, adresseMail, adresse, dateInscription, dateDesinscription, login, password, ville_id) VALUES (12, 'Richard', 'Georges', '1986-03-18','0613995477','0144225775','g.richard@mail.fr','06 Rue Division Leclerc','2018-08-01',null, 'grichard', 'richard',7);
INSERT INTO `adherent` (id, nom, prenom, dateDeNaissance, numTelPortable, numTelFixe, adresseMail, adresse, dateInscription, dateDesinscription, login, password, ville_id) VALUES (13, 'Roy', 'Roger', '1974-11-15','061425488','0144335885','r.roger@mail.fr','86 Rue de la République','2018-07-03',null, 'rroy', 'roy',6);
INSERT INTO `adherent` (id, nom, prenom, dateDeNaissance, numTelPortable, numTelFixe, adresseMail, adresse, dateInscription, dateDesinscription, login, password, ville_id) VALUES (14, 'Collin', 'Liliane', '1972-08-26','0617825995','0247725995','l.collin@mail.fr','2 Rue de Stalingrad','2018-07-16',null, 'lcollin', 'collin',4);
INSERT INTO `adherent` (id, nom, prenom, dateDeNaissance, numTelPortable, numTelFixe, adresseMail, adresse, dateInscription, dateDesinscription, login, password, ville_id) VALUES (15, 'Martinez', 'Solange', '1962-04-16','0615324744','0175425445','m.solange@mail.fr','15 Rue Alesia','2018-07-16',null, 'smartinez', 'martinez',8);

--/* TODO: insert enfant*/
INSERT INTO `enfant` (id, prenom, dateDeNaissance, dateInscription, dateDesinscription, adherent_id) VALUES (1, 'Jules', '2009-01-25', '2015-06-12', null, 1);
INSERT INTO `enfant` (id, prenom, dateDeNaissance, dateInscription, dateDesinscription, adherent_id) VALUES (2, 'Julie', '2008-01-05', '2015-06-12', null, 2);
INSERT INTO `enfant` (id, prenom, dateDeNaissance, dateInscription, dateDesinscription, adherent_id) VALUES (3, 'Kevin', '2003-09-22', '2015-06-12', null, 3);
INSERT INTO `enfant` (id, prenom, dateDeNaissance, dateInscription, dateDesinscription, adherent_id) VALUES (4, 'Mia', '2003-07-19', '2015-06-12', null, 4);
INSERT INTO `enfant` (id, prenom, dateDeNaissance, dateInscription, dateDesinscription, adherent_id) VALUES (5, 'John', '1999-01-25', '2015-06-12', null, 4);
INSERT INTO `enfant` (id, prenom, dateDeNaissance, dateInscription, dateDesinscription, adherent_id) VALUES (6, 'Jacqueline', '2000-01-05', '2016-06-12', null, 3);
INSERT INTO `enfant` (id, prenom, dateDeNaissance, dateInscription, dateDesinscription, adherent_id) VALUES (7, 'Mathieu', '2000-08-07', '2016-06-12', null, 1);
INSERT INTO `enfant` (id, prenom, dateDeNaissance, dateInscription, dateDesinscription, adherent_id) VALUES (8, 'Malika', '2003-11-05', '2016-06-12', null, 1);
INSERT INTO `enfant` (id, prenom, dateDeNaissance, dateInscription, dateDesinscription, adherent_id) VALUES (9, 'Simon', '2004-12-24', '2016-06-12', null, 2);
INSERT INTO `enfant` (id, prenom, dateDeNaissance, dateInscription, dateDesinscription, adherent_id) VALUES (10, 'Paul', '2005-10-05', '2016-06-12', null, 3);
--/*TODO: insert annéeScolaire*/

INSERT INTO `anneeScolaire` (id, anneeDebut, anneeFin) VALUES (1, 2015, 2016);
INSERT INTO `anneeScolaire` (id, anneeDebut, anneeFin) VALUES (2, 2016, 2017);
INSERT INTO `anneeScolaire` (id, anneeDebut, anneeFin) VALUES (3, 2017, 2018);
INSERT INTO `anneeScolaire` (id, anneeDebut, anneeFin) VALUES (4, 2018, 2019);

/*insert cycle DONE*/
INSERT INTO `cycle` (id, nomCycle) VALUES (1, 'Primaire');
INSERT INTO `cycle` (id, nomCycle) VALUES (2, 'Collège');
INSERT INTO `cycle` (id, nomCycle) VALUES (3, 'Lycée');

--/*TODO : insert etablissement*/
INSERT INTO `etablissement` (id, nom, adresse, telephone, email, ville_id, cycle_id) VALUES (1, 'Lycée Saint-Nicolas', '108 rue de Vaugirard','0142010101','lycee.saint.nicolas@etablissement.fr', 1, 3);
INSERT INTO `etablissement` (id, nom, adresse, telephone, email, ville_id, cycle_id) VALUES (2, 'Lycée Henri IV' , '23 rue clovis', '0144010101','lycee.henri.iv@etablissement.fr', 2, 3);
INSERT INTO `etablissement` (id, nom, adresse, telephone, email, ville_id, cycle_id) VALUES (3, 'Collège Jean-Baptiste-Say' , ' 11 Rue Auteuil', '0145010101', 'college.jeanbaptistesay@etablissement.fr', 3, 2);
INSERT INTO `etablissement` (id, nom, adresse, telephone, email, ville_id, cycle_id) VALUES (4, 'Collège Henri IV' , '23 bis rue clovis', '0144010102','college.henri.iv@etablissement.fr', 2, 2);
INSERT INTO `etablissement` (id, nom, adresse, telephone, email, ville_id, cycle_id) VALUES (5, 'Ecole Henri IV' , '23 ter rue clovis', '0144010103','ecole.henri.iv@etablissement.fr', 2, 1);
INSERT INTO `etablissement` (id, nom, adresse, telephone, email, ville_id, cycle_id) VALUES (6, 'Ecole Saint-Nicolas' , '23 rue clovis', '0144010102','ecole.saint.nicolas@etablissement.fr', 1, 1);



--
/*insert classe DONE*/
INSERT INTO `classe` (id, nomClasse, cycle_id) VALUES (1, 'CP', 1);
INSERT INTO `classe` (id, nomClasse, cycle_id) VALUES (2, 'CE1', 1);
INSERT INTO `classe` (id, nomClasse, cycle_id) VALUES (3, 'CE2', 1);
INSERT INTO `classe` (id, nomClasse, cycle_id) VALUES (4, 'CM1', 1);
INSERT INTO `classe` (id, nomClasse, cycle_id) VALUES (5, 'CM2', 1);

INSERT INTO `classe` (id, nomClasse, cycle_id) VALUES (6, '6ème', 2);
INSERT INTO `classe` (id, nomClasse, cycle_id) VALUES (7, '5ème', 2);
INSERT INTO `classe` (id, nomClasse, cycle_id) VALUES (8, '4ème', 2);
INSERT INTO `classe` (id, nomClasse, cycle_id) VALUES (9, '3ème', 2);

INSERT INTO `classe` (id, nomClasse, cycle_id) VALUES (10, 'Seconde', 3);
INSERT INTO `classe` (id, nomClasse, cycle_id) VALUES (11, 'Première', 3);
INSERT INTO `classe` (id, nomClasse, cycle_id) VALUES (12, 'Terminale', 3);

--/*TODO: insert liste fourniture ecole*/

INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (1,'2015-06-15', '2015-08-25', '2015-06-16', null, 1, 10, 1);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (2,'2015-06-15', '2015-08-25', '2015-06-16', null, 1, 11, 1);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (3,'2015-06-15', '2015-08-25', '2015-06-16', null, 1, 12, 1);

INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (4,'2015-06-15', '2015-08-25', '2015-06-16', null, 1, 10, 2);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (5,'2015-06-15', '2015-08-25', '2015-06-16', null, 1, 11, 2);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (6,'2015-06-15', '2015-08-25', '2015-06-16', null, 1, 12, 2);


INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (7,'2015-06-15', '2015-08-25', '2015-06-16', null, 1, 6, 3);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (8,'2015-06-15', '2015-08-25', '2015-06-16', null, 1, 7, 3);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (9,'2015-06-15', '2015-08-25', '2015-06-16', null, 1, 8, 3);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (10,'2015-06-15', '2015-08-25', '2015-06-16', null, 1, 9, 3);

INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (11,'2015-06-15', '2015-08-25', '2015-06-16', null, 1, 6, 4);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (12,'2015-06-15', '2015-08-25', '2015-06-16', null, 1, 7, 4);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (13,'2015-06-15', '2015-08-25', '2015-06-16', null, 1, 8, 4);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (14,'2015-06-15', '2015-08-25', '2015-06-16', null, 1, 9, 4);


INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (15,'2015-06-15', '2015-08-25', '2015-06-16', null, 1, 1, 5);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (16,'2015-06-15', '2015-08-25', '2015-06-16', null, 1, 2, 5);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (17,'2015-06-15', '2015-08-25', '2015-06-16', null, 1, 3, 5);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (18,'2015-06-15', '2015-08-25', '2015-06-16', null, 1, 4, 5);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (19,'2015-06-15', '2015-08-25', '2015-06-16', null, 1, 5, 5);

INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (20,'2015-06-15', '2015-08-25', '2015-06-16', null, 1, 1, 6);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (21,'2015-06-15', '2015-08-25', '2015-06-16', null, 1, 2, 6);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (22,'2015-06-15', '2015-08-25', '2015-06-16', null, 1, 3, 6);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (23,'2015-06-15', '2015-08-25', '2015-06-16', null, 1, 4, 6);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (24,'2015-06-15', '2015-08-25', '2015-06-16', null, 1, 5, 6);



INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (25,'2016-06-15', '2016-08-25', '2016-06-16', null, 2, 10, 1);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (26,'2016-06-15', '2016-08-25', '2016-06-16', null, 2, 11, 1);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (27,'2016-06-15', '2016-08-25', '2016-06-16', null, 2, 12, 1);

INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (28,'2016-06-15', '2016-08-25', '2016-06-16', null, 2, 10, 2);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (29,'2016-06-15', '2016-08-25', '2016-06-16', null, 2, 11, 2);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (30,'2016-06-15', '2016-08-25', '2016-06-16', null, 2, 12, 2);


INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (31,'2016-06-15', '2016-08-25', '2016-06-16', null, 2, 6, 3);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (32,'2016-06-15', '2016-08-25', '2016-06-16', null, 2, 7, 3);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (33,'2016-06-15', '2016-08-25', '2016-06-16', null, 2, 8, 3);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (34,'2016-06-15', '2016-08-25', '2016-06-16', null, 2, 9, 3);

INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (35,'2016-06-15', '2016-08-25', '2016-06-16', null, 2, 6, 4);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (36,'2016-06-15', '2016-08-25', '2016-06-16', null, 2, 7, 4);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (37,'2016-06-15', '2016-08-25', '2016-06-16', null, 2, 8, 4);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (38,'2016-06-15', '2016-08-25', '2016-06-16', null, 2, 9, 4);


INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (39,'2016-06-15', '2016-08-25', '2016-06-16', null, 2, 1, 5);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (40,'2016-06-15', '2016-08-25', '2016-06-16', null, 2, 2, 5);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (41,'2016-06-15', '2016-08-25', '2016-06-16', null, 2, 3, 5);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (42,'2016-06-15', '2016-08-25', '2016-06-16', null, 2, 4, 5);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (43,'2016-06-15', '2016-08-25', '2016-06-16', null, 2, 5, 5);

INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (44,'2016-06-15', '2016-08-25', '2016-06-16', null, 2, 1, 6);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (45,'2016-06-15', '2016-08-25', '2016-06-16', null, 2, 2, 6);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (46,'2016-06-15', '2016-08-25', '2016-06-16', null, 2, 3, 6);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (47,'2016-06-15', '2016-08-25', '2016-06-16', null, 2, 4, 6);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (48,'2016-06-15', '2016-08-25', '2016-06-16', null, 2, 5, 6);



INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (49,'2017-06-15', '2017-08-25', '2017-06-16', null, 3, 10, 1);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (50,'2017-06-15', '2017-08-25', '2017-06-16', null, 3, 11, 1);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (51,'2017-06-15', '2017-08-25', '2017-06-16', null, 3, 12, 1);

INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (52,'2017-06-15', '2017-08-25', '2017-06-16', null, 3, 10, 2);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (53,'2017-06-15', '2017-08-25', '2017-06-16', null, 3, 11, 2);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (54,'2017-06-15', '2017-08-25', '2017-06-16', null, 3, 12, 2);


INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (55,'2017-06-15', '2017-08-25', '2017-06-16', null, 3, 6, 3);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (56,'2017-06-15', '2017-08-25', '2017-06-16', null, 3, 7, 3);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (57,'2017-06-15', '2017-08-25', '2017-06-16', null, 3, 8, 3);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (58,'2017-06-15', '2017-08-25', '2017-06-16', null, 3, 9, 3);

INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (59,'2017-06-15', '2017-08-25', '2017-06-16', null, 3, 6, 4);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (60,'2017-06-15', '2017-08-25', '2017-06-16', null, 3, 7, 4);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (61,'2017-06-15', '2017-08-25', '2017-06-16', null, 3, 8, 4);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (62,'2017-06-15', '2017-08-25', '2017-06-16', null, 3, 9, 4);


INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (63,'2017-06-15', '2017-08-25', '2017-06-16', null, 3, 1, 5);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (64,'2017-06-15', '2017-08-25', '2017-06-16', null, 3, 2, 5);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (65,'2017-06-15', '2017-08-25', '2017-06-16', null, 3, 3, 5);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (66,'2017-06-15', '2017-08-25', '2017-06-16', null, 3, 4, 5);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (67,'2017-06-15', '2017-08-25', '2017-06-16', null, 3, 5, 5);

INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (68,'2017-06-15', '2017-08-25', '2017-06-16', null, 3, 1, 6);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (69,'2017-06-15', '2017-08-25', '2017-06-16', null, 3, 2, 6);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (70,'2017-06-15', '2017-08-25', '2017-06-16', null, 3, 3, 6);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (71,'2017-06-15', '2017-08-25', '2017-06-16', null, 3, 4, 6);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (72,'2017-06-15', '2017-08-25', '2017-06-16', null, 3, 5, 6);



INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (73,'2018-06-15', '2018-08-25', '2017-06-16', null, 4, 10, 1);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (74,'2018-06-15', '2018-08-25', '2017-06-16', null, 4, 11, 1);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (75,'2018-06-15', '2018-08-25', '2017-06-16', null, 4, 12, 1);

INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (76,'2018-06-15', '2018-08-25', '2017-06-16', null, 4, 10, 2);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (77,'2018-06-15', '2018-08-25', '2017-06-16', null, 4, 11, 2);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (78,'2018-06-15', '2018-08-25', '2017-06-16', null, 4, 12, 2);


INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (79,'2018-06-15', '2018-08-25', '2017-06-16', null, 4, 6, 3);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (80,'2018-06-15', '2018-08-25', '2017-06-16', null, 4, 7, 3);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (81,'2018-06-15', '2018-08-25', '2017-06-16', null, 4, 8, 3);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (82,'2018-06-15', '2018-08-25', '2017-06-16', null, 4, 9, 3);

INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (83,'2018-06-15', '2018-08-25', '2017-06-16', null, 4, 6, 4);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (84,'2018-06-15', '2018-08-25', '2017-06-16', null, 4, 7, 4);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (85,'2018-06-15', '2018-08-25', '2017-06-16', null, 4, 8, 4);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (86,'2018-06-15', '2018-08-25', '2017-06-16', null, 4, 9, 4);


INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (87,'2018-06-15', '2018-08-25', '2017-06-16', null, 4, 1, 5);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (88,'2018-06-15', '2018-08-25', '2017-06-16', null, 4, 2, 5);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (89,'2018-06-15', '2018-08-25', '2017-06-16', null, 4, 3, 5);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (90,'2018-06-15', '2018-08-25', '2017-06-16', null, 4, 4, 5);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (91,'2018-06-15', '2018-08-25', '2017-06-16', null, 4, 5, 5);

INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (92,'2018-06-15', '2018-08-25', '2017-06-16', null, 4, 1, 6);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (93,'2018-06-15', '2018-08-25', '2017-06-16', null, 4, 2, 6);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (94,'2018-06-15', '2018-08-25', '2017-06-16', null, 4, 3, 6);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (95,'2018-06-15', '2018-08-25', '2017-06-16', null, 4, 4, 6);
INSERT INTO `listefournitureecole` (id, dateCreation, dateButoire, dateValidation, dateAnnulation, anneeScolaire_id, classe_id, etablissement_id) VALUES (96,'2018-06-15', '2018-08-25', '2017-06-16', null, 4, 5, 6);



--
--/*TODO: insert scolarité*/
INSERT INTO `scolarite` (id, enfant_id, anneeScolaire_id, classe_id, etablissement_id) VALUES (1, 1, 1, 1, 6)
INSERT INTO `scolarite` (id, enfant_id, anneeScolaire_id, classe_id, etablissement_id) VALUES (2, 2, 1, 1, 5)
INSERT INTO `scolarite` (id, enfant_id, anneeScolaire_id, classe_id, etablissement_id) VALUES (3, 3, 1, 6, 4)
INSERT INTO `scolarite` (id, enfant_id, anneeScolaire_id, classe_id, etablissement_id) VALUES (4, 4, 1, 6, 3)
INSERT INTO `scolarite` (id, enfant_id, anneeScolaire_id, classe_id, etablissement_id) VALUES (5, 5, 1, 10, 2)
INSERT INTO `scolarite` (id, enfant_id, anneeScolaire_id, classe_id, etablissement_id) VALUES (6, 6, 1, 10, 1)

INSERT INTO `scolarite` (id, enfant_id, anneeScolaire_id, classe_id, etablissement_id) VALUES (7, 1, 2, 2, 6)
INSERT INTO `scolarite` (id, enfant_id, anneeScolaire_id, classe_id, etablissement_id) VALUES (8, 2, 2, 2, 5)
INSERT INTO `scolarite` (id, enfant_id, anneeScolaire_id, classe_id, etablissement_id) VALUES (9, 3, 2, 7, 4)
INSERT INTO `scolarite` (id, enfant_id, anneeScolaire_id, classe_id, etablissement_id) VALUES (10, 4, 2, 7, 3)
INSERT INTO `scolarite` (id, enfant_id, anneeScolaire_id, classe_id, etablissement_id) VALUES (11, 5, 2, 10, 2)
INSERT INTO `scolarite` (id, enfant_id, anneeScolaire_id, classe_id, etablissement_id) VALUES (12, 6, 2, 11, 1)

INSERT INTO `scolarite` (id, enfant_id, anneeScolaire_id, classe_id, etablissement_id) VALUES (13, 1, 3, 3, 6)
INSERT INTO `scolarite` (id, enfant_id, anneeScolaire_id, classe_id, etablissement_id) VALUES (14, 2, 3, 4, 5)
INSERT INTO `scolarite` (id, enfant_id, anneeScolaire_id, classe_id, etablissement_id) VALUES (15, 3, 3, 8, 4)
INSERT INTO `scolarite` (id, enfant_id, anneeScolaire_id, classe_id, etablissement_id) VALUES (16, 4, 3, 8, 3)
INSERT INTO `scolarite` (id, enfant_id, anneeScolaire_id, classe_id, etablissement_id) VALUES (17, 5, 3, 11, 2)
INSERT INTO `scolarite` (id, enfant_id, anneeScolaire_id, classe_id, etablissement_id) VALUES (18, 6, 3, 11, 1)

INSERT INTO `scolarite` (id, enfant_id, anneeScolaire_id, classe_id, etablissement_id) VALUES (19, 1, 4, 4, 6)
INSERT INTO `scolarite` (id, enfant_id, anneeScolaire_id, classe_id, etablissement_id) VALUES (20, 2, 4, 5, 5)
INSERT INTO `scolarite` (id, enfant_id, anneeScolaire_id, classe_id, etablissement_id) VALUES (21, 3, 4, 9, 4)
INSERT INTO `scolarite` (id, enfant_id, anneeScolaire_id, classe_id, etablissement_id) VALUES (22, 4, 4, 9, 3)
INSERT INTO `scolarite` (id, enfant_id, anneeScolaire_id, classe_id, etablissement_id) VALUES (23, 5, 4, 12, 2)
INSERT INTO `scolarite` (id, enfant_id, anneeScolaire_id, classe_id, etablissement_id) VALUES (24, 6, 4, 12, 1)
--

/*TODO: insert liste fourniture personnalisé*/

INSERT INTO `listeFourniturePersonnalisee` (id, dateCreation, dateValidation, dateAnnulation, dateRecuperation, scolarite_id, listeFournitureEcole_id) VALUES (1, '2015-07-15', '2015-07-15', null, '2015-09-05', 1, 20);
INSERT INTO `listeFourniturePersonnalisee` (id, dateCreation, dateValidation, dateAnnulation, dateRecuperation, scolarite_id, listeFournitureEcole_id) VALUES (2, '2015-07-15', '2015-07-15', null, '2015-09-05', 2, 15);
INSERT INTO `listeFourniturePersonnalisee` (id, dateCreation, dateValidation, dateAnnulation, dateRecuperation, scolarite_id, listeFournitureEcole_id) VALUES (3, '2015-07-15', '2015-07-15', null, '2015-09-05', 3, 11);
INSERT INTO `listeFourniturePersonnalisee` (id, dateCreation, dateValidation, dateAnnulation, dateRecuperation, scolarite_id, listeFournitureEcole_id) VALUES (4, '2015-07-15', '2015-07-15', null, '2015-09-05', 4, 7);
INSERT INTO `listeFourniturePersonnalisee` (id, dateCreation, dateValidation, dateAnnulation, dateRecuperation, scolarite_id, listeFournitureEcole_id) VALUES (5, '2015-07-15', '2015-07-15', null, '2015-09-05', 5, 4);
INSERT INTO `listeFourniturePersonnalisee` (id, dateCreation, dateValidation, dateAnnulation, dateRecuperation, scolarite_id, listeFournitureEcole_id) VALUES (6, '2015-07-15', '2015-07-15', null, '2015-09-05', 6, 1);

INSERT INTO `listeFourniturePersonnalisee` (id, dateCreation, dateValidation, dateAnnulation, dateRecuperation, scolarite_id, listeFournitureEcole_id) VALUES (7, '2016-07-15', '2016-07-15', null, '2016-09-05', 7, 45);
INSERT INTO `listeFourniturePersonnalisee` (id, dateCreation, dateValidation, dateAnnulation, dateRecuperation, scolarite_id, listeFournitureEcole_id) VALUES (8, '2016-07-15', '2016-07-15', null, '2016-09-05', 8, 40);
INSERT INTO `listeFourniturePersonnalisee` (id, dateCreation, dateValidation, dateAnnulation, dateRecuperation, scolarite_id, listeFournitureEcole_id) VALUES (9, '2016-07-15', '2016-07-15', null, '2016-09-05', 9, 36);
INSERT INTO `listeFourniturePersonnalisee` (id, dateCreation, dateValidation, dateAnnulation, dateRecuperation, scolarite_id, listeFournitureEcole_id) VALUES (10, '2016-07-15', '2016-07-15', null, '2016-09-05', 10, 32);
INSERT INTO `listeFourniturePersonnalisee` (id, dateCreation, dateValidation, dateAnnulation, dateRecuperation, scolarite_id, listeFournitureEcole_id) VALUES (11, '2016-07-15', '2016-07-15', null, '2016-09-05', 11, 28);
INSERT INTO `listeFourniturePersonnalisee` (id, dateCreation, dateValidation, dateAnnulation, dateRecuperation, scolarite_id, listeFournitureEcole_id) VALUES (12, '2016-07-15', '2016-07-15', null, '2016-09-05', 12, 26);

INSERT INTO `listeFourniturePersonnalisee` (id, dateCreation, dateValidation, dateAnnulation, dateRecuperation, scolarite_id, listeFournitureEcole_id) VALUES (13, '2017-07-15', '2017-07-15', null, '2017-09-05', 13, 70);
INSERT INTO `listeFourniturePersonnalisee` (id, dateCreation, dateValidation, dateAnnulation, dateRecuperation, scolarite_id, listeFournitureEcole_id) VALUES (14, '2017-07-15', '2017-07-15', null, '2017-09-05', 14, 66);
INSERT INTO `listeFourniturePersonnalisee` (id, dateCreation, dateValidation, dateAnnulation, dateRecuperation, scolarite_id, listeFournitureEcole_id) VALUES (15, '2017-07-15', '2017-07-15', null, '2017-09-05', 15, 61);
INSERT INTO `listeFourniturePersonnalisee` (id, dateCreation, dateValidation, dateAnnulation, dateRecuperation, scolarite_id, listeFournitureEcole_id) VALUES (16, '2017-07-15', '2017-07-15', null, '2017-09-05', 16, 57);
INSERT INTO `listeFourniturePersonnalisee` (id, dateCreation, dateValidation, dateAnnulation, dateRecuperation, scolarite_id, listeFournitureEcole_id) VALUES (17, '2017-07-15', '2017-07-15', null, '2017-09-05', 17, 53);
INSERT INTO `listeFourniturePersonnalisee` (id, dateCreation, dateValidation, dateAnnulation, dateRecuperation, scolarite_id, listeFournitureEcole_id) VALUES (18, '2017-07-15', '2017-07-15', null, '2017-09-05', 18, 50);

INSERT INTO `listeFourniturePersonnalisee` (id, dateCreation, dateValidation, dateAnnulation, dateRecuperation, scolarite_id, listeFournitureEcole_id) VALUES (19, '2018-07-15', '2018-07-15', null, '2018-09-05', 19, 95);
INSERT INTO `listeFourniturePersonnalisee` (id, dateCreation, dateValidation, dateAnnulation, dateRecuperation, scolarite_id, listeFournitureEcole_id) VALUES (20, '2018-07-15', '2018-07-15', null, '2018-09-05', 20, 91);
INSERT INTO `listeFourniturePersonnalisee` (id, dateCreation, dateValidation, dateAnnulation, dateRecuperation, scolarite_id, listeFournitureEcole_id) VALUES (21, '2018-07-15', '2018-07-15', null, '2018-09-05', 21, 86);
INSERT INTO `listeFourniturePersonnalisee` (id, dateCreation, dateValidation, dateAnnulation, dateRecuperation, scolarite_id, listeFournitureEcole_id) VALUES (22, '2018-07-15', '2018-07-15', null, '2018-09-05', 22, 82);
INSERT INTO `listeFourniturePersonnalisee` (id, dateCreation, dateValidation, dateAnnulation, dateRecuperation, scolarite_id, listeFournitureEcole_id) VALUES (23, '2018-07-15', '2018-07-15', null, '2018-09-05', 23, 78);
INSERT INTO `listeFourniturePersonnalisee` (id, dateCreation, dateValidation, dateAnnulation, dateRecuperation, scolarite_id, listeFournitureEcole_id) VALUES (24, '2018-07-15', '2018-07-15', null, '2018-09-05', 24, 75);
--/*insert categorie*/

INSERT INTO `categoriefourniture` (id, nom) VALUES (1, 'Papier');
INSERT INTO `categoriefourniture` (id, nom) VALUES (2, 'Classement');
INSERT INTO `categoriefourniture` (id, nom) VALUES (3, 'Petites fournitures');
INSERT INTO `categoriefourniture` (id, nom) VALUES (4, 'Ecriture et correction');
INSERT INTO `categoriefourniture` (id, nom) VALUES (5, 'Cahiers et agendas');
INSERT INTO `categoriefourniture` (id, nom) VALUES (6, 'Autres');


--/* TODO: insert Sous categorie*/
	/*Done Sous cat 1*/
INSERT INTO `sousCategoriefourniture` (id, nom, categorieFourniture_id) VALUES (1, 'Copies doubles', 1);
INSERT INTO `sousCategoriefourniture` (id, nom, categorieFourniture_id) VALUES (2, 'Copies simples', 1);
INSERT INTO `sousCategoriefourniture` (id, nom, categorieFourniture_id) VALUES (3, 'Papier', 1);
--
--	/*Done Sous cat 2*/
INSERT INTO `sousCategoriefourniture` (id, nom, categorieFourniture_id) VALUES (4, 'Pochettes et chemises', 2);
INSERT INTO `sousCategoriefourniture` (id, nom, categorieFourniture_id) VALUES (5, 'Classeurs', 2);
INSERT INTO `sousCategoriefourniture` (id, nom, categorieFourniture_id) VALUES (6, 'Intercalaires et pochettes perforées', 2);
INSERT INTO `sousCategoriefourniture` (id, nom, categorieFourniture_id) VALUES (7, 'Trieurs', 2);

--	/*Done Sous cat 3*/
INSERT INTO `sousCategoriefourniture` (id, nom, categorieFourniture_id) VALUES (8, 'Colles et adhésifs', 3);
INSERT INTO `sousCategoriefourniture` (id, nom, categorieFourniture_id) VALUES (9, 'Découper', 3);
INSERT INTO `sousCategoriefourniture` (id, nom, categorieFourniture_id) VALUES (10, 'Tracer et mesurer', 3);
INSERT INTO `sousCategoriefourniture` (id, nom, categorieFourniture_id) VALUES (11, 'Etiquettes', 3);
INSERT INTO `sousCategoriefourniture` (id, nom, categorieFourniture_id) VALUES (12, 'Attacher', 3);
--
--	/*Sous cat 4 ecriture et protection*/
INSERT INTO `sousCategoriefourniture` (id, nom, categorieFourniture_id) VALUES (13, 'Stylos', 4);
INSERT INTO `sousCategoriefourniture` (id, nom, categorieFourniture_id) VALUES (14, 'Feutres', 4);
INSERT INTO `sousCategoriefourniture` (id, nom, categorieFourniture_id) VALUES (15, 'Crayons', 4);
INSERT INTO `sousCategoriefourniture` (id, nom, categorieFourniture_id) VALUES (16, 'Marqueurs', 4);
INSERT INTO `sousCategoriefourniture` (id, nom, categorieFourniture_id) VALUES (17, 'Surligneurs', 4);
INSERT INTO `sousCategoriefourniture` (id, nom, categorieFourniture_id) VALUES (18, 'Correction', 4);
--
--	/*Sous cat 5 cahier et agenda*/
INSERT INTO `sousCategoriefourniture` (id, nom, categorieFourniture_id) VALUES (19, 'Cahiers', 5);
INSERT INTO `sousCategoriefourniture` (id, nom, categorieFourniture_id) VALUES (20, 'Blocs', 5);
INSERT INTO `sousCategoriefourniture` (id, nom, categorieFourniture_id) VALUES (21, 'Fiches', 5);
INSERT INTO `sousCategoriefourniture` (id, nom, categorieFourniture_id) VALUES (22, 'Agendas', 5);
--
--	/*Sous cat 6 autre*/
INSERT INTO `sousCategoriefourniture` (id, nom, categorieFourniture_id) VALUES (23, 'Sacs et trousses', 6);
INSERT INTO `sousCategoriefourniture` (id, nom, categorieFourniture_id) VALUES (24, 'Calculatrices et ardoise', 6);
INSERT INTO `sousCategoriefourniture` (id, nom, categorieFourniture_id) VALUES (25, 'Vêtements', 6);

--/*TODO: insert stock*/

INSERT INTO `stock` (id, quantite) VALUES (1, 13);
INSERT INTO `stock` (id, quantite) VALUES (2, 46);
INSERT INTO `stock` (id, quantite) VALUES (3, 85);
INSERT INTO `stock` (id, quantite) VALUES (4, 56);
INSERT INTO `stock` (id, quantite) VALUES (5, 55);

INSERT INTO `stock` (id, quantite) VALUES (6, 95);
INSERT INTO `stock` (id, quantite) VALUES (7, 75);
INSERT INTO `stock` (id, quantite) VALUES (8, 25);
INSERT INTO `stock` (id, quantite) VALUES (9, 45);
INSERT INTO `stock` (id, quantite) VALUES (10, 5);

INSERT INTO `stock` (id, quantite) VALUES (11, 63);
INSERT INTO `stock` (id, quantite) VALUES (12, 75);
INSERT INTO `stock` (id, quantite) VALUES (13, 42);
INSERT INTO `stock` (id, quantite) VALUES (14, 58);
INSERT INTO `stock` (id, quantite) VALUES (16, 42);

INSERT INTO `stock` (id, quantite) VALUES (17, 54);
INSERT INTO `stock` (id, quantite) VALUES (18, 12);
INSERT INTO `stock` (id, quantite) VALUES (19, 65);
INSERT INTO `stock` (id, quantite) VALUES (20, 95);
INSERT INTO `stock` (id, quantite) VALUES (21, 42);

INSERT INTO `stock` (id, quantite) VALUES (22, 78);
INSERT INTO `stock` (id, quantite) VALUES (23, 21);
INSERT INTO `stock` (id, quantite) VALUES (24, 32);
INSERT INTO `stock` (id, quantite) VALUES (25, 15);
INSERT INTO `stock` (id, quantite) VALUES (26, 75);

INSERT INTO `stock` (id, quantite) VALUES (27, 96);
INSERT INTO `stock` (id, quantite) VALUES (28, 64);
INSERT INTO `stock` (id, quantite) VALUES (29, 23);
INSERT INTO `stock` (id, quantite) VALUES (30, 34);
INSERT INTO `stock` (id, quantite) VALUES (31, 45);

INSERT INTO `stock` (id, quantite) VALUES (32, 74);
INSERT INTO `stock` (id, quantite) VALUES (33, 92);
INSERT INTO `stock` (id, quantite) VALUES (34, 45);
INSERT INTO `stock` (id, quantite) VALUES (35, 63);
INSERT INTO `stock` (id, quantite) VALUES (36, 78);

INSERT INTO `stock` (id, quantite) VALUES (37, 15);
INSERT INTO `stock` (id, quantite) VALUES (38, 81);
INSERT INTO `stock` (id, quantite) VALUES (39, 47);
INSERT INTO `stock` (id, quantite) VALUES (40, 63);
INSERT INTO `stock` (id, quantite) VALUES (41, 11);

INSERT INTO `stock` (id, quantite) VALUES (42, 78);
INSERT INTO `stock` (id, quantite) VALUES (43, 44);
INSERT INTO `stock` (id, quantite) VALUES (44, 21);
INSERT INTO `stock` (id, quantite) VALUES (45, 39);
INSERT INTO `stock` (id, quantite) VALUES (46, 48);

INSERT INTO `stock` (id, quantite) VALUES (47, 93);
INSERT INTO `stock` (id, quantite) VALUES (48, 11);
INSERT INTO `stock` (id, quantite) VALUES (49, 37);
INSERT INTO `stock` (id, quantite) VALUES (50, 69);
INSERT INTO `stock` (id, quantite) VALUES (51, 54);


INSERT INTO `stock` (id, quantite) VALUES (52, 15);
INSERT INTO `stock` (id, quantite) VALUES (53, 67);
INSERT INTO `stock` (id, quantite) VALUES (54, 95);
INSERT INTO `stock` (id, quantite) VALUES (55, 24);
INSERT INTO `stock` (id, quantite) VALUES (56, 38);


INSERT INTO `stock` (id, quantite) VALUES (57, 72);
INSERT INTO `stock` (id, quantite) VALUES (58, 91);
INSERT INTO `stock` (id, quantite) VALUES (59, 34);
INSERT INTO `stock` (id, quantite) VALUES (60, 65);
INSERT INTO `stock` (id, quantite) VALUES (61, 84);

INSERT INTO `stock` (id, quantite) VALUES (62, 42);
INSERT INTO `stock` (id, quantite) VALUES (63, 63);
INSERT INTO `stock` (id, quantite) VALUES (64, 84);
INSERT INTO `stock` (id, quantite) VALUES (65, 61);
INSERT INTO `stock` (id, quantite) VALUES (66, 95);

INSERT INTO `stock` (id, quantite) VALUES (67, 75);
INSERT INTO `stock` (id, quantite) VALUES (68, 4);
INSERT INTO `stock` (id, quantite) VALUES (69, 45);
INSERT INTO `stock` (id, quantite) VALUES (70, 61);
INSERT INTO `stock` (id, quantite) VALUES (71, 34);

INSERT INTO `stock` (id, quantite) VALUES (72, 78);
INSERT INTO `stock` (id, quantite) VALUES (73, 16);
INSERT INTO `stock` (id, quantite) VALUES (74, 41);
INSERT INTO `stock` (id, quantite) VALUES (75, 69);
INSERT INTO `stock` (id, quantite) VALUES (76, 62);

INSERT INTO `stock` (id, quantite) VALUES (77, 74);
INSERT INTO `stock` (id, quantite) VALUES (78, 32);
INSERT INTO `stock` (id, quantite) VALUES (79, 64);
INSERT INTO `stock` (id, quantite) VALUES (80, 56);

INSERT INTO `stock` (id, quantite) VALUES (82, 12);
INSERT INTO `stock` (id, quantite) VALUES (83, 32);
INSERT INTO `stock` (id, quantite) VALUES (84, 3);
INSERT INTO `stock` (id, quantite) VALUES (85, 6);
INSERT INTO `stock` (id, quantite) VALUES (86, 65);

--/* TODO: insert fourniture -id 15  - 81 supprimer*/
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (1, 'Copies doubles A5, petits carreaux','copieDoublePCgrande.jpg', 1, 1);						/*A trouver*/
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (2, 'Copies doubles A4, petits carreaux','copieDoublePCgrande.jpg', 1, 2);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (3, 'Copies doubles A5, grands carreaux', 'copieDoubleGCpetite.jpg',1, 3);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (4, 'Copies doubles A4, grands carreaux','copieDoubleGCgrande.jpg', 1, 4);

INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (5, 'Copies simples A5, petits carreaux','feuilleSimplePCgrande.jpg', 2, 5);            			/*A trouver*/
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (6, 'Copies simples A4, petits carreaux','feuilleSimplePCgrande.jpg', 2,6);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (7, 'Copies simples A5, grands carreaux','feuilleSimpleGCpetite.jpg', 2,7);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (8, 'Copies simples A4, grands carreaux','feuilleSimpleGCgrande.jpg', 2,8);

INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (9, 'Papier calque','papierCalque.jpg', 3,9);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (10, 'Papier millimétré', 'papierMillimetre.jpg',3,10);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (11, 'Papier à dessin','papierDessin.jpg', 3,11);


INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (13, 'Chemise en carton', 'chemiseCarton.jpg', 4,12);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (14, 'Chemise en plastique', 'chemisePlastique.jpg', 4,13);

INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (16, 'Classeur rigide A4', 'classeurRigideG.jpg', 5,14);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (17, 'Classeur rigide A5', 'classeurRigideP.jpg', 5,16);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (18, 'Classeur à levier', 'classeurALevier.jpg', 5,17);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (19, 'Classeur souple 4 anneaux', 'classeurSouple.jpg', 5,18);

INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (20, 'Intercalaire en carton, 6 positions', 'intercalaire6.jpg', 6, 86);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (21, 'Intercalaire en carton, 12 positions', 'intercalaire12.jpg', 6,19);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (22, 'Pochettes plastiques x400', 'pochettePlastique.jpg', 6,20);

INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (23, 'Trieur 12 compartiments', 'trieur12.jpg', 7,21);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (24, 'Trieur 8 compartiments', 'trieur8.jpg', 7,22);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (25, 'Trieur 6 compartiments', 'trieur6.jpg', 7,23);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (80, 'Porte vue', 'porteVue.jpg', 7,24);


INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (26, 'Colle en baton', 'colleBaton.jpg', 8,25);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (27, 'Colle liquide', 'colleLiquide.jpg', 8,26);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (28, 'Scotch', 'scotch.jpg', 8,27);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (29, 'Super Glue', 'superglue.jpg', 8,28);

INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (30, 'Ciseaux', 'ciseaux.jpg', 9,29);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (31, 'Taille-crayon', 'tailleCrayon.jpg', 9,30);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (12, 'Taille-crayon en plastique', 'tailleCrayonPlastique.jpg', 9,31);

INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (32, 'Règles', 'regle.jpg', 10,32);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (33, 'Equerres', 'equerre.jpg', 10,33);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (34, 'Rapporteurs', 'rapporteur.jpg', 10,34);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (35, 'Compas', 'compas.jpg', 10,35);

INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (36, 'Etiquettes simple', 'etiquette.jpg', 11,36);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (37, 'Etiquettes à motifs', 'etiquettemotif.jpg', 11,37);

INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (38, 'Trombones', 'trombone.jpg', 12,38);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (39, 'Elastiques', 'elastique.jpg', 12,39);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (40, 'Oeillets', 'oeillet.jpg', 12,40);

INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (41, 'Stylo bille bleu', 'styloBleu.jpg', 13,41);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (42, 'Stylo bille noir', 'styloNoir.jpg', 13,42);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (43, 'Stylo bille rouge', 'styloRouge.jpg', 13,43);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (44, 'Stylo bille vert', 'styloVert.jpg', 13,44);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (45, 'Stylo plume', 'styloPlume.jpg', 13,45);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (79, 'Cartouches encre', 'encre.jpg', 13,46);       

INSERT INTO `fourniture`  (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (46, 'Feutres de coloriage', 'feutrecoloriage.jpg', 14,47);
INSERT INTO `fourniture`  (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (47, 'Feutres pointe fine', 'feutrefine.jpg', 14,48);
INSERT INTO `fourniture`  (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (48, 'Feutres à plume', 'feutreplume.jpg', 14,49);

INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (49, 'Crayon papier', 'crayonpapier.jpg', 15,50);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (50, 'Porte mines', 'portemine.jpg', 15,51);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (51, 'Mines', 'mine.jpg', 15,52);

INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (52, 'Marqueur permanent', 'marqueurPermanent.jpg', 16,53);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (53, 'Marqueur effaçable', 'marqueurEffacable.jpg', 16,54);

INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (54, 'Surligneur classique', 'surligneurClassique.jpg', 17,55);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (55, 'Surligneur crayon', 'surligneurCrayon.jpg', 17,56);

INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (56, 'Correcteur liquide', 'correcteurLiquide.jpg', 18,57);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (57, 'Correcteur stylos', 'correcteurStylo.jpg', 18, 58);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (58, 'Gomme', 'gomme.jpg', 18 ,59);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (59, 'Effaceur', 'effaceur.jpg', 18,60);

INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (60, 'Cahier A5, petits carreaux', 'cahierPCpetit.jpg', 19,61);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (61, 'Cahier A4, petits carreaux', 'cahierPCgrand.jpg', 19,62);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (62, 'Cahier A5, grands carreaux', 'cahierGCpetit.jpg', 19,63);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (63, 'Cahier A4, grands carreaux', 'cahierGCgrand.jpg', 19,64);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (64, 'Protège cahier', 'protegeCahier.jpg', 19,65);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (78, 'Cahier de brouillon', 'brouillon.jpg', 19,66);

INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (65, 'Blocs petits carreaux', 'blocPC.jpg', 20,67);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (66, 'Blocs grands carreaux', 'blocGC.jpg', 20,68);

INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (67, 'Fiches A4', 'fichepetite.jpg', 21, 69);					/*a trouver*/
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (87, 'Fiches A5', 'fichepetite.jpg', 21, 70);

INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (68, 'Cahier de texte', 'cahiertexte.jpg', 22, 71);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (69, 'Agenda', 'agenda.jpg', 22, 72);

INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (70, 'Cartable', 'cartable.jpg', 23, 73);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (71, 'Sac à dos', 'sacados.jpg', 23, 74);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (72, 'Sac de sport', 'sport.jpg', 23,75);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (73, 'Trousses', 'trousse.jpg', 23,76);

INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (75, 'Calculatrice Casio', 'casio.jpg', 24,77);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (76, 'Calculatrice Texas', 'texas.jpg', 24,78);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (77, 'Calculatrice simple', 'calculatrice.jpg', 24,79);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (82, 'Ardoise', 'ardoise.jpg', 24,80);

INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (83, 'Gilets Jaune', 'giletJaune.jpg', 25,82);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (84, 'Blouses', 'blouse.jpg', 25,83);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (85, 'Baskets', 'basket.jpg', 25,84);
INSERT INTO `fourniture` (id, libelle, nomImage, sousCategorieFourniture_id, stock_id) VALUES (86, 'Ballerines', 'ballerine.jpg', 25,85);




--
--/*TODO: insert achat*/

INSERT INTO `achat` (id, quantite, prix, dateAchat, dateRemboursement, fourniture_id, adherent_id) VALUES (1, 15, 2.5, '2018-06-30', null, 1, null);
INSERT INTO `achat` (id, quantite, prix, dateAchat, dateRemboursement, fourniture_id, adherent_id) VALUES (2, 15, 2.5, '2018-06-30', null, 2, null);
INSERT INTO `achat` (id, quantite, prix, dateAchat, dateRemboursement, fourniture_id, adherent_id) VALUES (3, 15, 2.5, '2018-06-30', null, 3, null);
INSERT INTO `achat` (id, quantite, prix, dateAchat, dateRemboursement, fourniture_id, adherent_id) VALUES (4, 15, 2.5, '2018-06-30', null, 4, null);
INSERT INTO `achat` (id, quantite, prix, dateAchat, dateRemboursement, fourniture_id, adherent_id) VALUES (5, 15, 2.5, '2018-06-30', null, 5, null);

--
--/*TODO: insert don */
--
INSERT INTO `don` (id, quantite, dateDon, fourniture_id, adherent_id) VALUES (1, 15, '2018-06-02', 6, 1);
INSERT INTO `don` (id, quantite, dateDon, fourniture_id, adherent_id) VALUES (2, 15, '2018-06-02', 7, 1);
INSERT INTO `don` (id, quantite, dateDon, fourniture_id, adherent_id) VALUES (3, 15, '2018-06-02', 8, 2);
INSERT INTO `don` (id, quantite, dateDon, fourniture_id, adherent_id) VALUES (4, 15, '2018-06-02', 9, 2);
INSERT INTO `don` (id, quantite, dateDon, fourniture_id, adherent_id) VALUES (5, 15, '2018-06-02', 10, 3);
--/*TODO: insert composer*/

INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (1, 2, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (1, 16, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (1, 45, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (1, 46, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (1, 75, 1);

INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (4, 2, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (4, 16, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (4, 45, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (4, 46, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (4, 75, 1);

INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (7, 2, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (7, 16, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (7, 45, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (7, 46, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (7, 75, 1);

INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (11, 2, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (11, 16, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (11, 45, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (11, 46, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (11, 75, 1);

INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (15, 2, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (15, 16, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (15, 45, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (15, 46, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (15, 75, 1);

INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (20, 2, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (20, 16, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (20, 45, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (20, 46, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (20, 75, 1);

INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (26, 2, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (26, 16, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (26, 45, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (26, 46, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (26, 75, 1);

INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (28, 2, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (28, 16, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (28, 45, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (28, 46, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (28, 75, 1);

INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (32, 2, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (32, 16, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (32, 45, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (32, 46, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (32, 75, 1);

INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (36, 2, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (36, 16, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (36, 45, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (36, 46, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (36, 75, 1);

INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (40, 2, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (40, 16, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (40, 45, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (40, 46, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (40, 75, 1);

INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (45, 2, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (45, 16, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (45, 45, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (45, 46, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (45, 75, 1);

INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (50, 2, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (50, 16, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (50, 45, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (50, 46, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (50, 75, 1);

INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (53, 2, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (53, 16, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (53, 45, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (53, 46, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (53, 75, 1);

INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (57, 2, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (57, 16, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (57, 45, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (57, 46, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (57, 75, 1);

INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (61, 2, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (61, 16, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (61, 45, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (61, 46, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (61, 75, 1);

INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (66, 2, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (66, 16, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (66, 45, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (66, 46, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (66, 75, 1);

INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (70, 2, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (70, 16, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (70, 45, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (70, 46, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (70, 75, 1);

INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (75, 2, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (75, 16, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (75, 45, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (75, 46, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (75, 75, 1);

INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (78, 2, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (78, 16, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (78, 45, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (78, 46, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (78, 75, 1);

INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (82, 2, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (82, 16, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (82, 45, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (82, 46, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (82, 75, 1);

INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (86, 2, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (86, 16, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (86, 45, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (86, 46, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (86, 75, 1);

INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (91, 2, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (91, 16, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (91, 45, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (91, 46, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (91, 75, 1);

INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (95, 2, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (95, 16, 5);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (95, 45, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (95, 46, 1);
INSERT INTO `composer` (listeFournitureEcole_id, fourniture_id, quantite) VALUES (95, 75, 1);


--
--/*TODO: insert retirer*/

INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (2, 1, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (16, 1, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (45, 1, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (46, 1, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (75, 1, 1);

INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (2, 2, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (16, 2, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (45, 2, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (46, 2, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (75, 2, 1);

INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (2, 3, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (16, 3, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (45, 3, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (46, 3, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (75, 3, 1);

INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (2, 4, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (16, 4, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (45, 4, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (46, 4, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (75, 4, 1);

INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (2, 5, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (16, 5, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (45, 5, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (46, 5, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (75, 5, 1);

INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (2, 6, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (16, 6, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (45, 6, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (46, 6, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (75, 6, 1);

INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (2, 7, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (16, 7, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (45, 7, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (46, 7, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (75, 7, 1);

INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (2, 8, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (16, 8, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (45, 8, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (46, 8, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (75, 8, 1);

INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (2, 9, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (16, 9, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (45, 9, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (46, 9, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (75, 9, 1);

INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (2, 10, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (16, 10, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (45, 10, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (46, 10, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (75, 10, 1);

INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (2, 11, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (16, 11, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (45, 11, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (46, 11, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (75, 11, 1);

INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (2, 12, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (16, 12, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (45, 12, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (46, 12, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (75, 12, 1);

INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (2, 13, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (16, 13, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (45, 13, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (46, 13, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (75, 13, 1);

INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (2, 14, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (16, 14, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (45, 14, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (46, 14, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (75, 14, 1);

INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (2, 15, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (16, 15, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (45, 15, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (46, 15, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (75, 15, 1);

INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (2, 16, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (16, 16, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (45, 16, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (46, 16, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (75, 16, 1);

INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (2, 17, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (16, 17, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (45, 17, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (46, 17, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (75, 17, 1);

INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (2, 18, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (16, 18, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (45, 18, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (46, 18, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (75, 18, 1);

INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (2, 19, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (16, 19, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (45, 19, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (46, 19, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (75, 19, 1);

INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (2, 20, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (16, 20, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (45, 20, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (46, 20, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (75, 20, 1);

INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (2, 21, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (16, 21, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (45, 21, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (46, 21, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (75, 21, 1);

INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (2, 22, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (16, 22, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (45, 22, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (46, 22, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (75, 22, 1);

INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (2, 23, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (16, 23, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (45, 23, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (46, 23, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (75, 23, 1);

INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (2, 24, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (16, 24, 5);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (45, 24, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (46, 24, 1);
INSERT INTO `retirer` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (75, 24, 1);

--
--/*TODO: insert non dispo*/
INSERT INTO `nonDisponible` (fourniture_id, listeFourniturePersonnalisee_id, quantite) VALUES (1, 1, 1);

--/*TODO: insert echange*/
INSERT INTO `echange` (id, description, quantite, dateCreation, dateCloture, fourniture_id, adherent_id) VALUES (1, '8 classeurs neufs et 2 utilisés mais en très bon état', 10, '2018-12-10', '2018-12-10', 16, 2);
INSERT INTO `echange` (id, description, quantite, dateCreation, dateCloture, fourniture_id, adherent_id) VALUES (2, 'Echange deux rouleaux de scotch contre des gommes!', 2, '2018-12-10', '2018-12-10', 28, 3);
INSERT INTO `echange` (id, description, quantite, dateCreation, dateCloture, fourniture_id, adherent_id) VALUES (3, 'Des équerres en rab, recherche des compas en échange..', 6, '2018-12-10', '2018-12-10', 33, 5);
INSERT INTO `echange` (id, description, quantite, dateCreation, dateCloture, fourniture_id, adherent_id) VALUES (4, 'Protèges cahiers achetés en trop', 28, '2018-12-10', '2018-12-10', 64, 8);
INSERT INTO `echange` (id, description, quantite, dateCreation, dateCloture, fourniture_id, adherent_id) VALUES (5, 'Neufs!', 32, '2018-12-10', '2018-12-10', 12, 4);
INSERT INTO `echange` (id, description, quantite, dateCreation, dateCloture, fourniture_id, adherent_id) VALUES (6, 'Marque Adidas, pointure 38, neuf', 1, '2018-12-10', '2018-12-10', 85, 12);

INSERT INTO `echange` (id, description, quantite, dateCreation, dateCloture, fourniture_id, adherent_id) VALUES (7, 'Stylos noirs à échanger contre cahiers', 65, '2018-12-10', '2018-12-10', 42, 1);
INSERT INTO `echange` (id, description, quantite, dateCreation, dateCloture, fourniture_id, adherent_id) VALUES (8, 'Neuf', 8, '2018-12-10', '2018-12-10', 1, 10);
INSERT INTO `echange` (id, description, quantite, dateCreation, dateCloture, fourniture_id, adherent_id) VALUES (9, 'Jamais utilisé, échange contre petites fournitures', 7, '2018-12-10', '2018-12-10',19 , 11);

--













