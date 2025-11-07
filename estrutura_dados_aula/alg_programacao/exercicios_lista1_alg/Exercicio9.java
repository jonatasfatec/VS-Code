//Leia uma temperatura em graus Celsius e apresente-a convertida em graus Kelvin. A formula de conversão é: K = C + 273.15, sendo C a temperatura em Celsius e K a temperatura em Kelvin

import java.util.Scanner;

public class Exercicio9 {
    public static void main (String[] args){
        double valorCelsius, valorKelvin;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um valor que deseja converter de Celsius para Kelvin: ");
        valorCelsius = scanner.nextDouble();
        valorKelvin = valorCelsius + 273.15;
        System.out.print("O valor em Kelvin é: " + valorKelvin);
        scanner.close();
    }
}
