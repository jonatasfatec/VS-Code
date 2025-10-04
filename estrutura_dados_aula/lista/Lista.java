public class Lista {
    private No primeiro;

    public boolean estaVazia(){
        return primeiro == null;
    }

    public void insereInicio(int info){
        No novoNo = new No(info);
        if(!estaVazia()){
            novoNo.setProximo(primeiro);
        }
        primeiro = novoNo;
    }
    public int removeInicio(){
        if (estaVazia()) return -1;
        int temp = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        return temp;
    }

    @Override
    public String toString() {
        String s = "";
        if (estaVazia()) return "Lista Vazia\n";
        else{
            No atual = primeiro;
            while(atual != null){
                s = s + atual + " -> ";
                atual = atual.getProximo();
            }
            s += "\\\\";
        }
        return s + "\n";
    }
    public void insereFim(int info){
        No novoNo = new No(info);
        if(estaVazia()){
            primeiro = novoNo;
        } else{
            No atual = primeiro;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novoNo);
        }
    }
    
    public int removeFim(){
        if (estaVazia()) {
            return -1;
        } else if(primeiro.getProximo() == null) {
            int temp = primeiro.getInfo();
            primeiro = null;
            return temp;
        } else{
            No atual = primeiro;
            while(atual.getProximo().getProximo() != null){
                atual = atual.getProximo();
            }
            int temp = atual.getProximo().getInfo();
            atual.setProximo(null);
            return temp;
        }
    }
    
}
