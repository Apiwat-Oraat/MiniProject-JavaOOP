-- MySQL dump 10.13  Distrib 8.0.41, for Win64 (x86_64)
--
-- Host: localhost    Database: mydatabase
-- ------------------------------------------------------
-- Server version	9.1.0

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
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS `employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employees` (
  `employee_id` varchar(5) NOT NULL,
  `employee_name` varchar(255) NOT NULL,
  `position` varchar(100) NOT NULL,
  `gender` enum('ชาย','หญิง') NOT NULL,
  `id_card` varchar(13) NOT NULL,
  `address` text NOT NULL,
  `employment_date` varchar(255) NOT NULL,
  `salary` decimal(15,2) NOT NULL,
  `wage_per_day` decimal(10,2) NOT NULL,
  `phone_number` varchar(15) NOT NULL,
  PRIMARY KEY (`employee_id`),
  UNIQUE KEY `id_card` (`id_card`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employees`
--

LOCK TABLES `employees` WRITE;
/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
INSERT INTO `employees` VALUES ('E-005','อนุชา แซ่ตั้ง','Engineer','ชาย','5678901234567','12/34 ถนนร่มโพธิ์','03-เมษายน-2568',32000.00,1300.00,'0823456789'),('E-009','coconut','Engineer','ชาย','6960696069696','totototootototoot','10-เมษายน-2568',50000.00,2000.00,'0949449494'),('E-555','นรีรัตน์ รุ่งเรือง ','Engineer ','ชาย','1919101012232','98/23 ซอยต้นไม้ ','01-เมษายน-2568',50000.00,1660.00,'0845678901');
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `materials`
--

DROP TABLE IF EXISTS `materials`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `materials` (
  `material_id` varchar(20) NOT NULL,
  `material_name` varchar(255) NOT NULL,
  `material_type` varchar(100) NOT NULL,
  `unit_price` decimal(10,2) NOT NULL,
  `unit` varchar(50) NOT NULL,
  PRIMARY KEY (`material_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `materials`
--

LOCK TABLES `materials` WRITE;
/*!40000 ALTER TABLE `materials` DISABLE KEYS */;
INSERT INTO `materials` VALUES ('M001','ปูนซีเมนต์','วัสดุก่อสร้างพื้นฐาน',150.00,'ถุง'),('M002','เหล็กเส้น','วัสดุก่อสร้างโครงสร้าง',250.00,'เส้น'),('M003','อิฐมอญ','วัสดุก่อสร้างผนัง',10.00,'ก้อน'),('M004','ทรายหยาบ','วัสดุก่อสร้างผสม',50.00,'คิว'),('M005','หินคลุก','วัสดุก่อสร้างพื้น',80.00,'คิว'),('M006','กระเบื้องหลังคา','วัสดุก่อสร้างหลังคา',30.00,'แผ่น'),('M007','สีทาภายใน','วัสดุตกแต่ง',500.00,'แกลลอน'),('M008','สีทาภายนอก','วัสดุตกแต่ง',600.00,'แกลลอน'),('M009','สายไฟ','วัสดุไฟฟ้า',20.00,'เมตร'),('M010','ท่อ PVC','วัสดุประปา',15.00,'เมตร'),('M011','สุขภัณฑ์','วัสดุห้องน้ำ',1200.00,'ชุด'),('M012','ประตูไม้','วัสดุประตูหน้าต่าง',800.00,'บาน'),('M013','หน้าต่างอลูมิเนียม','วัสดุประตูหน้าต่าง',1500.00,'บาน'),('M014','ไม้อัด','วัสดุตกแต่งภายใน',300.00,'แผ่น'),('M015','แผ่นยิปซัม','วัสดุตกแต่งภายใน',250.00,'แผ่น'),('M016','หลอดไฟ LED','วัสดุไฟฟ้า',80.00,'หลอด'),('M017','ปลั๊กไฟ','วัสดุไฟฟ้า',30.00,'ตัว'),('M018','สวิตช์ไฟ','วัสดุไฟฟ้า',25.00,'ตัว'),('M019','ท่อเหล็ก','วัสดุประปา',200.00,'เมตร'),('M020','ปั๊มน้ำ','วัสดุประปา',2500.00,'ตัว'),('M021','เหล็กรูปพรรณ','วัสดุก่อสร้างโครงสร้าง',300.00,'เส้น'),('M022','อิฐบล็อก','วัสดุก่อสร้างผนัง',12.00,'ก้อน');
/*!40000 ALTER TABLE `materials` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `projectassignments`
--

DROP TABLE IF EXISTS `projectassignments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `projectassignments` (
  `assignment_id` int NOT NULL AUTO_INCREMENT,
  `project_id` varchar(20) NOT NULL,
  `employee_id` varchar(20) NOT NULL,
  `role` varchar(100) NOT NULL,
  `start_date` varchar(255) NOT NULL,
  `end_date` varchar(255) NOT NULL,
  PRIMARY KEY (`assignment_id`),
  KEY `project_id` (`project_id`),
  KEY `employee_id` (`employee_id`),
  CONSTRAINT `projectassignments_ibfk_1` FOREIGN KEY (`project_id`) REFERENCES `projects` (`project_id`) ON DELETE CASCADE,
  CONSTRAINT `projectassignments_ibfk_2` FOREIGN KEY (`employee_id`) REFERENCES `employees` (`employee_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `projectassignments`
--

LOCK TABLES `projectassignments` WRITE;
/*!40000 ALTER TABLE `projectassignments` DISABLE KEYS */;
INSERT INTO `projectassignments` VALUES (29,'SN-001','E-005','Engineer','12-มิถุนายน-2568','01-เมษายน-2568'),(40,'H-001','E-005','Engineer','31-สิงหาคม-2568','01-เมษายน-2568'),(44,'12345','E-005','Engineer','31-ธันวาคม-2568','21-กันยายน-2568');
/*!40000 ALTER TABLE `projectassignments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `projectcost`
--

DROP TABLE IF EXISTS `projectcost`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `projectcost` (
  `id` int NOT NULL AUTO_INCREMENT,
  `project_id` varchar(20) NOT NULL,
  `num_workers` int DEFAULT '0',
  `wage_per_person` decimal(10,2) DEFAULT '0.00',
  `work_duration` int DEFAULT '0',
  `labor_cost` decimal(15,2) NOT NULL,
  `material_cost` decimal(15,2) NOT NULL,
  `total_cost` decimal(15,2) NOT NULL,
  `budget_difference` decimal(15,2) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `project_id` (`project_id`),
  CONSTRAINT `projectcost_ibfk_1` FOREIGN KEY (`project_id`) REFERENCES `projects` (`project_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `projectcost`
--

LOCK TABLES `projectcost` WRITE;
/*!40000 ALTER TABLE `projectcost` DISABLE KEYS */;
INSERT INTO `projectcost` VALUES (2,'SN-001',10,400.00,180,720000.00,476000.00,1196000.00,-1146000.00),(3,'H-001',10,400.00,180,720000.00,795000.00,1515000.00,-815000.00);
/*!40000 ALTER TABLE `projectcost` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `projectmaterials`
--

DROP TABLE IF EXISTS `projectmaterials`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `projectmaterials` (
  `id` int NOT NULL AUTO_INCREMENT,
  `project_id` varchar(20) NOT NULL,
  `material_id` varchar(20) NOT NULL,
  `quantity` int NOT NULL,
  `total_price` decimal(15,2) NOT NULL,
  `unit` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `project_id` (`project_id`),
  KEY `material_id` (`material_id`),
  CONSTRAINT `projectmaterials_ibfk_1` FOREIGN KEY (`project_id`) REFERENCES `projects` (`project_id`) ON DELETE CASCADE,
  CONSTRAINT `projectmaterials_ibfk_2` FOREIGN KEY (`material_id`) REFERENCES `materials` (`material_id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=88 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `projectmaterials`
--

LOCK TABLES `projectmaterials` WRITE;
/*!40000 ALTER TABLE `projectmaterials` DISABLE KEYS */;
INSERT INTO `projectmaterials` VALUES (52,'SN-001','M001',10,1500.00,'ถุง'),(53,'SN-001','M002',20,6500.00,'เส้น'),(54,'SN-001','M002',20,11500.00,'เส้น'),(55,'SN-001','M002',20,16500.00,'เส้น'),(56,'SN-001','M002',20,21500.00,'เส้น'),(57,'SN-001','M002',20,26500.00,'เส้น'),(58,'SN-001','M002',20,31500.00,'เส้น'),(59,'SN-001','M002',20,36500.00,'เส้น'),(60,'SN-001','M002',20,41500.00,'เส้น'),(61,'SN-001','M002',20,46500.00,'เส้น'),(62,'SN-001','M002',20,51500.00,'เส้น'),(63,'SN-001','M002',20,56500.00,'เส้น'),(64,'SN-001','M002',20,61500.00,'เส้น'),(65,'SN-001','M002',20,66500.00,'เส้น'),(75,'H-001','M001',20,3000.00,'ถุง'),(76,'H-001','M001',20,6000.00,'ถุง'),(77,'H-001','M001',80,18000.00,'ถุง'),(78,'H-001','M001',80,30000.00,'ถุง'),(79,'H-001','M001',80,42000.00,'ถุง'),(80,'H-001','M001',50,49500.00,'ถุง'),(81,'H-001','M001',50,57000.00,'ถุง'),(82,'H-001','M001',50,64500.00,'ถุง'),(83,'H-001','M001',50,72000.00,'ถุง'),(84,'H-001','M001',50,79500.00,'ถุง'),(85,'H-001','M002',90,102000.00,'เส้น'),(86,'H-001','M002',90,124500.00,'เส้น'),(87,'H-001','M002',90,147000.00,'เส้น');
/*!40000 ALTER TABLE `projectmaterials` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `projects`
--

DROP TABLE IF EXISTS `projects`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `projects` (
  `project_id` varchar(20) NOT NULL,
  `project_name` varchar(255) NOT NULL,
  `customer_name` varchar(255) NOT NULL,
  `project_details` text,
  `project_type` varchar(100) NOT NULL,
  `budget` decimal(15,2) NOT NULL,
  `material_cost` decimal(15,2) DEFAULT '0.00',
  `project_status` varchar(100) DEFAULT NULL,
  `date_start` varchar(255) NOT NULL,
  `date_end` varchar(255) NOT NULL,
  PRIMARY KEY (`project_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `projects`
--

LOCK TABLES `projects` WRITE;
/*!40000 ALTER TABLE `projects` DISABLE KEYS */;
INSERT INTO `projects` VALUES ('12345','H-002','test','','โครงการขนาดเล็ก',1234567.00,0.00,'รอดำเนินการ','31-ธันวาคม-2568','21-กันยายน-2568'),('H-001','โครงการบ้านเดี่ยวสวนสุข','นายสมชาย ใจดี    ','สร้างบ้านเดี่ยว 10 ชั้น','โครงการขนาดใหญ่',700000.00,795000.00,'กำลังดำเนินการ','31-สิงหาคม-2568','01-เมษายน-2568'),('H-101','pipo','coconut','tara','โครงการขนาดใหญ่',600000.00,0.00,'กำลังดำเนินการ','30-เมษายน-2568','23-เมษายน-2568'),('SN-001','อยู่ดีมีสูข','นายมั้งมี ดี้ดี','บ้านจัดสั้นขนาดเล็ก','โครงการขนาดเล็ก',50000.00,476000.00,'รอดำเนินการ','12-มิถุนายน-2568','01-เมษายน-2568');
/*!40000 ALTER TABLE `projects` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `idUser` int NOT NULL AUTO_INCREMENT,
  `Username` varchar(45) DEFAULT NULL,
  `Password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idUser`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'admin','1234'),(2,'User','1234');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-09-21 16:42:29
