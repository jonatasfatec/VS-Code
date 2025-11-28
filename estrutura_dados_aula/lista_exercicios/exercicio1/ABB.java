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
        if (i >= atual.getInfo()) {
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

    public int contarEntre(int a, int b) {
        System.out.println("\nINICIANDO CONTAGEM ENTRE " + a + " E " + b + "\n");
        return contarEntreRec(raiz, a, b);
    }

    private int contarEntreRec(No atual, int a, int b) {
        if (atual == null) return 0;

        int valor = atual.getInfo();

        System.out.println("Visitando nó: " + valor);

        // Caso esteja dentro do intervalo
        if (valor >= a && valor <= b) {
            System.out.println(" → " + valor + " está dentro do intervalo. CONTANDO.");
            return 1
                + contarEntreRec(atual.getEsquerda(), a, b)
                + contarEntreRec(atual.getDireita(), a, b);
        }

        // Se valor menor que A → ignora esquerda
        if (valor < a) {
            System.out.println(" → " + valor + " é menor que " + a + ". Indo somente para a DIREITA.");
            return contarEntreRec(atual.getDireita(), a, b);
        }

        // Se valor maior que B → ignora direita
        System.out.println(" → " + valor + " é maior que " + b + ". Indo somente para a ESQUERDA.");
        return contarEntreRec(atual.getEsquerda(), a, b);
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

