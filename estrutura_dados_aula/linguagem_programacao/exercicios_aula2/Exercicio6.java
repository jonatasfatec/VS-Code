//Crie um programa para armazenar os valores 0s e 1s
//em uma matriz quadrada de ordem 3. Em seguida
//verificar se a matriz é uma matriz identidade.
//Obs: uma matriz identidade é aquela em que os
//elementos da diagonal principal são iguais a 1 e os
//demais elementos são iguais a zero.

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tam = 3;
        int[][] matriz = new int[tam][tam];
        boolean id = true; // faz a exclusão caso qualquer número for diferente

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.print("Digite 0 ou 1 para a posição [" + (i+1) + "][" + (j+1) + "]: ");
                matriz[i][j] = input.nextInt();
                if (i == j && matriz[i][j] != 1) { 
                    id = false;
                } else if (i != j && matriz[i][j] != 0) {
                    id = false;
                }
            }
        }
        if (id) {
            System.out.println("\nA matriz é uma matriz identidade!");
        } else {
            System.out.println("\nA matriz não é uma matriz identidade!");
        }
        input.close();
    }
}
