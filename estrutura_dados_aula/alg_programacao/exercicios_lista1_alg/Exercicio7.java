import java.util.Scanner;

public class Exercicio7 {
    public static void main (String[] args){
        double valorCelsius, valorFahrenheit;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor que deseja converter de Fahrenheit para Celsius: ");
        valorFahrenheit = scanner.nextDouble();
        valorCelsius = 5.0 * (valorFahrenheit - 32)/9.0;
        System.out.print("O valor em Celsius é: " + valorCelsius);
        scanner.close();
    }
}
