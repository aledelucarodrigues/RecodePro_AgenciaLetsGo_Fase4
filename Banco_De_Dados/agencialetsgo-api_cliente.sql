-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: agencialetsgo-api
-- ------------------------------------------------------
-- Server version	8.0.34

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
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `id_cliente` bigint NOT NULL AUTO_INCREMENT,
  `cartao_cliente` varchar(16) DEFAULT NULL,
  `cep_cliente` int DEFAULT NULL,
  `cidade_cliente` varchar(255) DEFAULT NULL,
  `cpf_cliente` varchar(255) DEFAULT NULL,
  `cpf_titular_cartao_credito` varchar(255) DEFAULT NULL,
  `email_cliente` varchar(255) DEFAULT NULL,
  `endereco_cliente` varchar(255) DEFAULT NULL,
  `nome_cliente` varchar(50) NOT NULL,
  `nome_titular_cartao_credito` varchar(255) DEFAULT NULL,
  `senha_cliente` varchar(255) DEFAULT NULL,
  `telefone_cliente` varchar(255) DEFAULT NULL,
  `uf_cliente` varchar(2) DEFAULT NULL,
  `venc_cartao_cliente` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`id_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'4125412541254125',81020235,'Curitiba','04455566633','04455566633','ale@gmail.com','Rua XV','Alessandra Rodrigues','Alessandra','123456','41988885555','PR','12/23'),(2,'4125412541254125',81020235,'Curitiba','04455566638','04455566633','ana@gmail.com','Rua XV','Ana','Alessandra','123456','41988885556','PR','12/23'),(3,'4125412541254125',81020235,'Curitiba','04455566639','04455566633','rafa@gmail.com','Rua XV','Rafa','Alessandra','123456','41988885552','PR','12/23'),(5,'4125412541254125',81020235,'Curitiba','04455566611','04455566633','analize@gmail.com','Rua XV','Analize','Alessandra','123456','41988884444','PR','12/23'),(6,'4125412541254125',81020235,'Curitiba','04455566633','04455566633','ale@gmail.com','Rua XV','Alessandra','Alessandra','123456','41988885555','PR','12/23'),(7,'4785478547854785',81020236,'Curitiba','05205205233','04455566633','davi@gmail.com','Rua Alegria','Davi','Alessandra','123456','41986865252','PR','12/28');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-17 17:49:54
