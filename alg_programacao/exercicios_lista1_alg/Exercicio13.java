import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        double k, m;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor em quilometros para ser convertido em milhas: ");
        k = scanner.nextDouble();
        m = k / 1.61;
        System.out.println("O resultado da conversão é: " + m + " milhas");
        scanner.close();
    }
}