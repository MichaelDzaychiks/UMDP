/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package belajarbutton;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author user1
 */
public class BelajarButton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LayarContoh layarContoh = new LayarContoh();
    }   
}

class LayarContoh extends JFrame implements ActionListener{
   JButton buttonA = new JButton("IF");
   JButton buttonB = new JButton("SI");
   JButton buttonC = new JButton("TE");
   JButton buttonD = new JButton("DKV");
   public LayarContoh() {
     super("::NPM-NAMALENGKAP::");
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setLocation(800, 100);
     this.setSize(400, 200);
     this.setVisible(true);
     this.setLayout(new GridLayout(2,2)); // baris, kolom
     this.add(buttonA);
     this.add(buttonB);
     this.add(buttonC);
     this.add(buttonD);
     buttonA.addActionListener(this);
     
   }
   @Override
   public void actionPerformed(ActionEvent e){
       Object object = e.getSource();
       if(object == buttonA){
           JOptionPane.showMessageDialog(null, "INFORMATIKA", "Program studi", JOptionPane.DEFAULT_OPTION);
       } else if(object == buttonB){
           JOptionPane.showMessageDialog(null, "SISTEM INFORMASI", "Program studi", JOptionPane.DEFAULT_OPTION);
       }
   }
}