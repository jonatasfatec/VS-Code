import java.util.Scanner;

public class Exercicio4 {

    public static void verificarTempo(int tempo) {
        int horas = tempo / 3600;
        int resto = tempo % 3600;
        int minutos = resto / 60;
        int segundos = resto % 60;

        System.out.println(tempo + " segundo(s) equivalem a " 
                           + horas + " hora(s), " 
                           + minutos + " minuto(s) e " 
                           + segundos + " segundo(s)");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o tempo em segundos: ");
        int segundos = input.nextInt();

        verificarTempo(segundos);

        input.close();
    }
}
