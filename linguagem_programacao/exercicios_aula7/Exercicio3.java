import java.util.Scanner;

public class Exercicio3 {

    public static int metodo1(Scanner input) {
        int[] vetA = new int[20];
        int soma = 0;

        System.out.println("Digite 20 números inteiros:");

        for (int i = 0; i < vetA.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetA[i] = input.nextInt();

            if (vetA[i] % 2 == 0 && vetA[i] % 3 == 0) {
                soma += vetA[i];
            }
        }

        return soma;
    }

    public static void metodo2(Scanner input) {
        int[] A = new int[15];
        int[] B = new int[15];

        System.out.println("Digite 15 valores inteiros:");

        for (int i = 0; i < 15; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = input.nextInt();

            int soma = 0;
            for (int j = 1; j <= A[i]; j++) {
                soma += j;
            }
            B[i] = soma;
        }

        System.out.println("Vetor A: ");
        for (int i = 0; i < 15; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println("\nVetor B (somatórias): ");
        for (int i = 0; i < 15; i++) {
            System.out.print(B[i] + " ");
        }

        System.out.println();
    }

    public static void metodo3(Scanner input) {
        int[][] matriz = new int[4][4];

        System.out.println("Digite os valores da matriz 4x4:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        boolean triangularSuperior = true;

        for (int i = 1; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                if (matriz[i][j] != 0) {
                    triangularSuperior = false;
                    break;
                }
            }
            if (!triangularSuperior)
                break;
        }

        char resultado = triangularSuperior ? 'V' : 'F';
        System.out.println("A matriz é triangular superior? " + resultado);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        do {
            System.out.print("Digite um valor para N (1, 2 ou 3): ");
            n = input.nextInt();

            if (n != 1 && n != 2 && n != 3) {
                System.out.println("Valor inválido. Digite novamente.");
            }
        } while (n != 1 && n != 2 && n != 3);

        if (n == 1) {
            int resultado = metodo1(input);
            System.out.println("Soma dos números pares e divisíveis por 3: " + resultado);
        } else if (n == 2) {
            metodo2(input);
        } else if (n == 3) {
            metodo3(input);
        }

        input.close();
    }
}
