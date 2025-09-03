import java.util.Date;
import java.util.Scanner;

public class TesteOrdenacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a capacidade do vetor, 0 encerra: ");
        int capacidade = scanner.nextInt();
        while (capacidade > 0) {
            NossoVetor nossoVetor = new NossoVetor(capacidade);
            nossoVetor.preencheVetor();
            //System.out.println("Vetor original:\n" + nossoVetor);
            long ini = new Date().getTime();
            nossoVetor.bubbleSort();
            long fim = new Date().getTime();
            System.out.println("Capacide: " + capacidade + ", tempo: " + (fim-ini) + " ms");
            //System.out.println("\nVetor ordenado pelo Bubble:\n" + nossoVetor);
            System.out.println("\nDigite a capacidade do novo vetor, 0 encerra: ");
            capacidade = scanner.nextInt();
        }
        scanner.close();
    }
    
}
