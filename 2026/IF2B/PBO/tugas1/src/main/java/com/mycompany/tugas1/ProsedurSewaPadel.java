/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas1;

/**
 *
 * @author Hp
 */

import java.util.Scanner;

public class ProsedurSewaPadel {

    public static int hitungBiaya(int jam, int hargaPerJam) {
        return jam * hargaPerJam;
    }

    public static int hitungDiskon(int total) {
        if (total > 300000) {
            return total * 10 / 100;
        }
        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nama1 = "Andi";
        int jam1 = 2;
        int harga1 = 150000;

        String nama2 = "Budi";
        int jam2 = 3;
        int harga2 = 150000;

        String nama3 = "Citra";
        int jam3 = 1;
        int harga3 = 150000;

        int total1 = hitungBiaya(jam1, harga1);
        int diskon1 = hitungDiskon(total1);
        int bayar1 = total1 - diskon1;

        int total2 = hitungBiaya(jam2, harga2);
        int diskon2 = hitungDiskon(total2);
        int bayar2 = total2 - diskon2;

        int total3 = hitungBiaya(jam3, harga3);
        int diskon3 = hitungDiskon(total3);
        int bayar3 = total3 - diskon3;

        System.out.println("Data Penyewa 1: " + nama1);
        System.out.println("Total Bayar: " + bayar1);

        System.out.println("Data Penyewa 2: " + nama2);
        System.out.println("Total Bayar: " + bayar2);

        System.out.println("Data Penyewa 3: " + nama3);
        System.out.println("Total Bayar: " + bayar3);
    }
}
