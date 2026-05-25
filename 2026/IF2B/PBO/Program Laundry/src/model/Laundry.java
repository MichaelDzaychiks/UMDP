/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user1
 */
public class Laundry {
    private String namaPelanggan;
    private int beratCucian;
    private String jenisLayanan;

    public Laundry(String namaPelanggan, int beratCucian, String jenisLayanan) {
        this.namaPelanggan = namaPelanggan;
        this.beratCucian = beratCucian;
        this.jenisLayanan = jenisLayanan;
    }

    public int getBiaya(){
        switch (jenisLayanan.toUpperCase()){
            case "CUCI KERING" : return 7000;
            case "CUCI SETRIKA" : return 10000;
            default: return 0;
        }
    }
    
    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public int getBeratCucian() {
        return beratCucian;
    }

    public void setBeratCucian(int beratCucian) {
        this.beratCucian = beratCucian;
    }

    public String getJenisLayanan() {
        return jenisLayanan;
    }

    public void setJenisLayanan(String jenisLayanan) {
        this.jenisLayanan = jenisLayanan;
    }
    
    
}
