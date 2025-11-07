// Exibe uma lista de valores 

import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) { // string nada mais é do que vetores, lista de valores!!
        Scanner scanner = new Scanner(System.in);
        int [] v = new int[5];
        // não fazer mil casas de nextInt com o vetor, fazer apenas o FOR!!! Já que é a mesma coisa!!control ponto e virgula             
        // o i é o único que existe dentro do for, o vetor já foi instanciado ANTES do for!!
        for (int i=0; i<5; i++) {
            System.out.print("Digite o valor da posicao, por favor! " + i + ": ");
            v[i] = scanner.nextInt();
        }
        System.out.println("\nA lista de valores foi: ");
        for(int i = 0; i < 5; i ++) {
            System.out.print(v[i] + " ");

        }
        scanner.close();
    }
}

// ele abre e libera pra mostrar os valores, agora podemos manupular os valores!!