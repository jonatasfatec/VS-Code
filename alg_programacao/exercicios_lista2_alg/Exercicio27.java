//Escreva um programa que, dada a idade de um nadador, classifique-o em uma das seguintes categorias:
//Categoria Idade
//Infantil A 5 a 7
//Infantil B 8 a 10
//Juvenil A 11 a 13
//Juvenil B 14 a 17
//Senior maiores de 18 anos

import javax.swing.JOptionPane;

public class Exercicio27 {

    public static void main(String[] args) {
        int idadeNarrador;
        JOptionPane.showMessageDialog(null, "Classifique um narrador em uma das seguintes categorias:\r\n"
                + "Categoria Idade\r\n"
                + "Infantil A - 5 a 7\r\n"
                + "Infantil B - 8 a 10\r\n"
                + "Juvenil A - 11 a 13\r\n"
                + "Juvenil B - 14 a 17\r\n"
                + "Senior - maiores de 18 anos");
        idadeNarrador = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do narrador"));

        if (idadeNarrador >= 18 && idadeNarrador < 100) {
            JOptionPane.showMessageDialog(null, "Narrador da classificação: Senior\n" + "Um homem de respeito!");
        } else if (idadeNarrador >= 14 && idadeNarrador < 18) {
            JOptionPane.showMessageDialog(null, "Narrador da classificação: Juvenil B\n" + "Juvena ainda hehe!");

        } else if (idadeNarrador >= 11 && idadeNarrador < 14) {
            JOptionPane.showMessageDialog(null, "Narrador da classificação: Juvenil A\n" + "Idade boa pra descobrir novos rumos!");

        } else if (idadeNarrador >= 8 && idadeNarrador < 11) {
            JOptionPane.showMessageDialog(null, "Narrador da classificação: Infantil B\n" + "Pequeno Silvio Luiz está para aparecer :D!");

        } else if (idadeNarrador >= 5 && idadeNarrador < 8) {
            JOptionPane.showMessageDialog(null, "Narrador da classificação: Infantil A\n" + "Nem saiu das fraldas ainda e já está com a boca no trombone!");

        } else if (idadeNarrador >= 0 && idadeNarrador < 5) {
            JOptionPane.showMessageDialog(null, "Não classificado\n" + "Idade não permitida!", "Muito novo", JOptionPane.WARNING_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "Idade não existe ou é muito elevada, tente outra vez!", "Idade inválida", JOptionPane.ERROR_MESSAGE);
        }
    }
}
