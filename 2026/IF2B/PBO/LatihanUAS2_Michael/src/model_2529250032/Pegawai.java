/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model_2529250032;

/**
 *
 * @author user1
 */
public class Pegawai {
    String namaPegawai, jenisKelamin, golongan;
    int gajiPokok;

    public Pegawai() {
    }

    public Pegawai(String namaPegawai, String jenisKelamin, String golongan, int gajiPokok) {
        this.namaPegawai = namaPegawai;
        this.jenisKelamin = jenisKelamin;
        this.golongan = golongan;
        this.gajiPokok = gajiPokok;
    }

    public String getNamaPegawai() {
        return namaPegawai;
    }

    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getGolongan() {
        return golongan;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
    
    public int getTunjangan(){
        switch(golongan.toUpperCase()){
            case "A" : return 2000000;
            case "B" : return 1500000;
            case "C" : return 1000000;
            default  : return 0;
        }
    };
    
    public int getTotalGaji(){
        return gajiPokok + getTunjangan();
    }

}
