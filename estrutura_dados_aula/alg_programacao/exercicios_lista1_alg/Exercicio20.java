import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        double k, l;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor em quilos para ser convertido em libras: ");
        k = scanner.nextDouble();

        l = k / 0.45;
        System.out.println("O resultado da conversão é: " + l + " libras");
        scanner.close();
    }
}
