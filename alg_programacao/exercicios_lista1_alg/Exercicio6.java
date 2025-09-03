import java.util.Scanner;

public class Exercicio6 {
    public static void main (String[] args){
        double valorCelsius, valorFahrenheit;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um valor que deseja converter de Celsius para Fahrenheit: ");
        valorCelsius = scanner.nextDouble();
        valorFahrenheit = (double)9/5 * valorCelsius + 32;
        System.out.print("O valor em Fahrenheit é: " + valorFahrenheit);
        scanner.close();
    }
}
