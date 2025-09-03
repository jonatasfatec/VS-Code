import javax.swing.JOptionPane;

public class ParaContinua {
    public static void main(String[] args) {
        char opcao = JOptionPane.showInputDialog("Digite P para parar ou C para continuar").charAt(0);
        if(opcao != 'c' && opcao != 'C' && opcao != 'p' && opcao != 'P'){
            JOptionPane.showMessageDialog(null, "Era P ou C bobão!");
        }
        //while(opcao == 'c' || opcao == 'C'){
        while (opcao != 'p' && opcao != 'P') {
            opcao = JOptionPane.showInputDialog("Digite P para parar ou C para continuar").charAt(0);
            if(opcao != 'c' && opcao != 'C' && opcao != 'p' && opcao != 'P'){
                JOptionPane.showMessageDialog(null, "Era P ou C bobão!");
            }
        }
    }
}
