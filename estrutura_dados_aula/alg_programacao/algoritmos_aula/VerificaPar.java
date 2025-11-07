import java.util.Scanner;

public class VerificaPar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("digite um número:");
        numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " é par!");
        } else {
            System.out.println(numero + " é ímpar!");
        }
        scanner.close();
    }
}
