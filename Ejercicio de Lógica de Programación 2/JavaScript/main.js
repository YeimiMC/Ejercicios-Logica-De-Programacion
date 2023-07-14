//Ejercicio de convertir temperatura

function convertirTemperatura() {
    let input = prompt("Ingrese la temperatura en grados Celsius:");
    let temperaturaCelsius = parseFloat(input);
  
    // Para comprobar si el input es un número válido
    let isInputValid = !isNaN(temperaturaCelsius);
  
    // Se realizan las conversiones de los números válidos
    let temperaturaFahrenheit = isInputValid ? (temperaturaCelsius * 9/5) + 32 : null;
    let temperaturaKelvin = isInputValid ? temperaturaCelsius + 273.15 : null;
  
    // Resultados
    if (isInputValid) {
      console.log("Grados Fahrenheit:", temperaturaFahrenheit);
      console.log("Grados Kelvin:", temperaturaKelvin);
    } else {
      console.log("Error: Ingrese un número válido para la temperatura.");
    }
  }
  
  convertirTemperatura();