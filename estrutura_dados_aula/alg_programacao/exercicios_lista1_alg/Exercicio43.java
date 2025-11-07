//Escreva um programa de ajuda para vendedores. A partir de um valor total lido, mostre:
//• o total a pagar com desconto de 10%;
//• o valor de cada parcela, no parcelamento de 3× sem juros;
//• a comissao do vendedor, no caso da venda ser a vista (5% sobre o valor com desconto)
//• a comissao do vendedor, no caso da venda ser parcelada (5% sobre o valor total) 

import java.util.Scanner;

public class Exercicio43 {
    public static void main(String[] args) {
        double valorIntegral, parcela, comissao, desconto;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor total a ser pago: ");
        valorIntegral = scanner.nextDouble();

        desconto = valorIntegral * 0.10;
        parcela = valorIntegral / 3;
        comissao = (valorIntegral - desconto) * 0.05;
        double comissaoParcelada = valorIntegral * 0.05;

        System.out.printf("\nO total a pagar com desconto(10%%) é R$%.2f%n", (valorIntegral - desconto));
        System.out.printf("O valor de cada parcela em 3x fica R$%.2f%n", parcela);
        System.out.printf("A comissão do vendedor é de R$%.2f%n", comissao);
        System.out.printf("A comissão caso a venda seja parcelada é R$%.2f%n", comissaoParcelada);

        scanner.close();
    }
}
