public class Animal {

    // -----------------------------
    // ATRIBUTOS PRIVADOS (ENCAPSULAMENTO)
    // -----------------------------
    private String nomeAnimal;
    private String especieAnimal;
    private String racaAnimal = "SRD";
    private char sexoAnimal; 
    private int dataNascAnimal;
    private String nomeDono;

    // -----------------------------
    // GETTERS E SETTERS PROTEGIDOS
    // -----------------------------

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        if (nomeAnimal == null || nomeAnimal.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do animal não pode ser vazio.");
        }
        this.nomeAnimal = nomeAnimal;
    }

    public String getEspecieAnimal() {
        return especieAnimal;
    }

    public void setEspecieAnimal(String especieAnimal) {
        if (especieAnimal == null || especieAnimal.trim().isEmpty()) {
            throw new IllegalArgumentException("A espécie não pode ser vazia.");
        }
        this.especieAnimal = especieAnimal;
    }

    public String getRacaAnimal() {
        return racaAnimal;
    }

    public void setRacaAnimal(String racaAnimal) {
        if (racaAnimal == null || racaAnimal.trim().isEmpty()) {
            this.racaAnimal = "SRD";
        } else {
            this.racaAnimal = racaAnimal;
        }
    }

    public char getSexoAnimal() {
        return sexoAnimal;
    }

    public void setSexoAnimal(char sexoAnimal) {
        sexoAnimal = Character.toUpperCase(sexoAnimal);
        if (sexoAnimal != 'F' && sexoAnimal != 'M') {
            throw new IllegalArgumentException("O sexo deve ser 'F' ou 'M'.");
        }
        this.sexoAnimal = sexoAnimal;
    }

    public int getDataNascAnimal() {
        return dataNascAnimal;
    }

    public void setDataNascAnimal(int dataNascAnimal) {
        int anoAtual = 2025;
        if (dataNascAnimal < 1900 || dataNascAnimal > anoAtual) {
            throw new IllegalArgumentException("Ano de nascimento inválido.");
        }
        this.dataNascAnimal = dataNascAnimal;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        if (nomeDono == null || nomeDono.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do dono não pode ser vazio.");
        }
        this.nomeDono = nomeDono;
    }

    // -----------------------------
    // MÉTODOS DA CLASSE
    // -----------------------------
    public int calcularIdade() {
        int anoAtual = 2025;
        return anoAtual - dataNascAnimal;
    }

    public void exibirDadosAnimal() {
        System.out.println("Ficha do Animal:");
        System.out.println("Nome: " + nomeAnimal);
        System.out.println("Espécie: " + especieAnimal);
        System.out.println("Raça: " + racaAnimal);
        System.out.println("Sexo: " + (sexoAnimal == 'F' ? "Fêmea" : "Macho"));
        System.out.println("Idade: " + calcularIdade() + " anos");
        System.out.println("Dono: " + nomeDono);
        System.out.println();
    }
}
