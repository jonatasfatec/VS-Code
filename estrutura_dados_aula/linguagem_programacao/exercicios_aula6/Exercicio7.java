import java.util.Scanner;

public class Exercicio7 {

    public static int[] lerVetor() {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = input.nextInt();
        }

        return numeros;
    }

    public static int encontrarMaior(int[] vetor) {
        int maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    public static int encontrarMenor(int[] vetor) {
        int menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        int[] numeros = lerVetor();
        int maior = encontrarMaior(numeros);
        int menor = encontrarMenor(numeros);

        System.out.println("\nO maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
    }
}
