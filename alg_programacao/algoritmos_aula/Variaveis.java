public class Variaveis{
	public static void main(String[] args){
		//declaração e atribuição de valores a variáveis
		int anoNascimento = 2000, numeroSapato;
		double valorTotal, taxaJuros;
		char opcao;
		boolean eNovo;
		
		numeroSapato = 36;
		taxaJuros = 0.07;
		valorTotal = 3000 + taxaJuros * 2000;
		eNovo = true;
		
		opcao ='a';
		
		String nome = "Jonatas";
		String sobrenome = "David";
		
		String nomeCompleto = nome + " " + sobrenome;
		
		int a = 10, b = 15;
		int c = a + b;
		
		System.out.println ("Eu sou " + nomeCompleto);
		
		System.out.println (a + " + " + b + " = " + c);
		
		System.out.println ("A taxa é " + taxaJuros*100 + "%");
	}
}

