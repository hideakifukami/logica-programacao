import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        String cod, resposta;
        double valorUnitario, total;
        int qntdade;

        cod = JOptionPane.showInputDialog("Indique o código da peça.");

        valorUnitario = Double.parseDouble(JOptionPane.showInputDialog("Indique o valor da peça."));

        qntdade = Integer.parseInt(JOptionPane.showInputDialog("Indique a quantidade de peças."));
        total = qntdade * valorUnitario;

        System.out.printf("A compra de %d unidades da peça de código %s tem o valor total de R$%.2f.", qntdade, cod, total);
        
    }
}

