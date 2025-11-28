class NoDuplo {
    int valor;
    NoDuplo anterior;
    NoDuplo proximo;

    public NoDuplo(int valor) {
        this.valor = valor;
        this.anterior = null;
        this.proximo = null;
    }
}

class ListaDupla {
    NoDuplo primeiro;
    NoDuplo ultimo;

    public ListaDupla() {
        primeiro = null;
        ultimo = null;
    }

    // Inserção no final (para testar)
    public void inserirFinal(int valor) {
        NoDuplo novo = new NoDuplo(valor);

        if (primeiro == null) {
            primeiro = novo;
            ultimo = novo;
        } else {
            ultimo.proximo = novo;
            novo.anterior = ultimo;
            ultimo = novo;
        }
    }

    // Mostrar a lista
    public void mostrar() {
        NoDuplo aux = primeiro;
        while (aux != null) {
            System.out.print(aux.valor + " ");
            aux = aux.proximo;
        }
        System.out.println();
    }

    // ⭐ MÉTODO PEDIDO: INVERTER A LISTA DUPLA SEM CRIAR NÓS
    public void inverter() {
        NoDuplo atual = primeiro;
        NoDuplo temp = null;

        // Troca os ponteiros de todos os nós
        while (atual != null) {
            temp = atual.anterior;
            atual.anterior = atual.proximo;
            atual.proximo = temp;
            atual = atual.anterior; // pois agora anterior aponta pro "próximo original"
        }

        // Ao final, temp aponta para o antigo primeiro → que virou último
        if (temp != null) {
            primeiro = temp.anterior; // novo primeiro
        }

        // Atualiza o último também
        atual = primeiro;
        while (atual != null && atual.proximo != null) {
            atual = atual.proximo;
        }
        ultimo = atual;
    }
}
