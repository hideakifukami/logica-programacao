import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        String strDist, strLitros;
        double dist, litros, consumo;

        strDist = JOptionPane.showInputDialog("Indique a distância percorrida: ");
        strLitros = JOptionPane.showInputDialog("Indique a quantidade de litros gasto: ");
        dist = Double.parseDouble(strDist);
        litros = Double.parseDouble(strLitros);

        consumo = dist / litros;

        JOptionPane.showMessageDialog(null, "O consumo médio da viagem foi de " + consumo + " quilomêtros por litro.");
    }
}

