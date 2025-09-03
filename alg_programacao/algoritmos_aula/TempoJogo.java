import java.util.Scanner;

public class TempoJogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hora1, hora2, total;
        System.out.println("Digite a horas em que o jogo começou: ");
        hora1 = scanner.nextInt();
        System.out.println("Digite a horas em que o jogo terminou: ");
        hora2 = scanner.nextInt();

        if(hora1 == hora2){
            System.out.println("O JOGO DUROU 24 HORA(S).");
        } else if(hora1 > hora2){
            total = 24 - hora1 + hora2;
            System.out.println("O JOGO DUROU " + total + " HORA(S).");
        } else{
            total = hora2 - hora1;
            System.out.println("O JOGO DUROU " + total + " HORAS(S).");
        }
        scanner.close();
    }
}
