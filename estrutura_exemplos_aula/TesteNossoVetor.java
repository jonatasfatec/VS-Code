import java.util.Scanner;

public class TesteNossoVetor {
    public static void main(String[] args) {
        int c;
        NossoVetor nossoVetor;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Querido usuário, indique o tamanho do vetor: ");
        c = scanner.nextInt();
        nossoVetor = new NossoVetor(c);
        //nossoVetor.v[2] = -1;
        nossoVetor.setPosicaoVetor(2, -1);
        for (int i=0; i<nossoVetor.getV().length; i++){
            //System.out.println(nossoVetor.v[i]);
            System.out.println(nossoVetor.getPosicaoVetor(i));
        }
        System.out.println("Nosso Vetor: " + nossoVetor);
        scanner.close();
    }
}
