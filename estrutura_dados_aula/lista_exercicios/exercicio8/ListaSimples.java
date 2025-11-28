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

    // ⭐ COPIAR (deep copy)
    public ListaSimples copiar() {
        ListaSimples novaLista = new ListaSimples();
        No aux = this.primeiro;

        while (aux != null) {
            novaLista.inserirFinal(aux.valor);
            aux = aux.proximo;
        }

        return novaLista;
    }

    // Exibir valores
    public void exibir() {
        No aux = primeiro;
        while (aux != null) {
            System.out.print(aux.valor + " -> ");
            aux = aux.proximo;
        }
        System.out.println("null");
    }

    // ⭐ Exibir nós com hash para diferenciar
    public void exibirComEnderecos() {
        No aux = primeiro;
        while (aux != null) {
            System.out.println("Valor: " + aux.valor + " | Nó: " + aux);
            aux = aux.proximo;
        }
        System.out.println();
    }
}
