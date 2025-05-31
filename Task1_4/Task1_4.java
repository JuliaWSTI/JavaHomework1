package Task1_4;

import javax.swing.*;

public class Task1_4 {

    public static void main(String[] args) {
        String userInput = JOptionPane.showInputDialog(null, "Podaj liczbę");
        if (userInput != null && !userInput.isEmpty()) {
            int number = Integer.parseInt(userInput);
        if ( number>=0) {

            ToBinary binaryConverter = new ToBinary(number);
            String binaryResult = binaryConverter.convertToBinary();
            JOptionPane.showMessageDialog(null,"In Binary: " + binaryResult);

            ToOctal octalConverter = new ToOctal(number);
            String octalResult = octalConverter.convertToOctal();
            JOptionPane.showMessageDialog(null, "In Octal: " + octalResult);

            ToHex hexConverter = new ToHex(number);
            String hexResult = hexConverter.convertToHex();
            JOptionPane.showMessageDialog(null, "In Hex: " + hexResult);
        }else {
            JOptionPane.showMessageDialog(null, "Wrong number");
        }
    }else {
        JOptionPane.showMessageDialog(null, "Wrong input");}
    }
}

class ToBinary {
    private int number;

    public ToBinary(int number) {
        this.number = number;
    }

    public String convertToBinary() {
        return Integer.toBinaryString(number);
    }
}

class ToOctal{
    int number;

    public ToOctal(int number) {
        this.number = number;
    }

    public String convertToOctal() {
        return Integer.toOctalString(number);
    }
}

class ToHex {
    int number;

    public ToHex(int number) {
        this.number = number;
    }
    public String convertToHex() {
        return Integer.toHexString(number);
    }
}
