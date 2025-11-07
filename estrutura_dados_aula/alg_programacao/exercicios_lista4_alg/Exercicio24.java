import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nome = new String[5];
        double[] altura = new double[5];
        System.out.println("Digite 5 nomes e suas alturas: ");
        for(int i=0; i<5; i++){
            System.out.print("Nome: ");
            nome[i] = scanner.nextLine();
            System.out.print("Altura: ");
            altura[i] = scanner.nextDouble();
            scanner.nextLine(); //sumidouro
        }
        int posBaixo = 0, posAlto = 0;
        for(int i=1; i<5; i++){
            if(altura[i] > altura[posAlto]){
                posAlto = i;
            }else if(altura[i] < altura[posBaixo]){
                posBaixo = i;
            }
        }
        System.out.println("A pessoa mais alta é: " + nome[posAlto] + ", com altura " + altura[posAlto]);
        System.out.println("A pessoa mais baixa é: " + nome[posBaixo] + ", com altura " + altura[posBaixo]);

        scanner.close(); 
    }
}
