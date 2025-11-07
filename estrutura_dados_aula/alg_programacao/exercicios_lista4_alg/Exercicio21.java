//Faça um programa que receba do usuario dois vetores, A e B, com 10 numeros inteiros cada. Crie um novo vetor denominado C calculando C = A - B. Mostre na tela os dados do vetor C.
import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número para o vetor A: ");
            a[i] = scanner.nextInt();

            System.out.print("Digite o " + (i + 1) + "º número para o vetor B: ");
            b[i] = scanner.nextInt();

            c[i] = a[i] - b[i];
        }

        System.out.println("\nVetor C = A - B:");
        for (int i = 0; i < 10; i++) {
            System.out.println("C[" + i + "] = " + c[i]);
        }

        scanner.close();
    }
}
