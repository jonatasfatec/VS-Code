import java.util.Scanner;
 
public class Divisor {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Digite um inteiro: ");
        int n1 = scanner.nextInt();
        System.out.print ("Digite um inteiro: ");
        int n2 = scanner.nextInt();
        if (n1 % n2 == 0) {
            System.out.println("O número " + n2 + " e divisor de " + n1);
        }
        else{
            System.out.println("O número " + n2 + " nao e divisor de " + n1);
        }
     scanner.close();  
    }
   
}