import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetorA = new int[30];
        int numVetorND = 0;
        int i = 0;

        while(i < vetorA.length) {
            System.out.print("Digite um número inteiro divisível por 5: ");
            int numero = input.nextInt();

            if (numero % 5 == 0) {
                vetorA[i] = numero;
                i++;
            } else {
                System.out.println("O número digitado NÃO é divisível por 5!");
                numVetorND++;
            }
        }

        System.out.print("Vetor A: ");
        for(int j = 0; j < vetorA.length; j++) {
            System.out.print(vetorA[j] + " ");
        }
        System.out.println("\nO usuário digitou " + numVetorND + " número(s) não divisível(is) por 5.");
        
        input.close();
    }
}

