import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        int vogais = 0;

        System.out.println("Digite seu primeiro nome, apenas:");
        nome = input.nextLine();
        nome = nome.toLowerCase();

        for (int i = 0; i < nome.length(); i++) {
            char letra = nome.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                vogais++;
            }
        }

        if (vogais == 0) {
            System.out.println("Esse nome não possui vogais a serem contadas!");
        } else {
            System.out.println("O nome possui " + vogais + " vogais.");
        }

        input.close();
    }
}
