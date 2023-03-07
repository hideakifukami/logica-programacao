import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        String srtNota1, srtNota2;
        double nota1, nota2, peso1, peso2, media;

        srtNota1 = JOptionPane.showInputDialog("Informe a primeira nota.");
        srtNota2 = JOptionPane.showInputDialog("Informe a segunda nota.");
        nota1 = Double.parseDouble(srtNota1);
        nota2 = Double.parseDouble(srtNota2);


        peso1 = 2.5;
        peso2 = 4.5;

        media = (nota1 * peso1 + nota2 * peso2) / (peso1 + peso2);

        JOptionPane.showMessageDialog(null, media);
    }
}
