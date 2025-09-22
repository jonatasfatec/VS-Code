import java.util.Date;
import java.util.Scanner;

public class TesteOrdenacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("digite a capacidade do vetor, 0 encerra: ");
        int capacidade =scanner.nextInt();
        while (capacidade > 0) {
            NossoVetor nossoVetor = new NossoVetor(capacidade);
            //nossoVetor.preencheVetor();
            //System.out.println("vetor original:\n" + nossoVetor);
            //long ini = new Date().getTime();
            //nossoVetor.bubbleSort();
            //long fim = new Date().getTime();

            //System.out.println("Bubble:\ncapacidade: " + capacidade + ", tempo: " + (fim - ini) + " ms");
            //System.out.println("Vetor ordenado pelo Bubble:\n" + nossoVetor);
            
            //nossoVetor.preencheVetor();
            //System.out.println("vetor original:\n" + nossoVetor);
            //long ini = new Date().getTime();
            //nossoVetor.insertionSort();
            //long fim = new Date().getTime();

            //System.out.println("Insertion:\ncapacidade: " + capacidade + ", tempo: " + (fim - ini) + " ms");
            //System.out.println("Vetor ordenado pelo Insertion:\n" + nossoVetor);
            
            nossoVetor.preencheVetor();
            //System.out.println("vetor original:\n" + nossoVetor);
            long ini = new Date().getTime();
            nossoVetor.quickSort(0, nossoVetor.tamanho()-1);
            long fim = new Date().getTime();
            //System.out.println("Vetor ordenado pelo Quick:\n" + nossoVetor);
            System.out.println("Quick:\ncapacidade: " + capacidade + ", tempo: " + (fim - ini) + " ms");
            
            ini = new Date().getTime();
            nossoVetor.quickSort(0, nossoVetor.tamanho()-1);
            fim = new Date().getTime();
            //System.out.println("Vetor ordenado pelo Quick:\n" + nossoVetor);
            System.out.println("Quick 2:\ncapacidade: " + capacidade + ", tempo: " + (fim - ini) + " ms");
            
            System.out.print ("\ndigite o tamanho do novo vetor, 0 encerra: ");
            capacidade = scanner.nextInt();
        }
        scanner.close();
    }
}
