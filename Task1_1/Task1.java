package Task1_1;

import javax.swing.*;


public class Task1 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Welcome!");
        String userInput = JOptionPane.showInputDialog(null,"Napisz cos!");
        String upperText = userInput.toUpperCase();
        JOptionPane.showMessageDialog(null,upperText);
    }
}
