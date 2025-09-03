// Escreva um programa completo que permita a qualquer aluno introduzir, pelo teclado, uma sequencia arbitrária de notas (válidas no intervalo de 10 a 20) e que mostre na tela, como resultado, a correspondente media aritmética. O número de notas com que o aluno pretenda efetuar o calculo não será fornecido ao programa, o qual terminará quando for introduzido um valor que nao seja válido como nota de aprovacão

import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota, total = 0, cont = 0;
        double media;

        System.out.println("Digite notas entre 10 e 20. Para encerrar, digite um valor fora desse intervalo.");

        do {
            System.out.print("Digite uma nota: ");
            nota = scanner.nextInt();

            if (nota >= 10 && nota <= 20) {
                total += nota;
                cont++;
            }

        } while (nota >= 10 && nota <= 20); 

        if (cont > 0) {
            media = (double) total / cont;
            System.out.println("A média aritmética é: " + media);
        } else {
            System.out.println("Nenhuma nota válida foi inserida.");
        }

        scanner.close();
    }
}
