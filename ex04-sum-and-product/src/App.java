import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        double num1, num2, soma, produto;
        num1 = 91.37; 
        num2 = 7.351;
        soma = num1 + num2;
        produto = num1 * num2;

        JOptionPane.showMessageDialog(null, "A soma é: " + soma + ". E o produto é: " + produto + ".");
    }
}
