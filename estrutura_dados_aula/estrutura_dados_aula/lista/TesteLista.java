public class TesteLista {
    public static void main(String[] args) {
        Lista lista = new Lista();
        System.out.println("Lista criada: " + lista);
        lista.insereInicio(10);
        lista.insereInicio(20);
        lista.insereInicio(30);
        System.out.println("Lista depois das inserções de início!");
        System.out.println(lista);
        System.out.println(lista.removeInicio() + " saiu do início!");
        System.out.println("Lista depois da remoção de início");
        System.out.println(lista);
        lista.insereFim(15);
        lista.insereFim(25);
        lista.insereFim(35);
        
    }
}
