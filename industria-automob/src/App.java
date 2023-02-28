import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Indique o código da peça.");
        int cod = myObj.nextInt();

        System.out.println("Indique o valor da peça.");
        double valorUnitario = myObj.nextDouble();

        System.out.println("Indique a quantidade de peças.");
        int qntdade = myObj.nextInt();
        double total = qntdade * valorUnitario;

        System.out.printf("A compra de %d unidades da peça de código %d tem o valor total de R$%.2f.", qntdade, cod, total);
    }
}

