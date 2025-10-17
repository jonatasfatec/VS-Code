// Exceção personalizada
class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}

public class ContaBancaria {

    private double saldo = 500.0;

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Erro: saldo insuficiente para o saque.");
        }
        saldo -= valor;
        System.out.println("Saque realizado. Saldo atual: R$" + saldo);
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        try {
            conta.sacar(800.0);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Operação encerrada.");
        }
    }
}
