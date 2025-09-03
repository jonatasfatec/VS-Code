import java.util.Scanner;

public class LeituraVetor2{
    public static void main(String[] args) {
        int[] n = new int[10];
        Scanner scanner = new Scanner(System.in);
        n[0] = scanner.nextInt();
        System.out.println("N[0] = " + n[0]);

        for(int i=0; i<10; i++){
            n[i]=2*n[i--];
            System.out.println("N[" + i + "] = " + n[i]);
        }
        scanner.close();
    }
}