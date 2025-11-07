//Crie um programa para armazenar valores inteiros em
//duas matrizes quadradas, denominadas A e B, de
//ordem 2. Em seguida, gerar uma terceira matriz
//chamada C que é obtida a partir da adição da matriz A
//e B.
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] A = new int[2][2];
        int[][] B = new int[2][2];
        int[][] C = new int[2][2];

        System.out.println("Digite os valores da matriz A (2x2): ");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = input.nextInt();
            }
        }
        System.out.println("\nDigite os valores da matriz B (2x2): ");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.print("B[" + i + "][" + j + "] = ");
                B[i][j] = input.nextInt();
            }
        }
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("\nA matriz C (A + B) ficou:\n");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }

        input.close();
    }
}
