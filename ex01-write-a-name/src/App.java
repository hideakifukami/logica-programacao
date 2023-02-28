import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        String name = myObj.nextLine();

        System.out.println("Hello, " + name);
    }
}
