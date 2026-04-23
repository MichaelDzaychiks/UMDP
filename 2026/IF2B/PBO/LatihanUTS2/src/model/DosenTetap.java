/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user1
 */
public class DosenTetap extends Dosen{
    private ProgramStudi programStudi;

    public DosenTetap() {
    }

    public DosenTetap(String nid, String nama, ProgramStudi programStudi) {
        super(nid, nama);
        this.programStudi = programStudi;
    }

    public ProgramStudi getProgramStudi() {
        return programStudi;
    }

    public void setProgramStudi(ProgramStudi programStudi) {
        this.programStudi = programStudi;
    }
    
//    @override
//    public void tampilBiodata(){
//        System.out.println("NID: " + getNid());
//        System.out.println("Nama Dosen: " + getNama());
//        System.out.println("Program Studi: " + getProgramStudi.getNamaProgramStudi);
//        System.out.println("fakultas: " + getProgramStudi.getFakultas());
//    }

    @Override
    public void tampilBiodata() {
        System.out.println("NID: " + getNid());
        System.out.println("Nama Dosen: " + getNama());
        System.out.println("Program Studi: " + getProgramStudi().getNamaProgramStudi());
        System.out.println("fakultas: " + getProgramStudi().getFakultas());
    }

}
