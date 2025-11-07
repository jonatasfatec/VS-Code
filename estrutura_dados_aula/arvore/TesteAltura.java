import java.util.Random;

public class TesteAltura {

    public static void main(String[] args) {
        final int tamanho = 200;
        final int repeticoes = 10; // número de testes para calcular média
        Random rand = new Random();

        int somaAlturaComRep = 0;
        int somaAlturaSemRep = 0;

        for (int t = 1; t <= repeticoes; t++) {
            ABB arvoreComRep = new ABB();
            ABBContagem arvoreSemRep = new ABBContagem();

            for (int i = 0; i < tamanho; i++) {
                int valor = rand.nextInt(100); // valores entre 0 e 99
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

        double mediaCom = (double) somaAlturaComRep / repeticoes;
        double mediaSem = (double) somaAlturaSemRep / repeticoes;

        System.out.println("\n=== RESULTADO FINAL ===");
        System.out.printf("Média altura COM repetição: %.2f\n", mediaCom);
        System.out.printf("Média altura SEM repetição: %.2f\n", mediaSem);
        System.out.println("========================");
    }
}
