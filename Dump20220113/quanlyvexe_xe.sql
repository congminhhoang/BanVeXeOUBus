-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: quanlyvexe
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `xe`
--

DROP TABLE IF EXISTS `xe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `xe` (
  `MaChuyenXe` varchar(45) NOT NULL,
  `ChuyenXe` varchar(45) DEFAULT NULL,
  `NoiDi` varchar(45) DEFAULT NULL,
  `NoiDen` varchar(45) DEFAULT NULL,
  `BienSoXe` varchar(45) DEFAULT NULL,
  `GiaVe` decimal(8,3) DEFAULT NULL,
  `MaNV` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`MaChuyenXe`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xe`
--

LOCK TABLES `xe` WRITE;
/*!40000 ALTER TABLE `xe` DISABLE KEYS */;
INSERT INTO `xe` VALUES ('LM20','DakLak - Tp.HCM','DakLaK',' Tp.HCM','28T-7890  ',200.000,NULL),('LM40','Đà Lạt - Tp.HCM','Đà Lạt','Tp.HCM','25H-4567  ',400.000,NULL),('LT25','Đà Lạt - Nha Trang','Đà Lạt','Nha Trang','39T-5678  ',250.000,NULL),('MM15','Tp.HCM - Cà Mau','Tp.HCM ','Cà Mau','47H-7658',150.000,NULL),('MT20','Tp.HCM - Vũng Tàu','Tp.HCM ','Vũng Tàu','49M-0987',200.000,NULL),('MT35','Tp.HCM -  Nha Trang','Tp.HCM ','Nha Trang','38H-1456  ',350.000,NULL),('TG10','Ninh Thuận - Bắc Giang ','Ninh Thuận',' Bắc Giang ','37H-1546  ',100.000,NULL),('TS40','Nha Trang - Sapa','Nha Trang','Sapa','60T-9876',400.000,NULL);
/*!40000 ALTER TABLE `xe` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-01-13 22:35:14
