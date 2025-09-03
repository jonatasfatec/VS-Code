import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        double h, m;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor em hectares para ser convertido em metros quadrados: ");
        h = scanner.nextDouble();

        m = h * 10000;
        System.out.println("O resultado da conversão é: " + m + " metros quadrados");
        scanner.close();
    }
}
