//Leia um valor de comprimento em jardas e apresente-o convertido em metros. A fórmula de conversão é: M = 0, 91 ∗ J, sendo J o comprimento em jardas e M o comprimento em metros.

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        double m, j;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor em jardas para ser convertido em metros: ");
        j = scanner.nextDouble();

        m = 0.91 * j;
        System.out.println("O resultado da conversão é: " + m + " metros");
        scanner.close();
    }
}
