-- MySQL dump 10.13  Distrib 5.7.17, for macos10.12 (x86_64)
--
-- Host: 116.196.113.107    Database: headstorm
-- ------------------------------------------------------
-- Server version	5.7.19

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
-- Table structure for table `t_question`
--

DROP TABLE IF EXISTS `t_question`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_question` (
  `id` int(11) NOT NULL,
  `subject` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `grade` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `lv` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `title` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `answer` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `level` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `A` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `B` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `C` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `D` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_question`
--

LOCK TABLES `t_question` WRITE;
/*!40000 ALTER TABLE `t_question` DISABLE KEYS */;
INSERT INTO `t_question` VALUES (1,'世界杯','7','LV1','梅西是哪个国家的','A','0','阿根廷','巴西','德国','中国'),(2,'世界杯','7','LV1','C罗是哪个国家的','A','0','阿根廷','葡萄牙','德国','中国'),(3,'世界杯','7','LV1','内马尔是哪个国家的','A','0','巴西','葡萄牙','德国','中国'),(4,'世界杯','7','LV1','苏亚雷斯是哪个国家的','B','0','巴西','乌拉圭','德国','中国'),(5,'世界杯','7','LV1','上一届世界杯的卫冕冠军是哪个国家','A','0','德国','葡萄牙','德国','中国'),(6,'世界杯','7','LV1','这届世界杯的吉祥物是什么','C','0','扎比瓦卡','海豹','海燕','海豚'),(7,'世界杯','7','LV1','上一次中国参加世界杯是在哪一届','B','0','巴西世界杯','2002年日韩世界杯','意大利世界杯','德国世界杯'),(8,'世界杯','7','LV1','每一队在场比赛的运动员有几名','C','0','10','13','11','9');
/*!40000 ALTER TABLE `t_question` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-06-12 23:14:51
