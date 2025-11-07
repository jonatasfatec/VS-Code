import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        double k, l;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor em libras para ser convertido em quilos: ");
        l = scanner.nextDouble();

        k = l / 0.45;
        System.out.println("O resultado da conversão é: " + k + " quilos");
        scanner.close();
    }
}
