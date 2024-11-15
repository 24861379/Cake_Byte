-- MySQL Script generated by MySQL Workbench
-- Fri Nov 15 15:39:32 2024
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema db_cake_byte
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema db_cake_byte
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_cake_byte` DEFAULT CHARACTER SET utf8mb4 ;
-- -----------------------------------------------------
-- Schema DB_Cake_Byte
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema DB_Cake_Byte
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `DB_Cake_Byte` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci ;
USE `db_cake_byte` ;

-- -----------------------------------------------------
-- Table `db_cake_byte`.`tb_cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_cake_byte`.`tb_cliente` (
  `ID_Cliente` INT(11) NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(45) NOT NULL,
  `Apellido` VARCHAR(45) NOT NULL,
  `Direccion` VARCHAR(100) NOT NULL,
  `Correo` VARCHAR(100) NOT NULL,
  `Telefono` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`ID_Cliente`))
ENGINE = InnoDB
AUTO_INCREMENT = 8
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `db_cake_byte`.`tb_decoracion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_cake_byte`.`tb_decoracion` (
  `ID_Decoracion` INT(11) NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(50) NOT NULL,
  `Precio_Adicional` DECIMAL(11,2) NOT NULL DEFAULT 0.00,
  PRIMARY KEY (`ID_Decoracion`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `db_cake_byte`.`tb_figura`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_cake_byte`.`tb_figura` (
  `ID_Figura` INT(11) NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(50) NOT NULL,
  `Precio_Adicional` DECIMAL(11,2) NOT NULL DEFAULT 0.00,
  PRIMARY KEY (`ID_Figura`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `db_cake_byte`.`tb_pedido`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_cake_byte`.`tb_pedido` (
  `ID_Pedido` INT(11) NOT NULL AUTO_INCREMENT,
  `ID_Cliente` INT(11) NOT NULL,
  `Fecha_Pedido` DATETIME NOT NULL,
  `Fecha_Entrega` DATETIME NOT NULL,
  `Estado` ENUM('Pendiente', 'Confirmado', 'En Preparacion', 'Listo', 'Entregado', 'Cancelado') NOT NULL DEFAULT 'Pendiente',
  `Instrucciones_Especiales` TEXT NULL DEFAULT NULL,
  `Total` DECIMAL(11,2) NOT NULL DEFAULT 0.00,
  PRIMARY KEY (`ID_Pedido`),
  INDEX `FK_ClientePedido_idx` (`ID_Cliente` ASC) VISIBLE,
  CONSTRAINT `FK_Cliente_Pedido`
    FOREIGN KEY (`ID_Cliente`)
    REFERENCES `db_cake_byte`.`tb_cliente` (`ID_Cliente`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `db_cake_byte`.`tb_sabor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_cake_byte`.`tb_sabor` (
  `ID_Sabor` INT(11) NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(50) NOT NULL,
  `Precio_Adicional` DECIMAL(11,2) NOT NULL DEFAULT 0.00,
  PRIMARY KEY (`ID_Sabor`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `db_cake_byte`.`tb_torta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_cake_byte`.`tb_torta` (
  `ID_Torta` INT(11) NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(100) NOT NULL,
  `Descripcion` TEXT NOT NULL,
  `Precio_Base` DECIMAL(11,2) NOT NULL,
  PRIMARY KEY (`ID_Torta`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `db_cake_byte`.`tb_detalle_pedido`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_cake_byte`.`tb_detalle_pedido` (
  `ID_Detalle` INT(11) NOT NULL AUTO_INCREMENT,
  `ID_Pedido` INT(11) NOT NULL,
  `ID_Torta` INT(11) NOT NULL,
  `ID_Figura` INT(11) NOT NULL,
  `ID_Sabor` INT(11) NOT NULL,
  `ID_Decoracion` INT(11) NOT NULL,
  `Cantidad` INT(11) NOT NULL,
  `Precio_Unitario` DECIMAL(11,2) NOT NULL,
  `Subtotal` DECIMAL(11,2) NOT NULL,
  PRIMARY KEY (`ID_Detalle`),
  INDEX `FK_Pedido_idx` (`ID_Pedido` ASC) VISIBLE,
  INDEX `FK_Torta_idx` (`ID_Torta` ASC) VISIBLE,
  INDEX `FK_Figura_idx` (`ID_Figura` ASC) VISIBLE,
  INDEX `FK_Sabor_idx` (`ID_Sabor` ASC) VISIBLE,
  INDEX `FK_Decoracion_idx` (`ID_Decoracion` ASC) VISIBLE,
  CONSTRAINT `FK_Decoracion`
    FOREIGN KEY (`ID_Decoracion`)
    REFERENCES `db_cake_byte`.`tb_decoracion` (`ID_Decoracion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_Figura`
    FOREIGN KEY (`ID_Figura`)
    REFERENCES `db_cake_byte`.`tb_figura` (`ID_Figura`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_Pedido_Detalle`
    FOREIGN KEY (`ID_Pedido`)
    REFERENCES `db_cake_byte`.`tb_pedido` (`ID_Pedido`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_Sabor`
    FOREIGN KEY (`ID_Sabor`)
    REFERENCES `db_cake_byte`.`tb_sabor` (`ID_Sabor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_Torta_Detalle`
    FOREIGN KEY (`ID_Torta`)
    REFERENCES `db_cake_byte`.`tb_torta` (`ID_Torta`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `db_cake_byte`.`tb_empleado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_cake_byte`.`tb_empleado` (
  `ID_Empleado` INT(11) NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(45) NOT NULL,
  `Apellido` VARCHAR(45) NOT NULL,
  `Correo` VARCHAR(100) NOT NULL,
  `Telefono` VARCHAR(15) NOT NULL,
  `Puesto` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`ID_Empleado`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `db_cake_byte`.`tb_historial_pedido`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_cake_byte`.`tb_historial_pedido` (
  `ID_Historial` INT(11) NOT NULL AUTO_INCREMENT,
  `ID_Pedido` INT(11) NOT NULL,
  `Estado_Anterior` ENUM('Pendiente', 'Confirmado', 'En Preparacion', 'Listo', 'Entregado', 'Cancelado') NOT NULL,
  `Fecha_Cambio` DATETIME NOT NULL,
  `Observaciones` TEXT NULL DEFAULT NULL,
  PRIMARY KEY (`ID_Historial`),
  INDEX `FK_PedidoHistorial_idx` (`ID_Pedido` ASC) VISIBLE,
  CONSTRAINT `FK_Pedido_Historial`
    FOREIGN KEY (`ID_Pedido`)
    REFERENCES `db_cake_byte`.`tb_pedido` (`ID_Pedido`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `db_cake_byte`.`tb_pago`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_cake_byte`.`tb_pago` (
  `ID_Pago` INT(11) NOT NULL AUTO_INCREMENT,
  `ID_Pedido` INT(11) NOT NULL,
  `Metodo_Pago` ENUM('Tarjeta', 'Efectivo', 'Nequi') NOT NULL,
  `Monto` DECIMAL(11,2) NOT NULL,
  `Fecha_Pago` DATETIME NOT NULL,
  PRIMARY KEY (`ID_Pago`),
  INDEX `FK_PedidoPago_idx` (`ID_Pedido` ASC) VISIBLE,
  CONSTRAINT `FK_Pedido_Pago`
    FOREIGN KEY (`ID_Pedido`)
    REFERENCES `db_cake_byte`.`tb_pedido` (`ID_Pedido`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `db_cake_byte`.`tb_usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_cake_byte`.`tb_usuario` (
  `ID_Usuario` INT(11) NOT NULL AUTO_INCREMENT,
  `ID_Cliente` INT NOT NULL,
  `ID_Empleado` INT NOT NULL,
  `Nombre_Usuario` VARCHAR(50) NOT NULL,
  `Contrasena` VARCHAR(128) NOT NULL,
  `Rol` ENUM('Cliente', 'Empleado', 'Administrador') NOT NULL,
  PRIMARY KEY (`ID_Usuario`),
  UNIQUE INDEX `Nombre_Usuario` (`Nombre_Usuario` ASC) VISIBLE,
  INDEX `FK_Cliente_Usuario_idx` (`ID_Cliente` ASC) VISIBLE,
  INDEX `FK_Empleado_Usuario_idx` (`ID_Empleado` ASC) VISIBLE,
  CONSTRAINT `FK_Cliente_Usuario`
    FOREIGN KEY (`ID_Cliente`)
    REFERENCES `db_cake_byte`.`tb_cliente` (`ID_Cliente`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_Empleado_Usuario`
    FOREIGN KEY (`ID_Empleado`)
    REFERENCES `db_cake_byte`.`tb_empleado` (`ID_Empleado`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 65
DEFAULT CHARACTER SET = utf8mb4;

USE `DB_Cake_Byte` ;

-- -----------------------------------------------------
-- Table `DB_Cake_Byte`.`tb_Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_Cake_Byte`.`tb_Usuario` (
  `ID_Usuario` INT NOT NULL AUTO_INCREMENT,
  `Nombre_Usuario` VARCHAR(50) NOT NULL,
  `Contrasena` VARCHAR(128) NOT NULL,
  `Rol` ENUM('Cliente', 'Empleado', 'Administrador') NOT NULL,
  UNIQUE INDEX (`Nombre_Usuario` ASC) VISIBLE,
  PRIMARY KEY (`ID_Usuario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DB_Cake_Byte`.`tb_Cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_Cake_Byte`.`tb_Cliente` (
  `ID_Cliente` INT NOT NULL AUTO_INCREMENT,
  `ID_Usuario` INT NOT NULL,
  `Nombre` VARCHAR(45) NOT NULL,
  `Apellido` VARCHAR(45) NOT NULL,
  `Direccion` VARCHAR(100) NOT NULL,
  `Correo` VARCHAR(100) NOT NULL,
  `Telefono` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`ID_Cliente`),
  INDEX `FK_Usuario_idx` (`ID_Usuario` ASC) VISIBLE,
  CONSTRAINT `FK_Usuario_Cliente`
    FOREIGN KEY (`ID_Usuario`)
    REFERENCES `DB_Cake_Byte`.`tb_Usuario` (`ID_Usuario`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DB_Cake_Byte`.`tb_Empleado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_Cake_Byte`.`tb_Empleado` (
  `ID_Empleado` INT NOT NULL AUTO_INCREMENT,
  `ID_Usuario` INT NOT NULL,
  `Nombre` VARCHAR(45) NOT NULL,
  `Apellido` VARCHAR(45) NOT NULL,
  `Correo` VARCHAR(100) NOT NULL,
  `Telefono` VARCHAR(15) NOT NULL,
  `Puesto` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`ID_Empleado`),
  INDEX `FK_UsuarioEmpleado_idx` (`ID_Usuario` ASC) VISIBLE,
  CONSTRAINT `FK_Usuario_Empleado`
    FOREIGN KEY (`ID_Usuario`)
    REFERENCES `DB_Cake_Byte`.`tb_Usuario` (`ID_Usuario`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DB_Cake_Byte`.`tb_Torta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_Cake_Byte`.`tb_Torta` (
  `ID_Torta` INT NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(100) NOT NULL,
  `Descripcion` TEXT NOT NULL,
  `Precio_Base` DECIMAL(11,2) NOT NULL,
  PRIMARY KEY (`ID_Torta`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DB_Cake_Byte`.`tb_Figura`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_Cake_Byte`.`tb_Figura` (
  `ID_Figura` INT NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(50) NOT NULL,
  `Precio_Adicional` DECIMAL(11,2) NOT NULL DEFAULT 0.00,
  PRIMARY KEY (`ID_Figura`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DB_Cake_Byte`.`tb_Sabor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_Cake_Byte`.`tb_Sabor` (
  `ID_Sabor` INT NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(50) NOT NULL,
  `Precio_Adicional` DECIMAL(11,2) NOT NULL DEFAULT 0.00,
  PRIMARY KEY (`ID_Sabor`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DB_Cake_Byte`.`tb_Decoracion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_Cake_Byte`.`tb_Decoracion` (
  `ID_Decoracion` INT NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(50) NOT NULL,
  `Precio_Adicional` DECIMAL(11,2) NOT NULL DEFAULT 0.00,
  PRIMARY KEY (`ID_Decoracion`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DB_Cake_Byte`.`tb_Pedido`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_Cake_Byte`.`tb_Pedido` (
  `ID_Pedido` INT NOT NULL AUTO_INCREMENT,
  `ID_Cliente` INT NOT NULL,
  `Fecha_Pedido` DATETIME NOT NULL,
  `Fecha_Entrega` DATETIME NOT NULL,
  `Estado` ENUM('Pendiente', 'Confirmado', 'En Preparacion', 'Listo', 'Entregado', 'Cancelado') NOT NULL DEFAULT 'Pendiente',
  `Instrucciones_Especiales` TEXT NULL DEFAULT NULL,
  `Total` DECIMAL(11,2) NOT NULL DEFAULT 0.00,
  PRIMARY KEY (`ID_Pedido`),
  INDEX `FK_ClientePedido_idx` (`ID_Cliente` ASC) VISIBLE,
  CONSTRAINT `FK_Cliente_Pedido`
    FOREIGN KEY (`ID_Cliente`)
    REFERENCES `DB_Cake_Byte`.`tb_Cliente` (`ID_Cliente`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DB_Cake_Byte`.`tb_Detalle_Pedido`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_Cake_Byte`.`tb_Detalle_Pedido` (
  `ID_Detalle` INT NOT NULL AUTO_INCREMENT,
  `ID_Pedido` INT NOT NULL,
  `ID_Torta` INT NOT NULL,
  `ID_Figura` INT NOT NULL,
  `ID_Sabor` INT NOT NULL,
  `ID_Decoracion` INT NOT NULL,
  `Cantidad` INT NOT NULL,
  `Precio_Unitario` DECIMAL(11,2) NOT NULL,
  `Subtotal` DECIMAL(11,2) NOT NULL,
  PRIMARY KEY (`ID_Detalle`),
  INDEX `FK_Pedido_idx` (`ID_Pedido` ASC) VISIBLE,
  INDEX `FK_Torta_idx` (`ID_Torta` ASC) VISIBLE,
  INDEX `FK_Figura_idx` (`ID_Figura` ASC) VISIBLE,
  INDEX `FK_Sabor_idx` (`ID_Sabor` ASC) VISIBLE,
  INDEX `FK_Decoracion_idx` (`ID_Decoracion` ASC) VISIBLE,
  CONSTRAINT `FK_Pedido_Detalle`
    FOREIGN KEY (`ID_Pedido`)
    REFERENCES `DB_Cake_Byte`.`tb_Pedido` (`ID_Pedido`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_Torta_Detalle`
    FOREIGN KEY (`ID_Torta`)
    REFERENCES `DB_Cake_Byte`.`tb_Torta` (`ID_Torta`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_Figura`
    FOREIGN KEY (`ID_Figura`)
    REFERENCES `DB_Cake_Byte`.`tb_Figura` (`ID_Figura`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_Sabor`
    FOREIGN KEY (`ID_Sabor`)
    REFERENCES `DB_Cake_Byte`.`tb_Sabor` (`ID_Sabor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_Decoracion`
    FOREIGN KEY (`ID_Decoracion`)
    REFERENCES `DB_Cake_Byte`.`tb_Decoracion` (`ID_Decoracion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DB_Cake_Byte`.`tb_Pago`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_Cake_Byte`.`tb_Pago` (
  `ID_Pago` INT NOT NULL AUTO_INCREMENT,
  `ID_Pedido` INT NOT NULL,
  `Metodo_Pago` ENUM('Tarjeta', 'Efectivo', 'Nequi') NOT NULL,
  `Monto` DECIMAL(11,2) NOT NULL,
  `Fecha_Pago` DATETIME NOT NULL,
  PRIMARY KEY (`ID_Pago`),
  INDEX `FK_PedidoPago_idx` (`ID_Pedido` ASC) VISIBLE,
  CONSTRAINT `FK_Pedido_Pago`
    FOREIGN KEY (`ID_Pedido`)
    REFERENCES `DB_Cake_Byte`.`tb_Pedido` (`ID_Pedido`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DB_Cake_Byte`.`tb_Historial_Pedido`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_Cake_Byte`.`tb_Historial_Pedido` (
  `ID_Historial` INT NOT NULL AUTO_INCREMENT,
  `ID_Pedido` INT NOT NULL,
  `Estado_Anterior` ENUM('Pendiente', 'Confirmado', 'En Preparacion', 'Listo', 'Entregado', 'Cancelado') NOT NULL,
  `Fecha_Cambio` DATETIME NOT NULL,
  `Observaciones` TEXT NULL DEFAULT NULL,
  PRIMARY KEY (`ID_Historial`),
  INDEX `FK_PedidoHistorial_idx` (`ID_Pedido` ASC) VISIBLE,
  CONSTRAINT `FK_Pedido_Historial`
    FOREIGN KEY (`ID_Pedido`)
    REFERENCES `DB_Cake_Byte`.`tb_Pedido` (`ID_Pedido`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
