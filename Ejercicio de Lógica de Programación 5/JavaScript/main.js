

  //Inicia la función
  function adivinarNumeroSecreto() {

    //Número aleatorio entre 1 y 100
    const numeroSecreto = Math.floor(Math.random() * 100) + 1;
    const numerosIngresados = [];
    const intentosMaximos = 5;
    let intentos = 0;
    
    while (intentos < intentosMaximos) {
      let input = prompt("Ingresa un número del 1 al 100 para adivinar el número secreto:");

      //Convertir el número ingresado a un tipo number
      let numeroIngresado = parseInt(input);
        //Validando el número ingresado
      if (Number.isNaN(numeroIngresado)) {
        console.log("Error: Ingresa un número válido.");
        continue;
      }
      
      //Agregar al número ingresado el array de números ingresados
      numerosIngresados.push(numeroIngresado);
      intentos++;
      
      
      if (numeroIngresado === numeroSecreto) {
        console.log("Felicidades, adivinaste el número secreto.");
        break;
      } else if (numeroIngresado < numeroSecreto) {
        console.log("El número secreto es mayor. Sigue intentando.");
      } else {
        console.log("El número secreto es menor. Sigue intentando.");
      }
    }
    
    console.log("Números ingresados: " + numerosIngresados.join(", "));
  }
  
  //Llamar a la función
  adivinarNumeroSecreto();