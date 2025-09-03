import javax.swing.JOptionPane;

public class DescascaN {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro positivo para ser descasacado: "));

        while (n <= 0) {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Deve ser positivo, digite novamente: "));
        }
        while (n > 0){
            JOptionPane.showMessageDialog(null, "Dígito: " + n%10);
            n /= 10;
        }
    }
}
