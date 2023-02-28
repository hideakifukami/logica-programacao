import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        String name1 = myObj.nextLine();
        
        System.out.println("Informe sua idade:");
        int idade1 = myObj.nextInt();

        System.out.println("Informe seu gênero:");
        String genero1 = myObj.nextLine();

        System.out.println("Informe seu salário:");
        double salario1 = myObj.nextDouble();

    }

}

