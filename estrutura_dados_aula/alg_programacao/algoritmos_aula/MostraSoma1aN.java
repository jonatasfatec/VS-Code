import javax.swing.JOptionPane;

public class MostraSoma1aN {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para ser somado de 1 até o N escolhido: "));
        int cont = 1, soma = 0, somaDigito = 0;
        String saida = " ";

        while (n <= 0) {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Deve ser positivo, digite novamente: "));
        }
        while (cont <= n) {
            soma = soma + cont;
            saida = saida + cont + " ";
            cont ++;
        }
        
        while (n > 0){
            JOptionPane.showMessageDialog(null, "Dígito: " + n%10);
            somaDigito += n%10;
            n /= 10;
        }
        JOptionPane.showMessageDialog(null, "Valores:\n" + saida);
        JOptionPane.showMessageDialog(null, "Soma = " + soma);
        JOptionPane.showMessageDialog(null, "Soma dos dígitos = " + somaDigito);
    }
}
