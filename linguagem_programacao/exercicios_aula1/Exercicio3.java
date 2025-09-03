import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[50];
        int maior;

        for (int i = 0; i < 50; i++) {
            System.out.print("Digite um número para ser armazenado: ");
            vetor[i] = input.nextInt();
        }

        maior = vetor[0];

        for (int i = 1; i < 50; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        System.out.println("O maior número digitado foi: " + maior);
    }
}
