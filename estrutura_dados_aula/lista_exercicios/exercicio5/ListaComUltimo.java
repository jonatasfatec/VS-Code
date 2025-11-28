class No {
    int info;
    No prox;

    public No(int info) {
        this.info = info;
    }
}

public class ListaComUltimo {

    private No inicio;
    private No ultimo;
    private int tamanho;

    public boolean estaVazia() {
        return inicio == null;
    }

    public int getTamanho() {
        return tamanho;
    }

    // Insere no final normalmente (facilita testes)
    public void insereFinal(int valor) {
        No novo = new No(valor);

        if (estaVazia()) {
            inicio = ultimo = novo;
        } else {
            ultimo.prox = novo;
            ultimo = novo;
        }

        tamanho++;
    }

    // ===================================================================
    //    MÉTODO PEDIDO: INSERIR ANTES DE UMA POSIÇÃO DA LISTA
    // ===================================================================
    public void insereAntes(int pos, int valor) {

        // posição inválida
        if (pos < 0 || pos > tamanho) {
            System.out.println("Posição inválida! Nenhuma inserção realizada.");
            return;
        }

        No novo = new No(valor);

        // Caso 1: inserir no início (pos = 0)
        if (pos == 0) {
            novo.prox = inicio;
            inicio = novo;

            // se a lista estava vazia, o último também muda
            if (tamanho == 0) {
                ultimo = novo;
            }

            tamanho++;
            return;
        }

        // Caso 2: inserir no final (pos == tamanho)
        if (pos == tamanho) {
            ultimo.prox = novo;
            ultimo = novo;
            tamanho++;
            return;
        }

        // Caso 3: inserir no meio
        No atual = inicio;
        No anterior = null;
        int contador = 0;

        while (contador < pos) {
            anterior = atual;
            atual = atual.prox;
            contador++;
        }

        anterior.prox = novo;
        novo.prox = atual;

        tamanho++;
    }

    // Método para exibir lista
    public void exibe() {
        No atual = inicio;

        while (atual != null) {
            System.out.print(atual.info + " -> ");
            atual = atual.prox;
        }

        System.out.println("null");
    }
}
