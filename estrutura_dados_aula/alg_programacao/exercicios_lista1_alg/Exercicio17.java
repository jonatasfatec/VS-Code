import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        double c, p;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor em centímetros para ser convertido em polegadas: ");
        c = scanner.nextDouble();

        p = c / 2.54;
        System.out.println("O resultado da conversão é: " + p + " polegadas");
        scanner.close();
    }
}
