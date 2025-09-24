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
        int valorA = 0;
        int valorB = 0;

        while (!(valorA < 0 && valorB < 0)) {
            System.out.print("Digite um valor para A (4 dígitos). Caso queira encerrar, digite um número negativo: ");
            valorA = input.nextInt();

            System.out.print("Digite um valor para B (2 dígitos): ");
            valorB = input.nextInt();

            if (valorA < 0 && valorB < 0) {
                System.out.println("\nEncerrando o programa.");
            } else {
                if (valorA >= 1000 && valorA <= 9999 && valorB >= 10 && valorB <= 99) {
                    encaixarValores(valorA, valorB);
                } else {
                    System.out.println("'A' deve ter 4 dígitos e 'B' deve ter 2 dígitos.\n");
                }
            }
        }

        input.close();
    }
}
