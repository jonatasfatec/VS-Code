import java.util.Scanner;
 
public class TodosDivisores {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println(("Digite um numero positivo: "));
        int n = scanner.nextInt();
 
        while (n < 0) {
            System.out.println(("Digite um numero que seja positivo: "));
            n = scanner.nextInt();
        }
        for (int i=1; i<=n; i = i + 1 ) {
            if (n%i == 0) {
                System.out.println("O número " + i + " e divisor de " + n);
            }
        }
        scanner.close();
    }
}