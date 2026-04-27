Create database LATIHANFUNGSIIF2B_MichaelChan_17;
use LATIHANFUNGSIIF2B_MichaelChan_17;

-- Membuat Tabel
CREATE TABLE Obat (
    IDObat VARCHAR(10) PRIMARY KEY,
    NamaObat VARCHAR(100) NOT NULL,
    JenisObat VARCHAR(50) NOT NULL,
    Harga INT NOT NULL,
    Stok INT NOT NULL
);

CREATE TABLE Pelanggan (
    IDPelanggan VARCHAR(10) PRIMARY KEY,
    Nama VARCHAR(100) NOT NULL,
    KotaAsal VARCHAR(50) NOT NULL,
    NoTelp VARCHAR(13) NOT NULL
);

CREATE TABLE Penjualan (
    IDPenjualan VARCHAR(10) PRIMARY KEY NOT NULL,
    IDPelanggan VARCHAR(10) NOT NULL,
    Tanggal DATE NOT NULL,
    FOREIGN KEY (IDPelanggan) REFERENCES Pelanggan(IDPelanggan)
);

CREATE TABLE DetailPenjualan (
    IDPenjualan VARCHAR(10),
    IDObat VARCHAR(10) NOT NULL,
    Jumlah INT NOT NULL,
    FOREIGN KEY (IDPenjualan) REFERENCES Penjualan(IDPenjualan),
	FOREIGN KEY (IDObat) REFERENCES Obat(IDObat)
);

Show tables;


-- Mengisi Tabel Obat, Pelanggan, Penjualan dan Detai Penjualan
INSERT INTO Obat (IDObat, NamaObat, JenisObat, Harga, Stok) VALUES
('OB-TB-001', 'Paracetamol', 'Tablet', 5000, 100),
('OB-KP-002', 'Amoxicillin', 'Kapsul', 10000, 50),
('OB-TB-003', 'Cetirizine', 'Tablet', 7000, 80),
('OB-TB-004', 'Ibuprofen', 'Tablet', 8000, 60),
('OB-TB-005', 'Antasida Doen', 'Tablet', 3000, 120),
('OB-TB-006', 'Metformin', 'Tablet', 12000, 40),
('OB-KP-007', 'Loperamide', 'Kapsul', 6000, 70),
('OB-SR-008', 'Cotrimoxazole', 'Sirup', 15000, 30),
('OB-IN-009', 'Salbutamol', 'Inhaler', 30000, 20),
('OB-TB-010', 'Ranitidine', 'Tablet', 9000, 50);


INSERT INTO Pelanggan (IDPelanggan, Nama, KotaAsal, NoTelp) VALUES
('PL-JK-001', 'Desi Pibriana', 'Jakarta', '081234567890'),
('PL-BG-002', 'Budi Santoso', 'Bogor', '082134567891'),
('PL-BD-003', 'Siti Aisyah', 'Bandung', '083134567892'),
('PL-SB-004', 'Rudi Hartono', 'Surabaya', '084134567893'),
('PL-YG-005', 'Dewi Lestari', 'Yogyakarta', '085134567894'),
('PL-ML-006', 'Hadi Pranoto', 'Malang', '086134567895'),
('PL-SM-007', 'Indah Permata', 'Semarang', '087134567896'),
('PL-MD-008', 'Joko Susanto', 'Medan', '088134567897'),
('PL-MK-009', 'Siti Nurhaliza', 'Makassar', '089134567898'),
('PL-PB-010', 'Agus Salim', 'Palembang', '081234567899');


INSERT INTO Penjualan (IDPenjualan, IDPelanggan, tanggal) VALUES
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



INSERT INTO DetailPenjualan (IDPenjualan, IDObat, jumlah) VALUES
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

-- Hapuslah Kolom Jenis Obat dari Tabel Obat- 
alter table obat drop JenisObat;


Select * from Obat;
Select * from Pelanggan;
Select * from Penjualan;
Select * from DetailPenjualan;


-- ==================================================================================================================================
-- FUNGSI STRING
-- ==================================================================================================================================

-- 1.Tampilkan nama pelanggan dalam huruf kapital semua, Kota Asal dalam huruf kecil semua
SELECT UPPER(Nama), LOWER(KotaAsal)
FROM Pelanggan;

-- 2.Tampilkan nama obat dalam huruf kecil semua dan ID Obat dalamhuruf kecil semua 
-- kemudian urutkan berdasarkan nama obat secara menaik
SELECT LOWER(NamaObat), LOWER(IDObat) FROM Obat ORDER BY NamaObat ASC;

-- 3.Tampilkan 3 huruf pertama nama pelanggan.
SELECT LEFT(Nama,3) FROM Pelanggan;

-- 4.Tampilkan 4 huruf terakhir nama obat.
SELECT RIGHT(NamaObat,4) FROM Obat;

-- 5.Tampilkan panjang karakter nama pelanggan.
SELECT LENGTH(Nama) FROM Pelanggan;

-- 6.Tampilkan nama pelanggan dan kota asal digabung menjadi satu kolom "Data Pelanggan"
SELECT CONCAT(Nama,' ',KotaAsal) FROM Pelanggan;

-- 7.Tampilkan ID pelanggan dan nama pelanggan, lalu dipisahkan menggunakan tanda -
SELECT CONCAT(IDPelanggan,'-',Nama) FROM Pelanggan;

-- 8.Tampilkan nama pelanggan dan nomor telepon, tetapi nomor telepon hanya 4 digit terakhir saja.
SELECT Nama, RIGHT(NoTelp,4) FROM Pelanggan;

-- 9.Tampilkan Nama obat dengan huruf pertama dan kedua kapital, sisanya kecil, sebagai Kolom Jenis Obat.
select * from obat;
SELECT CONCAT(UPPER(LEFT(NamaObat,2)), LOWER(SUBSTRING(NamaObat,3))) FROM Obat;

-- 10.Tampilkan nama pelanggan yang jumlah hurufnya lebih dari 5 karakter
SELECT Nama FROM Pelanggan WHERE LENGTH(Nama) > 5;

-- 11.Gabungkan nama pelanggan + teks " berasal dari " + kota asal
SELECT CONCAT(Nama,' berasal dari ',KotaAsal) FROM Pelanggan;

-- 12.Tampilkan nama obat beserta jumlah hurufnya.
SELECT NamaObat, LENGTH(NamaObat) FROM Obat;

-- 13.Tampilkan nama pelanggan dan tanggal penjualan, lalu ubah nama pelanggan ke huruf besar.
SELECT UPPER(Pelanggan.Nama), Penjualan.Tanggal
FROM Pelanggan
LEFT JOIN Penjualan ON Pelanggan.IDPelanggan = Penjualan.IDPelanggan;

-- 14.Tampilkan nama pelanggan, kota asal, nama obat, lalu gabungkan sehingga menghasilkan kalimat seperti:
-- "Budi (Palembang) membeli Amoxicillin"
SELECT CONCAT(Pelanggan.Nama,' (',Pelanggan.KotaAsal,') membeli ',Obat.NamaObat)
FROM Pelanggan
LEFT JOIN Penjualan ON Pelanggan.IDPelanggan = Penjualan.IDPelanggan
LEFT JOIN DetailPenjualan ON Penjualan.IDPenjualan = DetailPenjualan.IDPenjualan
LEFT JOIN Obat ON DetailPenjualan.IDObat = Obat.IDObat;

-- 15.Tampilkan nama obat dan jenis obat, lalu gabungkan: "Paracetamol - Analgesik"
SELECT CONCAT(NamaObat,' - ','Obat') FROM Obat;

-- ==================================================================================================================================
-- FUNGSI NUMERIK
-- ==================================================================================================================================

-- 1.Tampilkan nama obat, harga asli, dan harga setelah diskon 10%.
SELECT NamaObat, Harga, Harga - (Harga * 0.10) FROM Obat;
-- 2.Tampilkan nama obat, harga dan PPN 11% dari harga obat.
SELECT NamaObat, Harga, Harga * 0.11 FROM Obat;

-- 3.Tampilkan nama obat dan "total nilai stok" yang didapat dari (Harga x Stok).
SELECT NamaObat, Harga * Stok FROM Obat;

-- 4.Tampilkan nama obat, harga dan keuntungan per item, dan harga jual.
-- Notes: Keuntungan per Item = 25% dari harga.
-- Harga Jual = Harga + Keuntungan per Item
SELECT NamaObat, Harga, Harga * 0.25, Harga + (Harga * 0.25) FROM Obat;

-- 5.Tampilkan nama obat, harga dan simulasi kenaikan harga 7,5%.
SELECT NamaObat, Harga, Harga + (Harga * 0.075) FROM Obat;
-- ==================================================================================================================================
-- FUNGSI DATE
-- ==================================================================================================================================

-- 1.Tampilkan IDPenjualan, tanggal transaksi, dan nama hari transaksi.
SELECT IDPenjualan, Tanggal, DAYNAME(Tanggal) FROM Penjualan;

-- 2.Tampilkan semua penjualan yang terjadi hari ini.
SELECT * FROM Penjualan WHERE Tanggal = CURDATE();

-- 3.Tampilkan semua penjualan bulan ini.
SELECT * FROM Penjualan
WHERE MONTH(Tanggal) = MONTH(CURDATE())
AND YEAR(Tanggal) = YEAR(CURDATE());

-- 4.Tampilkan jumlah transaksi yang terjadi tahun ini.
select * from penjualan;
SELECT COUNT(*) FROM Penjualan WHERE YEAR(Tanggal) = YEAR(CURDATE());

-- 5.Tampilkan IDPenjualan, tanggal transaksi dan "Usia Transaksi" (berapa hari sejak transaksi).
SELECT IDPenjualan, Tanggal, DATEDIFF(CURDATE(), Tanggal) FROM Penjualan;

-- 6.Tampilkan penjualan yang terjadi pada hari Minggu.
SELECT * FROM Penjualan WHERE DAYNAME(Tanggal) = 'Sunday';
