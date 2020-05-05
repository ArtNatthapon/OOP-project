-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 05, 2020 at 03:13 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `oopproject`
--

-- --------------------------------------------------------

--
-- Table structure for table `confirm`
--

CREATE TABLE `confirm` (
  `carName` varchar(50) NOT NULL,
  `Period` varchar(50) NOT NULL,
  `Totalprice` varchar(50) NOT NULL,
  `Invoice` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `confirm`
--

INSERT INTO `confirm` (`carName`, `Period`, `Totalprice`, `Invoice`) VALUES
('a', 'a', 'a', '1913'),
('a', 'a', 'a', '1949'),
('a', 'a', 'a', '1259'),
('a', 'a', 'a', '1302'),
('BMW Series5', '7', '16000', NULL),
('Toyota', '7', '10000', NULL),
('Toyota', '7', '10000', NULL),
('Toyota', '7', '10000', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `Firstname` varchar(50) NOT NULL,
  `Lastname` varchar(50) NOT NULL,
  `Username` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `Tel` varchar(50) NOT NULL,
  `Invoice` varchar(50) DEFAULT NULL,
  `Credit` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`Firstname`, `Lastname`, `Username`, `Password`, `Tel`, `Invoice`, `Credit`) VALUES
('dasdsa', 'dasd', 'sadas', 'dasds', 'asdsad', '1913', 'dasdasda'),
('Art', 'asdsa', 'asdsad', 'sadas', 'sadas', '1949', 'dasd'),
('wqeqwe', 'qweqwe', 'qweqw', 'eqweqwe', 'qweqw', '1259', 'wqewqe'),
('Art', 'Natthapon', 'Art', 'Art', '123456789', '1302', '0992606069'),
('asdas', 'dasd', 'asdasd', 'asdas', 'dasd', 'dasdas', '1090'),
('Natthapon', 'Sriraksungnoen', 'Art', '0992606069', '123456', '123456879', '1504'),
('Natthapon', 'Sriraksungnoen', 'Art', 'Art', '1323546', '0992606069', '1635');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
