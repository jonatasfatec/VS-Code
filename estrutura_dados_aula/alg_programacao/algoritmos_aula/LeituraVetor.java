import java.util.Scanner;

public class LeituraVetor {
    public static void main(String[] args) {
        int[] x = new int[10];
        Scanner scanner = new Scanner(System.in);
        x[0] = scanner.nextInt();
         
        for (int i=0; i<10; i++){
            x[i] = scanner.nextInt();
        }
        for (int i=0; i<10; i++){
            if(x[i] < 0){
                x[i] = 1;
            }
            System.out.println("X[" + i + "]");
        }
        scanner.close();
    }
}
