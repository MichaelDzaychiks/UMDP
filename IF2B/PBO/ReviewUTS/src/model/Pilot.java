/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user1
 */
public class Pilot {
    private String namaPilot;
    private String lisensi;

    public Pilot() {
    }

    public Pilot(String namaPilot, String lisensi) {
        this.namaPilot = namaPilot;
        this.lisensi = lisensi;
    }

    public String getNamaPilot() {
        return namaPilot;
    }

    public void setNamaPilot(String namaPilot) {
        this.namaPilot = namaPilot;
    }

    public String getLisensi() {
        return lisensi;
    }

    public void setLisensi(String lisensi) {
        this.lisensi = lisensi;
    }

   
    
}
