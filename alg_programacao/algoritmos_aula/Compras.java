import javax.swing.JOptionPane;

public class Compras {
    public static void main(String[] args) {
        double valorCompra = Double.parseDouble(JOptionPane.showInputDialog("digite o valor da sua compra"));
        int opcaoPagamento = Integer.parseInt(JOptionPane.showInputDialog("Qual forma de pagamento:\n" + "1 - a vista\n" + "2 - a prazo"));

        if (opcaoPagamento == 1) {
            int pixBoleto = Integer.parseInt(JOptionPane.showInputDialog("Digite:\n" + "1 - PIX\n" + "2 - Boleto"));
            double desconto;

            if (pixBoleto == 1) {
                desconto = 0.10 * valorCompra;
            } else {
                desconto = 0.05 * valorCompra;
            }
            JOptionPane.showMessageDialog(null,
                    "desconto = R$" + desconto + "\nvalor a pagar = R$" + (valorCompra - desconto));
        } else if (opcaoPagamento == 2) {
            int numeroParcelas = Integer.parseInt(JOptionPane.showInputDialog("Escolha 2 ou 3 parcelas!"));
            double acrescimo;

            if (numeroParcelas == 2) {
                acrescimo = 0.05 * valorCompra;
            } else {
                acrescimo = 0.10 * valorCompra;
            }
            JOptionPane.showMessageDialog(null,
                    "Acrescimo = R$" + acrescimo + "\nValor a pagar = R$" + (valorCompra + acrescimo));
        } else {
            JOptionPane.showMessageDialog(null, "opção inválida", "Compra cancelada", JOptionPane.ERROR_MESSAGE);
        }
    }
}