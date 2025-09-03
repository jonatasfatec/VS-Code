// Uso do args e como funciona
public class SomaVetor {
    public static void main(String[] args) {

        // todo vetor em java tem um atributo, no caso de java é o length
         int soma = 0;

        // aqui no for, eu mão sei o tamanho da lista
        for (int i = 0; i < args.length; i++){
             int n = Integer.parseInt(args[i]);
            soma = soma + n;
            // System.out.println(args[i]);
        }
        System.out.println(soma);
    }
}
