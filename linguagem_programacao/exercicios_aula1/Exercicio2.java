import java.util.Scanner;
public class Exercicio2{
    public static void main(String[] args){
        int[] vetor1 = new int[15]; 
        int[] vetor2 = new int[15]; 
        Scanner input = new Scanner(System.in);

        for(int i=0; i<15; i++){
            System.out.print("Digite um número inteiro para ser aplicado ao vetor: ");
            vetor1[i] = input.nextInt();
            vetor2[i] = vetor1[i]*3;
        }
        System.out.println("\nOs valores de saída do vetor são: ");
        for(int i=0; i<15; i++){
            System.out.println("Vetor " + (i+1) +  ": " + vetor2[i]);
        }
        input.close();
    }
}