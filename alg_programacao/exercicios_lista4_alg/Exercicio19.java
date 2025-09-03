//Faça um vetor de tamanho 50 preenchido com o seguinte valor: (i+ 5 ∗ i)%(i+ 1), sendo i a posicão do elemento no vetor. Em seguida imprima o vetor na tela.
public class Exercicio19 {
    public static void main(String[] args) {
        int[] vetor = new int[50];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (i + 5 * i) % (i + 1);
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("O vetor[" + i + "] = " + vetor[i]);
        }
    }
}
