//Leia uma temperatura em graus Kelvin e apresente-a convertida em graus Celsius. A formula de conversão é: C = K − 273.15, sendo C a temperatura em Celsius e K a temperatura em Kelvin
import java.util.Scanner;

public class Exercicio8 {
    public static void main (String[] args){
        double valorCelsius, valorKelvin;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um valor que deseja converter de Kelvin para Celsius: ");
        valorKelvin = scanner.nextDouble();
        valorCelsius = valorKelvin - 273.15;
        System.out.print("O valor em Celsius é: " + valorCelsius);
        scanner.close();
    }
}
