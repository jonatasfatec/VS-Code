import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[100];
        int soma=0;

        for(int i=0; i<100; i++){
            System.out.print("Digite um número para ser armazenado no vetor: ");
            vetor[i] = input.nextInt();
            if((vetor[i]%2) != 0){
                soma+= vetor[i];
            }
        }
        System.out.println("A soma dos ímpares deu: " + soma);
    }
}
