public class Produto {
    private String nome;
    private String categoria;
    private double preco;
    private int estoque; 

    public Produto(String nome, String categoria, double preco, int estoque) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome() { return nome; }
    public String getCategoria() { return categoria; }
    public double getPreco() { return preco; }
    public int getEstoque() { return estoque; }

    @Override
    public String toString() {
        return nome + " (" + categoria + ") - R$" + preco + " | Estoque: " + estoque;
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

    // ====================================================
    // MÉTODO PEDIDO: SOMA TOTAL DO ESTOQUE
    // ====================================================
    public int somaEstoque() {
        int soma = 0;
        NoProduto atual = inicio;

        while (atual != null) {
            soma += atual.info.getEstoque();
            atual = atual.prox;
        }

        return soma;
    }
}
