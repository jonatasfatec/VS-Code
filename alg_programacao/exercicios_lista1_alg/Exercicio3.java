import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite um número: ");
        int numero2 = scanner.nextInt();
        System.out.print("Digite um número: ");
        int numero3 = scanner.nextInt();

        int soma = numero1 + numero2 + numero3; 
        System.out.println("A soma dos números é " + soma);

        scanner.close();
    }
}
