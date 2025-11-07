import java.util.Scanner;

public class ClassificaLetra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um caracter");
        char caracter = scanner.nextLine().toLowerCase().charAt(0);
        if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
            System.out.println("é uma vogal");
        } else{
            System.out.println("não é uma vogal");
        }
        scanner.close();
    }
}
