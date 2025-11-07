//Leia um angulo em graus e apresente-o convertido em radianos. A fórmula de conversão é: R = G ∗ π/180, sendo G o angulo em graus é R em radianos e π = 3.14.

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        double r, g;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor em graus para ser convertido em radianos: ");
        g = scanner.nextDouble();
        r = g * (3.14/180);
        System.out.println("O resultado da conversão é: " + r + " radianos");
        scanner.close();
    }
}
