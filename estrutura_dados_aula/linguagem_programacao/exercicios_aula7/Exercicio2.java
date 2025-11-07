import java.util.Scanner;

public class Exercicio2 {

    public static double calculaSequencia(int A, int n) {
        double valorTotal = 0.0;

        for (int i = 1; i <= n; i++) {
            valorTotal += 1.0 / (i * A);
        }
        return valorTotal;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A, n;

        System.out.print("Digite o valor de A: ");
        A = input.nextInt();

        System.out.print("Digite o valor de n: ");
        n = input.nextInt();

        System.out.printf("\nO valor da sequência foi: %.6f\n", calculaSequencia(A, n));
        input.close();
    }
}
