import java.util.Random;

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

public class Main {
    public static void main(String[] args) {
        ABB abb = new ABB();
        Random random = new Random();
        int n;

        for (int i = 1; i <= 20; i++) {
            n = random.nextInt(100);
            System.out.println(n + " ");
            abb.insere(n);
        }
        System.out.println();
        System.out.println(abb.percorreEmOrdem());
        n = random.nextInt();
        if (abb.buscaBinaria(n)) {
            System.out.println(n + " esta na arvore");
        } else {
            System.out.println(n + " não esta na arvore");
        }
    }
}
