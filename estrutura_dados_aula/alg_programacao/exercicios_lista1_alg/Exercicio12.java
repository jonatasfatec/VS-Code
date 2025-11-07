import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        double k, m;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor em milhas para ser convertido em quilometros: ");
        m = scanner.nextDouble();
        k = m * 1.61;
        System.out.println("O resultado da conversão é: " + k + " quilometros");
        scanner.close();
    }
}
