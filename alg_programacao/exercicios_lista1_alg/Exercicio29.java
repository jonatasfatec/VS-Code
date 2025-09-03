import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1,nota2, nota3, nota4, mediaA;

        System.out.print("Digite a primeira nota que será acrescida a média: ");
        nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
        nota3 = scanner.nextDouble();
        System.out.print("Digite a quarta nota: ");
        nota4 = scanner.nextDouble();

        mediaA = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.print("A média aritmética é " + mediaA);

        scanner.close();
    }
}
