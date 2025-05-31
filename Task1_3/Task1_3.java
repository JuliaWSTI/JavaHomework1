package Task1_3;
import javax.swing.*;


public class Task1_3 {
    public static void main(String[] args) {
        String userInput = JOptionPane.showInputDialog(null, "Podaj liczbę");

        if (userInput != null) {
            int wynik = 0;
            try {
                int userInt = Integer.parseInt(userInput);
                for (int i = userInt ; i != 0; i--) {
                    if (i % 2 != 0)
                        wynik = wynik + i;
                }

                JOptionPane.showMessageDialog(null, "Wynik: " + wynik);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Niepoprawna liczba!", "Błąd", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
