import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        double real, dolar;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor reais para ser colocado na cotação de dólares: ");
        real = scanner.nextDouble();

        dolar = real / 5.742 ;
        System.out.println("O resultado da conversão de reais é " + dolar + " dólares");
        scanner.close();
    }
}
