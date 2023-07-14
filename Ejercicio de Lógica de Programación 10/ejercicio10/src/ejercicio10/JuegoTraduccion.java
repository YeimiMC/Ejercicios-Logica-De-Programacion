package ejercicio10;

//Importaciones
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class JuegoTraduccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashMap para crear el diccionario con palabras en español e inglés
        HashMap<String, String> diccionario = crearDiccionario();

        //Seleccionar palabras al azar del diccionario:
        String[] palabrasElegidas = seleccionarPalabras(diccionario, 5);

        //Contador de respuestas correctas e incorrectas:
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Juego de Traducción Español-Inglés!");
        

        //Iteración:
        for (String palabra : palabrasElegidas) {
            System.out.println("Traduce la palabra '" + palabra + "' al inglés:");
            String traduccionCorrecta = diccionario.get(palabra);

            //Leer respuesta del usuario:
            String respuesta = scanner.nextLine();

            //Comparar la respuesta con la traducción:
            if (respuesta.equalsIgnoreCase(traduccionCorrecta)) {
                System.out.println("¡Respuesta correcta!");
                respuestasCorrectas++;
            } else {
                System.out.println("Respuesta incorrecta. La traducción correcta es: " + traduccionCorrecta);
                respuestasIncorrectas++;
            }

            System.out.println();
        }

        //Mostrar los resultados del juego
        System.out.println("Juego finalizado. Resultados:");
        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);

        //Cerrar el objeto Scanner
        scanner.close();
    }

    //Método HashMap colocar palabras en el diccionario en español e inglés
    public static HashMap<String, String> crearDiccionario() {
        HashMap<String, String> diccionario = new HashMap<>();

        //Agregamos las palabras al diccionario
        diccionario.put("casa", "house");
        diccionario.put("sol", "sun");
        diccionario.put("libro", "book");
        diccionario.put("perro", "dog");
        diccionario.put("lápiz", "pencil");
        diccionario.put("gato", "cat");
        diccionario.put("árbol", "tree");
        diccionario.put("coche", "car");
        diccionario.put("ciudad", "city");
        diccionario.put("mesa", "table");
        diccionario.put("manzana", "apple");
        diccionario.put("río", "river");
        diccionario.put("montaña", "mountain");
        diccionario.put("teléfono", "phone");
        diccionario.put("nube", "cloud");
        diccionario.put("playa", "beach");
        diccionario.put("luna", "moon");
        diccionario.put("computadora", "computer");
        diccionario.put("silla", "chair");
        diccionario.put("mar", "sea");

        return diccionario;
    }

    //Método para seleccionar palabras al azar del diccionario
    public static String[] seleccionarPalabras(HashMap<String, String> diccionario, int cantidad) {
        String[] palabrasElegidas = new String[cantidad];

        Random random = new Random();
        Object[] palabras = diccionario.keySet().toArray();

        for (int i = 0; i < cantidad; i++) {
            int indice = random.nextInt(palabras.length);
            palabrasElegidas[i] = palabras[indice].toString();
        }

        return palabrasElegidas;

	}

}
