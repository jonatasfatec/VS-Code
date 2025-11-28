public class Produto {
    private String nome;
    private String categoria;
    private double preco;

    public Produto(String nome, String categoria, double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    public String getNome() { return nome; }
    public String getCategoria() { return categoria; }
    public double getPreco() { return preco; }

    @Override
    public String toString() {
        return nome + " (" + categoria + ") - R$" + preco;
    }
}

// ------------------------------
// NÓ DA LISTA
// ------------------------------
class NoProduto {
    Produto info;
    NoProduto prox;

    public NoProduto(Produto info) {
        this.info = info;
    }
}

// ------------------------------
// LISTA DE PRODUTOS
// ------------------------------
class ListaProdutos {

    private NoProduto inicio;

    public void insere(Produto p) {
        NoProduto novo = new NoProduto(p);
        novo.prox = inicio;
        inicio = novo;
    }

    public Produto buscaPorNome(String nome) {
        NoProduto atual = inicio;

        while (atual != null) {
            if (atual.info.getNome().equalsIgnoreCase(nome)) {
                return atual.info;
            }
            atual = atual.prox;
        }

        return null;
    }
}
