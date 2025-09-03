import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite uma palavra");
        String palavra = scanner.nextLine().toLowerCase();

        char[] vetor_caracteres = new char[palavra.length()];
        for (int i = 0; i < palavra.length(); i++) {
            vetor_caracteres[i] = palavra.charAt(i);
        }

        int tamanho = vetor_caracteres.length;
        for (int i = vetor_caracteres.length - 1; i >= 0; i--) {
            if (vetor_caracteres[i] == ' ') {
                for (int j = i; j < tamanho - 1; j++) {
                    vetor_caracteres[j] = vetor_caracteres[j + 1];
                }
                tamanho--;
            }
        }

        palavra = new String(vetor_caracteres, 0, tamanho);
        boolean ePalindromo = true;

        for (int i = 0, j = palavra.length() - 1; i <= j && ePalindromo; i++, j--) {
            if (palavra.charAt(i) != palavra.charAt(j)) {
                ePalindromo = false;
            }
        }

        System.out.println(ePalindromo ? "é palindromo" : "não é palindromo");
        scanner.close();
    }
}
