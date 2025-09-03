// Crie um programa em Linguagem Java que armazene
// dados inteiros em uma matriz de ordem 5. Em
// seguida imprima apenas a diagonal principal. Depois
// imprima a diagonal secundária.
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tam = 5;
        int[][] matriz = new int[tam][tam];

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.print("Digite um número para a posição [" + (i+1) + "][" + (j+1) + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }
        System.out.print("\nDiagonal Principal: ");
        for (int i = 0; i < tam; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.print("\nDiagonal Secundária: ");
        for (int i = 0; i < tam; i++) {
            System.out.print(matriz[i][tam - 1 - i] + " ");
        }

        input.close();
    }
}
