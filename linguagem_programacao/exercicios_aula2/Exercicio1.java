// Crie um programa para inserir valores inteiros em uma
// matriz 4 x 4. Calcular e imprimir a soma de todos os
// elementos da matriz

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int i, j;

        for(i=0; i<4; i++){
            System.out.println("Digite quatro números inteiros: ");
            for(j=0; j<4; j++){
                matriz[i][j] = input.nextInt();
            }
        }

        System.out.println("\nA matriz 4x4 ficou:\n");
        for(i=0; i<4; i++){
            for(j=0; j<4; j++){
                System.out.print(matriz[i][j] + "\t"); // tabulação para alinhar
            }
            System.out.println();
        }

        input.close();
    }
}
