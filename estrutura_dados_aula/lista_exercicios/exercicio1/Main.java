import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ABB arvore = new ABB();
        Random rand = new Random();

        // Insere valores aleatórios
        for (int i = 0; i < 20; i++) {
            arvore.insere(rand.nextInt(100));
        }

        // Escolha dos limites A e B
        System.out.print("Digite o valor de A (mínimo): ");
        int a = sc.nextInt();

        System.out.print("Digite o valor de B (máximo): ");
        int b = sc.nextInt();

        System.out.println("\nResultado");
        int total = arvore.contarEntre(a, b);
        System.out.println("\nTotal de valores entre " + a + " e " + b + ": " + total);

        sc.close();
    }
}
