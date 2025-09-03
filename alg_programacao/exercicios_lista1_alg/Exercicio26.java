import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        double h, m;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor em metros quadrados para ser convertido em hectares: ");
        m = scanner.nextDouble();

        h = m * 0.0001;
        System.out.println("O resultado da conversão é: " + h + " hectares");
        scanner.close();
    }
}
