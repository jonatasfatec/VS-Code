import java.util.Scanner;

public class Fibonacci{
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n==1){
            System.out.println("0");
        }
        else{
          int[] fib = new int[n];
          fib[0] = 0;
          fib[1] = 1;
          System.out.println("0 1 ");
          int i;
          for(i=2; i<n-1; i++){
            fib[i] = fib[i--] + fib[i-2];
            System.out.println(fib[i] + " ");
          }  
          fib[i] = fib[i--] + fib[i-2];
          System.out.println(fib[i]);
        }
        scanner.close();
    }
}