//Leia uma velocidade em km/h (quilometros por hora) e apresente-a convertida em m/s (metros por segundo). A formula de conversão é: M = K/3.6, sendo K a velocidade em km/h e M em m/s.
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        double k, m;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor em km/h para ser convertido em m/s: ");
        k = scanner.nextDouble();

        m = k/3.6;
        System.out.println("O resultado da conversão é: " + m + " m/s");
        scanner.close();
    }
}