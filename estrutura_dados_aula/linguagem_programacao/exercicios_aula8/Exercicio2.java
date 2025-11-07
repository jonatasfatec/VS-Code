// Escreva um programa em linguagem Java que permita que o usuário insira valores inteiros em uma matriz de ordem 
//4x4. Em seguida o programa deve verificar se a matriz possui ponto de sela e, se possuir, mostre seu valor e sua 
//localização. Um elemento Aij de uma matriz bidimensional é dito ponto de sela da matriz se, e somente se, Aij for ao 
//mesmo tempo o menor elemento da linha i e o maior elemento da coluna j. Obs: a matriz pode ter mais de um ponto de 
//sela.
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        // Entrada dos valores da matriz 4x4
        System.out.println("Digite os 16 valores inteiros da matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        boolean temPontoSela = false;
        System.out.println("\n=== RESULTADO ===");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                int valor = matriz[i][j];
                boolean menorDaLinha = true;
                boolean maiorDaColuna = true;

                for (int k = 0; k < 4; k++) {
                    if (matriz[i][k] < valor) {
                        menorDaLinha = false;
                        break;
                    }
                }

                for (int k = 0; k < 4; k++) {
                    if (matriz[k][j] > valor) {
                        maiorDaColuna = false;
                        break;
                    }
                }

                if (menorDaLinha && maiorDaColuna) {
                    System.out.println("Ponto de sela encontrado: " + valor + 
                                       " na posição [" + i + "][" + j + "]");
                    temPontoSela = true;
                }
            }
        }

        if (!temPontoSela) {
            System.out.println("A matriz não possui ponto de sela.");
        }

        input.close();
    }
}
