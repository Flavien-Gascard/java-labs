package JFrames;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
            MyFrame(){
        this.setTitle("My JFrame");
        // Need this if you want the program to end when exiting the JFrame
        // Otherwise it will continue to run in the background
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setSize(420, 420);
        this.setVisible(true);
        ImageIcon image = new ImageIcon(
                "fgproject\\src\\main\\java\\com\\fgprojectjava\\fgproject\\JFrame_GUI\\baldur's gate.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(0,0,0));

}}