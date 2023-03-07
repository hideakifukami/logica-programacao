import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        double altura, peso, altura__metros, imc;

        altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura em centímetros. "));
        peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso em quilos. "));
        altura__metros = altura / 100;

        imc = peso / Math.pow(altura__metros, 2);

        if (imc < 18.6) {
            JOptionPane.showMessageDialog(null, "Seu IMC deu " + Math.round(imc) +": Abaixo do peso normal. ");
        }
        else if (imc < 25) {
            JOptionPane.showMessageDialog(null, "Seu IMC deu " + Math.round(imc) +": Peso normal. ");
        }
        else if (imc < 30) {
            JOptionPane.showMessageDialog(null, "Seu IMC deu " + Math.round(imc) +": Excesso de peso. ");
        }
        else if (imc < 35) {
            JOptionPane.showMessageDialog(null, "Seu IMC deu " + Math.round(imc) +": Obesidade classe I. ");
        }
        else if (imc < 40) {
            JOptionPane.showMessageDialog(null, "Seu IMC deu " + Math.round(imc) +": Obesidade classe II. ");
        }
        else {
            JOptionPane.showMessageDialog(null, "Seu IMC deu " + Math.round(imc) +": Obesidade classe III. ");
        }




    }
}
