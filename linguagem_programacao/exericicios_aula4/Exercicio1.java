import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome1, nome2;

        System.out.println("Digite um nome para ser lido:");
        nome1 = input.nextLine();

        System.out.println("Digite o segundo nome para ser lido:");
        nome2 = input.nextLine();

        System.out.println("Primeiro nome: " + nome1);
        System.out.println("Segundo nome: " + nome2);

        if (nome1.length() >= 2 && nome2.length() >= 2) {
            System.out.println("Segunda letra do primeiro nome: " + nome1.charAt(1));
            System.out.println("Segunda letra do segundo nome: " + nome2.charAt(1));
        } else {
            System.out.println("Um dos nomes é muito curto para mostrar a segunda letra.");
        }

        input.close();
    }
}
