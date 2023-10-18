DROP TABLE IF EXISTS TB_FACILITIES;

CREATE TABLE TB_FACILITIES (
	id      INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY COMMENT "id autoincremental",
    guid    NUMERIC(7) UNIQUE COMMENT "Global Unique identifier",
    name    varchar(45) not null COMMENT "NOMBRE DE LA INSTALACIÓN",
    description varchar(200),
    category    varchar(45) DEFAULT "BUILDING",
    address     varchar(200),
    heigth		decimal (5,2) NOT NULL
);

-- INSERTS DE LA TABLA TB_FACILITIES
INSERT INTO TB_FACILITIES (guid, name, description, address, heigth) 
VALUES (123, "EDIFICIO1", "DESCRIPCION", "DIR1", 90.7);
INSERT INTO TB_FACILITIES (id, guid, name, description, address, heigth) 
VALUES (100, 456, "EDIFICIO2", "DESCRIPCION 2", "DIR2", 120.7);
INSERT INTO TB_FACILITIES (guid, name, description, address, heigth, category) 
VALUES (789, "EDIFICIO2", "DESCRIPCION 2", "DIR2", 120.7, "STADIUM");

INSERT INTO TB_FACILITIES (guid, name, description, address, heigth, category) 
VALUES (246, "EDIFICIO3", "DESCRIPCION 3", "DIR3", 146.3, "STADIUM");

SELECT ID, NAME, heigth as altura, category as categoria
FROM TB_FACILITIES
WHERE heigth > 100
ORDER BY heigth, CATEGORY DESC
LIMIT 2;



select COUNT(ID) as CONTADOR from TB_FACILITIES;