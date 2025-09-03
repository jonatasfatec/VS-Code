import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        double r, g;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor em radianos para ser convertido em graus: ");
        r = scanner.nextDouble();
        g = r * (180/3.14);
        System.out.println("O resultado da conversão é: " + g + " graus");
        scanner.close();
    }
}
