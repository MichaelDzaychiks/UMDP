CREATE DATABASE tugas3_MichaelChan;
USE tugas3_MichaelChan;

CREATE TABLE Pasien (
ID_Pasien CHAR(6) PRIMARY KEY,
Nama_Lengkap VARCHAR(50) NOT NULL,
Alamat VARCHAR(200) NOT NULL,
Nomor_Telepon VARCHAR(15) NOT NULL,
Tanggal_Lahir DATE NOT NULL,
Jenis_Kelamin VARCHAR(15) NOT NULL
);

CREATE TABLE Dokter (
ID_Dokter CHAR(6) PRIMARY KEY,
Nama_Lengkap VARCHAR(50) NOT NULL,
Spesialisasi VARCHAR(100) NOT NULL,
NomorTelepon VARCHAR(15) NOT NULL,
Email VARCHAR(100) NOT NULL,
Jadwal_Praktik DATE NOT NULL
);

CREATE TABLE Kunjungan (
ID_Kunjungan CHAR(6) PRIMARY KEY,
Tanggal_Kunjungan DATE NOT NULL,
Waktu_Kunjungan TIME NOT NULL,
Keluhan_Pasien VARCHAR(255) NOT NULL,
Email VARCHAR(100),
ID_Pasien CHAR(6),
ID_Dokter CHAR(6),
FOREIGN KEY (ID_Pasien) REFERENCES Pasien(ID_Pasien)
ON UPDATE CASCADE ON DELETE CASCADE,
FOREIGN KEY (ID_Dokter) REFERENCES Dokter(ID_Dokter)
ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE Rekam_Medis (
ID_RekamMedis CHAR(6) PRIMARY KEY,
Diagnosis VARCHAR(255) NOT NULL,
Catatan_Medis VARCHAR(255),
Tanggal_Pencatatan DATE NOT NULL,
ID_Pasien CHAR(6),
FOREIGN KEY (ID_Pasien) REFERENCES Pasien(ID_Pasien)
ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE Pembayaran (
ID_Pembayaran CHAR(6) PRIMARY KEY,
Tanggal_Pembayaran DATE NOT NULL,
Metode_Pembayaran VARCHAR(30) NOT NULL,
Jumlah_Banyak INT NOT NULL,
ID_Kunjungan CHAR(6),
FOREIGN KEY (ID_Kunjungan) REFERENCES Kunjungan(ID_Kunjungan)
ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE Jadwal_Praktik (
ID_Jadwal CHAR(6) PRIMARY KEY,
Hari DATE NOT NULL,
Jam_Mulai TIME NOT NULL,
Jam_Selesai INT NOT NULL
);

CREATE TABLE Praktik (
ID_Praktik CHAR(6) PRIMARY KEY,
ID_Dokter CHAR(6),
ID_Jadwal CHAR(6),
FOREIGN KEY (ID_Dokter) REFERENCES Dokter(ID_Dokter)
ON UPDATE CASCADE ON DELETE CASCADE,
FOREIGN KEY (ID_Jadwal) REFERENCES Jadwal_Praktik(ID_Jadwal)
ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE Hancur (
ID_Hancur CHAR(6) PRIMARY KEY,
TanggalHancur DATE NOT NULL
);

INSERT INTO Pasien VALUES
('P00001','Lenovo','Palembang','081234567890','2000-05-10','Laki-laki'),
('P00002','Andi Setiawan','Jakarta','081234567891','1999-07-15','Laki-laki');

INSERT INTO Dokter VALUES
('D00001','Dr. Ahmad Fauzi','Anak','081300000001','[ahmad@klinik.com](mailto:ahmad@klinik.com)','2026-03-01'),
('D00002','Dr. Rina Dewi','Jantung','081300000002','[rina@klinik.com](mailto:rina@klinik.com)','2026-03-02');

INSERT INTO Kunjungan VALUES
('K00001','2026-03-01','09:00:00','Demam tinggi','[pasien1@mail.com](mailto:pasien1@mail.com)','P00001','D00001'),
('K00002','2026-03-02','10:00:00','Nyeri dada','[pasien2@mail.com](mailto:pasien2@mail.com)','P00002','D00002');

INSERT INTO Rekam_Medis VALUES
('R00001','Demam','Parasetamol','2026-03-01','P00001'),
('R00002','Angina','Kontrol rutin','2026-03-02','P00002');

INSERT INTO Pembayaran VALUES
('B00001','2026-03-01','Tunai',100000,'K00001'),
('B00002','2026-03-02','Transfer',200000,'K00002');

INSERT INTO Jadwal_Praktik VALUES
('J00001','2026-01-01','09:00:00',12),
('J00002','2026-01-02','10:00:00',13);

ALTER TABLE Pasien
RENAME COLUMN Nama_Lengkap TO Nama_Pasien;

ALTER TABLE Pembayaran
RENAME COLUMN Jumlah_Banyak TO Jumlah_Bayar;

ALTER TABLE Jadwal_Praktik
MODIFY Hari VARCHAR(15),
MODIFY Jam_Selesai TIME;

ALTER TABLE Rekam_Medis
RENAME COLUMN Catatan_Medis TO CatatanDokter;

UPDATE Jadwal_Praktik
SET Hari='Senin',
Jam_Selesai='12:00:00'
WHERE ID_Jadwal='J00001';

UPDATE Jadwal_Praktik
SET Hari='Selasa',
Jam_Selesai='13:00:00'
WHERE ID_Jadwal='J00002';

CREATE TABLE Arsip (
ID_Arsip CHAR(6) PRIMARY KEY,
Nama_Arsip VARCHAR(50)
);

INSERT INTO Arsip VALUES
('AR001','Data A'),
('AR002','Data B'),
('AR003','Data C'),
('AR004','Data D'),
('AR005','Data E');

DELETE FROM Arsip
WHERE ID_Arsip IN ('AR001','AR002');

ALTER TABLE Dokter
DROP COLUMN NomorTelepon;

DROP TABLE Hancur;

DROP TABLE Arsip;

SELECT Nama_Lengkap, Spesialisasi
FROM Dokter;

SELECT ID_Pasien, Nama_Pasien
FROM Pasien;

SELECT Nama_Pasien, Alamat
FROM Pasien;

SELECT Nama_Pasien, Alamat
FROM Pasien
WHERE ID_Pasien='P00002';

SELECT Nama_Lengkap, Spesialisasi
FROM Dokter
WHERE ID_Dokter='D00001';

SELECT Nama_Lengkap, Jadwal_Praktik
FROM Dokter
ORDER BY Jadwal_Praktik DESC;

SELECT Nama_Lengkap, Spesialisasi
FROM Dokter
ORDER BY Spesialisasi;

SELECT Nama_Pasien
FROM Pasien
WHERE Nama_Pasien BETWEEN 'A' AND 'M';

SELECT Nama_Pasien, Tanggal_Lahir
FROM Pasien
WHERE YEAR(Tanggal_Lahir)=2000;

SELECT *
FROM Pasien
WHERE Jenis_Kelamin='Perempuan';

SELECT *
FROM Kunjungan
WHERE ID_Dokter='D00001'
AND Keluhan_Pasien='Demam tinggi';

SELECT *
FROM Dokter
WHERE ID_Dokter IN ('D00001','D00002');

SELECT *
FROM Kunjungan
WHERE Keluhan_Pasien LIKE '%gi%';

SELECT *
FROM Kunjungan
WHERE Keluhan_Pasien REGEXP '^[A-Z]';

SELECT DISTINCT Jenis_Kelamin
FROM Pasien;

SELECT
Nama_Pasien,
CASE
WHEN Jenis_Kelamin='Laki-laki' THEN 'Pria'
ELSE 'Wanita'
END AS Kategori
FROM Pasien;

SELECT Nama_Pasien
FROM Pasien
LIMIT 5;

SELECT Nama_Pasien
FROM Pasien
LIMIT 2,3;

SELECT
Jenis_Kelamin,
COUNT(*) AS Total
FROM Pasien
GROUP BY Jenis_Kelamin;

SELECT
Jenis_Kelamin,
COUNT(*) AS Jumlah
FROM Pasien
GROUP BY Jenis_Kelamin
HAVING COUNT(*) >= 1;

SELECT CONCAT(Nama_Pasien,' | ',Alamat) AS Biodata
FROM Pasien;
