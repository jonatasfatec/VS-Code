// como buscar as coisas dentro da lista, no caso, processamento de listas dentro de um vetor!!
// Ler valores inteiros, contar o número de pares e colocar a quantidade de pares.
// Exercício 5 da lista de vetores

import java.util.Scanner;

public class Busca {
    public static void main(String[] args) {
        int i, pares = 0, v [];
        Scanner scanner = new Scanner(System.in);
        v = new int [10];
        System.out.println("Digite 10 valores inteiros, por favor: ");
        for (i = 0; i< v.length;i++){
            v[i] = scanner.nextInt();

        }
        for(i = 0; i<v.length; i ++){
            if (v[i] % 2 == 0){
                pares ++;
            }
        }
        System.out.println("A lista tem: " + pares + " pares");

        scanner.close();
    }    
}

// para otimizar o processamento, fazer assim:

// for(i = 0; i<v.length; i ++){
    // v[i] = scanner.nextInt();
    // if (v[i] % 2 == 0){
        // pares ++;
    // }
//}