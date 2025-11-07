import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        double k, m;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor em m/s para ser convertido em km/h: ");
        m = scanner.nextDouble();
        k = m * 3.6;
        System.out.println("O resultado da conversão é: " + k + " km/h");
        scanner.close();
    }
}