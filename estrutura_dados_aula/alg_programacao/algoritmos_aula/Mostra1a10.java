import javax.swing.JOptionPane;

public class Mostra1a10 {
    public static void main(String[] args) {
        int cont = 1, soma = 0;
        String saida = " ";

        while(cont <= 10){
            //System.out.println(cont);
            //saida = saida + cont + " ";
            saida = cont + " " + saida;
            soma = soma + cont;
            cont++;
        }
        JOptionPane.showMessageDialog(null, saida);
        JOptionPane.showMessageDialog(null, "soma = " + soma);
    }
}