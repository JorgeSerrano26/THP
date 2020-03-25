package tp1;

import java.util.Scanner;

public class ejercicio8 {
	static Scanner input;

	public static void main(String[] args) {

		/*
		 * 8. Suponiendo que el primer día de la semana es el Domingo, pedir un número
		 * entre 1 y 7 (inclusive) y mostrar el nombre del día correspondiente. Si el
		 * día no está en el rango permitido debe emitir por pantalla el mensaje de
		 * error "El día ingresado no es válido".
		 * 
		 */

		input = new Scanner(System.in);

		int day;

		System.out.print("Introduzca el numero de dia ");
		day = input.nextInt();
		input.close();

		switch (day) {

		case 1:
			System.out.println("El dia es Domingo");
			break;
		case 2:
			System.out.println("El dia es Lunes");
			break;
		case 3:
			System.out.println("El dia es Martes");
			break;
		case 4:
			System.out.println("El dia es Miercoles");
			break;
		case 5:
			System.out.println("El dia es Jueves");
			break;
		case 6:
			System.out.println("El dia es Viernes");
			break;
		case 7:
			System.out.println("El dia es Sabado");
			break;
		default:
			System.out.println("El día ingresado no es válido");
			break;
		}

	}
}