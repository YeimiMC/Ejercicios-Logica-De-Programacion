package ejercicio7;

import java.util.Scanner;

public class CalculoMinutosFinDeSemana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        // Se solicita el día de la semana
        System.out.print("Ingresa el día de la semana (Lunes - Viernes): ");
        String diaSemana = scanner.nextLine();

        // Se solicita la hora
        System.out.print("Ingresa la hora (formato hh:mm): ");
        String hora = scanner.nextLine();

        // Verificamos la validez de los datos ingresados
        if (validarDatos(diaSemana, hora)) {
            // Para obtener los minutos faltantes para el fin de semana
            int minutosFaltantes = calcularMinutosFaltantes(diaSemana, hora);

            // Se muestra el resultado
            System.out.println("Faltan " + minutosFaltantes + " minutos para el fin de semana.");
        } else {
            System.out.println("Datos ingresados no válidos. Vuelve a intentarlo.");
        }

        scanner.close();
    }

    public static boolean validarDatos(String diaSemana, String hora) {
        // Verificar que el día de la semana sea válido
        if (!diaSemana.matches("^(Lunes|Martes|Miércoles|Jueves|Viernes)$")) {
            return false;
        }

        // Verificar el formato de la hora
        if (!hora.matches("^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$")) {
            return false;
        }

        return true;
    }

    public static int calcularMinutosFaltantes(String diaSemana, String hora) {
        int minutosDia = 60 * 24; // Señalamos el total de minutos en un día
        int minutosFinSemana = 0;

        //Para calcular los minutos faltantes para el fin de semana según el día de la semana:
        switch (diaSemana) {
            case "Lunes":
                minutosFinSemana = 4 * minutosDia + 15 * 60; // 4 días y 15 horas
                break;
            case "Martes":
                minutosFinSemana = 3 * minutosDia + 15 * 60; // 3 días y 15 horas
                break;
            case "Miércoles":
                minutosFinSemana = 2 * minutosDia + 15 * 60; // 2 días y 15 horas
                break;
            case "Jueves":
                minutosFinSemana = 1 * minutosDia + 15 * 60; // 1 día y 15 horas
                break;
            case "Viernes":
                minutosFinSemana = 15 * 60; // 15 horas
                break;
        }

        // Ingreso de datos
        int horas = Integer.parseInt(hora.substring(0, 2));
        int minutos = Integer.parseInt(hora.substring(3));

   
        int minutosIngresados = horas * 60 + minutos;


        int minutosFaltantes = minutosFinSemana - minutosIngresados;

        return minutosFaltantes;

	}

}
