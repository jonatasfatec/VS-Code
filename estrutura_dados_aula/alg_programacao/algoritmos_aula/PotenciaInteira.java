import java.util.Scanner;

public class PotenciaInteira {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base (x), inteiro: ");
        int x = scanner.nextInt();

        int n;
        do {
            System.out.print("Digite o expoente (n ≥ 0), inteiro: ");
            n = scanner.nextInt();
            if (n < 0) {
                System.out.println("Valor inválido! Expoente deve ser maior ou igual a zero.");
            }
        } while (n < 0);

        int resultado = 1;

        if (n == 0) {
            System.out.println(x + " ^ 0 = 1");
        } else {
            for (int i = 1; i <= n; i++) {
                resultado *= x;
                System.out.println(x + " ^ " + i + " = " + resultado);
            }
        }

        System.out.println("Resultado final: " + x + " ^ " + n + " = " + resultado);
        scanner.close();
    }
}
