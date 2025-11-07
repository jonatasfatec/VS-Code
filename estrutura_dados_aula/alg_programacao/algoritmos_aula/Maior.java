// ler uma lista de valores e dizer qual é o maior!!

import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        int i; // ele tem que ser int, por causa do vetor!!
        Scanner scanner = new Scanner(System.in);
        double[] v = new double[10];
        double maior;
        System.out.println("Digite 10 valores, por favor: ");
        for(i = 0; i < v.length; i++){
            v[i] = scanner.nextDouble();
        }

        // parte da busca 
        maior = v[0];
        for(i=1; i < v.length; i++){
            if (v[i] > maior){
                maior = v [i];
            }
        }
        System.out.println("O maior valor foi: " + maior);
        scanner.close();
    }
}
