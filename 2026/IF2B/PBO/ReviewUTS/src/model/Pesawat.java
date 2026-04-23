/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user1
 */
public class Pesawat {
    private String nomorPesawat;
    private Pilot pilot;

    public Pesawat() {
    }

    public Pesawat(String nomorPesawat, Pilot pilot) {
        this.nomorPesawat = nomorPesawat;
        this.pilot = pilot;
    }

    public String getNomorPesawat() {
        return nomorPesawat;
    }

    public void setNomorPesawat(String nomorPesawat) {
        this.nomorPesawat = nomorPesawat;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }
    
}
