package tp2;

import java.util.Scanner;

public class ejercicio9 {

	static Scanner input;

	public static void main(String[] args) {
		/*
		 * Realizar un programa que le pida al usuario que ingrese 5 veces 3 valores
		 * enteros cada vez. Emití el promedio de cada grupo.
		 */

		input = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {

			System.out.println("Ingrese valor 1: ");
			int num1 = input.nextInt();
			System.out.println("Ingrese valor 2: ");
			int num2 = input.nextInt();
			System.out.println("Ingrese valor 3: ");
			int num3 = input.nextInt();

			System.out.println("El promedio es: " + average(num1, num2, num3));

		}
		System.out.println("Fin del programa");
		input.close();

	}

	public static int average(int value1, int value2, int value3) {
		int prom = ((value1 + value2 + value3) / 3);
		return prom;
	}
}