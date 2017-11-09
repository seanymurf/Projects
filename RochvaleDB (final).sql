-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 05, 2017 at 08:43 PM
-- Server version: 10.1.19-MariaDB
-- PHP Version: 5.6.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `userregistration`
--

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `emailAddress` varchar(30) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `productID` int(11) NOT NULL,
  `productName` varchar(20) NOT NULL,
  `productCode` varchar(15) NOT NULL,
  `productDescription` varchar(40) NOT NULL,
  `price` decimal(10,0) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`productID`, `productName`, `productCode`, `productDescription`, `price`) VALUES
(1, 'jeans', '', 'Pepe', '0'),
(2, 'Football Boots', '', 'Ronaldos', '0'),
(3, 'wallet', '', 'Leather', '0'),
(4, 'trowsers', '', 'Chinos', '0'),
(5, 'Tuxedo', '', 'Black Tuxedo', '0'),
(6, 'sweater', '', 'Winter', '0'),
(10, 'Pajamas', 'vvvv', 'blue', '95'),
(13, 'Shirt', 'z2', 'navy Blue', '0'),
(16, 'Slacks', 'fff', 'white', '200'),
(19, 'Shoes', 'az', 'Loafers', '99'),
(20, 'Dressing Gown', '88', 'Black', '79');

-- --------------------------------------------------------

--
-- Table structure for table `stafflogin`
--

CREATE TABLE `stafflogin` (
  `staffID` int(11) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `userdetails`
--

CREATE TABLE `userdetails` (
  `UserID` int(11) NOT NULL,
  `firstName` varchar(20) DEFAULT NULL,
  `lastName` varchar(20) DEFAULT NULL,
  `emailAddress` varchar(30) DEFAULT NULL,
  `password` varchar(20) NOT NULL,
  `retypePassword` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `userdetails`
--

INSERT INTO `userdetails` (`UserID`, `firstName`, `lastName`, `emailAddress`, `password`, `retypePassword`) VALUES
(8, 'Daniel', 'Sullivan', 'dan@gmail.com', '', ''),
(7, 'Mary', 'Sullivan', 'test@gmail.com', '', ''),
(10, 'sean', 'Murphy', 'seanymurf@live.ie', '', ''),
(18, 'jane', 'morgan', 'jane@gmail.com', '', ''),
(13, 'james', 'Murray', 'james@gmail.com', '', ''),
(20, 'joanne', 'murray', 'joanne@gmail.com', '', ''),
(15, 'joe', 'hehir', 'joe@yahoo.com', '', ''),
(19, 'jane', 'morgan', 'jane@gmail.com', '', ''),
(26, 'eileen', 'o Carroll', 'eileen@gmail.com', '', ''),
(69, 'Joe ', 'o Grady', 'joe@gmail', '9999', '9999'),
(70, 'hanna', 'o toole', 'hanna@Gmail.com', '963', '963'),
(71, 'Mark', 'White', 'markwhite@gmail.com', '4444', '4444'),
(72, 'Alan', 'Flynn', 'alan@gmail.com', 'aaaa', ''),
(79, 'Sean', 'Halloran', 'seany@yahoo.com', '88', ''),
(77, 'kk', 'katlin', 'kooa@yahoo.com', '72', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`emailAddress`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`productID`);

--
-- Indexes for table `stafflogin`
--
ALTER TABLE `stafflogin`
  ADD PRIMARY KEY (`staffID`);

--
-- Indexes for table `userdetails`
--
ALTER TABLE `userdetails`
  ADD PRIMARY KEY (`UserID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `productID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
--
-- AUTO_INCREMENT for table `userdetails`
--
ALTER TABLE `userdetails`
  MODIFY `UserID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=80;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
