package ejercicio6;

import java.util.Scanner;

public class InvertirTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Solicitar una palabra o frase al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra o frase: ");
        String texto = scanner.nextLine();
        scanner.close();

        // Invertir el texto
        StringBuilder textoInvertido = new StringBuilder(texto);
        textoInvertido.reverse();

        // Mostrar el texto invertido
        System.out.println("Texto invertido: " + textoInvertido.toString());

	}

}
