import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        double m, l;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor em metros cúbicos para ser convertido em litros: ");
        m = scanner.nextDouble();

        l = m * 1000;
        System.out.println("O resultado da conversão é: " + l + " litros");
        scanner.close();
    }
}
