import javax.swing.JOptionPane;

public class ComparaNumeros {
    public static void main(String[] args) {
        int num1, num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("digite outro numero"));

        if (num1 > num2) {
            JOptionPane.showMessageDialog(null, "O maior número é " + num1);
        } 
        else if (num2 > num1) {
            JOptionPane.showMessageDialog(null, "O maior número é " + num2);
        }
        else {
            JOptionPane.showMessageDialog(null, "Os dois números possuem o mesmo valor!");
        }
    }
}
