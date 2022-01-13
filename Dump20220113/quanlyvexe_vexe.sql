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
-- Table structure for table `vexe`
--

DROP TABLE IF EXISTS `vexe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vexe` (
  `MaVe` varchar(10) NOT NULL,
  `ChuyenXe` varchar(45) NOT NULL,
  `GioKhoiHanh` time DEFAULT NULL,
  `NgayKhoiHanh` date DEFAULT NULL,
  `SoGhe` varchar(45) DEFAULT NULL,
  `GiaVe` decimal(8,2) DEFAULT NULL,
  `HoTenKH` varchar(45) DEFAULT NULL,
  `BienSoXe` varchar(45) DEFAULT NULL,
  `MaNV` varchar(45) DEFAULT NULL,
  `MaKH` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`MaVe`),
  KEY `fk_khachhang_idx` (`MaKH`),
  KEY `fk_vexe_xe_idx` (`ChuyenXe`),
  CONSTRAINT `fk_khachhang_vexe` FOREIGN KEY (`MaKH`) REFERENCES `khachhang` (`MaKH`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vexe`
--

LOCK TABLES `vexe` WRITE;
/*!40000 ALTER TABLE `vexe` DISABLE KEYS */;
INSERT INTO `vexe` VALUES ('01','DakLak - Tp.HCM','09:45:00','2002-08-21','17',200.00,'Trần Minh Đạo','28T-7890  ','Quốc Bảo',NULL),('02','Tp.HCM - Nha Trang','09:00:00','2002-08-21','6',350.00,'Hoàng Công Minh','38H-1456  ','Đinh Thảo Ly',NULL),('03','Ninh Thuận - Bắc Giang','17:00:00','2002-08-21','5',100.00,'Lê Anh Quân','37H-1546  ','Nguyễn Văn A',NULL),('04','Đà Lạt - Tp.HCM','18:00:00','2002-08-21','1',400.00,'Trương Thị Thùy Li','25H-4567  ','Hồ Thái Vy',NULL),('05','Đà Lạt - Nha Trang','18:30:00','2002-08-21','12',250.00,'Hà Đăng Lương','39T-5678  ','Trương Thị Hoa',NULL);
/*!40000 ALTER TABLE `vexe` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-01-13 22:35:13
