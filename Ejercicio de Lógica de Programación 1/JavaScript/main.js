// Solicitar tres números al usuario
let num1 = parseFloat(prompt("Ingrese el primer número:"));
let num2 = parseFloat(prompt("Ingrese el segundo número:"));
let num3 = parseFloat(prompt("Ingrese el tercer número:"));

// Verificar si los números son iguales
let areNumbersEqual = num1 === num2 && num2 === num3;

// Ordenar los números de mayor a menor
let numbersDescending = [num1, num2, num3].sort((a, b) => b - a);
let descendingOutput = "Orden descendente: " + numbersDescending.join(", ");

// Ordenar los números de menor a mayor
let numbersAscending = [num1, num2, num3].sort((a, b) => a - b);
let ascendingOutput = "Orden ascendente: " + numbersAscending.join(", ");

// Mostrar los resultados
console.log(descendingOutput);
console.log(ascendingOutput);

// Mostrar un mensaje si los números son iguales
if (areNumbersEqual) {
  console.log("Los números son iguales");
}