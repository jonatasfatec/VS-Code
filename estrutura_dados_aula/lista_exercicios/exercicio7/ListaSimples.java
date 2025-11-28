class No {
    int valor;
    No proximo;

    public No(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
}

class ListaSimples {
    No primeiro;

    public ListaSimples() {
        primeiro = null;
    }

    public void inserirFinal(int valor) {
        No novo = new No(valor);

        if (primeiro == null) {
            primeiro = novo;
        } else {
            No aux = primeiro;
            while (aux.proximo != null) {
                aux = aux.proximo;
            }
            aux.proximo = novo;
        }
    }

    // ⭐ BUSCAR ÍNDICE
    public int buscarIndice(int x) {
        No atual = primeiro;
        int indice = 0;

        System.out.println("\n Iniciando busca pelo valor " + x + "...");

        while (atual != null) {
            System.out.println(
                "Visitando nó (endereço: " + atual + 
                ") | valor = " + atual.valor + 
                " | índice = " + indice
            );

            if (atual.valor == x) {
                System.out.println("Encontrado! Valor " + x + 
                                   " está no índice " + indice + ".");
                return indice;
            }

            atual = atual.proximo;
            indice++;
        }

        System.out.println("Valor " + x + " não encontrado na lista.");
        return -1;
    }

    public void exibir() {
        No aux = primeiro;
        while (aux != null) {
            System.out.print(aux.valor + " -> ");
            aux = aux.proximo;
        }
        System.out.println("null");
    }
}
