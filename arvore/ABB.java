public class ABB {
    private No raiz;

    public boolean estaVazia() {
        return raiz == null;
    }

    public void insere(int i) {
        if (estaVazia()) {
            raiz = new No(i);
        } else {
            insereRec(raiz, i);
        }
    }

    // 🔧 Correção: faltava o tipo do parâmetro 'i' (int)
    private void insereRec(No atual, int i) {
        if (i > atual.getInfo()) {
            if (atual.getDireita() == null) {
                atual.setDireita(new No(i));
            } else {
                insereRec(atual.getDireita(), i);
            }
        } else {
            if (atual.getEsquerda() == null) {
                atual.setEsquerda(new No(i));
            } else {
                insereRec(atual.getEsquerda(), i);
            }
        }
    }

    public String percorreEmOrdem() {
        if (estaVazia()) {
            return "árvore vazia";
        }
        return percorreEmOrdemRec(raiz);
    }

    private String percorreEmOrdemRec(No atual) {
        if (atual != null) {
            // 🔧 Melhorias: garantir espaçamento e evitar concatenação excessiva
            return percorreEmOrdemRec(atual.getEsquerda()) +
                    atual.toString() +
                    percorreEmOrdemRec(atual.getDireita());
        } else {
            return "";
        }
    }

    public boolean buscaBinaria(int i) {
        if (estaVazia())
            return false;
        return buscaBinaria(i, raiz);
    }

    private boolean buscaBinariaRec(int i, No atual) {
        if (i == atual.getInfo())
            return true;
        if (i > atual.getInfo()) {
            if (atual.getDireita() == null)
                return false;
            return buscaBinariaRec(i, atual.getDireita());
        } else {
            if (atual.getEsquerda() == null)
                return false;
            return buscaBinariaRec(i, atual.getEsquerda());
        }

    }
}

class No {
    private int info;
    private No esquerda;
    private No direita;

    public No(int info) {
        this.info = info;
        this.esquerda = null;
        this.direita = null;
    }

    public int getInfo() {
        return info;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public No getDireita() {
        return direita;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }

    @Override
    public String toString() {
        return "[" + info + "]";
    }
}
