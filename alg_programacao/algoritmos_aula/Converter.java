import java.util.Scanner;

public class Converter {
    public static void main (String[] args){
        //declaração de variáveis
        double valorCelsius, valorFahrenheit;
        Scanner scanner = new Scanner(System.in);
        //entrada de dados
        System.out.print("digite valor que deseja converter de Celsius para Fahrenheit: ");
        valorCelsius = scanner.nextDouble();
        //processamento
        valorFahrenheit = (double)9/5 * valorCelsius + 32;
        //saída
        System.out.print("O valor em Fahrenheit é: " + valorFahrenheit);
        scanner.close();
    }
}
