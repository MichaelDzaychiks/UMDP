/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package debugging;

/**
 *
 * @author user1
 */
public class Debugging {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int angka = "angka"; // langsung terdeteksi salah
		
        int angka[] = new int[5];
        try {
                angka[4] = 10/0;
        } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBounds Exception occurs");
        } catch (Exception e) {
                System.out.println("Parent Exception occurs");
        }
        System.out.println("-- Selesai --");
    }
    
}
