-- BAGIAN 1.
-- 1.	Buatlah Basis Data Salon dengan format nama basis data: Salon_NamaAnda.
-- ===================================================================================



-- 2.	Lengkapilah Sintaks SQL (Perintah DDL) 
-- untuk membuat tabel dari file yang telah diberikan, 
-- agar dapat terbentuk Relasi Antar Tabel sebagai berikut.
-- =======================================================================================
Create Table Pelanggan(
No_Pelanggan Char(6) not null primary key, 
NamaPelanggan Varchar(30) not null, 
Alamat Varchar(100) not null, 
Telp Varchar(13) not null 
);

Create Table Perawatan( 
Kd_Perawatan CHAR(6) not null primary key, 
JenisPerawatan VARCHAR(50) not null, 
Harga int not null);

Create Table Produk_Perawatan 
(Kd_Produk Char(6) not null primary key, 
NamaProduk Varchar(30) not null, 
jumlah INT not null, 
Harga INT not null 
);

create table Staff_Salon( 
ID_Staff char(6) not null primary key, 
KdPerawatan CHAR(6) not null, 
Nama varchar (225) not null,
Alamat varchar (225) not null, 
NoTelp varchar (13) not null);

Create Table DetailPerawatan 
(NoPelanggan Char(6) not null, 
KdPerawatan CHAR(6) not null,
JumlahBeliPerawatan int(3) not null);

Create Table DetailProdukPerawatan
(KdPerawatan Char(6) not null, 
KdProduk CHAR(6) not null,
JumlahBeliProduk int(3) not null);


-- 3.	Isilah data ke seluruh tabel sesuai dengan yang telah disediakan pada file .sql.
-- ==============================================================================================
INSERT INTO Pelanggan VALUES 
('PLN001','Cheri Maudi Chantika','JL. DI Panjaitan No. 12,Palembang','0821765132862'), 
('PLN002','Daffa Herta Pratama','JL. Paiman No. 21,Palembang','0813548292192'), 
('PLN003','Faris Aji','JL. Ramayana No. 16,Palembang','0812719485123'), 
('PLN004','Galang Hanipan','JL. Depo No. 9,Palembang','0821643019275'), 
('PLN005','Muhammad Gilang','JL. Lorok No. 14,Palembang','0812293358819'), 
('PLN006','Fernando Saputra','JL. Masjid No. 12,Palembang','0813433127472'), 
('PLN007','Aliya Yuridistina','JL. Bukit Asam  No. 16,Palembang','0813291527482'), 
('PLN008','Amalia Ramadhini','JL. Bukit Besar No. 9,Palembang','0821813928487'), 
('PLN009','Aisyah Putri','JL. Sungki No. 18,Palembang','0821554598293'), 
('PLN010','Angelina Morena','JL. Kamil No. 7,Palembang','0821554598293');


INSERT INTO Perawatan VALUES 
('PRW001','Hair Coloring','70000'), 
('PRW002','Hair Toning','60000'), 
('PRW003','Hair Mask','80000'), 
('PRW004','Hair Manicure','50000'), 
('PRW005','Creambath','75000'), 
('PRW006','Hair Spa','40000'), 
('PRW007','Hair Bleaching','60000'), 
('PRW008','Rebonding','55000'), 
('PRW009','Smoothing','85000'),
('PRW010','Perming','90000');


INSERT INTO Staff_Salon values 
('KYN001','PRW009','Ningsih Panjaitan','Jalan Kenangan No.12, Palembang','085173223409'), 
('KYN002','PRW008','Hotman Pasir','Jalan Binjai No.124, Betung','085119753409'), 
('KYN003','PRW006','Fadhel muysafa','Jalan Rindu berat No.98, Lubuklinggau','085173220909'), 
('KYN004','PRW005','Peraldos','Jalan jalan sampe capek No.12, Palembang','085173098459'), 
('KYN005','PRW003','Luhut Sitompul','Jalan Kesana Kemari No.02, Muara Enim','085174323409'), 
('KYN006','PRW004','Gojo Sitorus','Jalan Bank Raya  No.01, palembang','085173223219'), 
('KYN007','PRW010','Ramlan Aduhai','Jalan Kemang No.12, Palembang','085173222109'), 
('KYN008','PRW007','Fadhel yaudah','Jalan Kenalan No.121, Palembang','085173067409'), 
('KYN009','PRW009','Nanik Ritaningsih','Jalan ga sampe jadian No.12, Palembang','085173610409'), 
('KYN010','PRW001','Muhammad Veraldo','Jalan ketinggian No.09, Palembang','085173204519'); 

Insert into Produk_Perawatan (KdProduk, NamaProduk, satuan, harga) VAlUES 
('KDP001','Shampoo Head And Shoulder','30','25000'), 
('KDP002','Conditioner Pantene','40','45000'), 
('KDP003','Hair Serum Matrix ','50','55000'), 
('KDP004','Hair Vitamin Elips','70','15000'), 
('KDP005','Hair Oil L Oreal','20','250000'), 
('KDP006','Hair Tonic Garnier','80','65000'), 
('KDP007','Hair Energy Makarizo','80','45000'), 
('KDP008','Sun Screen Kahf','40','55000'), 
('KDP009','Face Wash Corsx','100','85000'),
('KDP010','Hair Spray Sea Salt','90','75000');

INSERT INTO DetailPerawatan (NoPelanggan, KdPerawatan, Jumlah) VALUES 
('PLN001','PRW010', '1'), 
('PLN003','PRW008', '1'), 
('PLN005','PRW006', '1'), 
('PLN007','PRW004', '1'), 
('PLN009','PRW002', '1'), 
('PLN010','PRW001', '1'), 
('PLN008','PRW003', '1'), 
('PLN006','PRW005', '1'), 
('PLN004','PRW007', '1'), 
('PLN002','PRW009', '1');

INSERT INTO DetailProdukPerawatan (KdPerawatan, KdProduk, Jumlah) VALUES 
('PRW010','KDP002','2'), 
('PRW008','KDP005','2'), 
('PRW006','KDP006', '3'), 
('PRW004','KDP005', '1'), 
('PRW002','KDP004', '3'), 
('PRW001','KDP003', '5'), 
('PRW003','KDP010', '2'),
('PRW005','KDP001', '1'), 
('PRW007','KDP007', '1'), 
('PRW009','KDP006', '2');

-- 4.	Tambahkan 1 baris data Anda pada Tabel Pelanggan, dengan NoPelanggan PLN011.
-- ======================================================================================


Show tables;

Desc pelanggan;
Desc perawatan;
Desc produk_perawatan;
Desc Staff_Salon;
Desc DetailPerawatan;
Desc DetailProdukPerawatan;

SELECT * From Pelanggan;
SELECT * From Perawatan;
SELECT * From Staff_Salon;
SELECT * From Produk_Perawatan;
SELECT * From DetailPerawatan;
SELECT * From DetailProdukPerawatan;


-- BAGIAN 2
-- 1. Tampilkan data pelanggan yang alamatnya mengandung kata "Bukit" dan nomor telepon tidak diawali "09". (5 Point)
-- =====================================================================================================================================



-- 2. Tampilkan data perawatan dengan harga antara 75.000 sampai 150.000. (5 Point)
-- =====================================================================================================================================





-- 3. Tampilkan nama pelanggan yang diakhiri dengan huruf "a". (10 Point)
-- =====================================================================================================================================





-- 4. Tampilkan pelanggan dengan NoPelanggan termasuk dalam ('PL001', 'PL003', 'PL005'). (10 Point)
-- =====================================================================================================================================



-- 5. Tambahkan Data pada Tabel detail Perawatan dengan data sebagai berikut (PLN011, PRW010, 2). (10 Point)
-- ========================================================================================================================================




-- 6. Tampilkan Kode Perawatan dan Hitung akumulasi jumlah beli perawatan 
-- untuk setiap KdPerawatan dari tabel detailperawatan. (20 Point)
-- =====================================================================================================================================






-- 7.	Tampilkan Kode Perawatan, Jenis Perawatan dan jumlah staff per jenis perawatan, 
-- kemudian urutkan berdasarkan jumlah terbanyak. (20 Point)
-- ====================================================================================================================================







-- 8.	Tampilkan semua data dari tabel perawatan dan staff salon yang menangani perawatan tersebut 
-- (termasuk perawatan yang belum dikuasai oleh staff). (20 Point)
-- =====================================================================================================================================


