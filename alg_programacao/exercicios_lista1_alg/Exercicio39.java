//A importancia de R$ 780.000,00 será dividida entre três ganhadores de um concurso. Sendo que da quantia total:
//• O primeiro ganhador recebera 46%;
//• O segundo recebera 32%;
//• O terceiro recebera o restante; 
//Calcule e imprima a quantia ganha por cada um dos ganhadores.

import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        double valorIntegral = 780000.00, valor1, valor2, valor3;
        Scanner scanner = new Scanner(System.in);

        valor1 = valorIntegral * 0.46;
        System.out.println("O primeiro ganhador ganhará " + valor1);
        valor2 = valorIntegral * 0.32;
        System.out.println("O segundo ganhador ganhará " + valor2);
        valor3 = valorIntegral - (valor1 + valor2);
        System.out.print("O terceiro ganhador ganhará " + valor3);
        scanner.close();
    }
}
