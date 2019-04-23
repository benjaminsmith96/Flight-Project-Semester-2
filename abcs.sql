-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Dec 03, 2018 at 04:23 AM
-- Server version: 10.1.34-MariaDB
-- PHP Version: 5.6.37

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
-- Table structure for table `airplane`
--

CREATE TABLE `airplane` (
  `airplane_id` int(10) NOT NULL,
  `first_capacity` int(10) NOT NULL,
  `current_first` int(10) NOT NULL,
  `business_capacity` int(10) NOT NULL,
  `current_business` int(10) NOT NULL,
  `economy_capacity` int(10) NOT NULL,
  `current_economic` int(10) NOT NULL,
  `baggage` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `airplane`
--

INSERT INTO `airplane` (`airplane_id`, `first_capacity`, `current_first`, `business_capacity`, `current_business`, `economy_capacity`, `current_economic`, `baggage`) VALUES
(101, 20, 0, 30, 9, 120, 120, 2),
(105, 25, 25, 30, 30, 160, 160, 4);

-- --------------------------------------------------------

--
-- Table structure for table `coupon`
--

CREATE TABLE `coupon` (
  `coupon_id` int(11) NOT NULL,
  `coupon_code` varchar(20) NOT NULL,
  `generator_id` int(11) NOT NULL,
  `use_by_id` int(11) NOT NULL,
  `active_date` date NOT NULL,
  `expire_date` date NOT NULL,
  `type` varchar(11) NOT NULL,
  `used_times` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `coupon`
--

INSERT INTO `coupon` (`coupon_id`, `coupon_code`, `generator_id`, `use_by_id`, `active_date`, `expire_date`, `type`, `used_times`) VALUES
(1, 'dgfdghghgh', 1, 2, '2018-12-01', '2018-12-19', '1', 0),
(23, 'Gph9UgrTKXlb', 1, 2, '2018-12-02', '2019-04-02', 'STANDARD', 0),
(28, 'tYfMio87EOOl', 3, 2, '2018-12-03', '2019-04-03', 'STANDARD', 1),
(29, 'W7rrxrium8qz', 2, 1, '2018-12-03', '2019-04-03', 'STANDARD', 0);

-- --------------------------------------------------------

--
-- Table structure for table `flight`
--

CREATE TABLE `flight` (
  `flight_number` int(10) NOT NULL,
  `arrival_time` time NOT NULL,
  `arrival_date` date NOT NULL,
  `arrival_airport` varchar(45) NOT NULL,
  `departure_time` time NOT NULL,
  `departure_date` date NOT NULL,
  `departure_airport` varchar(45) NOT NULL,
  `airplane_id` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `flight`
--

INSERT INTO `flight` (`flight_number`, `arrival_time`, `arrival_date`, `arrival_airport`, `departure_time`, `departure_date`, `departure_airport`, `airplane_id`) VALUES
(1, '23:28:18', '2018-11-05', 'LHR', '12:17:00', '2018-11-05', 'DUB', 101),
(2, '10:20:00', '2018-11-24', 'MAD', '06:00:00', '2018-11-24', 'LIS', 101),
(3, '17:30:00', '2018-12-25', 'SEV', '16:30:00', '2018-12-25', 'MAD', 105);

-- --------------------------------------------------------

--
-- Table structure for table `flight_bookings`
--

CREATE TABLE `flight_bookings` (
  `booking_id` int(10) NOT NULL,
  `user_id` int(10) NOT NULL,
  `flight_number` int(10) NOT NULL,
  `class` varchar(20) NOT NULL,
  `baggage` int(5) NOT NULL,
  `booking_price` float NOT NULL,
  `booking_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `flight_bookings`
--

INSERT INTO `flight_bookings` (`booking_id`, `user_id`, `flight_number`, `class`, `baggage`, `booking_price`, `booking_date`) VALUES
(2, 1, 1, 'First Class', 1, 470, '2018-11-30'),
(13, 2, 1, 'Business Class', 2, 290, '2018-12-03'),
(28, 3, 1, 'Business Class', 2, 290, '2018-12-03'),
(30, 1, 1, 'First Class', 1, 455, '2018-11-30'),
(35, 2, 1, 'Business Class', 1, 270, '2018-12-02'),
(46, 2, 1, 'Business Class', 1, 270, '2018-12-03'),
(48, 1, 1, 'Business Class', 1, 270, '2018-11-30'),
(51, 1, 1, 'First Class', 1, 440, '2018-11-30'),
(54, 1, 1, 'Business Class', 2, 290, '2018-12-02'),
(58, 1, 1, 'Business Class', 1, 258, '2018-11-30'),
(62, 1, 1, 'Business Class', 1, 253.5, '2018-11-30'),
(76, 1, 1, 'First Class', 1, 455, '2018-11-30'),
(99, 1, 1, 'First Class', 1, 428, '2018-11-30');

-- --------------------------------------------------------

--
-- Table structure for table `flight_price`
--

CREATE TABLE `flight_price` (
  `flight_number` int(10) NOT NULL,
  `first_price` float NOT NULL,
  `business_price` float NOT NULL,
  `economy_price` float NOT NULL,
  `baggage_price` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `flight_price`
--

INSERT INTO `flight_price` (`flight_number`, `first_price`, `business_price`, `economy_price`, `baggage_price`) VALUES
(1, 450, 250, 60, 20);

-- --------------------------------------------------------

--
-- Table structure for table `membership`
--

CREATE TABLE `membership` (
  `user_id` int(10) NOT NULL,
  `points` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `membership`
--

INSERT INTO `membership` (`user_id`, `points`) VALUES
(1, 149),
(2, 138),
(3, 181);

-- --------------------------------------------------------

--
-- Table structure for table `roles`
--

CREATE TABLE `roles` (
  `role_id` int(5) NOT NULL,
  `role_name` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `user_id` int(10) NOT NULL,
  `email` varchar(120) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role_id` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`user_id`, `email`, `password`, `role_id`) VALUES
(1, 'johndoe@gmail.com', 'Test1234', 1),
(2, 'ali.i.d@hotmail.com', 'aLi12345', 1),
(3, 'drsh@windowslive.com', 'mM123456', 1);

-- --------------------------------------------------------

--
-- Table structure for table `user_details`
--

CREATE TABLE `user_details` (
  `user_id` int(10) NOT NULL,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `dob` date NOT NULL,
  `sex` bit(1) DEFAULT NULL,
  `contact_number` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_details`
--

INSERT INTO `user_details` (`user_id`, `first_name`, `last_name`, `dob`, `sex`, `contact_number`) VALUES
(1, 'John', 'Doe', '2000-11-14', b'0', NULL),
(2, 'ali', 'ibra', '1993-03-14', b'0', '0838845617'),
(3, 'Mustafa', 'Almogamse', '1988-11-10', b'0', '0876060515');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `airplane`
--
ALTER TABLE `airplane`
  ADD PRIMARY KEY (`airplane_id`);

--
-- Indexes for table `coupon`
--
ALTER TABLE `coupon`
  ADD PRIMARY KEY (`coupon_id`);

--
-- Indexes for table `flight`
--
ALTER TABLE `flight`
  ADD PRIMARY KEY (`flight_number`);

--
-- Indexes for table `flight_bookings`
--
ALTER TABLE `flight_bookings`
  ADD PRIMARY KEY (`booking_id`);

--
-- Indexes for table `flight_price`
--
ALTER TABLE `flight_price`
  ADD PRIMARY KEY (`flight_number`);

--
-- Indexes for table `membership`
--
ALTER TABLE `membership`
  ADD PRIMARY KEY (`user_id`);

--
-- Indexes for table `roles`
--
ALTER TABLE `roles`
  ADD PRIMARY KEY (`role_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_id`);

--
-- Indexes for table `user_details`
--
ALTER TABLE `user_details`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `airplane`
--
ALTER TABLE `airplane`
  MODIFY `airplane_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=106;

--
-- AUTO_INCREMENT for table `coupon`
--
ALTER TABLE `coupon`
  MODIFY `coupon_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- AUTO_INCREMENT for table `flight`
--
ALTER TABLE `flight`
  MODIFY `flight_number` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `flight_bookings`
--
ALTER TABLE `flight_bookings`
  MODIFY `booking_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=100;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `user_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
