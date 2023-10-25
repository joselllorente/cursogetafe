DROP TABLE IF EXISTS TB_VEHICULOS_GUERRA;

CREATE TABLE TB_VEHICULOS_GUERRA (
    id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY COMMENT "id autoincremental",
    nombre varchar(20) not null COMMENT "NOMBRE",
    ataque NUMERIC(2) NOT NULL DEFAULT 5,
    defensa NUMERIC(2) NOT NULL DEFAULT 5,
    tipo ENUM('Nave','Tanque') NOT NULL
);


INSERT INTO TB_VEHICULOS_GUERRA (nombre, tipo) 
VALUES ("U.S.S. Enterprise", "Nave");

INSERT INTO TB_VEHICULOS_GUERRA (nombre, tipo, ataque, defensa) 
VALUES ("Tanque1", "Tanque", 10, 0);

--SELECT * FROM TB_VEHICULOS_GUERRA;
DROP TABLE IF EXISTS TB_GUERRERO;
CREATE TABLE TB_GUERRERO (
    id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY COMMENT "id autoincremental",
    nombre varchar(15) not null COMMENT "NOMBRE GUERRERO",
    fuerza NUMERIC(2) NOT NULL DEFAULT 5,
    resistencia NUMERIC(2) NOT NULL DEFAULT 5,
    vehiculo_id INTEGER NOT NULL
);

INSERT INTO TB_GUERRERO (nombre, vehiculo_id)
VALUES ("GUERRERO1", 1);

INSERT INTO TB_GUERRERO (nombre, vehiculo_id)
VALUES ("GUERRERO2", 1);

INSERT INTO TB_GUERRERO (nombre, vehiculo_id)
VALUES ("GUERRERO3", 1);

INSERT INTO TB_GUERRERO (nombre, vehiculo_id)
VALUES ("GUERRERO4", 1);

INSERT INTO TB_GUERRERO (nombre, vehiculo_id)
VALUES ("GUERRERO5", 1);

INSERT INTO TB_GUERRERO (nombre, vehiculo_id)
VALUES ("GUERRERO6", 1);

INSERT INTO TB_GUERRERO (nombre, vehiculo_id)
VALUES ("GUERRERO7", 1);

INSERT INTO TB_GUERRERO (nombre, vehiculo_id)
VALUES ("GUERRERO8", 1);

INSERT INTO TB_GUERRERO (nombre, vehiculo_id)
VALUES ("GUERRERO9", 1);

INSERT INTO TB_GUERRERO (nombre, vehiculo_id)
VALUES ("GUERRERO10", 1);




INSERT INTO TB_GUERRERO (nombre, vehiculo_id, fuerza, resistencia)
VALUES ("Guerrero11", 2, 7, 3);

INSERT INTO TB_GUERRERO (nombre, vehiculo_id, fuerza, resistencia)
VALUES ("Guerrero12", 2, 7, 3);

INSERT INTO TB_GUERRERO (nombre, vehiculo_id, fuerza, resistencia)
VALUES ("Guerrero13", 2, 7, 3);

INSERT INTO TB_GUERRERO (nombre, vehiculo_id, fuerza, resistencia)
VALUES ("Guerrero14", 2, 7, 3);

INSERT INTO TB_GUERRERO (nombre, vehiculo_id, fuerza, resistencia)
VALUES ("Guerrero15", 2, 7, 3);

INSERT INTO TB_GUERRERO (nombre, vehiculo_id, fuerza, resistencia)
VALUES ("Guerrero16", 2, 7, 3);

INSERT INTO TB_GUERRERO (nombre, vehiculo_id, fuerza, resistencia)
VALUES ("Guerrero17", 2, 7, 3);

INSERT INTO TB_GUERRERO (nombre, vehiculo_id, fuerza, resistencia)
VALUES ("Guerrero18", 2, 7, 3);

INSERT INTO TB_GUERRERO (nombre, vehiculo_id, fuerza, resistencia)
VALUES ("Guerrero19", 2, 7, 3);

INSERT INTO TB_GUERRERO (nombre, vehiculo_id, fuerza, resistencia)
VALUES ("Guerrero20", 2, 7, 3);

--SELECT * FROM TB_GUERRERO;