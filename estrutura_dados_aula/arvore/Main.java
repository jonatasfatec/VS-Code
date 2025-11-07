// Construir um metodo para cada tarefa a seguir:
//1º Contar o numero de nós de uma arvore
//2º Contar quantas vezes um valor n aparece na arvore
//3º Calcular a altura de uma arvore
//4º Contar os numero de nós folha
//5º Encontrar o maior elemento da arvore e o menor
//6º Calcular a soma dos elementos
//7º Implementar o percurso pré-ordem e pós-ordem
//8º Implementar a arvore binaria sem repeticção, cada nó armazena o elemento e o numero de vezes
//Item B:
// Faça testes com arvores de tamanho 200 com elementos de 0 a 99,
//comparando a altura dos dois modelos(com repetição e sem repetição)

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ABB arvoreRepeticao = new ABB();
        ABBContagem arvoreSemRepeticao = new ABBContagem();

        Random rand = new Random();

        for (int i = 0; i < 200; i++) {
            int valor = rand.nextInt(100); // 0 a 99
            arvoreRepeticao.insere(valor);
            arvoreSemRepeticao.insere(valor);
        }

        System.out.println("=== Árvore COM repetição ===");
        System.out.println("Altura: " + arvoreRepeticao.altura());
        System.out.println("Nós totais: " + arvoreRepeticao.contarNos());
        System.out.println("Folhas: " + arvoreRepeticao.contarFolhas());
        System.out.println("Maior: " + arvoreRepeticao.maior());
        System.out.println("Menor: " + arvoreRepeticao.menor());
        System.out.println("Soma total: " + arvoreRepeticao.soma());

        System.out.println("\n=== Árvore SEM repetição ===");
        System.out.println("Altura: " + arvoreSemRepeticao.altura());

        System.out.println("\nComparação de alturas:");
        System.out.println("Com repetição: " + arvoreRepeticao.altura());
        System.out.println("Sem repetição: " + arvoreSemRepeticao.altura());
    }
}
