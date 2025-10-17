import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio1 {
    static class NomeInvalidoException extends Exception {
        public NomeInvalidoException(String mensagem) {
            super(mensagem);
        }
    }

    static class SalarioInvalidoException extends Exception {
        public SalarioInvalidoException(String mensagem) {
            super(mensagem);
        }
    }

    public static float CalculoFGTS(float salario) {
        return salario * 0.08f;
    }

    public static String validarNome(String nome) throws NomeInvalidoException {
        if (nome.length() < 5 || nome.length() > 50) {
            throw new NomeInvalidoException("O nome deve conter entre 5 e 50 caracteres.");
        }
        if (!nome.matches("[a-zA-ZáéíóúãõâêîôûçÁÉÍÓÚÃÕÂÊÎÔÛÇ ]+")) {
            throw new NomeInvalidoException("O nome não deve conter números ou caracteres inválidos.");
        }
        return nome;
    }
    public static float validarSalario(float salario) throws SalarioInvalidoException {
        if (salario < 1412.00f) {
            throw new SalarioInvalidoException("O salário deve ser igual ou superior a R$ 1412,00.");
        }
        return salario;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nomeFunc = "";
        float salario = 0.0f;

        try {
            boolean nomeValido = false;
            while (!nomeValido) {
                try {
                    System.out.print("Informe seu nome: ");
                    nomeFunc = input.nextLine().trim();
                    validarNome(nomeFunc);
                    nomeValido = true;
                } catch (NomeInvalidoException e) {
                    System.out.println("Erro: " + e.getMessage());
                }
            }
            boolean salarioValido = false;
            while (!salarioValido) {
                try {
                    System.out.print("Informe seu salário: ");
                    salario = input.nextFloat();
                    input.nextLine(); // limpar o buffer
                    validarSalario(salario);
                    salarioValido = true;
                } catch (InputMismatchException e) {
                    System.out.println("Erro: O salário deve ser um número fracionário válido.");
                    input.nextLine(); // limpar entrada incorreta
                } catch (SalarioInvalidoException e) {
                    System.out.println("Erro: " + e.getMessage());
                }
            }

            float fgts = CalculoFGTS(salario);
            System.out.println("\n--- Recibo de Pagamento ---");
            System.out.println("Nome do Funcionário: " + nomeFunc);
            System.out.printf("Salário: R$ %.2f%n", salario);
            System.out.printf("FGTS a ser depositado: R$ %.2f%n", fgts);

        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        } finally {
            System.out.println("\nProcesso finalizado. Obrigado por utilizar o sistema.");
            input.close();
        }
    }
}
