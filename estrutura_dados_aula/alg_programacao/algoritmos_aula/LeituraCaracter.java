import java.util.Scanner;

public class LeituraCaracter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra;
        System.out.println("digite uma palavra");
        palavra = scanner.nextLine();
        char primeiraLetra = palavra.charAt(0);
        System.out.println("a palavra é " + palavra);
        System.out.println("a primeira letra é " + primeiraLetra);

        System.out.println("digite uma letra");
        char outraLetra = scanner.nextLine().charAt(0);

        System.out.println("a primeira letra é " + outraLetra);
        scanner.close();
    }
}
