package tp1;

import java.util.Scanner;

public class ejercicio8 {
	static Scanner input;

	public static void main(String[] args) {

		/*
		 * 8. Suponiendo que el primer d�a de la semana es el Domingo, pedir un n�mero
		 * entre 1 y 7 (inclusive) y mostrar el nombre del d�a correspondiente. Si el
		 * d�a no est� en el rango permitido debe emitir por pantalla el mensaje de
		 * error "El d�a ingresado no es v�lido".
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
			System.out.println("El d�a ingresado no es v�lido");
			break;
		}

	}
}