/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuanbasicgui;

import javax.swing.JFrame;
import javax.swing.JRootPane;

/**
 *
 * @author user1
 */
public class PertemuanBasicGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        JFrame layar = new JFrame();
//        layar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        layar.setLocation(700,300);
//        layar.setSize(300,200);
//        layar.setResizable(true);
//        layar.set
//        layar.setVisible(true);

        JFrame[] frames = new JFrame[8];
        frames[0] = new JFrame("ERROR_DIALOG");
      	frames[1] = new JFrame("FILE_CHOOSER_DIALOG");
      	frames[2] = new JFrame("FRAME");
      	frames[3] = new JFrame("INFORMATION_DIALOG");
      	frames[4] = new JFrame("NONE");
      	frames[5] = new JFrame("PLAIN_DIALOG");
      	frames[6] = new JFrame("QUESTION_DIALOG");
      	frames[7] = new JFrame("WARNING_DIALOG");
      	
        for(JFrame i:frames){
            i.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            i.setSize(200,100);
            i.setUndecorated(true);
            i.setVisible(true);
        }
        
      	frames[0].setLocation(50, 50);
      	frames[1].setLocation(260, 50);
      	frames[2].setLocation(50, 160);
      	frames[3].setLocation(260, 160);
      	frames[4].setLocation(50, 270);
      	frames[5].setLocation(260, 270);
      	frames[6].setLocation(50, 380);
      	frames[7].setLocation(260, 380);
 
        frames[0].getRootPane().setWindowDecorationStyle(JRootPane.ERROR_DIALOG);
 	frames[1].getRootPane().setWindowDecorationStyle(JRootPane.FILE_CHOOSER_DIALOG);
 	frames[2].getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
 	frames[3].getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
      	frames[4].getRootPane().setWindowDecorationStyle(JRootPane.NONE);
 	frames[5].getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
 	frames[6].getRootPane().setWindowDecorationStyle(JRootPane.QUESTION_DIALOG);
 	frames[7].getRootPane().setWindowDecorationStyle(JRootPane.WARNING_DIALOG);

    }

}
