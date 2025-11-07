import javax.swing.JOptionPane;

public class PositivoNeutroNegativo {
    public static void main(String[] args) {
        double x = Double.parseDouble(JOptionPane.showInputDialog("digite um numero"));
        if(x > 0){
            JOptionPane.showMessageDialog(null, x + " é positivo");
        }
        else if(x < 0) {
            JOptionPane.showMessageDialog(null, x + " é negativo");
        }
        else{
            JOptionPane.showMessageDialog(null,x + " é neutro");
        }
    }
}
