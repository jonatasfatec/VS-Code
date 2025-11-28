import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ABB arvore = new ABB();
        Random rand = new Random();

        System.out.println("==== INSERINDO 20 VALORES ALEATÓRIOS ====\n");

        // Inserindo valores aleatórios
        for (int i = 0; i < 20; i++) {
            int valor = rand.nextInt(100);
            System.out.println("\nInserção #" + (i + 1) + ": " + valor);
            arvore.insere(valor);
        }

        System.out.println("\n=========================================\n");

        // Verificação final
        arvore.ehEstritamenteBinaria();

        System.out.println("\nPrograma finalizado.");
    }
}
