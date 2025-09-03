import javax.swing.JOptionPane;

public class CaixasDialogo {
    public static void main(String[] args) {
        //entrada
        String s = JOptionPane.showInputDialog("digite um inteiro");
        int i = Integer.parseInt(s);

        double x = Double.parseDouble(
            JOptionPane.showInputDialog("digite um double")
        );

        char letra = JOptionPane.showInputDialog("digite uma letra").charAt(0);

        //saída
        JOptionPane.showMessageDialog(null, "o valor inteiro é " + i);
        JOptionPane.showMessageDialog(null, "o valor real é " + x);
        JOptionPane.showMessageDialog(null, "a letra digitada foi " + letra, "resultado", JOptionPane.WARNING_MESSAGE);
    }
}
