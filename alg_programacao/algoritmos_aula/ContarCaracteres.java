//Ler uma sequencia de caracteres e contar quantos são vogais, digitos e outros (Ainda não é sobre string!!)


import java.util.Scanner;

public class ContarCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String entrada = scanner.nextLine().toLowerCase();

        // Vetor de caracteres baseado na entrada
        char[] vetor_caracteres = new char[entrada.length()];
        for (int i = 0; i < entrada.length(); i++) {
            vetor_caracteres[i] = entrada.charAt(i);
        }

        // Eliminar os espaços da string (mesma lógica do palíndromo)
        int tamanho = vetor_caracteres.length;
        for (int i = vetor_caracteres.length - 1; i >= 0; i--) {
            if (vetor_caracteres[i] == ' ') {
                for (int j = i; j < tamanho - 1; j++) {
                    vetor_caracteres[j] = vetor_caracteres[j + 1];
                }
                tamanho--;
            }
        }

        entrada = new String(vetor_caracteres, 0, tamanho);

        // Contadores
        int vogais = 0;
        int digitos = 0;
        int outros = 0;

        for (int i = 0; i < entrada.length(); i++) {
            char c = entrada.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vogais++;
            } else if (Character.isDigit(c)) {
                digitos++;
            } else {
                outros++;
            }
        }

        // Resultado final
        System.out.println("Vogais: " + vogais);
        System.out.println("Dígitos: " + digitos);
        System.out.println("Outros caracteres: " + outros);

        scanner.close();
    }
}
