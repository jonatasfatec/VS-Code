public class VerificaSenha {

    public static void verificarSenha(String senha) throws IllegalArgumentException {
        if (senha.length() < 8) {
            throw new IllegalArgumentException("Senha muito curta! Deve ter pelo menos 8 caracteres.");
        }
        System.out.println("Senha válida!");
    }

    public static void main(String[] args) {
        try {
            verificarSenha("12345");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Validação finalizada.");
        }
    }
}
