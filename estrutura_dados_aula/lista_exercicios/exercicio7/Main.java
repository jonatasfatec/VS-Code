public class Main {
    public static void main(String[] args) {

        ListaSimples lista = new ListaSimples();

        lista.inserirFinal(10);
        lista.inserirFinal(20);
        lista.inserirFinal(30);
        lista.inserirFinal(40);
        lista.inserirFinal(50);

        System.out.println("=== LISTA ATUAL ===");
        lista.exibir();

        // Testando
        lista.buscarIndice(30);  // deve encontrar
        lista.buscarIndice(99);  // não deve encontrar
    }
}
