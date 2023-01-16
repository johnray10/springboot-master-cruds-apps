/*
SQLyog Ultimate v13.1.1 (64 bit)
MySQL - 10.4.24-MariaDB : Database - master_db
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`master_db` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `master_db`;

/*Table structure for table `customer` */

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `contact` varchar(255) DEFAULT NULL,
  `created_at` datetime(6) DEFAULT NULL,
  `customer_code` varchar(255) DEFAULT NULL,
  `customer_name` varchar(255) DEFAULT NULL,
  `date_encode` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

/*Data for the table `customer` */

insert  into `customer`(`id`,`address`,`city`,`contact`,`created_at`,`customer_code`,`customer_name`,`date_encode`,`gender`,`status`,`updated_at`) values 
(2,'Manila, Philippines','Quezon City','12345','2023-01-06 17:43:46.000000','CS002','Barbie Forteza','2023-01-06 00:00:00','Female','Not Active','2023-01-06 17:43:46.000000'),
(3,'Manila','Quezon City','12345','2023-01-06 17:44:48.000000','CS003','Jomer Pogi','2023-01-01 00:00:00','Male','Active','2023-01-06 17:44:48.000000'),
(4,'Manila','Las Vegas City','12345','2023-01-06 17:46:55.000000','CS004','Jomer Blanco','2023-01-02 00:00:00','Male','Active','2023-01-06 17:46:55.000000');

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `birth_date` datetime(6) DEFAULT NULL,
  `contact` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `photo` varchar(64) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `student_name` varchar(255) DEFAULT NULL,
  `student_code` varchar(255) DEFAULT NULL,
  `created_at` datetime(6) DEFAULT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

/*Data for the table `student` */

insert  into `student`(`id`,`address`,`birth_date`,`contact`,`email`,`gender`,`photo`,`status`,`student_name`,`student_code`,`created_at`,`updated_at`) values 
(1,'Manila','2023-01-05 00:00:00.000000','123456789','jfornias9@gmail.com','Male','MIW.jpg','Active','JayR Fornias','STUD001',NULL,NULL),
(2,'Quezon City','2023-01-05 00:00:00.000000','12345','jane@gmail.com','Female','avatar.jpg','Not Active','Jane','STUD002','2023-01-05 14:28:56.000000','2023-01-05 14:28:56.000000'),
(3,'Manila','1990-12-11 00:00:00.000000','12345','ddarkzane@yahoo.com','Male','darkz.jpeg','Active','Jek','STUD003','2023-01-05 15:48:54.000000','2023-01-05 15:48:54.000000'),
(4,'Manila','2023-01-04 00:00:00.000000','12345','ddarkzane@yahoo.com','Male','AA-2017.jpg','Active','Chris Motionless','STUD004','2023-01-06 17:57:01.000000','2023-01-06 17:57:01.000000');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
