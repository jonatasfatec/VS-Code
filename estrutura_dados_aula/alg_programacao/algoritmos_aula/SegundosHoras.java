import java.util.Scanner;

public class SegundosHoras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seg, h, m, s, resto;
        System.out.println("Digite quantos segundos se quer saber as horas, minutos e segundos:");
        seg = scanner.nextInt();
        h = seg/3600;
        m = (resto = seg%3600)/60;
        s = resto%60;

        System.out.println("As horas são: "+ h);
        System.out.println("Os minutos são: " + m);
        System.out.println("Os segundos são: " + s);
        System.out.println("Isto é, são: " + h + "h" + m +"m" + s + "s");
        scanner.close();
    }
}
