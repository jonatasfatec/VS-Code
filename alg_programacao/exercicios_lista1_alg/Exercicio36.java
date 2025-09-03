//Leia a altura e o raio de um cilindro circular e imprima o volume do cilindro. O volume de um cilindro circular é calculado por meio da seguinte fórmula: V = π ∗ raio^2 ∗ altura, onde π = 3.14

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        double altura, raio, volume;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor para a altura do cilindro: ");
        altura = scanner.nextDouble();
        System.out.print("Digite um valor para o raio do cilindro: ");
        raio = scanner.nextDouble();

        volume = 3.14 * (raio * raio) * altura;
        System.out.println("O volume do cilindro é " + volume);
        scanner.close();
    }
}
