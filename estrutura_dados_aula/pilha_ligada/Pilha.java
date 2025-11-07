public class Pilha {
    private No primeiro;

    public boolean push(){
        return primeiro == null;
    }

    public int pop(){
        if (push()) return -1;
        int temp = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        return temp;
    }

    @Override
    public String toString() {
        String s = "";
        if (push()) return "Lista Vazia\n";
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
    
}
