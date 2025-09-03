// ler o vetor, encontrar o menor E a sua posição.

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, posicao; // ele tem que ser int, por causa do vetor!!
        double[] v = new double[10];
        double menor;
        System.out.println("Digite 10 valores, por favor: ");
        for(i = 0; i < v.length; i++){
            v[i] = scanner.nextDouble();
        }

        // parte da busca 
        menor = v[0];
        posicao = 0;
        for(i=1; i < v.length; i++){
            if (v[i] < menor) {
                menor = v [i];
            }
        }
        System.out.println("O menor valor foi: " + menor);
        System.out.println("A posicao dele foi: " + posicao);

        scanner.close();
    }
}

// Usar o que ta dentro do parentesis ou fora dá o mesmo resultado!!
// ta sinalizado com a marcação de anotação