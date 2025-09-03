import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        //declaração das variaveis
        double numero1, numero2, soma;
        Scanner scanner = new Scanner(System.in);
        //entrada de dados
        System.out.print("digite o primeiro número: ");
        numero1 = scanner.nextDouble();
        System.out.print("digite o segundo número: ");
        numero2 = scanner.nextDouble();
        //processamento
        soma = numero1 + numero2;
        //saída
        System.out.println("a soma é: " + soma);
        scanner.close();
    }
}
