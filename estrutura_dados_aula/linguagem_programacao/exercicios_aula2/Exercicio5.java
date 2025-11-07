//Crie um programa em Linguagem Java que armazene
//dados inteiros em uma matriz de ordem 5 e imprima
//todos os elementos que se encontram em posições
//cuja linha mais coluna formam um número par.

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tam = 5;
        int[][] matriz = new int[tam][tam];

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.print("Digite um inteiro para a posição [" + (i+1) + "][" + (j+1) + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }
		
        System.out.println("\nElementos em posições cuja linha + coluna é par:");
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
        input.close();
    }
}
