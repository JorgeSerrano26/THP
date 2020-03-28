package tp1;

import java.util.Scanner;

public class ejercicio14 {

	static Scanner input;

	public static void main(String[] args) {

		/*
		 * Construir un programa que simule el funcionamiento de una calculadora que
		 * puede realizar las cuatro operaciones aritméticas básicas (suma, resta,
		 * producto y división) con valores numéricos enteros. En un principio, el
		 * usuario debe especificar la operación que desea realizar (s para la suma, r
		 * para la resta, p para el producto y d para la división) y luego, deberá
		 * ingresar dos números enteros para así realizar la operación. Informar el
		 * resultado por pantalla. Nota: Se recomienda el empleo de una sentencia
		 * switch.
		 * 
		 */
		input = new Scanner(System.in);

		System.out.println(
				"Ingrese que tipo de operacion desea realizar. s para la suma, r para la resta, p para multiplicar y d para la división");
		char operacion = input.next().charAt(0);

		System.out.print("Ingrese numero 1: ");
		int numero1 = input.nextInt();
		System.out.print("Ingrese numero 2: ");
		int numero2 = input.nextInt();

		input.close();

		switch (operacion) {

		case 's':
			int suma = numero1 + numero2;
			System.out.print("El resutlado de la suma es " + suma);
			break;
		case 'r':
			int resta = numero1 - numero2;
			System.out.print("El resutlado de la resta es " + resta);
			break;
		case 'p':
			int mult = numero1 * numero2;
			System.out.print("El resutlado de la multiplicacion es " + mult);
			break;
		case 'd':
			int div = numero1 / numero2;
			System.out.print("El resutlado de la division es " + div);
			break;
		default:
			System.out.print("No se ingreso operacion valida");
			break;
				
		}
	}
}