DROP TABLE IF EXISTS Prueba;
CREATE TABLE Prueba (
	id INTEGER NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(50) NOT NULL,
    cursoId INTEGER(2),
    importe DECIMAL(4,2),
	PRIMARY KEY(id)
);
INSERT INTO Prueba (nombre, cursoId, importe) VALUES ("N2", 99, 99.26);
INSERT INTO Prueba (nombre, cursoId, importe) VALUES ("N2", 99, 23.1225);
select * from Prueba;