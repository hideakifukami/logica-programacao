import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        String strFahr;
        double fahr, celsius;

        strFahr = JOptionPane.showInputDialog("Informa o valor da temperatura em Fahrenheit. ");
        fahr = Double.parseDouble(strFahr); 
        celsius = (fahr - 32) * 5 / 9;

        JOptionPane.showMessageDialog(null, "A temperatura em Celcius é: " + celsius + ".");
    }
}
