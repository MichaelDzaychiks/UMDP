/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user1
 */
public class Hero {
    private String namaHero;
    private String tipeHero;
    private String skill1Hero;
    private String skill2Hero;
    private String skill3Hero;
    private String skill4Hero;

    public Hero() {
    }

    public Hero(String namaHero, String tipeHero, String skill1Hero, String skill2Hero, String skill3Hero, String skill4Hero) {
        this.namaHero = namaHero;
        this.tipeHero = tipeHero;
        this.skill1Hero = skill1Hero;
        this.skill2Hero = skill2Hero;
        this.skill3Hero = skill3Hero;
        this.skill4Hero = skill4Hero;
    }

    public String getNamaHero() {
        return namaHero;
    }

    public void setNamaHero(String namaHero) {
        this.namaHero = namaHero;
    }

    public String getTipeHero() {
        return tipeHero;
    }

    public void setTipeHero(String tipeHero) {
        this.tipeHero = tipeHero;
    }

    public String getSkill1Hero() {
        return skill1Hero;
    }

    public void setSkill1Hero(String skill1Hero) {
        this.skill1Hero = skill1Hero;
    }

    public String getSkill2Hero() {
        return skill2Hero;
    }

    public void setSkill2Hero(String skill2Hero) {
        this.skill2Hero = skill2Hero;
    }

    public String getSkill3Hero() {
        return skill3Hero;
    }

    public void setSkill3Hero(String skill3Hero) {
        this.skill3Hero = skill3Hero;
    }

    public String getSkill4Hero() {
        return skill4Hero;
    }

    public void setSkill4Hero(String skill4Hero) {
        this.skill4Hero = skill4Hero;
    }
    
    
    
}
