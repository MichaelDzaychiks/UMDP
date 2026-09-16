/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package if2b;
import model.Address;
import model.Employee;
/**
 *
 * @author user1
 */
public class Praktikum_Michael {
    public static void main(String[] args) {
        Address almt1 = new Address("Jl. Rajawali 14", "Palembang", "Sumatera Selatan");
        Address almt2 = new Address("JL. Bangau 1", "Palembang", "Sumatera Selatan");
        Address almt3 = new Address("JL. Merdeka 45", "Palembang", "Sumatera Selatan");
        Address almt4 = new Address("JL. Kenten ", "Palembang", "Sumatera Selatan");
        Address almt5 = new Address("JL. Kenten", "Palembang", "Sumatera Selatan");
        
        almt2 = new Address(); 
        almt2.setJalan("Jl. Merdeka 45");
        almt2.setKota("Banyuasin");
        almt2.setProvinsi("Sumatera Selatan");
        
        final int max = 5;
        Address[] alamat = new Address[max];
        alamat[0] = almt1;
        alamat[1] = almt2;
        alamat[2] = new Address("Jl. Sudirman", "Palembang","Sumatera Selatan"); 
        
        Employee dila = new Employee();
        dila.setNip("150001");
        dila.setNama("Faradilla");
        dila.setAlamat(almt1);
        dila.display();
        
        Employee tia = new Employee("150002", "Shintia", alamat[2]);
        
        
       Employee ERO = new Employee();
      dila.setNip("15003");
      dila.setNama("ASERO");
      dila.setAlamat(almt3);
      dila.display();

       Employee NE = new Employee();
      dila.setNip("15004");
      dila.setNama("NAPNE");
      dila.setAlamat(almt4);
      dila.display();

       Employee GA = new Employee();
      dila.setNip("15005");
      dila.setNama("NAPGA");
      dila.setAlamat(almt5);
      dila.display();
        
//        Praktikum  almt1 = new Praktikum();
//        almt1.jalan = "Jl. Rajawali 14";
//        almt1.kota = "Palembang";
//        almt1.provinsi = "Sumatera Selatan";
//
//        Praktikum  almt2 = new Praktikum();
//        almt2.jalan = "Jl. Merdeka 45";
//        almt2.kota = "Banyuasin";
//        almt2.provinsi = "Sumatera Selatan";	
//
//        Employee dila = new Employee();
//        dila.nip = "150001";
//        dila.nama = "Faradilla";
//        dila.alamat = almt1;;
//        dila.display();

    	
        	}
}


//
//package if2b;
//
//class Address {
//    String jalan, kota, provinsi;
//
//    // Constructor
//    public Address() {}
//
//    public Address(String jalan, String kota, String provinsi) {
//        this.jalan = jalan;
//        this.kota = kota;
//        this.provinsi = provinsi;
//    }
//
//    // Setters
//    public void setJalan(String jalan) { this.jalan = jalan; }
//    public void setKota(String kota) { this.kota = kota; }
//    public void setProvinsi(String provinsi) { this.provinsi = provinsi; }
//}
//
//class Employee {
//    String nip;
//    String nama;
//    Address alamat; // Type must be Address, not Praktikum
//
//    // Constructors
//    public Employee() {}
//
//    public Employee(String nip, String nama, Address alamat) {
//        this.nip = nip;
//        this.nama = nama;
//        this.alamat = alamat;
//    }
//
//    // Setters
//    public void setNip(String nip) { this.nip = nip; }
//    public void setNama(String nama) { this.nama = nama; }
//    public void setAlamat(Address alamat) { this.alamat = alamat; }
//
//    void display() {
//        System.out.println(nip + " " + nama);
//        if (alamat != null) {
//            System.out.println(alamat.jalan + " " + alamat.kota + " " + alamat.provinsi);
//        }
//        System.out.println("============================");
//    }
//}
//
//public class Praktikum_Michael {
//    public static void main(String[] args) {
//        Address almt1 = new Address("Jl. Rajawali 14", "Palembang", "Sumatera Selatan");
//        
//        Address almt2 = new Address();
//        almt2.setJalan("Jl. Merdeka 45");
//        almt2.setKota("Banyuasin");
//        almt2.setProvinsi("Sumatera Selatan");
//
//        final int max = 5;
//        Address[] alamat = new Address[max];
//        alamat[0] = almt1;
//        alamat[1] = almt2;
//        alamat[2] = new Address("Jl. Sudirman", "Palembang", "Sumatera Selatan");
//
//        Employee dila = new Employee();
//        dila.setNip("150001");
//        dila.setNama("Faradilla"); // Fixed: use double quotes for String
//        dila.setAlamat(almt1);
//        dila.display();
//
//        Employee tia = new Employee("150002", "Shintia", alamat[2]);
//        tia.display();
//    }
//}
