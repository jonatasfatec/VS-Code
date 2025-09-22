import java.util.Scanner;

public class Histograma {
    public static void imprimirHistograma(char letra, int quantidade) {
        System.out.print(letra + ": ");
        for (int k = 0; k < quantidade; k++) {
            System.out.print("*");
        }
        System.out.println(" (" + quantidade + ")");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma frase, sem acentuação: ");
        String frase = input.nextLine();
        frase = frase.toLowerCase();

        int a = 0, e = 0, i = 0, o = 0, u = 0;

        for (int j = 0; j < frase.length(); j++) {
            char letra = frase.charAt(j);
            if (letra == 'a') {
                a++;
            } else if (letra == 'e') {
                e++;
            } else if (letra == 'i') {
                i++;
            } else if (letra == 'o') {
                o++;
            } else if (letra == 'u') {
                u++;
            }
        }
        imprimirHistograma('a', a);
        imprimirHistograma('e', e);
        imprimirHistograma('i', i);
        imprimirHistograma('o', o);
        imprimirHistograma('u', u);

        input.close();
    }
}
