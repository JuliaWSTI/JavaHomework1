package Task1_2;

import javax.swing.*;
import java.math.BigInteger;

public class Task1_2 {
    public static void main(String[] args) {
        String userInput = JOptionPane.showInputDialog(null, "Podaj liczbę:");

        if (userInput != null) {
            try {
                int liczba = Integer.parseInt(userInput);

                if (liczba < 0) {
                    JOptionPane.showMessageDialog(null, "Nie można obliczyć silni z liczby ujemnej!", "Błąd", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                BigInteger wynik = silnia(BigInteger.valueOf(liczba));


                JOptionPane.showMessageDialog(null, "Silnia: " + wynik);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Niepoprawna liczba!", "Błąd", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nie podano danych wejściowych.");
        }
    }


    public static BigInteger silnia(BigInteger n) {
        BigInteger result = BigInteger.ONE;
        for (BigInteger i = BigInteger.TWO; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
            result = result.multiply(i);
        }
        return result;
    }
}
