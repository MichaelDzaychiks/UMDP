/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanuts1.model;

/**
 *
 * @author user1
 */
public class MobilListrik extends Mobil {
    private int kapasitasBaterai;

    public MobilListrik(Produsen produsen,  int tahunPembuatan, String model, int jumlahPintu, String jenisBahanbakar, int kapasitasBaterai) {
        super(produsen, tahunPembuatan, model, jumlahPintu, jenisBahanbakar);
        this.kapasitasBaterai = kapasitasBaterai;
    }
    
    
}
