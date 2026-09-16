/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user1
 */
public class Employee {
    private String nip;
    private String nama;
    private Address alamat;

    public Employee() {
        this.nip = "-";
        this.nama = "-";
    }

    public Employee(String nip, String nama, Address alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Address getAlamat() {
        return alamat;
    }

    public void setAlamat(Address alamat) {
        this.alamat = alamat;
    }
    
    public void display(){
        System.out.println(nip + " " + nama);
        System.out.println(alamat.getJalan() + " " + alamat.getKota() + " " + alamat.getProvinsi());
        System.out.println("=========================");
    }
}
