/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanuts1.model;

/**
 *
 * @author user1
 */
public abstract class Kendaraan {
    private Produsen produsen;
    private int tahunPembuatan;

    public Kendaraan() {
    }

    public Kendaraan(Produsen produsen, int tahunPembuatan) {
        this.produsen = produsen;
        this.tahunPembuatan = tahunPembuatan;
    }

    public Produsen getProdusen() {
        return produsen;
    }

    public void setProdusen(Produsen produsen) {
        this.produsen = produsen;
    }

    public int getTahunPembuatan() {
        return tahunPembuatan;
    }

    public void setTahunPembuatan(int tahunPembuatan) {
        this.tahunPembuatan = tahunPembuatan;
    }
    
    
    
}
