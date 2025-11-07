//  ler uma lista de valores quaisquer (entra o double) cujo também é escolhido pelo usuário. Depois, exibir a lista de trás pra frente.
// A lista pode ser manipulada de qualquer jeito!!!


// pode definir o tamanho do vetor (lista) no tempo de execução e pode ser qualqur um!!(dentro do limite kkkkk)

import java.util.Scanner;

public class Vetor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Indice de um vetor é SEMPRE inteiro!!
        System.out.println("Por favor, digite o tamanho da sua lista: ");
        int tamanho = scanner.nextInt(); 

        // voce pode declarar primeiro
        double []lista;
        //  depois instanciar
        lista = new double[tamanho];
        System.out.println("Agora, digite os valores: ");
        for (int i = 0; i < tamanho; i ++) {
            //  ((i+1) + "\u00b0: ") <-- esse cara aqui, simplesmente faz a gente começar com primeiro, segundo, ...
            System.out.print((i+1) + "\u00b0: ");
            lista [i] = scanner.nextDouble();

        }
        //  a linha do for significa: 
        // o tamanho do meu i é igual ao valor do tamanho menos 1, pq é como um vetor funciona(pq ele começa com 0); enquanto i for maior que 0; a gente vai "subindo" a lista
        System.out.println("\nAgora, vou te mostrar sua lista invertida: ");
        for (int i = tamanho -1; i>0; i--) {
            System.out.print(lista[i] + " ");

        }
        scanner.close();

    }
    
}
