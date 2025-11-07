//Faça um programa que mostre ao usuario um menu com 4 opcoes de operacoes matemáticas (as básicas, por exemplo). O usuario escolhe uma das opcões e o seu programa entao pede dois valores numericos e realiza a operacao, mostrando o resultado e saindo.

import javax.swing.JOptionPane;

public class Exercicio18 {

    public static void main(String[] args) {
        double num1, num2;
        int opcaoOperacao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das seguintes operações:\n" + "1 - Soma\n" + "2 - Subtração\n" + "3 - Multiplicação\n" + "4 - Divisão"));

        if (opcaoOperacao == 1) {
            num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número real"));
            num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro número real"));
            double soma = num1 + num2;
            JOptionPane.showMessageDialog(null, "A soma dos dois números é " + soma);

        } else if (opcaoOperacao == 2) {
            num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número real"));
            num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro número real"));
            double sub = num1 - num2;
            JOptionPane.showMessageDialog(null, "A subtração dos dois números é " + sub);
        } else if (opcaoOperacao == 3) {
            num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número real"));
            num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro número real"));
            double mult = num1 * num2;
            JOptionPane.showMessageDialog(null, "A multiplicação dos dois números é " + mult);
        } else if (opcaoOperacao == 4) {
            num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número real"));
            num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro número real"));
            double div = num1 / num2;
            JOptionPane.showMessageDialog(null, "A divisão dos dois números é " + String.format("%.2f", div));
        } else {
            JOptionPane.showMessageDialog(null, "opção inválida", "Operação cancelada", JOptionPane.ERROR_MESSAGE);
        }
    }
}
