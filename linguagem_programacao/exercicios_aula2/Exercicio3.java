//Faça um programa que gere uma
//matriz 8X8 preenchendo com ‘1’ as
//“células” da área destacada da
//matriz ao lado, e ‘0’ as demais
//“células”.
public class Exercicio3 {
    public static void main(String[] args) {
        int[][] matriz = new int[8][8];

	System.out.println("A matriz fica: ");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i - j) < 0) {
                    matriz[i][j] = 0;
                } else {
                    matriz[i][j] = 1;
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

