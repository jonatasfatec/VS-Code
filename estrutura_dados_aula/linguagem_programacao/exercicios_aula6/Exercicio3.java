import java.util.Scanner;

public class Exercicio3 {

    public static void calcularMedia(float nota1, float nota2, char letra) {
        letra = Character.toUpperCase(letra);

        if (letra == 'A') {
            float media = (nota1 + nota2) / 2;
            System.out.printf("Média Aritmética: %.2f\n", media);
        } else if (letra == 'P') {
            float media = (nota1 * 7 + nota2 * 3) / 10;
            System.out.printf("Média Ponderada: %.2f\n", media);
        } else {
            System.out.println("Letra inválida. Use 'A' para média aritmética ou 'P' para ponderada.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        float nota1 = input.nextFloat();

        System.out.print("Digite a segunda nota: ");
        float nota2 = input.nextFloat();

        System.out.print("Digite 'A' para média aritmética ou 'P' para média ponderada: ");
        char opcao = input.next().charAt(0);

        calcularMedia(nota1, nota2, opcao);

        input.close();
    }
}
