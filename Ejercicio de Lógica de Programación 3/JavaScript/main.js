function calcularFactorial() {
    let input = prompt("Ingrese un número:");
    let numero = parseInt(input);
  
    // Comprobamos si es un número válido
    let isInputValid = !isNaN(numero);
  
    // Calcular 
    let factorial = isInputValid ? calcularFactorialNumero(numero) : null;
  
    // Mostrar resultado
    if (isInputValid) {
      console.log("Factorial:", factorial);
    } else {
      console.log("Error: Ingrese un número válido.");
    }
  }
  
  function calcularFactorialNumero(num) {
    if (num === 0 || num === 1) {
      return 1;
    } else {
      return num * calcularFactorialNumero(num - 1);
    }
  }
  
  calcularFactorial();