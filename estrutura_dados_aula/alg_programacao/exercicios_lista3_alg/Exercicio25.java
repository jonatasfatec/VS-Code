//Faca um programa que some todos os numeros naturais abaixo de 1000 que sao múltiplos de 3 ou 5.

public class Exercicio25 {
    public static void main(String[] args) {
        int numero = 0, soma = 0;

        do {
            if (numero % 3 == 0 || numero % 5 == 0) {
                soma += numero;
            }
            numero++;
        } while (numero < 1000);

        System.out.println("A soma dos múltiplos de 3 ou 5 abaixo de 1000 é: " + soma);
    }
}
