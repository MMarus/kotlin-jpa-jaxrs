-- @author: Marek Marušic

SET NAMES utf8;
SET foreign_key_checks = 0; -- for clean


DROP TABLE IF EXISTS USER;

CREATE TABLE USER (
	id INT NOT NULL AUTO_INCREMENT,
	firstname VARCHAR(30) NULL,
	surname VARCHAR(30) NULL,
	personalId VARCHAR(30) NULL,
	email VARCHAR(30) NULL,
	birthDate DATETIME NOT NULL,
	role INT NOT NULL,
	password VARCHAR(64) NULL,
	phone VARCHAR(30) NULL,

	PRIMARY KEY (ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;


INSERT INTO USER (id,firstname,surname,personalId,email,birthDate,role,password,phone) VALUES
(1,'admin','admin','admin','admin','2015-11-24 15:00:00', 0, 'admin', '+44444444444'),
(2,'employee','employee','employee','employee','2015-11-24 15:00:00', 0,'employee','+44444444444'),
(3,'customer','customer','customer','customer','2015-11-24 15:00:00', 0,'customer', '+44444444444');