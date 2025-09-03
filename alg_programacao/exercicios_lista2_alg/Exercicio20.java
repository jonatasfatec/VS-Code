//Dados tres valores, A, B, C, verificar se eles podem ser valores dos lados de um triangulo e, se forem, se e um triangulo escaleno, equilátero ou isosceles, considerando os seguintes conceitos:
//• O comprimento de cada lado de um triangulo é menor do que a soma dos outros dois lados.
//• Chama-se equilatero o triangulo que tem tres lados iguais.
//• Denominam-se isosceles o triangulo que tem o comprimento de dois lados iguais.
//• Recebe o nome de escaleno o triangulo que tem os tres lados diferentes.

import javax.swing.JOptionPane;

public class Exercicio20 {

    public static void main(String[] args) {
        int a, b, c;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor pro lado A"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor pro lado B"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor pro lado C"));
        if (a > 0 && b > 0 && c > 0) {
            JOptionPane.showMessageDialog(null, "Os valores são validos");

            if (a < (b + c) && b < (a + c) && c < (a + b)) {
                JOptionPane.showMessageDialog(null, "Os valores correspondem a um triângulo :)");
                if (a == b && a == c && b == c) {
                    JOptionPane.showMessageDialog(null, "Seu triângulo é equilátero :p");
                } else if (a == b || a == c || b == c) {
                    JOptionPane.showMessageDialog(null, "Seu triângulo é isósceles :p");
                } else {
                    JOptionPane.showMessageDialog(null, "Seu triângulo é escaleno :p");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Não é um triângulo!", "Falso triangulo", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Valores inválidos!", "Verificação cancelada", JOptionPane.ERROR_MESSAGE);
        }
    }
}
