/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarinterface;
// INTERFACE : 100% abstract class
// 1.semua method secara eksplisit telah bersifat PUBLIC dan ABSTRACT
// 2.method TIDAK BOLEH bersifat static
// 3.sebuah interface  DAPAT meng-EXTENDS  satu atau LEBIH  interface lainnya
// 4.sebuah interface  TIDAK DAPAT meng-EXTENDS  CLASS
// 5.sebuah interface  TIDAK BISA meng-IMPLEMENTS interface lainnya maupun class
public interface Computerable {
    void startUp();
    void standBy();
    void shutDown();
}
