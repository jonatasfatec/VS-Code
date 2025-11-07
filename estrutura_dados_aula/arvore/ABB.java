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

    private void insereRec(No atual, int i) {
        if (i >= atual.getInfo()) { // permite repetição
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

    // ----------- 1º Contar o número de nós -----------
    public int contarNos() {
        return contarNosRec(raiz);
    }

    private int contarNosRec(No atual) {
        if (atual == null) return 0;
        return 1 + contarNosRec(atual.getEsquerda()) + contarNosRec(atual.getDireita());
    }

    // ----------- 2º Contar quantas vezes um valor aparece -----------
    public int contarOcorrencias(int valor) {
        return contarOcorrenciasRec(raiz, valor);
    }

    private int contarOcorrenciasRec(No atual, int valor) {
        if (atual == null) return 0;
        int cont = (atual.getInfo() == valor) ? 1 : 0;
        return cont + contarOcorrenciasRec(atual.getEsquerda(), valor) + contarOcorrenciasRec(atual.getDireita(), valor);
    }

    // ----------- 3º Calcular altura da árvore -----------
    public int altura() {
        return alturaRec(raiz);
    }

    private int alturaRec(No atual) {
        if (atual == null) return 0;
        return 1 + Math.max(alturaRec(atual.getEsquerda()), alturaRec(atual.getDireita()));
    }

    // ----------- 4º Contar nós folha -----------
    public int contarFolhas() {
        return contarFolhasRec(raiz);
    }

    private int contarFolhasRec(No atual) {
        if (atual == null) return 0;
        if (atual.getEsquerda() == null && atual.getDireita() == null) return 1;
        return contarFolhasRec(atual.getEsquerda()) + contarFolhasRec(atual.getDireita());
    }

    // ----------- 5º Maior e menor elemento -----------
    public int maior() {
        No atual = raiz;
        if (atual == null) throw new IllegalStateException("Árvore vazia");
        while (atual.getDireita() != null) atual = atual.getDireita();
        return atual.getInfo();
    }

    public int menor() {
        No atual = raiz;
        if (atual == null) throw new IllegalStateException("Árvore vazia");
        while (atual.getEsquerda() != null) atual = atual.getEsquerda();
        return atual.getInfo();
    }

    // ----------- 6º Soma dos elementos -----------
    public int soma() {
        return somaRec(raiz);
    }

    private int somaRec(No atual) {
        if (atual == null) return 0;
        return atual.getInfo() + somaRec(atual.getEsquerda()) + somaRec(atual.getDireita());
    }

    // ----------- 7º Percursos -----------
    public String percorreEmOrdem() {
        if (estaVazia()) return "árvore vazia";
        return percorreEmOrdemRec(raiz);
    }

    private String percorreEmOrdemRec(No atual) {
        if (atual == null) return "";
        return percorreEmOrdemRec(atual.getEsquerda()) +
               atual.toString() +
               percorreEmOrdemRec(atual.getDireita());
    }

    public String percorrePreOrdem() {
        if (estaVazia()) return "árvore vazia";
        return percorrePreOrdemRec(raiz);
    }

    private String percorrePreOrdemRec(No atual) {
        if (atual == null) return "";
        return atual.toString() +
               percorrePreOrdemRec(atual.getEsquerda()) +
               percorrePreOrdemRec(atual.getDireita());
    }

    public String percorrePosOrdem() {
        if (estaVazia()) return "árvore vazia";
        return percorrePosOrdemRec(raiz);
    }

    private String percorrePosOrdemRec(No atual) {
        if (atual == null) return "";
        return percorrePosOrdemRec(atual.getEsquerda()) +
               percorrePosOrdemRec(atual.getDireita()) +
               atual.toString();
    }

    // ----------- Busca binária -----------
    public boolean buscaBinaria(int i) {
        if (estaVazia()) return false;
        return buscaBinariaRec(i, raiz);
    }

    private boolean buscaBinariaRec(int i, No atual) {
        if (atual == null) return false;
        if (i == atual.getInfo()) return true;
        if (i > atual.getInfo()) return buscaBinariaRec(i, atual.getDireita());
        else return buscaBinariaRec(i, atual.getEsquerda());
    }
}
class No {
    private int info;
    private No esquerda;
    private No direita;

    public No(int info) {
        this.info = info;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
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

