import java.util.ArrayList;
import java.util.Scanner;

public class Npalavras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o número de palavras (n): ");
        int n = input.nextInt();
        input.nextLine();

        System.out.print("Informe o caractere inicial (ch): ");
        char ch = input.nextLine().toLowerCase().charAt(0);

        ArrayList<String> palavrasValidas = new ArrayList<>();

        int count = 0;
        while (count < n) {
            System.out.print("Digite a palavra " + (count + 1) + ": ");
            String palavra = input.nextLine();

            if (palavra.length() == 0) {
                System.out.println("Palavra vazia! Digite novamente.");
                continue;
            }

            if (Character.toLowerCase(palavra.charAt(0)) == ch) {
                palavrasValidas.add(palavra);
                count++;
            } else {
                System.out.println("A palavra \"" + palavra + "\" não começa com a letra '" + ch + "'.");
            }
        }

        System.out.println("\nPalavras válidas que começam com '" + ch + "':");
        for (String p : palavrasValidas) {
            System.out.println(p);
        }

        input.close();
    }
}