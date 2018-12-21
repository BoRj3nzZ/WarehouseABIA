-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: warehouse
-- ------------------------------------------------------
-- Server version	5.6.35-log

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
-- Table structure for table `order`
--

DROP TABLE IF EXISTS `order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `order` (
  `idORDER` int(11) NOT NULL AUTO_INCREMENT,
  `idUSER` int(11) NOT NULL,
  `idORDERSTATUS` int(11) NOT NULL,
  `ORDERDESC` varchar(45) NOT NULL,
  `DATE` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `DESTINO` int(11) NOT NULL,
  PRIMARY KEY (`idORDER`),
  KEY `FKidUSER_idx` (`idUSER`),
  KEY `FKidORDERSTATUS_idx` (`idORDERSTATUS`),
  KEY `FKidDESTINO_idx` (`DESTINO`),
  CONSTRAINT `FKidDESTINO` FOREIGN KEY (`DESTINO`) REFERENCES `position` (`idPOSITION`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FKidORDERSTATUS` FOREIGN KEY (`idORDERSTATUS`) REFERENCES `order status` (`idORDER STATUS`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FKidUSER` FOREIGN KEY (`idUSER`) REFERENCES `user` (`idUSER`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order`
--

LOCK TABLES `order` WRITE;
/*!40000 ALTER TABLE `order` DISABLE KEYS */;
INSERT INTO `order` VALUES (13,4,2,'Primera orden','2018-11-30 09:27:51',102),(14,5,1,'Segunda orden','2018-11-30 09:27:51',108);
/*!40000 ALTER TABLE `order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order status`
--

DROP TABLE IF EXISTS `order status`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `order status` (
  `idORDER STATUS` int(11) NOT NULL AUTO_INCREMENT,
  `STATUSNAME` varchar(25) NOT NULL,
  `STATUSDESC` varchar(45) NOT NULL,
  PRIMARY KEY (`idORDER STATUS`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order status`
--

LOCK TABLES `order status` WRITE;
/*!40000 ALTER TABLE `order status` DISABLE KEYS */;
INSERT INTO `order status` VALUES (1,'not checked','The order is not already checked.'),(2,'in process','The order is in process.'),(3,'checked','The order is checked.');
/*!40000 ALTER TABLE `order status` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `position`
--

DROP TABLE IF EXISTS `position`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `position` (
  `idPOSITION` int(11) NOT NULL,
  `idPOSTYPE` int(11) NOT NULL,
  `FULL` int(11) NOT NULL COMMENT '0 LIBRE 1 FULL',
  `POSNAME` varchar(45) NOT NULL,
  PRIMARY KEY (`idPOSITION`),
  KEY `FKidPOSTYPE_idx` (`idPOSTYPE`),
  CONSTRAINT `FKidPOSTYPE` FOREIGN KEY (`idPOSTYPE`) REFERENCES `postype` (`idPOSTYPE`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `position`
--

LOCK TABLES `position` WRITE;
/*!40000 ALTER TABLE `position` DISABLE KEYS */;
INSERT INTO `position` VALUES (1,1,0,'Segment 1'),(2,1,0,'Segment 2'),(3,1,0,'Segment 3'),(4,1,0,'Segment 4'),(5,1,0,'Segment 5'),(6,1,0,'Segment 6'),(7,1,0,'Segment 7'),(8,1,0,'Segment 8'),(9,1,0,'Segment 9'),(10,1,0,'Segment 10'),(11,1,0,'Segment 11'),(12,1,0,'Segment 12'),(13,1,0,'Segment 13'),(14,1,0,'Segment 14'),(15,1,0,'Segment 15'),(16,1,0,'Segment 16'),(102,3,1,'Workstation 102'),(103,3,1,'Workstation 103'),(108,3,1,'Workstation 108'),(109,3,1,'Workstation 109'),(114,3,0,'Workstation 114'),(115,3,0,'Workstation 115'),(205,2,0,'Parking 205'),(206,2,0,'Parking 206'),(211,2,0,'Parking 211'),(212,2,0,'Parking 212');
/*!40000 ALTER TABLE `position` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `positionrelation`
--

DROP TABLE IF EXISTS `positionrelation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `positionrelation` (
  `idORIGEN` int(11) NOT NULL,
  `idDESTINO` int(11) NOT NULL,
  PRIMARY KEY (`idORIGEN`,`idDESTINO`),
  KEY `FKidDESTINO_idx` (`idDESTINO`),
  CONSTRAINT `FKidDEST` FOREIGN KEY (`idDESTINO`) REFERENCES `position` (`idPOSITION`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FKidORIGEN` FOREIGN KEY (`idORIGEN`) REFERENCES `position` (`idPOSITION`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `positionrelation`
--

LOCK TABLES `positionrelation` WRITE;
/*!40000 ALTER TABLE `positionrelation` DISABLE KEYS */;
INSERT INTO `positionrelation` VALUES (3,1),(1,2),(102,2),(4,3),(6,3),(103,3),(2,4),(2,5),(205,5),(9,6),(206,6),(9,7),(5,8),(7,8),(108,8),(10,9),(12,9),(109,9),(8,10),(8,11),(211,11),(15,12),(212,12),(15,13),(11,14),(13,14),(114,14),(16,15),(115,15),(14,16),(2,102),(3,103),(8,108),(9,109),(14,114),(15,115),(5,205),(6,206),(11,211),(12,212);
/*!40000 ALTER TABLE `positionrelation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `postype`
--

DROP TABLE IF EXISTS `postype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `postype` (
  `idPOSTYPE` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(25) NOT NULL,
  PRIMARY KEY (`idPOSTYPE`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `postype`
--

LOCK TABLES `postype` WRITE;
/*!40000 ALTER TABLE `postype` DISABLE KEYS */;
INSERT INTO `postype` VALUES (1,'Segment'),(2,'Parking'),(3,'Workstation');
/*!40000 ALTER TABLE `postype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product` (
  `idPRODUCT` int(11) NOT NULL AUTO_INCREMENT,
  `PRODUCTTYPE` int(11) NOT NULL,
  `POSITION` int(11) DEFAULT NULL,
  PRIMARY KEY (`idPRODUCT`),
  KEY `FKidPRODUCTTYPE_idx` (`PRODUCTTYPE`),
  KEY `FKidPRODUCTPOSITION_idx` (`POSITION`),
  CONSTRAINT `FKidPRODUCTPOSITION` FOREIGN KEY (`POSITION`) REFERENCES `position` (`idPOSITION`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FKidPRODUCTTYPE` FOREIGN KEY (`PRODUCTTYPE`) REFERENCES `producttype` (`idPRODUCTTYPE`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (8,1,103),(9,2,109),(10,3,115),(11,4,114);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producttype`
--

DROP TABLE IF EXISTS `producttype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `producttype` (
  `idPRODUCTTYPE` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(45) NOT NULL,
  `DESCRIPTION` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idPRODUCTTYPE`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producttype`
--

LOCK TABLES `producttype` WRITE;
/*!40000 ALTER TABLE `producttype` DISABLE KEYS */;
INSERT INTO `producttype` VALUES (1,'Apple','This product is food.'),(2,'Zelda','This product is a game.'),(3,'Toshiba satellite','This product is a laptop'),(4,'Bose QuietComfort 25 ','This product is a headphone');
/*!40000 ALTER TABLE `producttype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role` (
  `idROLE` int(11) NOT NULL AUTO_INCREMENT,
  `ROLENAME` varchar(25) NOT NULL,
  `ROLEDESC` varchar(45) NOT NULL,
  PRIMARY KEY (`idROLE`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'Customer','This is the role of the customer.'),(2,'Warehouse operator','This is the role of the warehouse operator.'),(3,'Warehouse manager','This is the role of the warehouse manager.');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `task`
--

DROP TABLE IF EXISTS `task`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `task` (
  `idORDER` int(11) NOT NULL,
  `idPRODUCT` int(11) NOT NULL,
  `idVEHICLE` int(11) DEFAULT NULL,
  `idSTATUS` int(11) NOT NULL,
  `FINISHDATE` datetime DEFAULT NULL,
  PRIMARY KEY (`idORDER`,`idPRODUCT`),
  KEY `FKidPRODUCT_idx` (`idPRODUCT`),
  KEY `FKidTASKVEHICLE_idx` (`idVEHICLE`),
  KEY `FKidTASKSTATUS_idx` (`idSTATUS`),
  CONSTRAINT `FKidORDER` FOREIGN KEY (`idORDER`) REFERENCES `order` (`idORDER`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FKidPRODUCT` FOREIGN KEY (`idPRODUCT`) REFERENCES `product` (`idPRODUCT`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FKidTASKSTATUS` FOREIGN KEY (`idSTATUS`) REFERENCES `taskstatus` (`idTASKSTATUS`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FKidTASKVEHICLE` FOREIGN KEY (`idVEHICLE`) REFERENCES `vehicle` (`idVEHICLE`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `task`
--

LOCK TABLES `task` WRITE;
/*!40000 ALTER TABLE `task` DISABLE KEYS */;
INSERT INTO `task` VALUES (13,8,6,2,NULL),(13,9,7,1,NULL),(14,10,NULL,1,NULL),(14,11,NULL,1,NULL);
/*!40000 ALTER TABLE `task` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `taskstatus`
--

DROP TABLE IF EXISTS `taskstatus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `taskstatus` (
  `idTASKSTATUS` int(11) NOT NULL AUTO_INCREMENT,
  `STATUSNAME` varchar(25) NOT NULL,
  `STATUSDESC` varchar(45) NOT NULL,
  PRIMARY KEY (`idTASKSTATUS`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `taskstatus`
--

LOCK TABLES `taskstatus` WRITE;
/*!40000 ALTER TABLE `taskstatus` DISABLE KEYS */;
INSERT INTO `taskstatus` VALUES (1,'to do','This task needs to be done.'),(2,'doing','This task is in process.'),(3,'done','This task is completed.');
/*!40000 ALTER TABLE `taskstatus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `idUSER` int(11) NOT NULL AUTO_INCREMENT,
  `idROLE` int(11) NOT NULL,
  `USERNAME` varchar(25) DEFAULT NULL,
  `PASSWORD` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`idUSER`),
  KEY `fkRoleId_idx` (`idROLE`),
  CONSTRAINT `FKidROLE` FOREIGN KEY (`idROLE`) REFERENCES `role` (`idROLE`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (4,1,'iker','12345678'),(5,2,'olaso','12345678'),(6,3,'borja','12345678'),(7,3,'lanas','12345678');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehicle`
--

DROP TABLE IF EXISTS `vehicle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vehicle` (
  `idVEHICLE` int(11) NOT NULL AUTO_INCREMENT,
  `idPOSITION` int(11) NOT NULL,
  `idVEHICLESTATUS` int(11) NOT NULL,
  PRIMARY KEY (`idVEHICLE`),
  KEY `FKidPOSITIONVEHICLE_idx` (`idPOSITION`),
  KEY `FKidVEHICLESTATUS_idx` (`idVEHICLESTATUS`),
  CONSTRAINT `FKidPOSITIONVEHICLE` FOREIGN KEY (`idPOSITION`) REFERENCES `position` (`idPOSITION`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FKidVEHICLESTATUS` FOREIGN KEY (`idVEHICLESTATUS`) REFERENCES `vehiclestatus` (`idVEHICLESTATUS`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehicle`
--

LOCK TABLES `vehicle` WRITE;
/*!40000 ALTER TABLE `vehicle` DISABLE KEYS */;
INSERT INTO `vehicle` VALUES (6,102,1),(7,103,1),(8,108,1),(9,109,1);
/*!40000 ALTER TABLE `vehicle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehiclestatus`
--

DROP TABLE IF EXISTS `vehiclestatus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vehiclestatus` (
  `idVEHICLESTATUS` int(11) NOT NULL AUTO_INCREMENT,
  `STATUSNAME` varchar(25) NOT NULL,
  `STATUSDESC` varchar(45) NOT NULL,
  PRIMARY KEY (`idVEHICLESTATUS`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehiclestatus`
--

LOCK TABLES `vehiclestatus` WRITE;
/*!40000 ALTER TABLE `vehiclestatus` DISABLE KEYS */;
INSERT INTO `vehiclestatus` VALUES (1,'stopped','The vehicle is not moving.'),(2,'moving','The vehicle is on the way.');
/*!40000 ALTER TABLE `vehiclestatus` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-14  7:55:24
