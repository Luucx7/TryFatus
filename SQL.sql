CREATE DATABASE  IF NOT EXISTS `tryfatus` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `tryfatus`;
-- MySQL dump 10.13  Distrib 5.7.23, for Win64 (x86_64)
--
-- Host: localhost    Database: tryfatus
-- ------------------------------------------------------
-- Server version	5.7.23

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clientes` (
  `CPF` varchar(11) NOT NULL,
  `Nome` varchar(60) NOT NULL,
  `RG` varchar(12) NOT NULL,
  `Celular` varchar(17) DEFAULT NULL,
  `Telefone` varchar(17) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `Endereco` varchar(60) DEFAULT NULL,
  `Bairro` varchar(20) DEFAULT NULL,
  `Cidade` varchar(30) DEFAULT NULL,
  `Estado` char(2) DEFAULT 'SC',
  `Nascimento` date DEFAULT NULL,
  PRIMARY KEY (`CPF`),
  UNIQUE KEY `CPF_UNIQUE` (`CPF`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `juros`
--

DROP TABLE IF EXISTS `juros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `juros` (
  `ID` int(11) NOT NULL,
  `taxa_base` double NOT NULL DEFAULT '0.05',
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID_UNIQUE` (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `vendas`
--

DROP TABLE IF EXISTS `vendas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vendas` (
  `idVenda` int(11) NOT NULL AUTO_INCREMENT,
  `Clientes_CPF` varchar(11) NOT NULL,
  `Produto` varchar(60) NOT NULL,
  `valorTotal` double NOT NULL,
  `valorPago` double DEFAULT NULL,
  `quantiaParcelas` int(11) NOT NULL,
  `metodoPagamento` varchar(10) DEFAULT NULL,
  `dataCompra` date DEFAULT NULL,
  `dataVencimento` date DEFAULT NULL,
  `ativa` tinyint(1) NOT NULL,
  PRIMARY KEY (`idVenda`),
  KEY `fk_Vendas_Clientes_idx` (`Clientes_CPF`),
  CONSTRAINT `fk_Vendas_Clientes` FOREIGN KEY (`Clientes_CPF`) REFERENCES `clientes` (`CPF`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-07 21:16:56
