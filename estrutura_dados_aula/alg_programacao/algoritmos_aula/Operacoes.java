public class Operacoes{
	public static void main(String[] args){
		int a = 17, b = 3;
		System.out.println("Soma: " + (a + b));
		System.out.println("Subtração: " + (a - b) + "\n");
		System.out.println("Multiplicação: " + a * b);
		System.out.println("Divisão: " + a / b);
		System.out.println(a + " resto " + b + " = " + a % b + "\n");
		
		double x = a / b;
		
		System.out.println("X = " + x);
		
		x = (double) a / b;
		System.out.println("X com casting: " + x);
	}
}