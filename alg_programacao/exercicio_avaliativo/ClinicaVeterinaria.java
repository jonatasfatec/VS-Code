import java.util.ArrayList;
import java.util.Scanner;

public class ClinicaVeterinaria {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animais = new ArrayList<>();

        int opcao;

        do {
            System.out.println("===== MENU CLÍNICA VETERINÁRIA =====");
            System.out.println("1 - Cadastrar Animal");
            System.out.println("2 - Listar Animais");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    Animal a = new Animal();
                    try {
                        System.out.print("Nome do Animal: ");
                        a.setNomeAnimal(scanner.nextLine());

                        System.out.print("Espécie do Animal: ");
                        a.setEspecieAnimal(scanner.nextLine());

                        System.out.print("Raça do Animal (vazio = SRD): ");
                        a.setRacaAnimal(scanner.nextLine());

                        System.out.print("Sexo (F/M): ");
                        a.setSexoAnimal(scanner.nextLine().charAt(0));

                        System.out.print("Ano de nascimento: ");
                        a.setDataNascAnimal(scanner.nextInt());
                        scanner.nextLine();

                        System.out.print("Nome do Dono: ");
                        a.setNomeDono(scanner.nextLine());

                        animais.add(a);
                        System.out.println("\nAnimal cadastrado com sucesso!\n");

                    } catch (Exception e) {
                        System.out.println("Erro ao cadastrar: " + e.getMessage());
                        System.out.println("Cadastro cancelado.\n");
                    }
                    break;

                case 2:
                    if (animais.isEmpty()) {
                        System.out.println("\nNenhum animal cadastrado.\n");
                    } else {
                        System.out.println("\n=== LISTA DE ANIMAIS ===");
                        for (Animal ani : animais) {
                            ani.exibirDadosAnimal();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.\n");
            }

        } while (opcao != 3);

        scanner.close();
    }
}
