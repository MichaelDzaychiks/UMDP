    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan12;

import model.Anjing;
import model.Burung;
import model.Harimau;
import model.Hewan;
import model.Kucing;

/**
 *
 * @author user1
 */
public class Pertemuan12 {

    public static void main(String[] args) {
//        Hewan hewan = new Hewan();
//        hewan.bersuara();
        
        Anjing anjing = new Anjing();
        anjing.bersuara();
        cetak(anjing);
        
        Burung burung = new Burung();
        burung.bersuara();
        cetak(burung);
        
        Harimau harimau = new Harimau();
        harimau.bersuara();
        cetak(harimau);
        
        Kucing kucing = new Kucing();
        kucing.bersuara();
        cetak(kucing);
    } 
    
    public static void cetak(Hewan x){
        x.bersuara();
    }
}
