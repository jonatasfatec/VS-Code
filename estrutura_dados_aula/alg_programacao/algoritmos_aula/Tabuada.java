import javax.swing.JOptionPane;

public class Tabuada{
    public static void main(String[] args){
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro >= 0: "));
        String saida = "";

        for(int i=0; i<=10; i++){
            saida = saida + n + " x " + i + " = " + i*n +"\n";
        }
        JOptionPane.showMessageDialog(null, saida, "Tabuado do " + n, JOptionPane.PLAIN_MESSAGE);
    }
}