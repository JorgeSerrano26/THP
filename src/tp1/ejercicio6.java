package tp1;

import java.util.Scanner;

public class ejercicio6 {
	static Scanner input;

	public static void main(String[] args) {

		/*
		 * Realiz� un programa que solicite al usuario el ingreso por teclado un valor
		 * entero mayor que 0 en una variable llamada num1 y muestre un mensaje por
		 * pantalla indicando "el n�mero es par" o "el n�mero es impar". Deber� utilizar
		 * el operador �m�dulo� es el caracter %.
		 */
		input = new Scanner(System.in);

		int num1;

		System.out.print("Introduzca el n�mero: ");
		num1 = input.nextInt();

		if (num1 > 0) {
			if (num1 % 2 == 0)
				System.out.println("El n�mero es par");
			else
				System.out.println("El n�mero es impar");
		} else {
			System.out.println("Ingresaste 0, volve a intentarlo");
			System.out.print("Introduzca el n�mero: ");
			num1 = input.nextInt();
			if (num1 % 2 == 0)
				System.out.println("El n�mero es par");
			else
				System.out.println("El n�mero es impar");
		}
		input.close();

		/*
		 * Hubieramos usado una estructura repetitiva pero hasta el momento no fue
		 * explicado
		 */
	}
}