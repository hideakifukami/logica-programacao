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

        System.out.println("A compra de " + qntdade + " unidades da peça de código " + cod + " tem o valor total de R$" + total + ".");
    }
}
