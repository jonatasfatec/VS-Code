import java.util.Scanner;

public class Exercicio1 {

    public static void encaixarValores(int valorA, int valorB) {
        String strA = String.valueOf(valorA);
        String strB = String.valueOf(valorB);

        // Diagramação formatada.
        System.out.println("\n+-------------------------------+");
        System.out.println("|     A     |    B    | Mensagem |");
        System.out.println("+-----------+---------+----------+");
        System.out.printf("|  %5d   |  %3d   | %-8s |\n", valorA, valorB,
                strA.endsWith(strB) ? "Encaixa" : "Não encaixa");
        System.out.println("+-------------------------------+");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valorA, valorB;

        System.out.print("Digite um valor para A (4 dígitos). Caso queira encerrar, digite um número negativo: ");
        valorA = input.nextInt();

        System.out.print("Digite um valor para B (2 dígitos): ");
        valorB = input.nextInt();

        // Testa antes de entrar no while
        if (valorA < 0 || valorB < 0) {
            System.out.println("\nEncerrando o programa.");
        } else {
            // Executa enquanto os dois são positivos
            while (valorA >= 0 && valorB >= 0) {

                if (valorA >= 1000 && valorA <= 9999 && valorB >= 10 && valorB <= 99) {
                    encaixarValores(valorA, valorB);
                } else {
                    System.out.println("Entrada inválida! 'A' deve ter 4 dígitos e 'B' deve ter 2 dígitos.\n");
                }

                // lê de novo no final do laço
                System.out.print("\nDigite um valor para A (4 dígitos). Caso queira encerrar, digite um número negativo: ");
                valorA = input.nextInt();

                System.out.print("Digite um valor para B (2 dígitos): ");
                valorB = input.nextInt();
            }

            System.out.println("\nEncerrando o programa.");
        }

        input.close();
    }
}
