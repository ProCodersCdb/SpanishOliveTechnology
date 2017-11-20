CREATE TABLE `usuarios` (
	`userID` INT(11) NOT NULL AUTO_INCREMENT,
	`email` VARCHAR(50) NOT NULL,
	`pass` VARCHAR(50) NOT NULL,
	`data` VARCHAR(280) NULL DEFAULT NULL,
	PRIMARY KEY (`userID`),
	UNIQUE INDEX `email` (`email`)
)
COMMENT='Tabla donde se guardan los usuarios registrados en Spanish Olive Technology'
COLLATE='utf8_general_ci'
ENGINE=InnoDB
AUTO_INCREMENT=13
;
