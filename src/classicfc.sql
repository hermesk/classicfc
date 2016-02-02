-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Dec 04, 2015 at 02:11 PM
-- Server version: 5.6.12-log
-- PHP Version: 5.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `classicfc`
--
CREATE DATABASE IF NOT EXISTS `classicfc` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `classicfc`;

-- --------------------------------------------------------

--
-- Table structure for table `players`
--

CREATE TABLE IF NOT EXISTS `players` (
  `Jersey_No` int(10) NOT NULL,
  `First_Name` varchar(20) NOT NULL,
  `Other_Name` varchar(20) NOT NULL,
  `Position` varchar(20) NOT NULL,
  `Nationality` varchar(20) NOT NULL,
  `Age` int(20) NOT NULL,
  `Contract` date DEFAULT NULL,
  PRIMARY KEY (`Jersey_No`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `players`
--

INSERT INTO `players` (`Jersey_No`, `First_Name`, `Other_Name`, `Position`, `Nationality`, `Age`, `Contract`) VALUES
(1, 'David', 'Degea', 'Goal Keeper', 'Spanish', 26, '2019-01-06'),
(2, 'Marcelo', 'Diaz', 'Left Back', 'Brazilian', 26, '2018-08-11'),
(3, 'Ryan', 'Betrand', 'Left Back', 'England', 22, '2017-12-01'),
(4, 'Sergio', 'Ramos', 'Center Back', 'Spanish', 29, '2018-01-07'),
(5, 'John', 'Terry', 'Center Back', 'England', 32, '2016-07-01'),
(6, 'Paul', 'Pogba', 'Holding Midfielder', 'French', 21, '2020-12-01'),
(7, 'Luis', 'Suarez', 'Striker', 'Uruguay', 27, '2019-06-01'),
(8, 'Andres', 'Iniesta', 'Midfielder', 'Spanish', 32, '2020-11-14'),
(9, 'Karim', 'benzema', 'Striker', 'French', 28, '2020-01-11'),
(10, 'Eden', 'Hazard', 'Winger', 'Belgian', 25, '2020-01-08'),
(11, 'Arjen', 'Robben', 'Winger', 'Holland', 32, '2017-01-06'),
(12, 'Victor', 'Wanyama', 'Midfielder', 'Kenya', 25, '2016-07-01'),
(13, 'jimmy', 'vady', 'Striker', 'England', 24, '2018-12-01'),
(14, 'Xabi', 'Alonso', 'Midfielder', 'Spanish', 30, '2016-06-01'),
(15, 'Eng Michael', 'Olunga', 'Striker', 'Kenyan', 24, '2017-06-01'),
(16, 'John', 'Stones', 'Defender', 'England', 24, '2020-12-01'),
(17, 'Arjen', 'Robben', 'Winger', 'Dutch', 30, '2016-07-01'),
(18, 'Victor', 'Moses', 'Winger', 'Nigerian', 28, '2017-12-16'),
(19, 'Diego', 'Costa', 'Striker', 'Spanish', 27, '2017-12-01'),
(20, 'Romelu', 'Lukaku', 'Striker', 'Belgian', 24, '2019-06-01'),
(21, 'Romelu', 'Lukaku', 'Striker', 'Belgian', 24, '2019-06-01'),
(30, 'juan', 'mata', 'midfielder', 'spanish', 28, '2018-12-01');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
