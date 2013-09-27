-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         5.5.28 - MySQL Community Server (GPL)
-- SO del servidor:              Win32
-- HeidiSQL Versión:             8.0.0.4396
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Volcando estructura de base de datos para banco
DROP DATABASE IF EXISTS `banco`;
CREATE DATABASE IF NOT EXISTS `banco` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `banco`;


-- Volcando estructura para tabla banco.cuentabancaria
DROP TABLE IF EXISTS `cuentabancaria`;
CREATE TABLE IF NOT EXISTS `cuentabancaria` (
  `idCuentaBancaria` int(10) DEFAULT NULL,
  `numeroCuenta` varchar(50) DEFAULT NULL,
  `dc` varchar(50) DEFAULT NULL,
  `saldo` decimal(10,0) DEFAULT NULL,
  `cif` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla banco.cuentabancaria: ~0 rows (aproximadamente)
DELETE FROM `cuentabancaria`;
/*!40000 ALTER TABLE `cuentabancaria` DISABLE KEYS */;
/*!40000 ALTER TABLE `cuentabancaria` ENABLE KEYS */;


-- Volcando estructura para tabla banco.entidadbancaria
DROP TABLE IF EXISTS `entidadbancaria`;
CREATE TABLE IF NOT EXISTS `entidadbancaria` (
  `idEntidad` int(10) DEFAULT NULL,
  `codigoEntidad` varchar(50) DEFAULT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `cif` varchar(50) DEFAULT NULL,
  `tipoEntidadBancaria` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla banco.entidadbancaria: ~0 rows (aproximadamente)
DELETE FROM `entidadbancaria`;
/*!40000 ALTER TABLE `entidadbancaria` DISABLE KEYS */;
/*!40000 ALTER TABLE `entidadbancaria` ENABLE KEYS */;


-- Volcando estructura para tabla banco.movimientobancario
DROP TABLE IF EXISTS `movimientobancario`;
CREATE TABLE IF NOT EXISTS `movimientobancario` (
  `idMovimientoBancario` int(10) DEFAULT NULL,
  `importe` decimal(10,0) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `saltoTotal` decimal(10,0) DEFAULT NULL,
  `concepto` varchar(50) DEFAULT NULL,
  `tipoMovimientoBancario` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla banco.movimientobancario: ~0 rows (aproximadamente)
DELETE FROM `movimientobancario`;
/*!40000 ALTER TABLE `movimientobancario` DISABLE KEYS */;
/*!40000 ALTER TABLE `movimientobancario` ENABLE KEYS */;


-- Volcando estructura para tabla banco.sucursalbancaria
DROP TABLE IF EXISTS `sucursalbancaria`;
CREATE TABLE IF NOT EXISTS `sucursalbancaria` (
  `idSucursalBancaria` int(10) DEFAULT NULL,
  `entidadBancaria` varchar(50) DEFAULT NULL,
  `codigoSucursal` varchar(50) DEFAULT NULL,
  `nombre` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla banco.sucursalbancaria: ~0 rows (aproximadamente)
DELETE FROM `sucursalbancaria`;
/*!40000 ALTER TABLE `sucursalbancaria` DISABLE KEYS */;
/*!40000 ALTER TABLE `sucursalbancaria` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
cuentabancaria