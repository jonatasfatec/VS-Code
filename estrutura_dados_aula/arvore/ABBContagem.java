public class ABBContagem {
    private NoContagem raiz;

    public boolean estaVazia() {
        return raiz == null;
    }

    public void insere(int i) {
        if (raiz == null) {
            raiz = new NoContagem(i);
        } else {
            insereRec(raiz, i);
        }
    }

    private void insereRec(NoContagem atual, int i) {
        if (i == atual.getInfo()) {
            atual.incrementar();
        } else if (i < atual.getInfo()) {
            if (atual.getEsquerda() == null) {
                atual.setEsquerda(new NoContagem(i));
            } else {
                insereRec(atual.getEsquerda(), i);
            }
        } else {
            if (atual.getDireita() == null) {
                atual.setDireita(new NoContagem(i));
            } else {
                insereRec(atual.getDireita(), i);
            }
        }
    }

    // 1º Contar o número de nós
    public int contarNos() {
        return contarNosRec(raiz);
    }

    private int contarNosRec(NoContagem atual) {
        if (atual == null) return 0;
        return 1 + contarNosRec(atual.getEsquerda()) + contarNosRec(atual.getDireita());
    }

    // 2º Contar quantas vezes um valor aparece
    public int contarOcorrencias(int valor) {
        return contarOcorrenciasRec(raiz, valor);
    }

    private int contarOcorrenciasRec(NoContagem atual, int valor) {
        if (atual == null) return 0;
        if (valor == atual.getInfo()) return atual.getContagem();
        if (valor < atual.getInfo()) return contarOcorrenciasRec(atual.getEsquerda(), valor);
        return contarOcorrenciasRec(atual.getDireita(), valor);
    }

    // 3º Calcular altura da árvore
    public int altura() {
        return alturaRec(raiz);
    }

    private int alturaRec(NoContagem atual) {
        if (atual == null) return 0;
        return 1 + Math.max(alturaRec(atual.getEsquerda()), alturaRec(atual.getDireita()));
    }

    // 4º Contar nós folha
    public int contarFolhas() {
        return contarFolhasRec(raiz);
    }

    private int contarFolhasRec(NoContagem atual) {
        if (atual == null) return 0;
        if (atual.getEsquerda() == null && atual.getDireita() == null) return 1;
        return contarFolhasRec(atual.getEsquerda()) + contarFolhasRec(atual.getDireita());
    }

    // 5º Maior e menor elemento
    public int maior() {
        NoContagem atual = raiz;
        if (atual == null) throw new IllegalStateException("Árvore vazia");
        while (atual.getDireita() != null) atual = atual.getDireita();
        return atual.getInfo();
    }

    public int menor() {
        NoContagem atual = raiz;
        if (atual == null) throw new IllegalStateException("Árvore vazia");
        while (atual.getEsquerda() != null) atual = atual.getEsquerda();
        return atual.getInfo();
    }

    // 6º Soma dos elementos
    public int soma() {
        return somaRec(raiz);
    }

    private int somaRec(NoContagem atual) {
        if (atual == null) return 0;
        return (atual.getInfo() * atual.getContagem()) +
               somaRec(atual.getEsquerda()) +
               somaRec(atual.getDireita());
    }

    // 7º Percursos
    public String percorreEmOrdem() {
        if (estaVazia()) return "árvore vazia";
        return percorreEmOrdemRec(raiz);
    }

    private String percorreEmOrdemRec(NoContagem atual) {
        if (atual == null) return "";
        return percorreEmOrdemRec(atual.getEsquerda()) +
               atual.toString() +
               percorreEmOrdemRec(atual.getDireita());
    }

    public String percorrePreOrdem() {
        if (estaVazia()) return "árvore vazia";
        return percorrePreOrdemRec(raiz);
    }

    private String percorrePreOrdemRec(NoContagem atual) {
        if (atual == null) return "";
        return atual.toString() +
               percorrePreOrdemRec(atual.getEsquerda()) +
               percorrePreOrdemRec(atual.getDireita());
    }

    public String percorrePosOrdem() {
        if (estaVazia()) return "árvore vazia";
        return percorrePosOrdemRec(raiz);
    }

    private String percorrePosOrdemRec(NoContagem atual) {
        if (atual == null) return "";
        return percorrePosOrdemRec(atual.getEsquerda()) +
               percorrePosOrdemRec(atual.getDireita()) +
               atual.toString();
    }

    // Classe interna NoContagem
    static class NoContagem {
        private int info;
        private int contagem;
        private NoContagem esquerda, direita;

        public NoContagem(int info) {
            this.info = info;
            this.contagem = 1;
        }

        public int getInfo() { return info; }
        public int getContagem() { return contagem; }
        public NoContagem getEsquerda() { return esquerda; }
        public NoContagem getDireita() { return direita; }
        public void setEsquerda(NoContagem e) { esquerda = e; }
        public void setDireita(NoContagem d) { direita = d; }
        public void incrementar() { contagem++; }

        @Override
        public String toString() {
            return "[" + info + " x" + contagem + "]";
        }
    }
}
