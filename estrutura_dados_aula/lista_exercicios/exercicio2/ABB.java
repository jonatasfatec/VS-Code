public class ABB {

    private No raiz;

    public boolean estaVazia() {
        return raiz == null;
    }

    public void insere(int i) {
        if (estaVazia()) {
            raiz = new No(i);
            System.out.println("Inserindo raiz: " + i);
        } else {
            System.out.println("Inserindo: " + i);
            insereRec(raiz, i);
        }
    }

    private void insereRec(No atual, int i) {
        System.out.println(" -> Visitando nó " + atual.getInfo());

        if (i >= atual.getInfo()) {
            System.out.println("   Valor >= " + atual.getInfo() + " → indo para a DIREITA");
            if (atual.getDireita() == null) {
                System.out.println("   Inserido à direita de " + atual.getInfo() + ": " + i);
                atual.setDireita(new No(i));
            } else {
                insereRec(atual.getDireita(), i);
            }
        } else {
            System.out.println("   Valor < " + atual.getInfo() + " → indo para a ESQUERDA");
            if (atual.getEsquerda() == null) {
                System.out.println("   Inserido à esquerda de " + atual.getInfo() + ": " + i);
                atual.setEsquerda(new No(i));
            } else {
                insereRec(atual.getEsquerda(), i);
            }
        }
    }

    public boolean ehEstritamenteBinaria() {
        System.out.println("\n=== Verificando se a árvore é estritamente binária ===\n");
        boolean resultado = ehEstritamenteBinariaRec(raiz);

        if (resultado) {
            System.out.println("\nA árvore É estritamente binária pois **todos os nós possuem 0 ou 2 filhos**,");
            System.out.println("ou seja, não existe nenhum nó com apenas um filho.");
        } else {
            System.out.println("\nA árvore NÃO é estritamente binária pois **foi encontrado um nó com apenas 1 filho**.");
        }

        return resultado;
    }

    private boolean ehEstritamenteBinariaRec(No atual) {
        if (atual == null) return true;

        System.out.println(" -> Analisando nó " + atual.getInfo());

        No esq = atual.getEsquerda();
        No dir = atual.getDireita();

        // Verifica se é proibido
        if ((esq == null && dir != null) || (esq != null && dir == null)) {
            System.out.println("   ERRO: Nó " + atual.getInfo() + " possui APENAS UM filho!");
            return false;
        }

        // Recursão
        return ehEstritamenteBinariaRec(esq) && ehEstritamenteBinariaRec(dir);
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

