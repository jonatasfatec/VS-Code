public class Main {
    public static void main(String[] args) {

        ListaComUltimo lista = new ListaComUltimo();

        // Inserindo elementos no final
        lista.insereFinal(10);
        lista.insereFinal(20);
        lista.insereFinal(30);
        lista.insereFinal(40);

        System.out.println("Lista inicial:");
        lista.exibe();

        // Inserir antes da posição 0 (início)
        lista.insereAntes(0, 5);
        lista.exibe();

        // Inserir antes da posição 2 (meio)
        lista.insereAntes(2, 15);
        lista.exibe();

        // Inserir antes da posição final (equivalente a inserir no fim)
        lista.insereAntes(lista.getTamanho(), 50);
        lista.exibe();
    }
}
