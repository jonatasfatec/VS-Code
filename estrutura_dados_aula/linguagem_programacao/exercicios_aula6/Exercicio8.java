import java.util.Scanner;

public class Exercicio8 {

    public static void mostrarTabuadas(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("\nTabuada do " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número N para exibir as tabuadas de 1 até N: ");
        int num = input.nextInt();

        mostrarTabuadas(num);

        input.close();
    }
}