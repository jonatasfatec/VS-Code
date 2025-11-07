///Leia um valor de area em metros quadrados m2 e apresente-o convertido em acres. A formula de conversão é: A = M ∗ 0, 000247, sendo M a area em metros quadrados é A a area em acres.

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        double a, m;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor em metros quadrados para ser convertido em acres: ");
        m = scanner.nextDouble();

        a = 0.000247 * m;
        System.out.println("O resultado da conversão é: " + a + " acres");
        scanner.close();
    }
}
