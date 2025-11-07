import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[50];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número para o vetor: ");
            vetor[i] = input.nextInt();
        }

        System.out.println("\nNúmeros positivos digitados:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > 0) {
                System.out.println(vetor[i]);
            }
        }
    }
}
