function calcular(event) {
    event.preventDefault();

    const numero1 = parseFloat(document.getElementById("numero1").value);
    const numero2 = parseFloat(document.getElementById("numero2").value);
    const operador = document.getElementById("operador").value;

    if (isNaN(numero1) || isNaN(numero2)) {
        document.getElementById("resultado").textContent = "Por favor, insira números válidos.";
        return;
    }

    let resultado;
    switch (operador) {
        case "+":
            resultado = numero1 + numero2;
            break;
        case "-":
            resultado = numero1 - numero2;
            break;
        case "*":
            resultado = numero1 * numero2;
            break;
        case "/":
            if (numero2 === 0) {
                document.getElementById("resultado").textContent = "Erro: Divisão por zero.";
                return;
            }
            resultado = numero1 / numero2;
            break;
        default:
            document.getElementById("resultado").textContent = "Operador inválido.";
            return;
    }

    document.getElementById("resultado").textContent = 
        `Resultado: ${numero1} ${operador} ${numero2} = ${resultado}`;
}
