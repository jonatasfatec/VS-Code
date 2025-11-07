import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetorA = new int[20];
        int[] vetorB = new int[20];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite um número inteiro para o vetor A[" + (i+1) + "]: ");
            vetorA[i] = input.nextInt();
        }
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print("Digite um número inteiro para o vetor B[" + (i+1) + "]: ");
            vetorB[i] = input.nextInt();
        }
		
        System.out.println("\n--- Vetor A antes da troca ---");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\n--- Vetor B antes da troca ---");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        for (int i = 0; i < vetorA.length; i++) {
            int temp = vetorA[i];
            vetorA[i] = vetorB[vetorB.length - 1 - i];
            vetorB[vetorB.length - 1 - i] = temp;
        }

        System.out.println("\n\n--- Vetor A depois da troca ---");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\n--- Vetor B depois da troca ---");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        input.close();
    }
}
