function verificarHabilitacao(event) {
    // Impede o recarregamento da página
    event.preventDefault();

    // Obtém a idade do usuário
    const idade = parseInt(document.getElementById("idade").value);

    // Valida a entrada
    if (isNaN(idade) || idade <= 0) {
        document.getElementById("resultado").textContent = "Por favor, insira uma idade válida.";
        return;
    }

    // Verifica se a pessoa pode dirigir
    const mensagem = idade >= 18 
        ? "Você tem idade suficiente para dirigir!" 
        : "Você ainda não pode dirigir.";

    // Exibe o resultado
    document.getElementById("resultado").textContent = mensagem;
}
