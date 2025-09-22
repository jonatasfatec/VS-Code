import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String textoOriginal;
        String textoModificado = "";
        int contador = 0;

        System.out.println("Digite uma frase ou palavra:");
        textoOriginal = input.nextLine();

        for (int i = 0; i < textoOriginal.length(); i++) {
            char caractere = textoOriginal.charAt(i);
            if (caractere == 'a') {
                textoModificado += '*';
                contador++;
            } else {
                textoModificado += caractere;
            }
        }

        System.out.println("Texto modificado: " + textoModificado);

        if (contador == 0) {
            System.out.println("Nenhum caractere 'a' foi encontrado.");
        } else {
            System.out.println("Total de caracteres 'a' substituídos: " + contador);
        }

        input.close();
    }
}
