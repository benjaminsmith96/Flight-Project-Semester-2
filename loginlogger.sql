-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 19, 2019 at 06:55 PM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `abcs`
--

-- --------------------------------------------------------

--
-- Table structure for table `loginlogger`
--

CREATE TABLE `loginlogger` (
  `level` text NOT NULL,
  `message` text NOT NULL,
  `exception` text NOT NULL,
  `time` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `loginlogger`
--

INSERT INTO `loginlogger` (`level`, `message`, `exception`, `time`) VALUES
('0', '', '', '0000-00-00'),
('java.util.logging.Level', 'Error Detected', 'ArrayIndexOutOfBoundsException', '2019-04-15'),
('java.util.logging.Level', 'Error Detected', 'ArrayIndexOutOfBoundsException', '2019-04-15'),
('java.util.logging.Level', 'Error Detected', 'ArrayIndexOutOfBoundsException', '2019-04-15'),
('java.util.logging.Level', 'Error Detected', 'ArrayIndexOutOfBoundsException', '2019-04-15'),
('java.util.logging.Level', 'Error Detected', 'ArrayIndexOutOfBoundsException', '2019-04-15'),
('java.util.logging.Level', 'Error Detected', 'ArrayIndexOutOfBoundsException', '2019-04-15'),
('java.util.logging.Level', 'Error Detected', 'ArrayIndexOutOfBoundsException', '2019-04-16'),
('java.util.logging.Level', 'Error Detected', 'ArrayIndexOutOfBoundsException', '2019-04-16');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
