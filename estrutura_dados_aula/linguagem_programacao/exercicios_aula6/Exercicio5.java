import java.util.Scanner;

public class Exercicio5 {

    public static String emitirConceito(float media) {
        if (media >= 0 && media <= 4.9) {
            return "D";
        } else if (media <= 6.9) {
            return "C";
        } else if (media <= 8.9) {
            return "B";
        } else if (media <= 10) {
            return "A";
        } else {
            return "Média inválida!";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a média final do aluno: ");
        float media = input.nextFloat();

        System.out.println("\nA classificação da média foi: " + emitirConceito(media));

        input.close();
    }
}
