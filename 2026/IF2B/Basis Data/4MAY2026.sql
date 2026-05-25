-- Membuat Sebuah Basis Data dengan format penamaan: BasisData_NamaMahasiswa

Create database BasisData_MichaelChan;
use BasisData_MichaelChan;

-- Membuat Tabel-Tabel
CREATE TABLE Produk (
    idproduk VARCHAR(10) PRIMARY KEY,
    namaproduk VARCHAR(100) NOT NULL,
    kategori VARCHAR(100),
    satuan VARCHAR(50),
    harga INT NOT NULL,
    stok INT NOT NULL
);

CREATE TABLE Pelanggan (
    idpelanggan VARCHAR(10) PRIMARY KEY,
    nama VARCHAR(100) NOT NULL,
    alamat VARCHAR(255),
    notelp VARCHAR(15)
);

CREATE TABLE Transaksi (
    idtransaksi VARCHAR(10) PRIMARY KEY,
    idpelanggan VARCHAR(10),
    tanggal DATE NOT NULL,
    FOREIGN KEY (idpelanggan) REFERENCES Pelanggan(idpelanggan)
);

CREATE TABLE DetailTransaksi (
    idtransaksi VARCHAR(10),
    idproduk VARCHAR(10),
    jumlah INT NOT NULL,
    FOREIGN KEY (idtransaksi) REFERENCES Transaksi(idtransaksi),
    FOREIGN KEY (idproduk) REFERENCES Produk(idproduk)
);

-- Mengisi Tabel-Tabel dengan Data yang ada
INSERT INTO Produk (idproduk, namaproduk, kategori, satuan, harga, stok) VALUES
('BP-BR-001', 'Beras Ramos 5kg', 'Beras', 'sak', 65000, 100),
('BP-MN-002', 'Minyak Goreng 2L', 'Minyak', 'botol', 30000, 80),
('BP-TL-003', 'Telur Ayam 1kg', 'Telur', 'kg', 25000, 150),
('BP-GL-004', 'Gula Pasir 1kg', 'Gula', 'kg', 14000, 200),
('BP-TP-005', 'Tepung Terigu 1kg', 'Tepung', 'kg', 11000, 120),
('BP-GR-006', 'Garam Halus 500g', 'Bumbu', 'pak', 4000, 250),
('BP-GR-007', 'Kecap Manis 600ml', 'Bumbu', 'botol', 16000, 90),
('BP-SU-008', 'Susu Kental Manis', 'Susu', 'kaleng', 12000, 70),
('BP-SY-009', 'Cabe Rawit 250g', 'Sayur', 'pak', 9000, 60),
('BP-SY-010', 'Bawang Merah 1kg', 'Sayur', 'kg', 27000, 100);

INSERT INTO Pelanggan (idpelanggan, nama, alamat, notelp) VALUES
('PL-JK-001', 'Desi Pibriana', 'Jakarta', '081112348765'),
('PL-BD-002', 'Sari Wulandari', 'Bandung', '082212345679'),
('PL-SB-003', 'Dedi Hartono', 'Surabaya', '083212345680'),
('PL-YG-004', 'Lestari Dewi', 'Yogyakarta', '084212345681'),
('PL-ML-005', 'Agus Pranoto', 'Malang', '085212345682'),
('PL-SM-006', 'Rahmat Hidayat', 'Semarang', '086212345683'),
('PL-MD-007', 'Nia Fitriani', 'Medan', '087212345684'),
('PL-BT-008', 'Diana Ayu', 'Banten', '088212345685'),
('PL-PK-009', 'Zaki Alfarizi', 'Pekanbaru', '089212345686'),
('PL-MK-010', 'Siska Novita', 'Makassar', '081212345687');

INSERT INTO Transaksi (idtransaksi, idpelanggan, tanggal) VALUES
('TR-01', 'PL-JK-001', '2026-04-01'),
('TR-02', 'PL-BD-002', '2026-04-01'),
('TR-03', 'PL-SB-003', '2026-04-02'),
('TR-04', 'PL-YG-004', '2026-04-02'),
('TR-05', 'PL-ML-005', '2026-04-02'),
('TR-06', 'PL-SM-006', '2026-04-03'),
('TR-07', 'PL-MD-007', '2026-04-04'),
('TR-08', 'PL-BT-008', '2026-04-04'),
('TR-09', 'PL-PK-009', '2026-04-04'),
('TR-10', 'PL-MK-010', '2026-04-05');

INSERT INTO DetailTransaksi (idtransaksi, idproduk, jumlah) VALUES
('TR-01', 'BP-BR-001', 1),
('TR-01', 'BP-TL-003', 1),
('TR-01', 'BP-GR-006', 1),
('TR-02', 'BP-MN-002', 1),
('TR-02', 'BP-TP-005', 2),
('TR-03', 'BP-SY-010', 2),
('TR-03', 'BP-GR-007', 1),
('TR-04', 'BP-BR-001', 1),
('TR-04', 'BP-GR-006', 1),
('TR-05', 'BP-TL-003', 1);

Select * from produk;
Select * from pelanggan;
Select * from transaksi;
Select * from detailtransaksi;

-- Menghapus kolom Kategori dari tabel produk
Alter Table produk drop kategori;
-- =================================================================================================================================
Select * from produk;
Select * from pelanggan;
Select * from transaksi;
Select * from detailtransaksi;
-- =========================================================== BELAJAR VIEW ========================================================
-- 1.	Buatlah View Untuk Menampilkan seluruh data produk yang telah menipis di gudang, 
-- kemudian urutkan berdasarkan nama produk secara menaik. 
-- (Dikatakan menipis apabila stoknya kurang dari 100). - (10 Point)
Select * from produk;
Select * from produk
Where stok < 100
order by namaproduk ASC;

-- SINTAKS VIEW:
create view soal1 as Select * from produk
Where stok < 100
order by namaproduk ASC;
select * from soal1;
-- 2.	Buatlah View Untuk Menampilkan  tanggal dan Jumlah id transaksi yang bertransaksi di tanggal tersebut (jumlah transaksi Per Hari), 
-- kemudian kelompokkan dan urutkan berdasarkan tanggal secara menaik. — (10 Point)
Select * from transaksi;

select tanggal, COUNT(idtransaksi) as 'Jumlah Transaksi Per Hari'
From transaksi
Group By tanggal
ORDER By tanggal ASC;

-- SINTAKS VIEW:
create view soal2 as select tanggal, COUNT(idtransaksi) as 'Jumlah Transaksi Per Hari'
From transaksi
Group By tanggal
ORDER By tanggal ASC;

select * from soal2;

Select * from produk;
Select * from pelanggan;
Select * from transaksi;
Select * from detailtransaksi;

-- 3. Buatlah View Untuk Menampilkan seluruh data produk(id, nama, satuan, harga dan stok produk) yang belum pernah dibeli oleh pelanggan. (20 Point)

Select * from produk;
Select * from detailtransaksi;
-- ========================
Select produk.idproduk, namaproduk, satuan, harga, stok
From Produk
LEFT JOIN detailtransaksi ON produk.idproduk = detailtransaksi.idproduk
Where detailtransaksi.idproduk is null;

-- SINTAKS VIEW:
create view soal3 as Select produk.idproduk, namaproduk, satuan, harga, stok
From Produk
LEFT JOIN detailtransaksi ON produk.idproduk = detailtransaksi.idproduk
Where detailtransaksi.idproduk is null;

select * from soal3a;


-- 4.	Buatlah View Untuk Menampilkan ID Produk, Nama Produk, Kategori, Harga dan jumlah Produk yang dibeli dengan jumlah lebih dari 1. 
-- Adapun Kategori Produk dapat dikategorikan sebagai berikut. (20 Point)
-- •	Jika Karakter Ke-4 dan Ke-5 adalah "BR", Maka kategori produknya adalah "Beras"
-- •	Jika Karakter Ke-4 dan Ke-5 adalah "GR", kategori produknya adalah "Bumbu"
-- •	Jika Karakter Ke-4 dan Ke-5 adalah "GL", Maka kategori produknya adalah "Gula"
-- •	Jika Karakter Ke-4 dan Ke-5 adalah "MN", kategori produknya adalah "Minyak"
-- •	Jika Karakter Ke-4 dan Ke-5 adalah "SY", kategori produknya adalah "Sayur"
-- •	Jika Karakter Ke-4 dan Ke-5 adalah "SU", kategori produknya adalah "Susu"
-- •	Jika Karakter Ke-4 dan Ke-5 adalah "TL", kategori produknya adalah "Telur"
-- •	Jika Karakter Ke-4 dan Ke-5 adalah "TP", kategori produknya adalah "Tepung"
-- •	Jika bukan diantara kategori produk yang telah disebutkan, artinya kategori produk tersebut belum terdaftar.
-- Setelah itu, urutkan berdasarkan Nama Produknya secara menaik.

Select produk.idproduk, namaproduk, CASE
WHEN substr(produk.idproduk, 4, 2) = 'BR' THEN 'Beras'
WHEN substr(produk.idproduk, 4, 2) = 'GR' THEN 'Bumbu'
WHEN substr(produk.idproduk, 4, 2) = 'GL' THEN 'Gula'
WHEN substr(produk.idproduk, 4, 2) = 'MN' THEN 'Minyak'
WHEN substr(produk.idproduk, 4, 2) = 'SY' THEN 'Sayur'
WHEN substr(produk.idproduk, 4, 2) = 'SU' THEN 'Susu'
WHEN substr(produk.idproduk, 4, 2) = 'TL' THEN 'Telur'
WHEN substr(produk.idproduk, 4, 2) = 'TP' THEN 'Tepung'
ELSE 'Belum Terdaftar' 
END AS 'Kategori Produk', harga, jumlah
From Produk
JOIN detailtransaksi ON produk.idproduk = detailtransaksi.idproduk
Where jumlah > 1
Order by namaproduk asc;


-- SINTAKS VIEW:
create view soal4 as Select produk.idproduk, namaproduk, CASE
WHEN substr(produk.idproduk, 4, 2) = 'BR' THEN 'Beras'
WHEN substr(produk.idproduk, 4, 2) = 'GR' THEN 'Bumbu'
WHEN substr(produk.idproduk, 4, 2) = 'GL' THEN 'Gula'
WHEN substr(produk.idproduk, 4, 2) = 'MN' THEN 'Minyak'
WHEN substr(produk.idproduk, 4, 2) = 'SY' THEN 'Sayur'
WHEN substr(produk.idproduk, 4, 2) = 'SU' THEN 'Susu'
WHEN substr(produk.idproduk, 4, 2) = 'TL' THEN 'Telur'
WHEN substr(produk.idproduk, 4, 2) = 'TP' THEN 'Tepung'
ELSE 'Belum Terdaftar' 
END AS 'Kategori Produk', harga, jumlah
From Produk
JOIN detailtransaksi ON produk.idproduk = detailtransaksi.idproduk
Where jumlah > 1
Order by namaproduk asc;


-- 5) Buatlah View Untuk Menampilkan seluruh data pelanggan yang pernah bertransaksi lalu urutkan berdasarkan Nama Pelanggan secara Menaik-- (20 Point)
Select pelanggan.idpelanggan, nama, alamat, notelp
From pelanggan
LEFT JOIN transaksi ON pelanggan.idpelanggan = transaksi.idpelanggan
order by nama ASC;

-- SINTAKS VIEW:
create view soal5 as Select pelanggan.idpelanggan, nama, alamat, notelp
From pelanggan
LEFT JOIN transaksi ON pelanggan.idpelanggan = transaksi.idpelanggan
order by nama ASC;

select * from soal5;

-- 6) Buatlah View Untuk Menampilkan id transaksi dan Total uang yang harus dibayar oleh pelanggan per id transaksinya.
--  Adapun Total uang yang harus dibayar oleh pelanggan didapatkan dengan 
--  menjumlahkan hasil dari harga produk dikali jumlah transaksi (20 Point)

select idtransaksi, SUM(harga*jumlah) 'Total Uang yang harus dibayar Pelanggan'
From Produk
JOIN Detailtransaksi ON Produk.idproduk = Detailtransaksi.idproduk
Group by idtransaksi;

-- SINTAKS VIEW:
create view soal6 as select idtransaksi, SUM(harga*jumlah) 'Total Uang yang harus dibayar Pelanggan'
From Produk
JOIN Detailtransaksi ON Produk.idproduk = Detailtransaksi.idproduk
Group by idtransaksi;

select * from soal6;

-- 7) 
Select * from produk;
Select * from pelanggan;
Select * from transaksi;
Select * from detailtransaksi;

create view soal7 as Select * from produk
Where harga
order by hargaProduk;
-- ================================================== BELAJAR PROSEDUR ============================================================
Select * from produk;
Select * from pelanggan;
Select * from transaksi;
Select * from detailtransaksi;

-- ================================================== PROSEDUR TANPA PARAMETER ====================================================
-- memanggil seluruh data produk yang harganya antara 15000 sampai dengan 30000
select * from produk where harga between 15000 and 30000;

-- Contoh 1. Buat Prosedur untuk memanggil seluruh data Produk yang harganya antara 15000 sampai dengan 30000
DELIMITER //
create procedure DataProduk()
Begin
	Select * from produk where harga between 15000 and 30000;
End 
// DELIMITER ;

call DataProduk();
select * from produk where harga between 15000 and 30000;

-- buat prosedur khusus untuk satuan yang kg saja
DELIMITER //
create procedure SatuanKhusus()
begin
	select * from produk where satuan = "kg";
end
// DELIMITER ;

call SatuanKhusus();

-- ================================================== PROSEDUR DENGAN PARAMETER ====================================================
-- Buat Prosedur untuk memanggil seluruh data Produk yang harganya antara harga tertentu,
-- harga ini ditentukan oleh User secara langsung.
select * from Produk where harga between 15000 and 30000;


DELIMITER //
create procedure dataProdukHargaTertentu(HargaAwal int, HargaAkhir int)
Begin
	select * from Produk where harga between HargaAwal And HargaAkhir;
End
// DELIMITER ;

call dataProdukHargaTertentu(15000,30000);

-- ================================================== LATIHAN PROSEDUR ============================================================
-- 1. Buatlah prosedur untuk input Seluruh data produk
-- 2. Buatlah prosedur untuk input Seluruh data pelanggan
desc pelanggan;
select * from pelanggan;

delimiter // 
create procedure inputdatapelanggan(idpelanggan VarChar(10), nama varchar(100),alamat varchar(255), notelp varchar(15))
begin
	insert into pelanggan values(idpelanggan,nama,alamat,notelp);
end
 // delimiter ;
 
 call inputdatapelanggan('PL-BD-013', 'Kiana Kaslana', 'Palembang', '082212345678');
 
 drop procedure inputdatapelanggan;
-- 3. Buatlah prosedur untuk input Seluruh data Transaksi
-- 4. Buatlah Prosedur untuk input seluruh data DetailTransaksi

-- 5. Buatlah prosedur untuk delete data produk
-- 6. Buatlah prosedur untuk delete data pelanggan
-- 7. Buatlah prosedur untuk delete data Transaksi
-- 8. Buatlah Prosedur untuk delete data DetailTransaksi

-- 9. Buatlah prosedur untuk Update data produk (Data yang diupdate dapat apa saja selain dari primary key)
-- MISAL: update nama produk dari tabel produkk
Update produk set namaproduk = '' where idProduk = '';
desc produk;
delimiter // 
create procedure updateProduk(x varchar(100),IDP varchar(10))
begin
	update produk set NamaProduk = x where idproduk = IDP;
end
 // delimiter ;
 
 call updateProduk('Beras Selincar 10kg', 'BP-BR-012');

-- 10. Buatlah prosedur untuk Update data pelanggan (Data yang diupdate dapat apa saja selain dari primary key)
-- 11. Buatlah prosedur untuk Update data Transaksi (Data yang diupdate dapat apa saja selain dari primary key/ Foreign Key)
-- 12. Buatlah Prosedur untuk Update data DetailTransaksi (Data yang diupdate dapat apa saja selain dari primary key/ Foreign Key)



-- =================================================BELAJAR FUNGSI================================================================================
-- Buat Prosedur Hitung Diskon untuk menampilkan data transaksi dan TotalBayar 
-- dengan ketentuan: Apabila Total belanja Lebih dari 100000 maka akan didiskon 10%. 
-- Total belanja kurang dari itu, maka diskon hanya diberikan sebesar 5%.
-- Berikan user kebebasan untuk input ID Transaksi yang ingin ia ketahui.

-- Prosedur ganjil genap


-- ==================================================== BELAJAR FUNGSI ====================================================
-- 1a) Buatlah Fungsi Untuk Menghitung Luas Persegi Panjang TANPA PARAMETER
delimiter //  
create function LuasPPTP()
	returns int
begin
	declare panjang int;
    declare lebar int;
    declare luas int;
    
    set panjang = 10;
    set lebar = 15;
    
	set Luas = panjang * lebar;
    
    return Luas;
end
// delimiter ;

select LuasPPTP();

-- Buatlah Fungsi Untuk Menghitung Luas SEGITIGA TANPA PARAMETER
delimiter //  
create function LuasSegitigaTP()
	returns int
begin
	declare alas int;
    declare tinggi int;
    declare luas int;
    
    set alas = 10;
    set tinggi = 15;
    
	set Luas = alas*tinggi/2;
    
    return Luas;
end
// delimiter ;
select LuasSegitigaTP();

-- 1b) Buatlah Fungsi Untuk Menghitung Luas Persegi Panjang MENGGUNAKAN PARAMETER
delimiter //  
create function LuasPPDP(panjang int, lebar int)
	returns int
begin
    declare luas int;
    
	set Luas = panjang * lebar;
    
    return Luas;
end
// delimiter ;

select LuasPPDP(15,10);


-- 2a) Buatkan Fungsi untuk menghitung Total Harga TANPA Parameter (Harga * jumlah)
delimiter //  
create function TotalhargaTP()
	returns int
begin
	declare harga int;
    declare jumlah int;
    declare totalharga int;
    
    set harga = 10000;
    set jumlah = 15;
    
	set totalharga = harga * jumlah;
    
    return totalharga;
end
// delimiter ;

select TotalHargaTP();


-- 2b) Buatkan Fungsi untuk menghitung Total Harga DENGAN Parameter (Harga * jumlah)
delimiter //  
create function TotalhargaDP(harga int, jumlah int)
	returns int
begin
    declare totalharga int;
	set totalharga = harga * jumlah;
    return totalharga;
end
// delimiter ;

select TotalHargaDP(15000,2);

-- 2c) Setelah membuat Fungsi untuk menghitung Total Harga DENGAN Parameter (Harga * jumlah),
-- Masukkan Fungsi HitungTotalDP ke dalam pemanggilan data menggunakan tabel yang ada dengan:
-- 1. Menampilkan ID transaksi, ID Produk, Nama Produk, Harga, Jumlah dan HitungTotalHargaDP.
SELECT 
    idtransaksi, 
    idproduk, 
    namaproduk, 
    harga, 
    jumlah, 
    TotalHargaDP(harga, jumlah) AS TotalHarga
FROM 
    detailtransaksi 
join
	Produk
on
	detailtransaksi.idproduk = produk.idproduk;
    
select * from produk;
select * from detailtransaksi;


-- 2. Menampilkan ID transaksi, dan akumulasi dari HitungTotalHargaDP dan kelompokkan per id Transaksinya.
SELECT 
    idtransaksi, 
    idproduk, 
    namaproduk, 
    harga, 
    jumlah, 
    SUM(TotalHargaDP(harga, jumlah)) 'akumulasi transaksi'
FROM 
    detailtransaksi 
join Produk on detailtransaksi.idproduk = produk.idproduk
group by idtransaksi;



-- ========================================== LATIHAN MEMBUAT FUNGSI =============================================
Select * from produk;
Select * from pelanggan;
Select * from transaksi;
Select * from detailtransaksi;
-- Buatkan Sebuah Fungsi untuk Menghitung Diskon 10% dari IDTransaksi Tertentu
-- Pertimbangkan Juga untuk Mengembalikan Nilai 0 untuk transaksi yang Tidak ada.
-- Sintaks SQL yang dapat mengjitung Function SUM(jumlah * harga) * 0.9:
SELECT detailtransaksi.idtransaksi, detailtransaksi.idproduk, harga, jumlah, SUM(jumlah * harga) AS TotalBayar, 
SUM(jumlah * harga) * 0.9 AS TotalSetelahDiskon
    FROM detailtransaksi
    JOIN produk ON Detailtransaksi.idproduk = Produk.idproduk
    WHERE detailtransaksi.idtransaksi = idtransaksi
    group by idtransaksi;

delimiter // 
create function menghitungDiskon10(idtransaksi varchar(100))
returns int
begin
	declare hargasetelahdiskon int;
    select (sum(jumlah*harga)*0.9) into hargasetelahdiskon
    from detailtransaksi
    join produk on detailtransaksi.idproduk = produk.idproduk
    where detailtransaksi.idtransaksi = idtransaksi
    group by idtransaksi;
end
// delimiter ;

 -- SELECT detailtransaksi.idtransaksi, detailtransaksi.idproduk, harga, jumlah, SUM(jumlah * harga) AS TotalBayar, 
--  HitungDiskon10 AS TotalSetelahDiskon
--      FROM detailtransaksi
--      JOIN produk ON Detailtransaksi.idproduk = Produk.idproduk
--      WHERE detailtransaksi.idtransaksi = idtransaksi
--      group by idtransaksi;




-- Buatkan Fungsi untuk Diskon yang dapat ditentukan kemudian oleh User untuk ID Transaksi Tertentu



-- MAY 11 2026
Delimiter // 
create procedure p3()
begin
	set @x = 10;
end
// Delimiter ;
call p3();
select @x;


delimiter // 
create procedure p4(in X INT, OUT y int, INOUT z int)
begin
	set @x = x + 8;
    set y = 12;
    set z = z + 12;
end
// delimiter ;
drop procedure p4;
set @z = 12;
call p4(2,@y,@z);
select @x,@y,@z;


-- STORE PROCEDURE DENGAN CONDITION
delimiter //  
create procedure p5(x INT)
begin
	declare hasil varchar(255);
    if mod(x,2) = 0 THEN
		set hasil = 'genap';
	else 
		set hasil = 'ganjil';
	end if;
    select hasil;
end
// delimiter ;

call p5(10);





-- 15MAY2026
-- ============================================== BELAJAR TRIGGER =====================================================
-- ==================== LANGKAH-LANGKAH DALAM MEMBUAT TRIGGER BELAJAR TRIGGER =========================================
-- 1. Buat Database Belajar Trigger
drop database BelajarTrigger;
Create database BelajarTriggerMichael;
use BelajarTriggerMichael;

show tables;
-- =======================================
-- 2. Buat Tabel Akun
create table Akun (
	IDAkun int,
    Jumlah Decimal (10,2)
);
select * from Akun;

-- =======================================
-- 3. Membuat Trigger Input Nilai Total. Variabel Total akan terus bertambah jika terdapat inputan data baru ke Tabel Akun 
-- sampai kapanpun, sejauh Trigger ini Belum Dihapus.
-- Trigger ini akan Mengakumulasi Nilai Total (awal/ lama) dengan nilai Total terbaru.
DELIMITER //
create trigger InputNilaiSUM 
Before Insert  
on Akun               -- Artinya Trigger InputNilaiSUM ini akan dieksekusi sebelum user menginputkan data ke tabel akun
FOR each row 
BEGIN 
	SET @Total = @Total + new.jumlah;
END //
DELIMITER ;
select @sum;

drop trigger InputNilaiSUM;

-- =======================================
-- 4. Menginputkan Nilai awal untuk Total dengan Angka NOL
SET @Total = 0;
select @Total;

-- ==============================================================================
-- 5. Menginputkan Data Pertama ke Tabel Akun, Lalu cek Nilai Total di Tabel Akun
select * from Akun;

Insert into Akun VALUES (137, 14.98);
Select @Total as 'Total Jumlah yang diinput';

-- ======== Menginputkan Data Kedua ke Tabel Akun, Lalu cek Nilai Total di Tabel Akun ========
Insert into Akun VALUES(141, 1937.50);
Select @Total as 'Total Jumlah yang diinput';

-- ======== Menginputkan Data Ketiga ke Tabel Akun, Lalu cek Nilai Total di Tabel Akun ========
Insert into Akun VALUES(97, -100.00);
Select @Total as 'Total Jumlah yang diinput';

-- Cek Nilai Total Terbaru yang merupakan hasil akumulasi dari 3 Nilai Total yang diinputkan ke Tabel Akun
Select @Total;
select * from akun;

-- Trigger Hanya dapat DIHAPUS menggunakan Perintah DROP. Setelah dihapus, Total berhenti Mengakumulasi Nilainya, walaupun Diinputkan data baru. 
Drop Trigger InputNilaiSUM;

Insert into Akun VALUES(97, -100.00);
select * from akun;
Select @Total;

-- ============================== TRIGGER BEFORE INSERT ==============================
Create table Akun2 (
	id int (10) Primary Key Auto_increment,
	amount decimal (10,2),
    created_at timestamp DEFAULT NOW(),
    updated_at timestamp DEFAULT NOW()
);

Show triggers;

drop table Akun2;

-- Buat Trigger untuk perkalian nilai jumlah yang diinputkan user dengan angka 10
Drop trigger PerkalianJumlah;
DELIMITER //
create trigger PerkalianJumlah
Before Insert 
on Akun2
FOR each row 

BEGIN 
	SET new.amount = new.amount*10;
END //
DELIMITER ;

Select * from Akun2;
Insert Into Akun2(Amount) VALUES (0.2);
Insert Into Akun2(Amount) VALUES (25);

-- ============================== TRIGGER BEFORE UPDATE ==============================
DELIMITER //
create trigger AkumulasiTotal
Before UPDATE 
on Akun2
FOR each row 

BEGIN 
	SET NEW.amount = NEW.amount + OLD.amount;
END //
DELIMITER ;

Select * from Akun2;
Update akun2 set amount = 10 where id = 1;
Update akun2 set amount = 10 where id = 2;


-- AFTER INSERT
Create table user (
	id int (10) Primary Key Auto_increment,
	name varchar(255),
    birthdate date
);

create table notification(
	id int,
    user_id int,
    message varchar(255),
    foreign key (user_id) references user(id) on update cascade on delete cascade
);

drop table notification;

Show triggers;

delimiter // 
create trigger t3 after insert on user for each row 
begin
	if New.birthdate IS NULL THEN 
    INSERT INTO notification (user_id,message) VALUES (NEW.id,concat('hi ', NEW.name, ',please update your date of birth'));
    end if;
end
// delimiter ;

insert into user(name,birthdate) values ('Kiana',NULL);
select * from notification ;

-- =================================== Trigger Tabel Mahasiswa dan LogMahasiswa ============================
-- Membuat Tabel Mahasiswa dan Menyimpan Log perubahan Data Mahasiswa Menggunakan Trigger

-- Membuat Tabel Mahasiswa

Create table mahasiswa (
	npm VARCHAR (10) PRIMARY KEY not null,
    nama VARCHAR (50) not null,
    alamat VARCHAR (100) not null
);
desc mahasiswa;
drop table mahasiswa;

create table LogMahasiswa(
	id_log INT (10) PRIMARY KEY auto_increment not null,
    npm VARCHAR (10) not null,
    nama VARCHAR (50) not null,
    alamat_lama VARCHAR (100) not null,
    alamat_baru VARCHAR (100) not null,
    waktu_perubahan DATE not null
);
desc LogMahasiswa;
drop table logmahasiswa;

-- Isi Tabel Mahasiswa
select * from mahasiswa;
select * from LogMahasiswa;
INSERT INTO MAHASISWA VALUES ('212400100','Lina','Bandung');
INSERT INTO MAHASISWA VALUES ('212400101','Bambang','Jakarta');
INSERT INTO MAHASISWA VALUES ('212400102','Shinta','Semarang');
INSERT INTO MAHASISWA VALUES ('212400103','Lena','Palembang');
INSERT INTO MAHASISWA VALUES ('212400104','Nara','Jakarta');
INSERT INTO MAHASISWA VALUES ('212400105','Ari','Semarang');
INSERT INTO MAHASISWA VALUES ('212400106','Shawn','Manado');

Select * From Mahasiswa;
Select * From LogMahasiswa;


-- Membuat Trigger UpdateAlamat untuk mahasiswa yang telah ada di tabel mahasiswa
DELIMITER //
CREATE Trigger UpdateAlamat
	BEFORE UPDATE
	ON Mahasiswa
	FOR EACH ROW
BEGIN
	INSERT INTO LogMahasiswa
    SET npm = OLD.npm,
    nama = OLD.nama,
    alamat_lama = OLD.alamat,
    alamat_baru = NEW.alamat,
    waktu_perubahan = NOW();
END //
DELIMITER ;

Select * From LogMahasiswa;
select * from mahasiswa;
UPDATE mahasiswa
SET alamat = 'Surabaya'
WHERE npm = '212400100';

-- Membuat Tabel LogPerubahan (untuk mencatat perubahan yang terjadi terhadap data)

Create Table LogPerubahan (
ID INT (10) PRIMARY KEY auto_increment not null,
JenisPerubahan VARCHAR (50) Not null,
WaktuPerubahan Datetime not null
);
desc LogPerubahan;

-- Membuat Trigger Jenis Perubahan (Jika ada yang menambahkan data pada data mahasiswa, maka Log Perubahan Akan mencatat hal tersebut)
-- Setelah Insert data ke Tabel mahasiswa, Maka Tabel LogPerubahan agar terupdate dengan keterangan Jenis Perubahannya "Menambah Data"
DELIMITER //
CREATE Trigger TambahMahasiswa
	AFTER INSERT
	ON Mahasiswa
	FOR EACH ROW
BEGIN
	INSERT INTO LogPerubahan (JenisPerubahan, WaktuPerubahan)
    VALUES ('Menambah Data', NOW());
END //
DELIMITER ;
drop trigger tambahmahasiswa;

Select * from logperubahan;

Select * from mahasiswa;

INSERT INTO MAHASISWA VALUES ('212400107','Daniela','Yogyakarta');
Select * From LogPerubahan;

-- =================== LATIHAN =====================
-- 1. Buat Trigger yang jika:
-- Setelah Update data dari Tabel mahasiswa, Maka Tabel LogPerubahan agar terupdate dengan keterangan 
-- Jenis Perubahannya "Mengubah Data"
DELIMITER //

CREATE TRIGGER LogUpdateMahasiswa
AFTER UPDATE ON Mahasiswa
FOR EACH ROW
BEGIN
    INSERT INTO LogPerubahan (JenisPerubahan, WaktuPerubahan)
    VALUES ('Mengubah Data', NOW());
END //

DELIMITER ;
drop trigger logupdatemahasiswa;

select * from LogUpdateMahasiswa;

-- 2. Buat Trigger yang jika:
-- Setelah Delete data dari Tabel mahasiswa, Maka Tabel LogPerubahan agar terupdate dengan keterangan 
-- Jenis Perubahannya "Menghapus Data"



-- ==================================== LATIHAN TRIGGER Update Stok Setelah Transaksi Pembelian Dilakukan ==========================
-- Buat Tabel Barang
create table barang(
kodebarang VARCHAR (10) Primary Key Not null,
namabarang VARCHAR (50) not null,
harga INT (11) not null,
stok int (11) not null
);

Desc Barang;

-- Isi Tabel Barang
Insert into barang VALUES('B001','Tepung Terigu','8500','30');
Insert into barang VALUES('B002','Teh Botol','10000','50');
Insert into barang VALUES('B003','Mentega','9000','40');
Insert into barang VALUES('B004','Buavita','7500','65');
Insert into barang VALUES('B005','Good Day','9500','75');
Select * From Barang;

-- Buat Tabel Pembelian
Create table pembelian(
	id_beli VARCHAR(10) primary key not null,
    kodebarang VARCHAR (10) not null,
    namabarang varchar (50) not null,
    jumlahbeli int (11) not null
);
Desc pembelian;

-- Isi Tabel Pembelian
insert into pembelian VALUES ('PB-001','B002','Teh Botol','15');
insert into pembelian VALUES ('PB-002','B004','Buavita','15');

Select * From pembelian;
Select * From barang;

-- ==== LATIHAN 1: Buatlah Trigger untuk memperbaharui stok pada table barang setelah ada penambahan data pada tabel pembelian. 
DELIMITER //
CREATE Trigger UpdateStok
	AFTER INSERT
	ON pembelian
	FOR EACH ROW
BEGIN
	update barang
    SET stok = stok + new.jumlahbeli
    where kodebarang = new.kodebarang;
END //
DELIMITER ;

Select * From barang;
insert into pembelian VALUES ('PB-003','B005','Good Day','15');
select * from pembelian;



-- ==== LATIHAN 2: Buat pula trigger untuk menghapus data barang pada tabel pembelian 
-- setelah data barang pada tabel master barang dihapus.
DELIMITER //
CREATE Trigger DeleteBarang
	AFTER DELETE
	ON barang
	FOR EACH ROW
BEGIN
	Delete FROM pembelian
    where kodebarang = old.kodebarang;
END //
DELIMITER ;

Select * From barang;
Select * From Pembelian;


-- ==================================================== BELAJAR EVENT ==================================================

Show events;
Show Variables where variable_name = 'Event_Scheduler';

SET Global event_scheduler = ON;


Create table Pesan(
	id int auto_increment primary key,
    message Varchar (50) not null,
    created_at timestamp Default Now()
);
-- ------------------------------------------------------------------
Create event Event1
ON Schedule at '2026-05-18 10:36:00'
DO
Insert Into Pesan (message) VALUES ('Test Event 1');

select * from pesan;
-- ------------------------------------------------------------------

Create event Event2
ON Schedule at current_timestamp()
DO
Insert Into Pesan (message) VALUES ('Test Event 2');

select * from pesan;
-- ------------------------------------------------------------------
Create event Event3
ON Schedule at current_timestamp() + Interval 10 second
DO
Insert Into Pesan (message) VALUES ('Test Event 3');

show events;
select * from pesan;
-- ------------------------------------------------------------------
create event Event4 
ON Schedule every 30 second
DO
Insert Into Pesan (message) VALUES ('Test Event 4');

show events;
select * from pesan;

-- ------------------------------------------------------------------
create event Event5
ON Schedule every 1 minute
DO
delete from pesan where message = ('Test Event 4');

show events;
select * from pesan;