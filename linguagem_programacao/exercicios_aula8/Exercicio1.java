//Escreva um programa em linguagem Java que permita que o usuário insira valores em um vetor com 10 números 
//inteiros denominado Num, e também em um segundo vetor com 5 números inteiros denominado Divis. Em seguida o 
//programa deve verificar e imprimir os números do primeiro vetor, e se existirem, os seus divisores armazenados no 
//segundo vetor, bem como suas posições.
//Obs: veja o exemplo abaixo em que do lado esquerdo tem-se os dois vetores Num e Divis, e do lado direito a 
//impressão do programa. Perceba que nesse exemplo o índice inicia com valor 1, a fim de entender o problema; porém 
//para a elaboração do código não esqueça de usar 0 para iniciar os índices dos vetores.


import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] Num = new int[10];
        int[] Divis = new int[5];

        System.out.println("Digite 10 números inteiros para o vetor Num:");
        for (int i = 0; i < Num.length; i++) {
            System.out.print("Num[" + i + "]: ");
            Num[i] = input.nextInt();
        }

        System.out.println("\nDigite 5 números inteiros para o vetor Divis:");
        for (int i = 0; i < Divis.length; i++) {
            System.out.print("Divis[" + i + "]: ");
            Divis[i] = input.nextInt();
        }

        System.out.println("\n=== RESULTADO ===");
        for (int i = 0; i < Num.length; i++) {
            boolean temDivisor = false;

            System.out.println("\nNúmero " + Num[i] + " (posição " + i + "):");

            for (int j = 0; j < Divis.length; j++) {
                if (Divis[j] != 0 && Num[i] % Divis[j] == 0) {
                    System.out.println("   Divisor encontrado: " + Divis[j] + " (posição " + j + ")");
                    temDivisor = true;
                }
            }

            if (!temDivisor) {
                System.out.println("   Nenhum divisor encontrado no vetor Divis.");
            }
        }

        input.close();
    }
}
