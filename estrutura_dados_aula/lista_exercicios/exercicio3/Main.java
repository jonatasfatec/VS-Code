import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ListaProdutos lista = new ListaProdutos();

        System.out.println("---- Cadastro de Produtos ----");

        System.out.print("Quantos produtos deseja inserir? ");
        int qtd = sc.nextInt();
        sc.nextLine(); // limpar buffer

        for (int i = 0; i < qtd; i++) {
            System.out.println("\nProduto " + (i + 1) + ":");

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Categoria: ");
            String categoria = sc.nextLine();

            System.out.print("Preço: ");
            double preco = sc.nextDouble();
            sc.nextLine(); // limpar buffer

            lista.insere(new Produto(nome, categoria, preco));
        }

        System.out.println("\n---- Buscar Produto ----");
        System.out.print("Digite o nome do produto a buscar: ");
        String nomeBusca = sc.nextLine();

        Produto p = lista.buscaPorNome(nomeBusca);

        if (p != null) {
            System.out.println("Produto encontrado: " + p);
        } else {
            System.out.println("Produto não encontrado!");
        }

        sc.close();
    }
}
