/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanuts2;

import model.Dosen;
import model.DosenTetap;
import model.DosenTidakTetap;
import model.ProgramStudi;

/**
 *
 * @author user1
 */
public class LatihanUTS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ProgramStudi si = new ProgramStudi("sistem Informasi" , "FIKR");
       ProgramStudi ak = new ProgramStudi("Akuntansi" , "FEB");
       
       Dosen[] dosen = new Dosen[4];
       dosen[0] = new DosenTetap("123","Michael",si);
       dosen[1] = new DosenTetap("124","siti",ak);
       dosen[2] = new DosenTidakTetap("Universitas Tridinanti","901","teguh");
       dosen[3] = new DosenTidakTetap("Universitas Musi","902","si");
       
       for(Dosen d : dosen){
           cetak(d);
       }
       
    }
    public static void cetak(Dosen x){
        x.tampilBiodata();
    }
    
}
