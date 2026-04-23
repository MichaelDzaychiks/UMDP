/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanuts1.model;

/**
 *
 * @author user1
 */
public class Mobil extends Kendaraan{
    private String model;
    private int jumlahPintu;
    private String jenisBahanbakar;

    public Mobil(Produsen produsen,  int tahunPembuatan, String model, int jumlahPintu, String jenisBahanbakar) { //urutannya harus tepat seperti yang ada di gambar visio
        super(produsen, tahunPembuatan); //nanti di UTS wajib ada 
        this.model = model;
        this.jumlahPintu = jumlahPintu;
        this.jenisBahanbakar = jenisBahanbakar;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    public String getJenisBahanbakar() {
        return jenisBahanbakar;
    }

    public void setJenisBahanbakar(String jenisBahanbakar) {
        this.jenisBahanbakar = jenisBahanbakar;
    }

    
//    gtw ini apa,biar ga error
    public String setJenisBahanbakar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

    
    
}
