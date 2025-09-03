//ler um número qualquer e dizer se ele é positivo (>=0) ou negativo(< 0)//

import java.util.Scanner;

public class PositivoNegativo {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        double numero;
        System.out.println("digite um número");
        numero = scanner.nextDouble();
        if (numero >= 0){
            System.out.println(numero + " é positivo");
        }
        else{
            System.out.println(numero + " é negativo");
        }
        scanner.close();
    }
}
