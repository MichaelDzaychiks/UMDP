CREATE DATABASE LatihanJoin_Michael;
USE LatihanJoin_Michael;
DROP database LatihanJoin_Michael;

CREATE TABLE pasien (
    KdPasien CHAR(8) PRIMARY KEY NOT NULL,
    Nama VARCHAR(50) NOT NULL,
    Alamat VARCHAR(225) NOT NULL,
    JenisKelamin VARCHAR(10) NOT NULL,
    GolonganDarah CHAR(2) NOT NULL
);

CREATE TABLE obat (
    KdObat CHAR(5) PRIMARY KEY NOT NULL,
    NamaObat VARCHAR(70) NOT NULL,
    Harga INT NOT NULL
);

CREATE TABLE transaksi (
    KdPasien CHAR(8) NOT NULL,
    KdObat CHAR(5) NOT NULL,
    TanggalTransaksi DATE NOT NULL,
    Jumlah INT NOT NULL,
    FOREIGN KEY (KdPasien) REFERENCES pasien(KdPasien) ON UPDATE CASCADE ON DELETE CASCADE,
    FOREIGN KEY (KdObat) REFERENCES obat(KdObat) ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO pasien VALUES
('P01AA001','Ferry','Jl. Melati No. 1','Laki-Laki','A'),
('P01AB001','Benny','Jl. Mercubuana No. 567','Laki-Laki','AB'),
('P01BB001','Juno','Jl. Betet No. 172','Laki-Laki','B'),
('P02AB001','Aqila','Jl. Mawar No. 4','Perempuan','AB'),
('P02OO001','Bianca','Jl. Jendral Sudirman No. 483','Perempuan','O'),
('P03AA001','Michael','Jl. Contoh No. 10','Laki-Laki','A');

INSERT INTO obat VALUES
('B0001','Asam Mefenamat',25000),
('B0002','Cetrin',78000),
('B0003','Losartan',45000),
('B0004','Dekongestan',34000),
('B0005','Bisolvon',97000);

INSERT INTO transaksi VALUES
('P01BB001','B0002','2024-04-04',3),
('P01BB001','B0004','2024-04-04',2),
('P02AB001','B0005','2024-04-05',5),
('P01AA001','B0003','2024-04-06',2),
('P01AA001','B0004','2024-04-06',4);

select * from transaksi;
drop table transaksi;

-- SOAL 1
SELECT * FROM pasien;

-- SOAL 2
SELECT * FROM obat;

-- SOAL 3
SELECT * FROM transaksi;

-- SOAL 4
SELECT Nama, JenisKelamin FROM pasien;

-- SOAL 5
SELECT NamaObat, Harga FROM obat;

-- SOAL 6
SELECT pasien.Nama, transaksi.TanggalTransaksi FROM pasien JOIN transaksi ON pasien.KdPasien = transaksi.KdPasien;

-- SOAL 7
SELECT pasien.Nama, COUNT(transaksi.KdObat) FROM pasien 
JOIN transaksi ON pasien.KdPasien = transaksi.KdPasien GROUP BY pasien.Nama;

-- SOAL 8
SELECT obat.NamaObat, SUM(transaksi.Jumlah) FROM obat
JOIN transaksi ON obat.KdObat = transaksi.KdObat GROUP BY obat.NamaObat;

-- SOAL 9
SELECT DISTINCT pasien.* FROM pasien
JOIN transaksi ON pasien.KdPasien = transaksi.KdPasien;

-- SOAL 10
SELECT * FROM pasien WHERE KdPasien NOT IN (SELECT KdPasien FROM transaksi);

-- SOAL 11
SELECT pasien.KdPasien, pasien.Nama, pasien.Alamat, pasien.JenisKelamin, pasien.GolonganDarah,
transaksi.KdObat, transaksi.TanggalTransaksi, transaksi.Jumlah
FROM pasien
LEFT JOIN transaksi ON pasien.KdPasien = transaksi.KdPasien;

-- SOAL 12
SELECT * FROM pasien LEFT JOIN transaksi ON pasien.KdPasien = transaksi.KdPasien
WHERE transaksi.KdPasien IS NULL;

-- SOAL 13
SELECT obat.*, transaksi.TanggalTransaksi, transaksi.Jumlah FROM obat
LEFT JOIN transaksi ON obat.KdObat = transaksi.KdObat;

-- SOAL 14
SELECT * FROM obat LEFT JOIN transaksi ON obat.KdObat = transaksi.KdObat 
WHERE transaksi.KdObat IS NULL;

-- SOAL 15
SELECT pasien.Nama, SUM(transaksi.Jumlah) FROM pasien
JOIN transaksi ON pasien.KdPasien = transaksi.KdPasien GROUP BY pasien.Nama;

-- SOAL 16
SELECT pasien.KdPasien, pasien.Nama, pasien.Alamat, pasien.JenisKelamin, pasien.GolonganDarah,
SUM(transaksi.Jumlah)
FROM pasien JOIN transaksi ON pasien.KdPasien = transaksi.KdPasien
GROUP BY pasien.KdPasien, pasien.Nama, pasien.Alamat, pasien.JenisKelamin, pasien.GolonganDarah
ORDER BY SUM(transaksi.Jumlah) DESC LIMIT 1;

-- SOAL 17
SELECT obat.KdObat, obat.NamaObat, obat.Harga FROM obat
JOIN transaksi ON obat.KdObat = transaksi.KdObat
GROUP BY obat.KdObat, obat.NamaObat, obat.Harga
ORDER BY SUM(transaksi.Jumlah) DESC LIMIT 1;

-- SOAL 18
SELECT SUM(transaksi.Jumlah * obat.Harga)
FROM transaksi JOIN obat ON transaksi.KdObat = obat.KdObat;

-- SOAL 19
SELECT pasien.KdPasien, pasien.Nama, AVG(transaksi.Jumlah)
FROM pasien JOIN transaksi ON pasien.KdPasien = transaksi.KdPasien
GROUP BY pasien.KdPasien, pasien.Nama;

-- SOAL 20
SELECT * FROM pasien
WHERE JenisKelamin = 'Perempuan' OR GolonganDarah = 'AB' ORDER BY Nama;

-- SOAL 21
SELECT * FROM pasien WHERE GolonganDarah IN ('A','B') OR Alamat LIKE '%Mawar%' ORDER BY Nama ASC;

-- SOAL 22
SELECT * FROM obat WHERE Harga > 70000;

-- SOAL 23
SELECT pasien.Nama, obat.NamaObat, obat.Harga, transaksi.TanggalTransaksi
FROM transaksi
JOIN pasien ON transaksi.KdPasien = pasien.KdPasien
JOIN obat ON transaksi.KdObat = obat.KdObat
WHERE transaksi.TanggalTransaksi BETWEEN '2024-04-01' AND '2024-04-05'
AND transaksi.Jumlah > 2
ORDER BY transaksi.TanggalTransaksi DESC;

-- SOAL 24
SELECT pasien.Nama, transaksi.TanggalTransaksi FROM pasien
JOIN transaksi ON pasien.KdPasien = transaksi.KdPasien
WHERE transaksi.TanggalTransaksi BETWEEN '2024-04-02' AND '2024-04-05';

-- SOAL 25
SELECT pasien.Nama, obat.NamaObat, obat.Harga, transaksi.Jumlah
FROM transaksi
JOIN pasien ON transaksi.KdPasien = pasien.KdPasien
JOIN obat ON transaksi.KdObat = obat.KdObat
WHERE pasien.Nama = 'Juno' OR transaksi.Jumlah > 4
ORDER BY obat.Harga;

-- SOAL 26
SELECT pasien.KdPasien, pasien.Nama, COUNT(transaksi.KdPasien) FROM pasien
LEFT JOIN transaksi ON pasien.KdPasien = transaksi.KdPasien 
GROUP BY pasien.KdPasien, pasien.Nama
ORDER BY COUNT(transaksi.KdPasien) DESC;