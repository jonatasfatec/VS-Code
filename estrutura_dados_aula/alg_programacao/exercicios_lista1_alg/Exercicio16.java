//Leia um valor de comprimento em polegadas e apresente-o convertido em centímetros. A formula de conversão é: C = P ∗ 2.54, sendo C o comprimento em centímetros e P o comprimento em polegadas

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        double c, p;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor em polegadas para ser convertido em centímetros: ");
        p = scanner.nextDouble();

        c = p * 2.54;
        System.out.println("O resultado da conversão é: " + c + " centímetros");
        scanner.close();
    }
}
