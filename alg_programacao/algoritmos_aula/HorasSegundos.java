import java.util.Scanner;

public class HorasSegundos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h, m, s, seg;
        System.out.println("Digite quantas horas: ");
        h = scanner.nextInt();
        System.out.println("Digite quantos minutos: ");
        m = scanner.nextInt();
        System.out.println("Digite quantos segundos: ");
        s = scanner.nextInt();

        seg = s + m*60 + h*360;
        
        if(h <= 24 && h >= 0 && m <= 59 && m >= 0 && s <= 59 && s >= 0){
            System.out.print("As horas de " + h + ":" + m + ":" + s + " em segundos são: " + seg);
        }else{
            System.out.println("Valores inválidos");
        }
        scanner.close();
    }
}
