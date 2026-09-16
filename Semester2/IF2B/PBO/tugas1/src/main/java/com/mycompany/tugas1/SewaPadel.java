/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas1;

/**
 *
 * @author Hp
 */
public class SewaPadel {

    String nama;
    int jam;
    int hargaPerJam;

    public SewaPadel(String nama, int jam, int hargaPerJam) {
        this.nama = nama;
        this.jam = jam;
        this.hargaPerJam = hargaPerJam;
    }

    public int hitungTotal() {
        return jam * hargaPerJam;
    }

    public int hitungDiskon() {
        int total = hitungTotal();
        if (total > 300000) {
            return total * 10 / 100;
        }
        return 0;
    }

    public int hitungBayar() {
        return hitungTotal() - hitungDiskon();
    }

    public static void main(String[] args) {

        SewaPadel pelanggan1 = new SewaPadel("Andi", 2, 150000);
        SewaPadel pelanggan2 = new SewaPadel("Budi", 3, 150000);

        System.out.println("Nama: " + pelanggan1.nama);
        System.out.println("Total Bayar: " + pelanggan1.hitungBayar());

        System.out.println("Nama: " + pelanggan2.nama);
        System.out.println("Total Bayar: " + pelanggan2.hitungBayar());
    }
}