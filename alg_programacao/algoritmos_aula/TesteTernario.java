// ternario é um if else simples
// Ler um numero e dizer se ele é ímpar ou par utilizando o operador ternário

import java.util.Scanner;

public class TesteTernario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite um inteiro: ");
        int num = scanner.nextInt();

        // Impressão usando if/else tradicional
        if (num % 2 == 0) {
            System.out.println(num + ": classificado como par");
        } else {
            System.out.println(num + ": classificado como impar");
        }

        // Classificação usando operador ternário
        String s = (num % 2 == 0)
                    ? ": classificado como par"
                    : ": classificado como impar";
        System.out.println(num + s);

        // Versão compacta diretamente no print
        System.out.println(num + (num % 2 == 0
                                  ? ": classificado como par"
                                  : ": classificado como impar"));

        scanner.close();
    }
}

