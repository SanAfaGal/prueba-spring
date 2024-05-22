CREATE DATABASE IF NOT EXISTS `prueba_tecnica`;
USE `prueba_tecnica`;

CREATE TABLE tbl_personas (
    id_persona INT NOT NULL AUTO_INCREMENT,
    nombre_persona VARCHAR(50) NOT NULL,
    edad INT NOT NULL,
    ocupacion VARCHAR(50) NOT NULL,
    PRIMARY KEY (id_persona)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

CREATE TABLE tbl_lugares (
    id_lugar INT NOT NULL AUTO_INCREMENT,
    nombre_lugar VARCHAR(50) NOT NULL,
    departamento_estado VARCHAR(50) NOT NULL,
    pais VARCHAR(50) NOT NULL,
    fk_persona INT,
    PRIMARY KEY (id_lugar),
    FOREIGN KEY (fk_persona) REFERENCES tbl_personas(id_persona) on update cascade on delete cascade
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;