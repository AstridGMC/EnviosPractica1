-- MySQL dump 10.13  Distrib 8.0.17, for Linux (x86_64)
--
-- Host: localhost    Database: enviosPractica
-- ------------------------------------------------------
-- Server version	8.0.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Cliente`
--

DROP TABLE IF EXISTS `Cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Cliente` (
  `nit` char(9) NOT NULL,
  `cui` char(13) NOT NULL,
  `nombreRemitente` varchar(50) NOT NULL,
  `telefono` varchar(11) NOT NULL,
  `direccion` varchar(60) NOT NULL,
  `paquetesEnRuta` int(11) DEFAULT NULL,
  PRIMARY KEY (`cui`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Cliente`
--

LOCK TABLES `Cliente` WRITE;
/*!40000 ALTER TABLE `Cliente` DISABLE KEYS */;
INSERT INTO `Cliente` VALUES ('8787979-8','3435353535353','Alvaro Carrillo','35353243','La Democracia Huehuetenango',5),('3535353-5','3453535535353','Fernanda  Palacios','35353535','Huehuetenango',6),('4333232-3','4332324234444','Carlos Gutierrez','23424242','Quetzaltenango',5),('3535355-3','4342545454534','Margarita  Ortega','43535353','Huehuetenango',5),('3535354-5','4535353535353','Marcos Gonzales','35353535','Escuintla',10);
/*!40000 ALTER TABLE `Cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Destino`
--

DROP TABLE IF EXISTS `Destino`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Destino` (
  `precio` int(11) NOT NULL,
  `nombre` varchar(25) NOT NULL,
  `codDestino` int(11) NOT NULL,
  PRIMARY KEY (`codDestino`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Destino`
--

LOCK TABLES `Destino` WRITE;
/*!40000 ALTER TABLE `Destino` DISABLE KEYS */;
INSERT INTO `Destino` VALUES (50,'Ciudad Guatemala',1),(45,'Huehuetenango',2),(45,'Escuintla',3);
/*!40000 ALTER TABLE `Destino` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Factura`
--

DROP TABLE IF EXISTS `Factura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Factura` (
  `idFactura` varchar(30) NOT NULL,
  `fecha` date DEFAULT NULL,
  `monto` int(11) NOT NULL,
  `nombreCliente` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idFactura`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Factura`
--

LOCK TABLES `Factura` WRITE;
/*!40000 ALTER TABLE `Factura` DISABLE KEYS */;
INSERT INTO `Factura` VALUES ('1','2019-08-18',51,'Alvaro Carrillo'),('10','2019-08-26',245,'Alvaro Carrillo'),('2','2019-08-24',232,'Fernanda  Palacios'),('3','2019-08-25',57,'Marcos Gonzales'),('4','2019-08-25',54,'Marcos Gonzales'),('5','2019-08-25',57,'Marcos Gonzales'),('6','2019-08-26',67,'Fernanda  Palacios'),('7','2019-08-26',124,'Carlos Gutierrez'),('8','2019-08-26',206,'Carlos Gutierrez'),('9','2019-08-26',130,'null');
/*!40000 ALTER TABLE `Factura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Paquete`
--

DROP TABLE IF EXISTS `Paquete`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Paquete` (
  `numeroDeGuia` varchar(12) NOT NULL,
  `peso` int(11) NOT NULL,
  `codDestino` int(11) NOT NULL,
  `codigoRuta` varchar(30) DEFAULT NULL,
  `idFactura` varchar(30) NOT NULL,
  `estado` varchar(20) NOT NULL,
  `prioridad` tinyint(4) NOT NULL,
  `precioPaquete` int(11) DEFAULT NULL,
  PRIMARY KEY (`numeroDeGuia`),
  KEY `FK_CODIGO_DESTINO` (`codDestino`),
  KEY `FK_ID_FACTURA` (`idFactura`),
  CONSTRAINT `FK_CODIGO_DESTINO` FOREIGN KEY (`codDestino`) REFERENCES `Destino` (`codDestino`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Paquete`
--

LOCK TABLES `Paquete` WRITE;
/*!40000 ALTER TABLE `Paquete` DISABLE KEYS */;
INSERT INTO `Paquete` VALUES ('100000',2,2,'0','1','en ruta',0,51),('100001',32,2,'0','2','en ruta',0,151),('100002',12,3,'A2','2','en ruta',1,232),('100003',4,2,'0','3','en ruta',0,57),('100004',3,2,'0','4','en ruta',0,54),('100005',4,2,'0','5','en ruta',0,57),('100006',4,2,'0','6','en ruta',0,67),('100007',3,2,'0','7','en ruta',0,64),('100008',5,2,'0','7','en ruta',1,124),('100009',5,1,'0','8','en ruta',0,75),('100010',5,3,'0','8','en ruta',1,135),('100011',7,1,'0','8','en ruta',0,206),('100012',3,2,'0','9','en ruta',0,54),('100013',5,3,'0','9','en ruta',0,114),('100014',5,2,'0','9','en ruta',0,70),('100015',5,2,'0','9','en ruta',1,130),('100016',4,3,'0','10','en ruta',0,57),('100017',4,2,'0','10','en ruta',0,114),('100018',5,1,'0','10','en ruta',0,179),('100019',7,3,'0','10','en ruta',0,245),('100020',5,2,'0','10','en ruta',0,60),('100021',2,2,'0','10','en ruta',0,111),('100022',6,3,'0','10','en ruta',0,174),('100023',3,3,'0','10','en ruta',0,64),('100024',4,2,'0','10','en ruta',1,121),('100025',5,1,'0','10','en ruta',0,186),('100026',4,2,'0','10','en ruta',0,67),('100027',5,2,'0','10','en ruta',1,127);
/*!40000 ALTER TABLE `Paquete` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Pasar`
--

DROP TABLE IF EXISTS `Pasar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Pasar` (
  `horas` int(11) DEFAULT NULL,
  `codPuntoDeControl` varchar(30) NOT NULL,
  `numeroDeGuia` varchar(12) NOT NULL,
  `numeroHoras` int(11) DEFAULT NULL,
  `costoTotalPorPaquete` int(11) DEFAULT NULL,
  KEY `FK_COD_PUNTO_DE_CONTOL` (`codPuntoDeControl`),
  KEY `FK_NUMERO_DE_GUIA` (`numeroDeGuia`),
  CONSTRAINT `FK_NUMERO_DE_GUIA` FOREIGN KEY (`numeroDeGuia`) REFERENCES `Paquete` (`numeroDeGuia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Pasar`
--

LOCK TABLES `Pasar` WRITE;
/*!40000 ALTER TABLE `Pasar` DISABLE KEYS */;
INSERT INTO `Pasar` VALUES (NULL,'P3','100002',3,NULL);
/*!40000 ALTER TABLE `Pasar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PuntoDeControl`
--

DROP TABLE IF EXISTS `PuntoDeControl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `PuntoDeControl` (
  `precioGlobal` int(11) NOT NULL,
  `precioIndividual` int(11) DEFAULT NULL,
  `codPuntoDeControl` varchar(30) NOT NULL,
  `codigoRuta` varchar(30) NOT NULL,
  `numeroPuntoControl` int(11) NOT NULL,
  `estado` varchar(15) NOT NULL,
  `capacidad` int(11) NOT NULL,
  `cuiOperador` char(13) DEFAULT NULL,
  PRIMARY KEY (`codPuntoDeControl`),
  KEY `FK_CODIGO_RUTA` (`codigoRuta`),
  KEY `FK_CUI_OPERADOR` (`cuiOperador`),
  CONSTRAINT `FK_CUI_OPERADOR` FOREIGN KEY (`cuiOperador`) REFERENCES `Usuario` (`cuiOperador`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PuntoDeControl`
--

LOCK TABLES `PuntoDeControl` WRITE;
/*!40000 ALTER TABLE `PuntoDeControl` DISABLE KEYS */;
INSERT INTO `PuntoDeControl` VALUES (6,0,'P1','A1',1,'Activo',30,'3535353535353'),(6,2,'P10','A2',4,'Activo',10,'5656565656565'),(6,0,'P11','A3',3,'Activo',14,'4353053905385'),(0,12,'P12','A4',1,'Activo',22,'2424242424242'),(6,2,'P13','A4',2,'Activo',15,'4353053905385'),(6,0,'P14','A4',3,'Activo',20,'4353053905385'),(6,0,'P15','A5',1,'Activo',18,'5656565656565'),(6,3,'P16','A5',2,'Activo',17,'4353053905385'),(6,4,'P17','A5',3,'Activo',25,'3535353535353'),(6,0,'P18','A5',4,'Activo',27,'3535353535353'),(6,5,'P2','A1',2,'Activo',18,'5656565656565'),(6,0,'P3','A2',1,'Activo',20,'3535353535353'),(6,0,'P4','A2',2,'Activo',13,'4353053905385'),(6,0,'P5','A3',1,'Activo',18,'4353053905385'),(6,5,'P6','A3',2,'Activo',22,'3535353535353'),(6,5,'P7','A1',3,'Activo',20,'5656565656565'),(6,5,'P8','A1',4,'Activo',12,'4353053905385'),(6,0,'P9','A2',3,'Activo',25,'3535353535353');
/*!40000 ALTER TABLE `PuntoDeControl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Ruta`
--

DROP TABLE IF EXISTS `Ruta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Ruta` (
  `codDestino` int(11) NOT NULL,
  `codigoRuta` varchar(30) NOT NULL,
  `estado` varchar(15) NOT NULL,
  PRIMARY KEY (`codigoRuta`),
  KEY `FK_COD_DESTINO` (`codDestino`),
  CONSTRAINT `FK_COD_DESTINO` FOREIGN KEY (`codDestino`) REFERENCES `Destino` (`codDestino`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Ruta`
--

LOCK TABLES `Ruta` WRITE;
/*!40000 ALTER TABLE `Ruta` DISABLE KEYS */;
INSERT INTO `Ruta` VALUES (1,'A1','Activo'),(3,'A2','Activo'),(3,'A3','Activo'),(3,'A4','Activo'),(2,'A5','Activo');
/*!40000 ALTER TABLE `Ruta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Usuario`
--

DROP TABLE IF EXISTS `Usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Usuario` (
  `nombreUsuario` varchar(40) NOT NULL,
  `cuiOperador` char(13) NOT NULL,
  `passwordUser` varchar(18) NOT NULL,
  `rango` varchar(15) NOT NULL,
  `telefono` int(11) NOT NULL,
  `estado` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`cuiOperador`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Usuario`
--

LOCK TABLES `Usuario` WRITE;
/*!40000 ALTER TABLE `Usuario` DISABLE KEYS */;
INSERT INTO `Usuario` VALUES ('Brenda Calderon','1212121212121','Calderon.123','administrador',24234234,'Activo'),('Melvin Martinez','1234567890000','Hola.123','administrador',58775456,'Activo'),('Karen Martinez','2334355665567','Lola.123','administrador',34567654,'Activo'),('Diana Recinos','2424242424242','Recinos.123','operador',35353546,'Activo'),('Marcos Morales','3047455530126','Morales.123','administrador',46345430,'Activo'),('Maria Gonzales','3456458730227','Gonzales.123','recepcionista',56878798,'Activo'),('Fernando Flores','3535353535353','Flores.123','operador',35324324,'Activo'),('Carmen Castillo','4353053905385','Castillo.123','operador',56765454,'Activo'),('Fernando Herera','4867655645456','Herrera.123','recepcionista',56789898,'Activo'),('Gerson Perez','5656564545454','Perez.123','recepcionista',32332434,'Activo'),('Marcos Fernandez','5656565656565','Fernandez.123','operador',44546768,'Activo');
/*!40000 ALTER TABLE `Usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-08-26 13:10:06
