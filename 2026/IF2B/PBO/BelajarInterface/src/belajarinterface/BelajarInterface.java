/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package belajarinterface;

/**
 *
 * @author user1
 */
class Laptop implements Computerable{

    @Override
    public void startUp() {
        System.out.println("Laptop sedang dinyalakan");
    }

    @Override
    public void standBy() {
        System.out.println("laptop sedang istirahat");
    }

    @Override
    public void shutDown() {
        System.out.println("laptop sedang dimatikan");
    }
    
}

public class BelajarInterface {
    public static void main(String[] args) {
        Laptop azuz = new Laptop();
        azuz.startUp();
        azuz.standBy();
        azuz.shutDown();
    }
}
class Foo { } // OK
interface InterSatu { } // OK
interface InterDua { } // OK


class Fii implements Foo { } // NO!

interface InterSatu implements InterDua { } // NO!

interface InterTiga implements Foo { } // NO!


// interface tidak bisa extends class
interface InterEmpat extends Foo { } // NO!


interface InterMilan extends InterSatu { } // OK


class Amphibii extends HewanDarat, HewanAir { } // NO!

class Bola implements InterSatu, InterDua , InterTiga { } // OK

interface InterNasional extends InterSatu, InterDua, InterTiga{ } // OK

class Olahraga extends Bola implements InterMilan { } // OK


class KelasNormal {}
interface InterfaceSatu {}
interface InterfaceDua {}

class KelasOnline extends KelasNormal {}
interface InterfaceTiga extends InterfaceSatu {}
interface InterfaceEmpat extends InterfaceSatu {}

interface InterfaceLima extends InterfaceSatu {}

class HewanDarat {}
class HewanAir {}
class Kodok extends HewanDarat {}
class Katak extends HewanDarat,HewanAir{}

interface InterfaceEnam extends InterfaceSatu, InterfaceDua {}
class Hewan implements InterfaceSatu, InterfaceDua, InterfaceLima {}
class Belajar extends KelasNormal implements InterfaceSatu, InterfaceDua {}



class A {}
class B {}
class C {}

interface X {}
interface Y {}
interface Z {}

// extends suatu interface
class Praktikum extends X {} 
interface PraktikLab601 extends X {} 
interface PraktikLab606 extends X, Y {}

// implements suatu interface
class PBO implements X {} 
class BDII implements X, Y, Z {} 
interface Learning implements X {}

// extends suatu class
class OOP extends A {} 
class Daspro extends A, B {} 
interface Latihan extends A {} 

// implements suatu class
 class Informatika implements A {} 
interface Study implements A {}