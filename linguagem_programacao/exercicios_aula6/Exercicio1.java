import java.util.Scanner;

public class Exercicio1 {

    // Método que verifica se o valor é par ou ímpar
    public static void verificarValor(int valor) {
        if (valor % 2 == 0) {
            System.out.println("Par!");
        } else {
            System.out.println("Ímpar!");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = input.nextInt();

        verificarValor(num);

        input.close();
    }
}
