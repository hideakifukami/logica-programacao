import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        double raio, area;
        final double PI = 3.1416;

        System.out.println("Escreva o valor do raio:");
        Scanner scan = new Scanner(System.in);
        raio = scan.nextDouble();
        area = PI * Math.pow(raio, 2);

        System.out.print("O valor da area é " + area);
    }
}
