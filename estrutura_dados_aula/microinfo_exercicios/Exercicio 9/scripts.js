function converterMaiusculas(event) {
    // Impede o recarregamento da página
    event.preventDefault();

    // Obtém o texto inserido pelo usuário
    const texto = document.getElementById("texto").value;

    // Converte o texto para maiúsculas
    const textoMaiusculo = texto.toUpperCase();

    // Exibe o resultado
    document.getElementById("resultado").textContent = `Texto em maiúsculas:\n${textoMaiusculo}`;
}
