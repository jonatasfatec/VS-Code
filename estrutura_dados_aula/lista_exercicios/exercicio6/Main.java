public class Main {
    public static void main(String[] args) {

        ListaDupla lista = new ListaDupla();

        lista.inserirFinal(10);
        lista.inserirFinal(20);
        lista.inserirFinal(30);
        lista.inserirFinal(40);

        System.out.println("Lista original:");
        lista.mostrar();

        lista.inverter();

        System.out.println("Lista invertida:");
        lista.mostrar();
    }
}
