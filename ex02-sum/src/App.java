import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Indique a primeira parcela de uma soma.");
        double num1 = myObj.nextDouble();

        System.out.println("Indique a segunda parcela de uma soma.");
        double num2 = myObj.nextDouble();
        double sum = num1 + num2;

        System.out.println("A soma é: " + sum);
    }
}
