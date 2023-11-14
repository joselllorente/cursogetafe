CREATE TABLE TB_DIRECCION (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    tipo_direccion ENUM('calle', 'plaza', 'travesía', 'avenida', 'carretera', 'otro') NOT NULL COMMENT "Calle, plaza, travesía, avenida, carretera, otro.",
	direccion VARCHAR(40),
    ciudad VARCHAR(20),
    provincia VARCHAR(20),
    cod_postal NUMERIC(5)
);

CREATE TABLE TB_BIBLIOTECA (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(20) NOT NULL,
    fk_direccion INT NOT NULL,
    FOREIGN KEY (fk_direccion) REFERENCES TB_DIRECCION (id)
);

SELECT ID, TITULO, AUTOR, ISBN FROM TB_LIBROS WHERE FK_BIBLIOTECA=2


CREATE TABLE TB_LIBROS (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(30) NOT NULL,
    autor VARCHAR(20),
    ISBN VARCHAR(20),
    fk_biblioteca INT NOT NULL,
    CONSTRAINT FK_LIBRO_BIBLIOTECA_ID FOREIGN KEY (fk_biblioteca) REFERENCES TB_BIBLIOTECA (id)
);


INSERT INTO TB_DIRECCION (tipo_direccion, direccion, ciudad, provincia, cod_postal)
VALUES ("calle","Nombre Calle 1", "Ciudad1","Provincia1",28000);
INSERT INTO TB_DIRECCION (tipo_direccion, direccion, ciudad, provincia, cod_postal)
VALUES ("calle","Nombre Calle 2", "Ciudad2","Provincia2",37000);

SELECT * FROM TB_DIRECCION;

INSERT INTO TB_BIBLIOTECA (nombre,fk_direccion)
VALUES ("Biblioteca 1", 1);
INSERT INTO TB_BIBLIOTECA (nombre,fk_direccion)
VALUES ("Biblioteca 2", 2);

SELECT * FROM TB_BIBLIOTECA;