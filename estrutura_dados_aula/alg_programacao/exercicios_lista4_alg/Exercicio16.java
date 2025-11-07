import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] x = new double[5];
        System.out.println("Digite 5 valores: ");
        for(int i=0; i<5; i++){
            x[i] = scanner.nextDouble();
        }
        System.out.println("Digite um inteiro: ");
        int cod = scanner.nextInt();
        if(cod > 2){
            System.out.println("Código inválido!");
        }else if (cod == 1){
            for(int i=0; i<5; i++){
                System.out.printf("%.3f", x[i]);
            }
        } else if(cod == 2){
            for(int i=4; i>=0; i--){
                System.out.printf("%.3f", x[i]);
            }
        }
        scanner.close();
    }
}
