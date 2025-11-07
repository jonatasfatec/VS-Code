function verificarParOuImpar(event) {
    // Evita o recarregamento do formulário
    event.preventDefault();

    // Obtém o valor inserido pelo usuário
    const numero = parseInt(document.getElementById("numero").value);

    // Valida a entrada
    if (isNaN(numero)) {
        document.getElementById("resultado").textContent = "Por favor, insira um número válido.";
        return;
    }

    // Verifica se o número é par ou ímpar
    const resultado = (numero % 2 === 0) ? "par" : "ímpar";

    // Exibe o resultado
    document.getElementById("resultado").textContent = 
        `O número ${numero} é ${resultado}.`;
}
