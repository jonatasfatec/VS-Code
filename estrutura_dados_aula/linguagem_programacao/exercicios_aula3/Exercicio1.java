import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tam = 3, i, j, k, somador = 0;
        int array[][][] = new int[tam][tam][tam];

        System.out.println("Valores do Cubo: ");
        for (i = 0; i < tam; i++) {
            for (j = 0; j < tam; j++) {
                System.out.println();
                for (k = 0; k < tam; k++) {
                    somador++;
                    array[i][j][k] = somador;
                    System.out.print("[" + i + "]" + "[" + j + "]" + "[" + k + "] = " + array[i][j][k] + " | ");
                }
            }
        }

        input.close();
    }
}
