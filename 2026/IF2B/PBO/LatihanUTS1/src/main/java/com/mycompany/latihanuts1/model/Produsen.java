/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanuts1.model;

/**
 *
 * @author Michael 2529250032 IF2B
 */
public class Produsen {
    private String namaBrand;
    private String negara;

    public Produsen() {
    }

    public Produsen(String namaBrand, String negara) {
        this.namaBrand = namaBrand;
        this.negara = negara;
    }

    public String getNamaBrand() {
        return namaBrand;
    }

    public void setNamaBrand(String namaBrand) {
        this.namaBrand = namaBrand;
    }

    public String getNegara() {
        return negara;
    }

    public void setNegara(String negara) {
        this.negara = negara;
    }
    
    
}
