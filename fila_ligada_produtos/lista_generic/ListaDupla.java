public class ListaDupla <E>{
    private No<E> primeiro;
    private No<E> ultimo;

    public boolean estaVazia(){
        return primeiro == null;
    }

    public void insereInicio(E elemento){
        No novo = new No<E>(elemento);
        if(estaVazia()){
            primeiro = novo;
        } else{     
            novo.setAnterior(ultimo);
            primeiro.setProximo(novo);
        }
        ultimo = novo;
    }
    public void insereFim(E elemento){
        No novo = new No<E>(elemento);
        if(estaVazia()){
            primeiro = novo;
        } else{
            novo.setAnterior(ultimo);
            ultimo.setProximo(novo);
        }
        ultimo = novo;
    }
    public E removeInicio(){
        if(estaVazia()) return null;
        E temp = primeiro.getElemento();
        if(primeiro == ultimo){
            primeiro = null;
            ultimo = null;
        } else{
            primeiro = primeiro.getProximo();
            primeiro.setAnterior(null);
        }
        return temp;
    }

    public E removeFim(){
        return null;
    }

    @Override
    public String toString(){
        if(estaVazia()) return "lista vazia";
        No<E> runner = primeiro;
        String s = "//<-";
        while (runner != null){
            s += runner + " <=> ";
            runner = runner.getProximo();
        }
        s += s + runner + "->//";
        return s;
    }
}