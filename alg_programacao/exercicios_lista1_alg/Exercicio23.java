import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        double m, j;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor em metros para ser convertido em jardas: ");
        m = scanner.nextDouble();

        j = m / 0.91;
        System.out.println("O resultado da conversão é: " + j + " jardas");
        scanner.close();
    }
}
