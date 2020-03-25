package tp1;

import java.util.Scanner;

public class ejercicio6 {
	static Scanner input;

	public static void main(String[] args) {

		/*
		 * Realizá un programa que solicite al usuario el ingreso por teclado un valor
		 * entero mayor que 0 en una variable llamada num1 y muestre un mensaje por
		 * pantalla indicando "el número es par" o "el número es impar". Deberá utilizar
		 * el operador “módulo” es el caracter %.
		 */
		input = new Scanner(System.in);

		int num1;

		System.out.print("Introduzca el número: ");
		num1 = input.nextInt();

		if (num1 > 0) {
			if (num1 % 2 == 0)
				System.out.println("El número es par");
			else
				System.out.println("El número es impar");
		} else {
			System.out.println("Ingresaste 0, volve a intentarlo");
			System.out.print("Introduzca el número: ");
			num1 = input.nextInt();
			if (num1 % 2 == 0)
				System.out.println("El número es par");
			else
				System.out.println("El número es impar");
		}
		input.close();

		/*
		 * Hubieramos usado una estructura repetitiva pero hasta el momento no fue
		 * explicado
		 */
	}
}