import java.util.Scanner;

public class TrianguloProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Digite um número inteiro positivo n: ");
        long n = scanner.nextLong();

        boolean encontrado = false;
        // Validar entrada negativa ou zero
        if (n <= 0) {
            System.out.println("Valor inválido. Digite um número maior que zero.");
            scanner.close();
            return;
        }

        for (long i = 1; ; i++) {
            long prod = i * (i + 1) * (i + 2);
            if (prod == n) {
                System.out.printf("%d = %d * %d * %d%n", n, i, i + 1, i + 2);
                encontrado = true;
                break;
            }
            if (prod > n) {
                break;
            }
        }

        if (!encontrado) {
            System.out.printf("%d não pode ser escrito como produto de três números consecutivos.%n", n);
        }

        scanner.close();
    }
}
