import java.util.Scanner;

public class ContaMaiusculas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = input.nextLine();

        int maiusculas = 0;

        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if (Character.isUpperCase(letra)) {
                maiusculas++;
            }
        }

        if (maiusculas == 0) {
            System.out.println("Essa frase não possui letras maiúsculas!");
        } else {
            System.out.println("A frase possui " + maiusculas + " letra(s) maiúscula(s).");
        }

        input.close();
    }
}
