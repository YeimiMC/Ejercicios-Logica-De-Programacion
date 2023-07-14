package ejercicio9;

//importaciones
import java.util.HashMap;
import java.util.Scanner;

public class Diccionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashMap para crear el diccionario
		HashMap<String, String> diccionario = crearDiccionario(); 


        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra en español: ");
        String palabra = scanner.nextLine();

        String traduccion = diccionario.get(palabra.toLowerCase());

        if (traduccion != null) {
            System.out.println("Traducción al inglés: " + traduccion);
        } else {
            System.out.println("La palabra no se encuentra en el diccionario");
        }

        scanner.close();
    }

    public static HashMap<String, String> crearDiccionario() {
        HashMap<String, String> diccionario = new HashMap<>();

        // Agregamos palabras en espaniol e ingles al diccionario
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

}
