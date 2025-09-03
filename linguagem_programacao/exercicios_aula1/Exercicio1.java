import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int[] vetor = new int[20];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite um número para ser armazenado: ");
            vetor[i] = input.nextInt();
        }

        System.out.println("\nExibe em ordem inversa:");
        for (int i = 19; i >= 0; i--) {
            System.out.println(vetor[i]);
        }

        input.close(); 
    }
}

