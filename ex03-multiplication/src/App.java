import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Indique o primeiro fator de uma multiplicação.");
        double num1 = myObj.nextDouble();

        System.out.println("Indique o segundo fator de uma multiplicação.");
        double num2 = myObj.nextDouble();
        double mult = num1 * num2;

        System.out.println(num1 + " x " + num2 + " = " + mult);
    }
}
