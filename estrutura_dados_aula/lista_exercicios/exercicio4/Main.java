import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ListaProdutos lista = new ListaProdutos();

        System.out.println("---- Cadastro de Produtos ----");

        System.out.print("Quantos produtos deseja inserir? ");
        int qtd = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qtd; i++) {
            System.out.println("\nProduto " + (i + 1) + ":");

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Categoria: ");
            String categoria = sc.nextLine();

            System.out.print("Preço: ");
            double preco = sc.nextDouble();

            System.out.print("Estoque: "); 
            int estoque = sc.nextInt();
            sc.nextLine();

            lista.insere(new Produto(nome, categoria, preco, estoque));
        }

        System.out.println("\nTotal de itens no estoque: " + lista.somaEstoque());

        sc.close();
    }
}
