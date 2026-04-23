/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihanuts1;

import com.mycompany.latihanuts1.model.Mobil;
import com.mycompany.latihanuts1.model.MobilListrik;
import com.mycompany.latihanuts1.model.Produsen;

/**
 *
 * @author user1
 */
public class LatihanUTS1 {

    public static void main(String[] args) {
        Produsen toyota = new Produsen("Toyota", "Jepang");
        Produsen ynn = new Produsen("Yoan", "Indonesia");
        
        Mobil[] mobil = new Mobil[4];
        mobil[0] = new Mobil(ynn,2024,"maxta" , 4, "diesel");
        mobil[1] = new Mobil(toyota,1995, "grande" , 5, "bensin");
        mobil[2] = new MobilListrik(ynn,2024,"zen" , 2, "listrik",200000);
        mobil[3] = new MobilListrik(toyota,2000,"ave maria" , 5, "hybrid",250000);
        
        for(Mobil m : mobil){
            System.out.println("Produsen \t:" + m.getProdusen().getNamaBrand() + " - " + m.getProdusen().getNegara());
            System.out.println("Tahun pembuatan: " + m.getTahunPembuatan());
            System.out.println("Jumlah Pintu: " + m.getJumlahPintu());
            System.out.println("Jenis bahan bakar: " + m.setJenisBahanbakar());
            System.out.println("");
        }
    }
}
