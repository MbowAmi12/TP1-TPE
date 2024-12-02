CREATE TABLE Groupe (
    ID_Groupe INT PRIMARY KEY,
    Nom VARCHAR(20) NOT NULL
);

CREATE TABLE Professeur (
    ID_Professeur INT PRIMARY KEY,
    Nom VARCHAR(20) NOT NULL,
    Prenom VARCHAR(20) NOT NULL,
    Domaine_Specialisation VARCHAR(20)
);

CREATE TABLE Cours (
    ID_Cours INT PRIMARY KEY,
    Intitule VARCHAR(20) NOT NULL,
    Coefficient INT NOT NULL,
    ID_Professeur INT,
    FOREIGN KEY (ID_Professeur) REFERENCES Professeur(ID_Professeur)
);

CREATE TABLE Eleve (
    Matricule INT PRIMARY KEY,
    Nom VARCHAR(20) NOT NULL,
    Prenom VARCHAR(20) NOT NULL,
    Date_Naissance DATE NOT NULL,
    ID_Groupe INT,
    FOREIGN KEY (ID_Groupe) REFERENCES Groupe(ID_Groupe)
);

CREATE TABLE Note (
    ID_Note INT PRIMARY KEY,
    Matricule_Eleve INT,
    ID_Cours INT,
    Valeur DECIMAL(10,2),
    FOREIGN KEY (Matricule_Eleve) REFERENCES Eleve(Matricule),
    FOREIGN KEY (ID_Cours) REFERENCES Cours(ID_Cours)
);

INSERT INTO Groupe VALUES (1, 'Groupe A');
INSERT INTO Groupe VALUES (2, 'Groupe B');

INSERT INTO Professeur VALUES (1, 'mabye', 'abdoulaye', 'java');
INSERT INTO Professeur VALUES (2, 'dia', 'astou', 'sql');
INSERT INTO Professeur VALUES (3, 'koundoul', 'birane', 'merise');

INSERT INTO Cours VALUES (1, 'mathematique', 2, 1);
INSERT INTO Cours VALUES (2, 'PC', 4, 2);
INSERT INTO Cours VALUES (3, 'Programation', 5, 3);
INSERT INTO Cours VALUES (4, 'algorithme', 2, 1);

INSERT INTO Eleve VALUES (101, 'Mbow', 'aminata', '2002-05-12', 1);
INSERT INTO Eleve VALUES (102, 'Tall', 'papa', '2005-09-11', 1);
INSERT INTO Eleve VALUES (103, 'ndiaye', 'mame', '2003-11-30', 2);
INSERT INTO Eleve VALUES (104, 'faye', 'ibrahima', '2007-03-12', 2);

