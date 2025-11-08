import java.util.Random;

public class TesteAltura {
    public static void main(String[] args) {
        final int tamanho = 200;
        final int repeticoes = 10;
        Random rand = new Random();

        int somaAlturaComRep = 0;
        int somaAlturaSemRep = 0;

        for (int t = 1; t <= repeticoes; t++) {
            ABB arvoreComRep = new ABB();
            ABBsemRepeticao arvoreSemRep = new ABBsemRepeticao();

            for (int i = 0; i < tamanho; i++) {
                int valor = rand.nextInt(100);
                arvoreComRep.insere(valor);
                arvoreSemRep.insere(valor);
            }

            int alturaCom = arvoreComRep.altura();
            int alturaSem = arvoreSemRep.altura();

            somaAlturaComRep += alturaCom;
            somaAlturaSemRep += alturaSem;

            System.out.printf("Teste %d:\n", t);
            System.out.println("Altura COM repetição:  " + alturaCom);
            System.out.println("Altura SEM repetição:  " + alturaSem);
            System.out.println("----------------------------");
        }
    }
}
