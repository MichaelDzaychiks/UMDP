/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user1
 */
public class DosenTidakTetap extends Dosen{
    private String asalPerguruanTinggi;

    public DosenTidakTetap() {
    }

    public DosenTidakTetap(String asalPerguruanTinggi, String nid, String nama) {
        super(nid, nama);
        this.asalPerguruanTinggi = asalPerguruanTinggi;
    }

    public String getAsalPerguruanTinggi() {
        return asalPerguruanTinggi;
    }

    public void setAsalPerguruanTinggi(String asalPerguruanTinggi) {
        this.asalPerguruanTinggi = asalPerguruanTinggi;
    }

    @Override
    public void tampilBiodata() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
        System.out.println("NID: " + getNid());
        System.out.println("Nama Dosen: " + getNama());
        System.out.println("Asal PT: " + asalPerguruanTinggi);
    }
    
}
