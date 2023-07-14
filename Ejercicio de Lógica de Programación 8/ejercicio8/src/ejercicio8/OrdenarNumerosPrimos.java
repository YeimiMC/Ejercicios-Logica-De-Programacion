package ejercicio8;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenarNumerosPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		//Array para almacenar los números ingresados
        int[] numeros = new int[10]; 

        //Se solicita al usuario 10 números:
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        //Llamamos al método para ordenar los números primos:
        ordenarNumerosPrimos(numeros); 

        // Mostrar el array con los números primos al inicio
        System.out.println("Array ordenado:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("pos[" + i + "] = " + numeros[i]);
        }
        
        //Cerramos el scanner
        scanner.close();
    }

	//Para ordenar, mover e intercambiar los números primos que nos arroje el array
    public static void ordenarNumerosPrimos(int[] numeros) {
        int contadorPrimos = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (esPrimo(numeros[i])) {
                int temp = numeros[contadorPrimos];
                numeros[contadorPrimos] = numeros[i];
                numeros[i] = temp;

                contadorPrimos++; 
            }
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;

	}

}
