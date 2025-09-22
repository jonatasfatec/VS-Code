import java.util.Scanner;

public class Exercicio2 {

    public static void calcularSoma(int x, int y) {
        int soma = x + y;
        System.out.println("A soma é: " + soma);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = input.nextInt();
        calcularSoma(num1, num2);

        input.close();
    }
}
