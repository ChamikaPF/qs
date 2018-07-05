-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Aug 14, 2017 at 12:00 PM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 5.6.23

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `restaurantdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `customerid` int(10) NOT NULL,
  `customername` varchar(30) NOT NULL,
  `phone` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`customerid`, `customername`, `phone`) VALUES
(2, 'Chamika', 776668726),
(3, 'gaga', 456321985),
(4, 'Nilukshi', 766797010),
(5, 'Hasith', 714785985),
(6, 'chamika', 771234567),
(7, 'Gagana', 777135928),
(8, 'chamika', 772458597);

-- --------------------------------------------------------

--
-- Table structure for table `fooditem`
--

CREATE TABLE `fooditem` (
  `itemid` int(11) NOT NULL,
  `itemname` varchar(20) NOT NULL,
  `itemprice` int(11) NOT NULL,
  `itemqty` int(11) NOT NULL,
  `type` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `fooditem`
--

INSERT INTO `fooditem` (`itemid`, `itemname`, `itemprice`, `itemqty`, `type`) VALUES
(1, ' Chicken Bucket', 800, 498, 'Main'),
(2, ' Chicken Burrito', 700, 500, 'Main'),
(3, ' Chicken Buriyani', 650, 498, 'Main'),
(4, 'Toasted wrap', 500, 500, 'Main'),
(5, 'Burger', 300, 500, 'Main'),
(6, 'Lasanga', 250, 500, 'Main'),
(7, ' Lava Cake', 200, 500, 'Dessert'),
(8, 'Cheese Cake', 250, 499, 'Dessert'),
(9, 'Ice Cream', 100, 496, 'Dessert'),
(10, 'Waffle', 200, 500, 'Dessert'),
(11, 'Sundae', 300, 500, 'Dessert'),
(12, 'Pepsi', 100, 500, 'Drink'),
(13, 'Tongo', 100, 498, 'Drink'),
(14, 'Hot Chocolate', 150, 498, 'Drink'),
(15, 'Cafe Mocha', 100, 500, 'Drink'),
(16, 'Cappuccino', 150, 500, 'Drink'),
(17, 'Lathe', 150, 500, 'Drink');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `userid` int(5) NOT NULL,
  `usernam` varchar(20) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`userid`, `usernam`, `password`) VALUES
(1, 'Chamika', '9876'),
(2, 'Hasith', '1964'),
(3, 'admin', '1234'),
(4, 'Gagana', '123456');

-- --------------------------------------------------------

--
-- Table structure for table `logindetails`
--

CREATE TABLE `logindetails` (
  `count` int(10) NOT NULL,
  `EmpID` int(10) NOT NULL,
  `Details` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `logindetails`
--

INSERT INTO `logindetails` (`count`, `EmpID`, `Details`) VALUES
(50, 4, '2017/08/12 15:16:38'),
(51, 4, '2017/08/12 15:23:24'),
(52, 1, '2017/08/13 09:31:12'),
(53, 3, '2017/08/13 09:31:42'),
(54, 4, '2017/08/13 10:24:09'),
(55, 4, '2017/08/13 12:08:50'),
(56, 4, '2017/08/13 12:57:14'),
(57, 3, '2017/08/13 13:00:56'),
(58, 4, '2017/08/13 13:05:14'),
(59, 4, '2017/08/13 13:58:07'),
(60, 3, '2017/08/13 13:58:39'),
(61, 4, '2017/08/13 14:48:45'),
(62, 4, '2017/08/13 19:47:05'),
(63, 4, '2017/08/13 19:47:28'),
(64, 4, '2017/08/13 20:12:51'),
(65, 4, '2017/08/13 20:54:48'),
(66, 4, '2017/08/14 08:34:47'),
(67, 4, '2017/08/14 08:45:04'),
(68, 3, '2017/08/14 08:45:30'),
(69, 3, '2017/08/14 08:48:18'),
(70, 4, '2017/08/14 08:48:33'),
(71, 4, '2017/08/14 08:55:18'),
(72, 4, '2017/08/14 08:59:27'),
(73, 4, '2017/08/14 09:05:51'),
(74, 4, '2017/08/14 09:18:40'),
(75, 4, '2017/08/14 09:19:52'),
(76, 4, '2017/08/14 09:32:23'),
(77, 4, '2017/08/14 10:19:27'),
(78, 3, '2017/08/14 10:22:33'),
(79, 3, '2017/08/14 10:25:55'),
(80, 4, '2017/08/14 10:29:49'),
(81, 3, '2017/08/14 10:33:03'),
(82, 4, '2017/08/14 10:38:31'),
(83, 4, '2017/08/14 11:35:34'),
(84, 4, '2017/08/14 12:13:05'),
(85, 3, '2017/08/14 12:13:17'),
(86, 3, '2017/08/14 12:30:27'),
(87, 4, '2017/08/14 12:32:34'),
(88, 4, '2017/08/14 13:08:37'),
(89, 3, '2017/08/14 13:27:19'),
(90, 3, '2017/08/14 13:55:21'),
(91, 3, '2017/08/14 13:56:11'),
(92, 3, '2017/08/14 14:11:06'),
(93, 1, '2017/08/14 14:13:04'),
(94, 2, '2017/08/14 14:14:24'),
(95, 4, '2017/08/14 14:15:30'),
(96, 1, '2017/08/14 14:16:19'),
(97, 3, '2017/08/14 14:18:23'),
(98, 3, '2017/08/14 14:22:44'),
(99, 3, '2017/08/14 14:24:14'),
(100, 1, '2017/08/14 14:26:44'),
(101, 1, '2017/08/14 14:37:39'),
(102, 3, '2017/08/14 14:39:13'),
(103, 1, '2017/08/14 15:22:39'),
(104, 1, '2017/08/14 15:23:48');

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `orderid` int(10) NOT NULL,
  `main_item` varchar(20) NOT NULL,
  `MainQt` int(10) NOT NULL,
  `Dessert_item` varchar(20) NOT NULL,
  `DessertQt` int(10) NOT NULL,
  `Drink_item` varchar(20) NOT NULL,
  `DrinkQt` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`orderid`, `main_item`, `MainQt`, `Dessert_item`, `DessertQt`, `Drink_item`, `DrinkQt`) VALUES
(1, ' Chicken Buriyani', 2, 'Ice Cream', 4, 'Hot Chocolate', 2),
(2, ' Chicken Bucket', 2, 'Cheese Cake', 1, 'Tongo', 2);

-- --------------------------------------------------------

--
-- Table structure for table `purchases`
--

CREATE TABLE `purchases` (
  `purchaseid` int(10) NOT NULL,
  `totalamounttopay` int(10) NOT NULL,
  `paid` int(10) NOT NULL,
  `outstanding` int(10) NOT NULL,
  `quantity` int(20) NOT NULL,
  `itemid` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `purchases`
--

INSERT INTO `purchases` (`purchaseid`, `totalamounttopay`, `paid`, `outstanding`, `quantity`, `itemid`) VALUES
(1, 10000, 500, 9500, 100, 18);

-- --------------------------------------------------------

--
-- Table structure for table `suplier`
--

CREATE TABLE `suplier` (
  `count` int(10) NOT NULL,
  `itemid` int(10) NOT NULL,
  `itemdescription` varchar(50) NOT NULL,
  `SuplierID` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`customerid`);

--
-- Indexes for table `fooditem`
--
ALTER TABLE `fooditem`
  ADD PRIMARY KEY (`itemid`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`userid`);

--
-- Indexes for table `logindetails`
--
ALTER TABLE `logindetails`
  ADD PRIMARY KEY (`count`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`orderid`);

--
-- Indexes for table `purchases`
--
ALTER TABLE `purchases`
  ADD PRIMARY KEY (`purchaseid`);

--
-- Indexes for table `suplier`
--
ALTER TABLE `suplier`
  ADD PRIMARY KEY (`count`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `customerid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `logindetails`
--
ALTER TABLE `logindetails`
  MODIFY `count` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=105;
--
-- AUTO_INCREMENT for table `suplier`
--
ALTER TABLE `suplier`
  MODIFY `count` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
