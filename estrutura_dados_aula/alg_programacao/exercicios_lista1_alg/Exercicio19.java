import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        double m, l;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor em litros para ser convertido em metros cúbicos: ");
        l = scanner.nextDouble();

        m = l / 1000;
        System.out.println("O resultado da conversão é: " + m + " metros cúbicos");
        scanner.close();
    }
}
