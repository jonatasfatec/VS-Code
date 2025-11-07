import java.util.Scanner;

public class Entradas{
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite um valor inteiro: ");
        int a = scanner.nextInt();
        System.out.print("digite um double: ");
        double x = scanner.nextDouble();
        System.out.print("digite true para verdadeiro ou false para falso: ");
        boolean eVerdade = scanner.nextBoolean();
        System.out.println("você digitou: \na = " + a + "\nx = " + x + "\neVerdade = " + eVerdade);
        
        scanner.close();
    }
}