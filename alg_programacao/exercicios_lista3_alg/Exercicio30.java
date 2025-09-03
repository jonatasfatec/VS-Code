import java.util.Scanner;

public class Exercicio30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao, n, soma = 0;

        System.out.println("Escolha a sequência que deseja calcular:");
        System.out.println("1 - Soma de 1 + 2 + 3 + ... + n");
        System.out.println("2 - Soma de 1 - 2 + 3 - 4 + ... + (2n - 1)");
        System.out.println("3 - Soma de 1 + 3 + 5 + ... + (2n - 1)");
        System.out.print("Digite a opção (1, 2 ou 3): ");
        opcao = scanner.nextInt();

        System.out.print("Digite o valor de n: ");
        n = scanner.nextInt();

        if (opcao == 1) {
            for (int i = 1; i <= n; i++) {
                soma += i;
            }
            System.out.println("Resultado da soma de 1 até " + n + " é: " + soma);
        } else if (opcao == 2) {
            for (int i = 1; i <= 2 * n - 1; i++) {
                if (i % 2 == 0) {
                    soma -= i;
                } else {
                    soma += i;
                }
            }
            System.out.println("Resultado da sequência 1 - 2 + 3 - 4 + ... + (2n - 1) é: " + soma);
        } else if (opcao == 3) {
            for (int i = 1; i <= 2 * n - 1; i += 2) {
                soma += i;
            }
            System.out.println("Soma dos " + n + " primeiros números ímpares é: " + soma);
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
