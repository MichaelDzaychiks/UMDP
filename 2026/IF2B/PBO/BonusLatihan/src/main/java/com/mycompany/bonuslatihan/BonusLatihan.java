/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bonuslatihan;

import model.Ayam;
import model.Hewan;
import model.Kelinci;
import model.Kucing;
import model.Kuda;

/**
 *
 * @author user1
 */
public class BonusLatihan {

    public static void main(String[] args) {
        Hewan[] hewan = new Hewan[10];
        hewan[1] = new Ayam();
        hewan[2] = new Kelinci();
        hewan[3] = new Kucing();
        hewan[4] = new Kuda();
    }

    private static class Hewan {

        public Hewan() {
        }
    }
    
        for(int i=0;i<4;i++){
            hewan[i].bersuara();
        }
}
