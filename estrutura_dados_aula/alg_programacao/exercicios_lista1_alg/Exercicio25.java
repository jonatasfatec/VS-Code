import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        double a, m;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor em acres para ser convertido em metros quadrados: ");
        a = scanner.nextDouble();

        m = a * 4048.58;
        System.out.println("O resultado da conversão é: " + m + " metros quadrados");
        scanner.close();
    }
}
