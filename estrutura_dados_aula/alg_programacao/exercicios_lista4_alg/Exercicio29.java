//Faça um programa que receba 6 numeros inteiros e mostre:
//• Os numeros pares digitados;
//• A soma dos numeros pares digitados;
//• Os numeros ımpares digitados;
//• A quantidade de numeros ımpares digitados;
import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];
        int somaPares = 0;
        int qtdImpares = 0;

        System.out.println("Digite 6 números inteiros:");
        for (int i = 0; i < 6; i++) {
            System.out.print((i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }
        System.out.print("\nNúmeros pares digitados: ");
        for (int num : numeros) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
                somaPares += num;
            }
        }

        System.out.println("\nSoma dos números pares: " + somaPares);
        System.out.print("Números ímpares digitados: ");
        for (int num : numeros) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
                qtdImpares++;
            }
        }
        System.out.println("\nQuantidade de números ímpares: " + qtdImpares);
        scanner.close();
    }
}