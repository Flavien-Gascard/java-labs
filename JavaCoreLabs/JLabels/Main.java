package JavaCoreLabs.JLabels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
    public static void main (String[] args){
// new MyFrame();


        JLabel label = new JLabel();
        ImageIcon image = new ImageIcon("fgproject\\src\\main\\java\\com\\fgprojectjava\\fgproject\\JFrame_GUI\\baldur's gate.png");


        label.setText("This is a label");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        // label.setForeground(new Color(0,0,0));
        // label.setFont(new Font("MV Boli",Font.BOLD, 90));
        // label.setBackground(Color.BLACK);
        // label.setOpaque(false);
    

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);





    }

}
