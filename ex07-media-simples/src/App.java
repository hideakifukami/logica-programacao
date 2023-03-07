import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        String srtNota1, srtNota2;
        double nota1, nota2, media;

        srtNota1 = JOptionPane.showInputDialog("Informe a primeira nota.");
        srtNota2 = JOptionPane.showInputDialog("Informe a segunda nota.");
        nota1 = Double.parseDouble(srtNota1);
        nota2 = Double.parseDouble(srtNota2);

        media = (nota1 + nota2) / 2;

        JOptionPane.showMessageDialog(null, media);
    }
}
