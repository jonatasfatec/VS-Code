import java.util.Scanner;
public class SequenciaDoUsuario{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um inteiro >= 0: ");
        int n = scanner.nextInt();
        while(n < 0){
            System.out.print("o valor deve ser >= 0: ");
            n = scanner.nextInt();
        }
        if(n % 2 == 0){
            for (int i=0; i <= n; i++){
                System.out.println(i);
            }
        } else{
            for (int i=1; i<=n; i++){
                System.out.println(i);
            }
        }
        scanner.close();
    }
}