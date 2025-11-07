import java.util.Scanner;

public class ContaEspacos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String frase;
        int espacos = 0;

        System.out.println("Digite uma frase: ");
        frase = input.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if (letra == ' ') {
                espacos++;
            }
        }

        if (espacos == 0) {
            System.out.println("Essa frase não possui espaços a serem contadas!");
        } else {
            System.out.println("A frase possui " + espacos + " espaço(s).");
        }

        input.close();
    }
}
