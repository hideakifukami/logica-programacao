import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        String strRaio;
        double volume, pi;
        int raio;

        strRaio = JOptionPane.showInputDialog("Insira o valor do raio do círculo.");
        raio = Integer.parseInt(strRaio);
        pi = 3.14;
        volume = pi * Math.pow(raio, 3);

        JOptionPane.showMessageDialog(null, "O volume do círculo de raio " + raio + " é: " + volume);
    }
}
