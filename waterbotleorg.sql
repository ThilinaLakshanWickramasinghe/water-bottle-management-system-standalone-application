-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 06, 2021 at 08:45 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `waterbotleorg`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id_new` int(20) NOT NULL,
  `c_invoice` varchar(20) DEFAULT NULL,
  `c_date` varchar(10) DEFAULT NULL,
  `c_name` varchar(100) DEFAULT NULL,
  `c_address` varchar(100) DEFAULT NULL,
  `c_phone` int(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id_new`, `c_invoice`, `c_date`, `c_name`, `c_address`, `c_phone`) VALUES
(1, '0001', '2021-7-24', 'Thilina Lakshan', 'No 540 C Kotabegodawatta Gelioya', 776699560),
(2, '0002', '2021-7-24', 'Chamara Danushk', 'no 6 badulla road ,adhikarigam', 77559650),
(3, '0003', '2021-7-24', 'chandra kumara', 'no 615 colomo 7', 114535565),
(4, '0004', '2021-7-24', 'Namal Kumara', 'NO 6 pannipitiya road maligawatta', 705390587),
(5, '0005', '2021-7-24', 'thilina lakshanwickrmasinghe', '540 c gelioua', 776699560),
(6, '0006', '2021-7-24', 'ceb', 'ceb', 111111111);

-- --------------------------------------------------------

--
-- Table structure for table `customerbill`
--

CREATE TABLE `customerbill` (
  `id_new` int(20) NOT NULL,
  `invoice_number` varchar(20) DEFAULT NULL,
  `bill_number` varchar(50) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `date` varchar(10) DEFAULT NULL,
  `ml500` int(20) DEFAULT NULL,
  `ml750` int(20) DEFAULT NULL,
  `ml1000` int(20) DEFAULT NULL,
  `ml1500` int(20) DEFAULT NULL,
  `ml5000` int(20) DEFAULT NULL,
  `ml7000` int(20) DEFAULT NULL,
  `l10` int(20) DEFAULT NULL,
  `l19` int(20) DEFAULT NULL,
  `el10` int(20) DEFAULT NULL,
  `el19` int(20) DEFAULT NULL,
  `dispencer` int(20) DEFAULT NULL,
  `total` decimal(65,2) DEFAULT NULL,
  `oldtotal` decimal(65,2) DEFAULT NULL,
  `profit` decimal(65,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customerbill`
--

INSERT INTO `customerbill` (`id_new`, `invoice_number`, `bill_number`, `name`, `date`, `ml500`, `ml750`, `ml1000`, `ml1500`, `ml5000`, `ml7000`, `l10`, `l19`, `el10`, `el19`, `dispencer`, `total`, `oldtotal`, `profit`) VALUES
(8, '0004', '01235465123', 'Namal Kumara', '2021-8-2', 5, 5, 5, 5, 5, 5, 5, 5, 50, 50, 5, '18000.00', '13500.00', '4500.00'),
(9, '0003', '012546985', 'chandra kumara', '2021-7-20', 10, 10, 10, 10, 10, 10, 10, 10, 20, 20, 10, '27900.00', '27000.00', '900.00');

-- --------------------------------------------------------

--
-- Table structure for table `purchase`
--

CREATE TABLE `purchase` (
  `id` int(11) NOT NULL,
  `date` varchar(10) DEFAULT NULL,
  `ml500` int(50) DEFAULT NULL,
  `ml750` int(50) DEFAULT NULL,
  `ml1000` int(50) DEFAULT NULL,
  `ml1500` int(50) DEFAULT NULL,
  `ml5000` int(50) DEFAULT NULL,
  `ml7000` int(50) DEFAULT NULL,
  `l10` int(50) DEFAULT NULL,
  `l19` int(50) DEFAULT NULL,
  `el10` int(50) DEFAULT NULL,
  `el19` int(50) DEFAULT NULL,
  `dispencer` int(50) DEFAULT NULL,
  `total` decimal(65,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `purchase`
--

INSERT INTO `purchase` (`id`, `date`, `ml500`, `ml750`, `ml1000`, `ml1500`, `ml5000`, `ml7000`, `l10`, `l19`, `el10`, `el19`, `dispencer`, `total`) VALUES
(11, '2021-7-27', 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, '25000.00');

-- --------------------------------------------------------

--
-- Table structure for table `selling_history`
--

CREATE TABLE `selling_history` (
  `id` int(100) NOT NULL,
  `month` varchar(7) DEFAULT NULL,
  `500ml` int(100) DEFAULT NULL,
  `750ml` int(100) DEFAULT NULL,
  `1000ml` int(100) DEFAULT NULL,
  `1500ml` int(100) DEFAULT NULL,
  `5000ml` int(100) DEFAULT NULL,
  `7000ml` int(100) DEFAULT NULL,
  `10L` int(100) DEFAULT NULL,
  `19L` int(100) DEFAULT NULL,
  `dispencer` int(100) DEFAULT NULL,
  `total` decimal(65,2) DEFAULT NULL,
  `profit` decimal(65,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `selling_history`
--

INSERT INTO `selling_history` (`id`, `month`, `500ml`, `750ml`, `1000ml`, `1500ml`, `5000ml`, `7000ml`, `10L`, `19L`, `dispencer`, `total`, `profit`) VALUES
(1, '2021-7', 10, 10, 10, 10, 10, 10, 10, 10, 10, '27900.00', '900.00'),
(2, '2021-8', 5, 5, 5, 5, 5, 5, 5, 5, 5, '18000.00', '4500.00'),
(3, '2021', 15, 15, 15, 15, 15, 15, 15, 15, 15, '45900.00', '5400.00'),
(4, '2021-7', 10, 10, 10, 10, 10, 10, 10, 10, 10, '27900.00', '900.00'),
(6, '2021-8', 5, 5, 5, 5, 5, 5, 5, 5, 5, '18000.00', '4500.00'),
(7, '2021', 15, 15, 15, 15, 15, 15, 15, 15, 15, '45900.00', '5400.00');

-- --------------------------------------------------------

--
-- Table structure for table `store`
--

CREATE TABLE `store` (
  `id` int(11) NOT NULL,
  `category` varchar(100) NOT NULL,
  `qts` int(11) NOT NULL,
  `price_per_one` decimal(65,2) DEFAULT NULL,
  `total_price` decimal(65,2) NOT NULL,
  `selling_qts` int(100) DEFAULT NULL,
  `selling_total_price` decimal(65,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `store`
--

INSERT INTO `store` (`id`, `category`, `qts`, `price_per_one`, `total_price`, `selling_qts`, `selling_total_price`) VALUES
(1, '500ml', 100, '120.00', '15000.00', 86, '1100.00'),
(2, '750ml', 82, '150.00', '12300.00', 77, '1600.00'),
(3, '1000ml', 137, '200.00', '27400.00', 78, '2100.00'),
(4, '1500ml', 102, '250.00', '25500.00', 76, '2600.00'),
(5, '5000ml', 157, '300.00', '47100.00', 77, '3100.00'),
(6, '7000ml', 122, '350.00', '42700.00', 78, '3600.00'),
(7, '10 L', 207, '400.00', '82800.00', 76, '4100.00'),
(8, '19 L', 162, '450.00', '72900.00', 77, '4600.00'),
(9, '10 L Empty', 70, '0.00', '0.00', 113, '0.00'),
(10, '19 L Empty', 70, '0.00', '0.00', 66, '0.00'),
(11, 'Dispencer', 187, '500.00', '93500.00', 80, '5100.00');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id_new`);

--
-- Indexes for table `customerbill`
--
ALTER TABLE `customerbill`
  ADD PRIMARY KEY (`id_new`);

--
-- Indexes for table `purchase`
--
ALTER TABLE `purchase`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `selling_history`
--
ALTER TABLE `selling_history`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `store`
--
ALTER TABLE `store`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `id_new` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `customerbill`
--
ALTER TABLE `customerbill`
  MODIFY `id_new` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `purchase`
--
ALTER TABLE `purchase`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `selling_history`
--
ALTER TABLE `selling_history`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `store`
--
ALTER TABLE `store`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
