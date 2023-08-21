-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 21, 2023 at 02:56 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `trojan_squad`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `No` int(10) NOT NULL,
  `Id` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`No`, `Id`, `password`) VALUES
(1, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `consultation`
--

CREATE TABLE `consultation` (
  `No` int(100) NOT NULL,
  `patient_id` varchar(100) NOT NULL,
  `doctor_id` varchar(100) NOT NULL,
  `date` date NOT NULL,
  `time` time(6) NOT NULL,
  `complains` varchar(100) NOT NULL,
  `findings` varchar(100) NOT NULL,
  `treatment` varchar(100) NOT NULL,
  `medicine` varchar(100) NOT NULL,
  `alergies` varchar(100) NOT NULL,
  `doctor_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `diagnosis`
--

CREATE TABLE `diagnosis` (
  `No` int(100) NOT NULL,
  `patient_id` varchar(100) NOT NULL,
  `doctor_id` varchar(100) NOT NULL,
  `date` date NOT NULL,
  `time` time(6) NOT NULL,
  `description` varchar(100) NOT NULL,
  `diagnosis` varchar(100) NOT NULL,
  `complications` varchar(100) NOT NULL,
  `allergies` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `No` int(100) NOT NULL,
  `doctor_id` varchar(100) NOT NULL,
  `user_name` varchar(100) NOT NULL,
  `address` longtext NOT NULL,
  `contact_no` longtext NOT NULL,
  `email` longtext NOT NULL,
  `department` varchar(100) NOT NULL,
  `speciality` varchar(100) NOT NULL,
  `designation` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`No`, `doctor_id`, `user_name`, `address`, `contact_no`, `email`, `department`, `speciality`, `designation`, `password`) VALUES
(18, 'HJO40WYJ', 'DrSmith', '123 Main Street, Cityville', '(555) 123-4567', 'dr.smith@example.com', 'Internal Medicine', 'Cardiology', 'Consultant', 'P@ssw0rd1'),
(19, 'BK6TILZ1', ' DrJohnson', '456 Elm Avenue, Townsville', '(555) 987-6543', 'johnson.doc@example.com', 'Pediatrics', 'Neonatology', 'Pediatrician', 'SecureDoc123'),
(20, 'ROMC4DJG', ' DrBrown', '789 Oak Lane, Villageton', '(555) 789-0123', ' doc.brown@example.com', 'Surgery', 'Orthopedics', 'Surgeon', 'Doctor4567'),
(21, 'HTUSLWLM', 'DrMiller', '567 Pine Road, Hamletville', '(555) 234-5678', 'miller.doc@example.com', 'Obstetrics and Gynecology', 'Reproductive Endocrinology', 'OB/GYN Specialist', 'MedicalPass!'),
(22, 'K4ID3H4K', 'DrWilson', '890 Cedar Street, Countryside', '(555) 890-1234', 'wilson.doc@example.com', 'Neurology', 'Neurophysiology', 'Neurologist', 'DocNeuro789');

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `No` int(50) NOT NULL,
  `patient_id` varchar(50) NOT NULL,
  `user_name` varchar(500) NOT NULL,
  `address` varchar(50) NOT NULL,
  `contact_no` varchar(500) NOT NULL,
  `email` varchar(50) NOT NULL,
  `dob` date NOT NULL,
  `gender` varchar(50) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`No`, `patient_id`, `user_name`, `address`, `contact_no`, `email`, `dob`, `gender`, `password`) VALUES
(10, '1CI39Y6X', 'Ruchira Lakshan', 'Moneragala', '762433369', 'ruchira@gmail.com', '2023-08-10', 'Male', '123456'),
(11, 'HYJ0SEN3', 'Alex Johnson', '123 Health Street, Careville', ' (555) 555-1234', 'alex.johnson@example.com', '1990-05-15', 'Male', 'Patient@123'),
(12, 'KT89ZRZP', 'Emily Davis', '456 Recovery Lane, Healingtown', '(555) 555-9876', 'emily.davis@example.com', '1985-11-03', 'Female', 'HealthPass1'),
(13, 'JO4TSBE2', 'Ethan Miller', '789 Wellness Avenue, Wellnessville', '(555) 555-7890', 'ethan.miller@example.com', '1998-07-22', 'Male', 'Wellness2023'),
(14, 'IVE0BO48', 'Olivia Smith', '567 Recovery Road, Recoverytown', '(555) 555-2345', 'olivia.smith@example.com', '2000-02-10', 'Female', ' PatientCare!'),
(15, 'G5V24VEJ', 'Liam Wilson', '890 Care Lane, Careville', '(555) 555-8901', ' liam.wilson@example.com', '1995-09-28', 'Male', ' HealingPatient456');

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE `staff` (
  `No` int(10) NOT NULL,
  `staff_id` varchar(1000) NOT NULL,
  `user_name` varchar(1000) NOT NULL,
  `address` varchar(1000) NOT NULL,
  `contact_no` varchar(255) NOT NULL,
  `email` varchar(1000) NOT NULL,
  `department` varchar(1000) NOT NULL,
  `designation` varchar(1000) NOT NULL,
  `password` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`No`, `staff_id`, `user_name`, `address`, `contact_no`, `email`, `department`, `designation`, `password`) VALUES
(10, 'L65IMC3K', ' Lisa Anderson', '123 Medical Avenue, Healthville', '(555) 555-1234', 'lisa.anderson@example.com', 'Medical Records', 'Medical Records Clerk', 'Records@123'),
(11, 'UUSE8RIP', 'David Martinez', '456 Health Lane, Wellnessville', '(555) 555-9876', ' david.martinez@example.com', ' Billing and Insurance', ' Billing Specialist', ' Billings123'),
(12, '9VXMI5TT', 'Jessica Thompson', '789 Care Street, Careville', '(555) 555-7890', ' jessica.thompson@example.com', 'Reception', 'Receptionist', ' FrontDesk1'),
(13, 'YHLAPOGI', 'Robert Williams', '567 Patient Road, Healingville', '(555) 555-2345', ' robert.williams@example.com', ' Nursing', 'Nurse Administrator', 'NursePass!'),
(14, '3PY86LT5', 'Emily Parker', '890 Health Avenue, Recoveryville', '(555) 555-8901', ' emily.parker@example.com', ' IT Support', 'IT Support Specialist', 'ITSupport456');

-- --------------------------------------------------------

--
-- Table structure for table `staff_med_insert`
--

CREATE TABLE `staff_med_insert` (
  `patient_id` varchar(100) NOT NULL,
  `staff_id` varchar(100) NOT NULL,
  `description` varchar(100) NOT NULL,
  `complications` varchar(100) NOT NULL,
  `medicines` varchar(100) NOT NULL,
  `Allergies` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `surgery`
--

CREATE TABLE `surgery` (
  `No` int(11) NOT NULL,
  `patient_id` varchar(100) NOT NULL,
  `doctor_id` varchar(100) NOT NULL,
  `doctor_Name` varchar(100) NOT NULL,
  `date` date NOT NULL,
  `time` varchar(100) NOT NULL,
  `description` varchar(100) NOT NULL,
  `complications` varchar(100) NOT NULL,
  `allergies` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `surgery`
--

INSERT INTO `surgery` (`No`, `patient_id`, `doctor_id`, `doctor_Name`, `date`, `time`, `description`, `complications`, `allergies`) VALUES
(4, '1CI39Y6X', 'HJO40WYJ', 'Dr. Smith', '2023-08-25', '10:00 AM', 'Appendectomy', 'Penicillin', 'None');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`No`);

--
-- Indexes for table `consultation`
--
ALTER TABLE `consultation`
  ADD PRIMARY KEY (`No`);

--
-- Indexes for table `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`No`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`No`);

--
-- Indexes for table `staff`
--
ALTER TABLE `staff`
  ADD PRIMARY KEY (`No`);

--
-- Indexes for table `staff_med_insert`
--
ALTER TABLE `staff_med_insert`
  ADD UNIQUE KEY `patient_id` (`patient_id`);

--
-- Indexes for table `surgery`
--
ALTER TABLE `surgery`
  ADD PRIMARY KEY (`No`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `No` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `consultation`
--
ALTER TABLE `consultation`
  MODIFY `No` int(100) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `doctor`
--
ALTER TABLE `doctor`
  MODIFY `No` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `patient`
--
ALTER TABLE `patient`
  MODIFY `No` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `staff`
--
ALTER TABLE `staff`
  MODIFY `No` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `surgery`
--
ALTER TABLE `surgery`
  MODIFY `No` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
