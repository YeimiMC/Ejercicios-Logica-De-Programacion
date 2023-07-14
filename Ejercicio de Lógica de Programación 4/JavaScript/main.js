function generarSerieFibonacci() {
    let input = prompt("Ingrese un número:");
    let numero = parseInt(input);
  
    // Verificar si el input es válido
    let isInputValid = !isNaN(numero);
  
    // Generar la serie de Fibonacci (al comprobar que el input es válido)
    let serieFibonacci = isInputValid ? calcularSerieFibonacci(numero) : null;
  
    // Mostrar la serie de Fibonacci 
    if (isInputValid) {
      console.log("Serie de Fibonacci:", serieFibonacci.join(", "));
    } else {
      console.log("Error: Ingrese un número válido.");
    }
  }
  
  function calcularSerieFibonacci(num) {
    let serie = [];
    if (num >= 1) {
      serie.push(0);
    }
    if (num >= 2) {
      serie.push(1);
    }
    if (num > 2) {
      for (let i = 2; i < num; i++) {
        let numAnterior1 = serie[i - 1];
        let numAnterior2 = serie[i - 2];
        let nuevoNumero = numAnterior1 + numAnterior2;
        serie.push(nuevoNumero);
      }
    }
    return serie;
  }
  
  generarSerieFibonacci();