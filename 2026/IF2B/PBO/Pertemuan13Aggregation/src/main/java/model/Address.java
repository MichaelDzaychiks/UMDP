/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user1
 */
public class Address {
    private String jalan;
    private String kota;
    private String provinsi;

    public Address() {
        this.jalan = "-";
        this.kota = "-";
        this.provinsi = "-";
    }

    public Address(String jalan, String kota, String provinsi) {
        this.jalan = jalan;
        this.kota = kota;
        this.provinsi = provinsi;
    }

    public String getJalan() {
        return jalan;
    }

    public void setJalan(String jalan) {
        this.jalan = jalan;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }
    
}
