//Faça um programa que leia dois vetores de 10 elementos. Crie um vetor que seja a intersecção entre os 2 vetores anteriores, ou seja, que contém apenas os números que estão em ambos os vetores. Não deve conter números repetidos.

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros1 = new int[10];
        int[] numeros2 = new int[10];
        int[] intersecao = new int[10]; // no máximo 10 elementos em comum
        int count = 0;

        System.out.println("Digite 10 números para o primeiro grupo:");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "º número: ");
            numeros1[i] = scanner.nextInt();
        }

        System.out.println("Digite 10 números para o segundo grupo:");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "º número: ");
            numeros2[i] = scanner.nextInt();
        }

        // Verifica interseção
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (numeros1[i] == numeros2[j]) {
                    // Verifica se já está no vetor intersecao
                    boolean repetido = false;
                    for (int k = 0; k < count; k++) {
                        if (intersecao[k] == numeros1[i]) {
                            repetido = true;
                            break;
                        }
                    }
                    if (!repetido) {
                        intersecao[count] = numeros1[i];
                        count++;
                    }
                    break;
                }
            }
        }

        System.out.println("\nOs números que estão em ambos são esses: ");
        if (count == 0) {
            System.out.println("Nenhum número em comum.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.print(intersecao[i] + " ");
            }
        }

        scanner.close();
    }
}
