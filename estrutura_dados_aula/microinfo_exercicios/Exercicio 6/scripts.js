function verificarAnoBissexto() {
    // Obtém o ano inserido pelo usuário
    const ano = parseInt(document.getElementById("ano").value);

    // Valida a entrada
    if (isNaN(ano) || ano <= 0) {
        document.getElementById("resultado").textContent = "Por favor, insira um ano válido.";
        return;
    }

    // Verifica se o ano é bissexto
    let mensagem;
    if ((ano % 4 === 0 && ano % 100 !== 0) || ano % 400 === 0) {
        mensagem = `O ano ${ano} é bissexto.`;
    } else {
        mensagem = `O ano ${ano} não é bissexto.`;
    }

    // Exibe o resultado
    document.getElementById("resultado").textContent = mensagem;
}