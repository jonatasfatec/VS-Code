function converterMinusculas(event) {
    // Impede o recarregamento da página
    event.preventDefault();

    // Obtém o texto inserido pelo usuário
    const texto = document.getElementById("texto").value;

    // Converte o texto para minúsculas
    const textoMinusculo = texto.toLowerCase();

    // Exibe o resultado
    document.getElementById("resultado").textContent = `Texto em minúsculas:\n${textoMinusculo}`;
}
