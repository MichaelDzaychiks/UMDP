/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package graphicaluserinterface;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JRootPane;

/**
 *
 * @author user1
 */
public class GraphicalUserInterface {
    public static void main(String[] args) {
        new LayarContoh();
    }
    
}

class LayarContoh extends javax.swing.JFrame{
    private JLabel labelPilihanFakultas = new JLabel("Pilih Fakultas");
    JRadioButton radioButtonFikr = new JRadioButton("FIKR");
    JRadioButton radioButtonFeb = new JRadioButton("FEB");
    ButtonGroup groupFakultas = new ButtonGroup();
    private JLabel labelPilihanBahasa = new JLabel("pilih bahasa");
    JRadioButton radioButtonIndonesia = new JRadioButton("Indonesia");
    JRadioButton radioButtoninggris = new JRadioButton("Inggris");
    ButtonGroup groupBahasa = new ButtonGroup();
    JComboBox cmbProdi = new JComboBox();
    public LayarContoh() {
        super("::NPM-NAMALENGKAP::");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(0, 0);
        this.setSize(400, 300);
        this.setVisible(true);
        this.add(labelPilihan);
        this.setLayout(new GridLayout(3,1)); // baris, kolom
        this.add(radioButtonFikr);
        this.add(radioButtonFeb);
        
        radioButtonFikr.setSelected(true);
    }
}
}