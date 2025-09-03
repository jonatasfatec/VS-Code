import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor1,valor2, valor3, somaQ;

        System.out.print("Considere um valor para soma dos quadrados: ");
        valor1 = scanner.nextDouble();
        System.out.print("Escolha outro valor: ");
        valor2 = scanner.nextDouble();
        System.out.print("Escolha mais um: ");
        valor3 = scanner.nextDouble();

        somaQ = (valor1 * valor1) + (valor2 * valor2) + (valor3 * valor3);
        System.out.println("A soma dos quadrados é " + somaQ);

        scanner.close();
    }
}
