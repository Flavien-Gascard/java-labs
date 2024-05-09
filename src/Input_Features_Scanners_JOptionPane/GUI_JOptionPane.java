package Input_Features_Scanners_JOptionPane;

import javax.swing.JOptionPane;

public class GUI_JOptionPane {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("What is your name?");

        // integers need to be parsed in order for the message dialoge to work
        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));

        double height = Double.parseDouble(JOptionPane.showInputDialog(null, "How tall are you in centimeters?"));

        JOptionPane.showMessageDialog(null, "Hello! "
                + name
                + ", you are "
                + age
                + " years old, and your height is "
                + height);

    }

}
