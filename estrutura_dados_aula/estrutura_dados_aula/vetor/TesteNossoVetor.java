import java.util.Scanner;
import java.util.Random;

public class TesteNossoVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Qual o tamanho do vetor? ");
        int tamanho = scanner.nextInt();

        // Cria o vetor base
        NossoVetor vetorBase = new NossoVetor(tamanho);

        // Preenche o vetor base com números aleatórios
        for (int i = 0; i < tamanho; i++) {
            vetorBase.setPosicaoVetor(i, random.nextInt(1000)); // valores entre 0 e 999
        }

        // Cria cópias manuais do vetor base
        NossoVetor vetorBubble = new NossoVetor(tamanho);
        NossoVetor vetorInsertion = new NossoVetor(tamanho);
        NossoVetor vetorSelection = new NossoVetor(tamanho);
        NossoVetor vetorQuick = new NossoVetor(tamanho);

        for (int i = 0; i < tamanho; i++) {
            int valor = vetorBase.getPosicaoVetor(i);
            vetorBubble.setPosicaoVetor(i, valor);
            vetorInsertion.setPosicaoVetor(i, valor);
            vetorSelection.setPosicaoVetor(i, valor);
            vetorQuick.setPosicaoVetor(i, valor);
        }

        // ==============================
        // BUBBLE SORT
        // ==============================
        long inicio = System.nanoTime();
        vetorBubble.bubbleSort();
        long fim = System.nanoTime();
        long tempoBubble = fim - inicio;

        // ==============================
        // INSERTION SORT
        // ==============================
        inicio = System.nanoTime();
        vetorInsertion.insertionSort();
        fim = System.nanoTime();
        long tempoInsertion = fim - inicio;

        // ==============================
        // SELECTION SORT
        // ==============================
        inicio = System.nanoTime();
        vetorSelection.selectionSort();
        fim = System.nanoTime();
        long tempoSelection = fim - inicio;

        // ==============================
        // QUICK SORT
        // ==============================
        inicio = System.nanoTime();
        vetorQuick.quickSort(0, tamanho - 1); // chama com os parâmetros exigidos
        fim = System.nanoTime();
        long tempoQuick = fim - inicio;

        // ==============================
        // RESULTADOS
        // ==============================
        System.out.println("\n===== COMPARATIVO DE ALGORITMOS =====");
        System.out.println("Tamanho do vetor: " + tamanho);
        System.out.printf("Bubble Sort:    %d ns (%.3f ms)%n", tempoBubble, tempoBubble / 1_000_000.0);
        System.out.printf("Insertion Sort: %d ns (%.3f ms)%n", tempoInsertion, tempoInsertion / 1_000_000.0);
        System.out.printf("Selection Sort: %d ns (%.3f ms)%n", tempoSelection, tempoSelection / 1_000_000.0);
        System.out.printf("Quick Sort:     %d ns (%.3f ms)%n", tempoQuick, tempoQuick / 1_000_000.0);

        scanner.close();
    }
}
