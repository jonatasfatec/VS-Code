import java.util.Scanner;

public class Exercicio6 {

    public static boolean ePerfeito(int numero) {
        int somaDivisores = 0;

        for (int i = 1; i <= numero/2; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
            }
        }
        return somaDivisores == numero;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número para verificar se é perfeito: ");
        int numero = input.nextInt();

        if (ePerfeito(numero)) {
            System.out.println(numero + " é um número perfeito!");
        } else {
            System.out.println(numero + " não é um número perfeito.");
        }

        input.close();
    }
}
