import java.util.Scanner;

public class ExemploMatriz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A[][] = new int[3][4];
        int i, j;

        System.out.println("Digite os valores da matriz: ");
        for(i=0; i<3; i++){
            for(j=0; j<4; j++){
                A[i][j] = input.nextInt();
            }
        }
        input.close();
}