import java.util.Random;

public class NossoVetor {
    private int[] v;
    private int ocupacao;
    //bloco especial de construção de objetos
    public NossoVetor(int capacidade) {
        v = new int[capacidade];
        ocupacao = 0; //por clareza
    }
    //acessa posição vetor
    public int getPosicaoVetor (int posicao) {
        return v[posicao];
    }
    //altera posição do vetor
    public void setPosicaoVetor (int posicao, int valor) {
        v[posicao] = valor;
    }
    //acessa o vetor
    public int[] getV () {
        return v;
    }
    public boolean estaVazio(){
        return ocupacao == 0;
    }
    public boolean estaCheio(){
        return ocupacao == v.length;
    }
    //inserir um elemento no vetor
    public void insereElemento(int elemento){
        if (estaCheio()) redimensiona(v.length*2);
        v[ocupacao++] = elemento;
    }
    // private void dobra(){
    //     int[] vLocal = new int[v.length*2];
    //     for(int i=0; i<ocupacao; i++){
    //         vLocal[i] = v[i];
    //     }
    //     v = vLocal;
    // }
    // private void reduzirMetade(){
    //     int[] vLocal = new int[v.length/2];
    //     for (int i=0; i<ocupacao; i++){
    //         vLocal[i] = v[i];
    //         v = vLocal;
    //     }
    // }
    
    private void redimensiona(int novoTamanho){
        int[] vLocal = new int[novoTamanho];
        for(int i=0; i<ocupacao; i++){
            vLocal[i] = v[i];
        }
        v = vLocal;
    }
    public int remove () {
        if(!estaVazio()){
            ocupacao--;
            if (v.length > 4 && ocupacao <= v.length/4) redimensiona(v.length/2);
                return v[ocupacao];
        }
        return -1;
    }
    //verificar se um elemento está ou não no vetor
    public boolean contem (int x){
        for (int i=0; i<ocupacao; i++){
            if(v[i] == x){
                return true;
            }
        }
        return false;
    }
    public int tamanho(){
        return ocupacao;
    }
    public void preencheVetor(){
        Random random = new Random();
        for (int i=0; i<v.length; i++){
            v[i] = random.nextInt(v.length*10);
        }
        ocupacao = v.length;
    }
    public void bubbleSort(){
        for(int i=1; i<v.length; i++){
            for(int j=0; j<v.length-1; j++){
                if(v[j]>v[j+1]){
                    int aux = v[j];
                    v[j+1] = aux;
                }
            }
        }
    }
    public int[] clonar(){
        int[] cloneV = v.clone();
        return cloneV; 
    }
    public void selectionSort(){
        for(int i=0; i<v.length; i++){
            int pos = i;
            for(int j=i+1; j<v.length; j++){
                if(v[j]<v[pos]){
                    pos = j;
                }
            }
            if(pos != i){
                int aux = v[pos];
                v[pos] = v[i];
                v[i] = aux;
            }
        }
    }
    public boolean buscaBinaria(int x){
        int ini = 0, fim = v.length-1;
        while(ini<=fim){
            int meio = (ini+fim)/2;
            if(x == v[meio]) return true;
            if(x > v[meio]) ini = meio + 1;
            else fim = meio - 1;
        }
        return false;
    }
    @Override
    public String toString () {
        String s = "tamanho = " + v.length + "\nocupacao = " + ocupacao +"\n";
        for (int i=0; i<v.length; i++) {
            s += v[i] + " ";
        }
        return s;
    }
}