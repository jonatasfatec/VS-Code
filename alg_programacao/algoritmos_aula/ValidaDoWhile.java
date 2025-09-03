import java.util.Scanner;

public class ValidaDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do{
            System.out.println("Digite um valor positivo: ");
            n = scanner.nextInt();
        } while(n <= 0);
        scanner.close();
    }
}
