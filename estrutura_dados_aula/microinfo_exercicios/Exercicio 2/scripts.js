function converterTemperatura() {
    const celsius = parseFloat(document.getElementById("celsius").value);

    if (isNaN(celsius)) {
        document.getElementById("resultado").textContent = "Por favor, insira um número válido.";
        return;
    }

    const fahrenheit = (celsius * 9 / 5) + 32;

    document.getElementById("resultado").textContent = 
        `${celsius}°C equivalem a ${fahrenheit.toFixed(2)}°F.`;
}
