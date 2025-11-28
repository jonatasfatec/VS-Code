public class Main {
    public static void main(String[] args) {

        ListaSimples listaOriginal = new ListaSimples();
        listaOriginal.inserirFinal(10);
        listaOriginal.inserirFinal(20);
        listaOriginal.inserirFinal(30);

        // Copiar lista
        ListaSimples copia = listaOriginal.copiar();

        System.out.println("=== LISTA ORIGINAL ===");
        listaOriginal.exibir();
        listaOriginal.exibirComEnderecos();

        System.out.println("=== LISTA COPIADA ===");
        copia.exibir();
        copia.exibirComEnderecos();

        System.out.println("Alterando a lista original (inserindo 99)...");
        listaOriginal.inserirFinal(99);

        System.out.println("\nLISTA ORIGINAL DEPOIS DA ALTERAÇÃO:");
        listaOriginal.exibir();

        System.out.println("LISTA COPIADA DEPOIS DA ALTERAÇÃO DA ORIGINAL:");
        copia.exibir();
    }
}
