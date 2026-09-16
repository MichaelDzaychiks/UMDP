-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 18 Bulan Mei 2026 pada 06.00
-- Versi server: 10.4.32-MariaDB
-- Versi PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `latihanfungsiif2b_michaelchan_17`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `detailpenjualan`
--

CREATE TABLE `detailpenjualan` (
  `IDPenjualan` varchar(10) DEFAULT NULL,
  `IDObat` varchar(10) NOT NULL,
  `Jumlah` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `detailpenjualan`
--

INSERT INTO `detailpenjualan` (`IDPenjualan`, `IDObat`, `Jumlah`) VALUES
('PJ-001', 'OB-TB-001', 2),
('PJ-001', 'OB-TB-003', 1),
('PJ-002', 'OB-KP-002', 2),
('PJ-002', 'OB-TB-004', 1),
('PJ-002', 'OB-SR-008', 2),
('PJ-003', 'OB-IN-009', 1),
('PJ-004', 'OB-KP-007', 1),
('PJ-004', 'OB-TB-005', 1),
('PJ-004', 'OB-TB-003', 2),
('PJ-005', 'OB-TB-001', 1);

-- --------------------------------------------------------

--
-- Struktur dari tabel `obat`
--

CREATE TABLE `obat` (
  `IDObat` varchar(10) NOT NULL,
  `NamaObat` varchar(100) NOT NULL,
  `Harga` int(11) NOT NULL,
  `Stok` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `obat`
--

INSERT INTO `obat` (`IDObat`, `NamaObat`, `Harga`, `Stok`) VALUES
('OB-IN-009', 'Salbutamol', 30000, 20),
('OB-KP-002', 'Amoxicillin', 10000, 50),
('OB-KP-007', 'Loperamide', 6000, 70),
('OB-SR-008', 'Cotrimoxazole', 15000, 30),
('OB-TB-001', 'Paracetamol', 5000, 100),
('OB-TB-003', 'Cetirizine', 7000, 80),
('OB-TB-004', 'Ibuprofen', 8000, 60),
('OB-TB-005', 'Antasida Doen', 3000, 120),
('OB-TB-006', 'Metformin', 12000, 40),
('OB-TB-010', 'Ranitidine', 9000, 50);

-- --------------------------------------------------------

--
-- Struktur dari tabel `pelanggan`
--

CREATE TABLE `pelanggan` (
  `IDPelanggan` varchar(10) NOT NULL,
  `Nama` varchar(100) NOT NULL,
  `KotaAsal` varchar(50) NOT NULL,
  `NoTelp` varchar(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `pelanggan`
--

INSERT INTO `pelanggan` (`IDPelanggan`, `Nama`, `KotaAsal`, `NoTelp`) VALUES
('PL-BD-003', 'Siti Aisyah', 'Bandung', '083134567892'),
('PL-BG-002', 'Budi Santoso', 'Bogor', '082134567891'),
('PL-JK-001', 'Desi Pibriana', 'Jakarta', '081234567890'),
('PL-MD-008', 'Joko Susanto', 'Medan', '088134567897'),
('PL-MK-009', 'Siti Nurhaliza', 'Makassar', '089134567898'),
('PL-ML-006', 'Hadi Pranoto', 'Malang', '086134567895'),
('PL-PB-010', 'Agus Salim', 'Palembang', '081234567899'),
('PL-SB-004', 'Rudi Hartono', 'Surabaya', '084134567893'),
('PL-SM-007', 'Indah Permata', 'Semarang', '087134567896'),
('PL-YG-005', 'Dewi Lestari', 'Yogyakarta', '085134567894');

-- --------------------------------------------------------

--
-- Struktur dari tabel `penjualan`
--

CREATE TABLE `penjualan` (
  `IDPenjualan` varchar(10) NOT NULL,
  `IDPelanggan` varchar(10) NOT NULL,
  `Tanggal` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `penjualan`
--

INSERT INTO `penjualan` (`IDPenjualan`, `IDPelanggan`, `Tanggal`) VALUES
('PJ-001', 'PL-JK-001', '2026-03-20'),
('PJ-002', 'PL-BG-002', '2026-03-20'),
('PJ-003', 'PL-BD-003', '2026-03-21'),
('PJ-004', 'PL-SB-004', '2026-03-21'),
('PJ-005', 'PL-YG-005', '2026-03-21'),
('PJ-006', 'PL-ML-006', '2026-03-22'),
('PJ-007', 'PL-SM-007', '2026-03-22'),
('PJ-008', 'PL-MD-008', '2026-03-22'),
('PJ-009', 'PL-MK-009', '2026-03-22'),
('PJ-010', 'PL-PB-010', '2026-03-23');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `detailpenjualan`
--
ALTER TABLE `detailpenjualan`
  ADD KEY `IDPenjualan` (`IDPenjualan`),
  ADD KEY `IDObat` (`IDObat`);

--
-- Indeks untuk tabel `obat`
--
ALTER TABLE `obat`
  ADD PRIMARY KEY (`IDObat`);

--
-- Indeks untuk tabel `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`IDPelanggan`);

--
-- Indeks untuk tabel `penjualan`
--
ALTER TABLE `penjualan`
  ADD PRIMARY KEY (`IDPenjualan`),
  ADD KEY `IDPelanggan` (`IDPelanggan`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `detailpenjualan`
--
ALTER TABLE `detailpenjualan`
  ADD CONSTRAINT `detailpenjualan_ibfk_1` FOREIGN KEY (`IDPenjualan`) REFERENCES `penjualan` (`IDPenjualan`),
  ADD CONSTRAINT `detailpenjualan_ibfk_2` FOREIGN KEY (`IDObat`) REFERENCES `obat` (`IDObat`);

--
-- Ketidakleluasaan untuk tabel `penjualan`
--
ALTER TABLE `penjualan`
  ADD CONSTRAINT `penjualan_ibfk_1` FOREIGN KEY (`IDPelanggan`) REFERENCES `pelanggan` (`IDPelanggan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
