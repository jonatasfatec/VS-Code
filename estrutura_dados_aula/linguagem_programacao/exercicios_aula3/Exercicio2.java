import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, j, k, soma, somaImpar = 0, somaPar = 0;
        int array[][][] = new int[3][3][3];

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.println();
                for (k = 0; k < 3; k++) {
                    array[i][j][k] = i + j + k;
                    soma = array[i][j][k];
                    if ((soma % 2) == 0) {
                        somaPar += soma;
                    } else {
                        somaImpar += soma;
                    }
                    System.out.print("[" + i + "]" + "[" + j + "]" + "[" + k + "] = " + soma + " | ");
                }
            }
        }
        System.out.println("\n\nA soma dos pares é " + somaPar);
        System.out.println("A soma dos ímpares é " + somaImpar);
        input.close();
    }
}
