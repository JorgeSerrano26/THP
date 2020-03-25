package tp1;

import java.util.Scanner;

public class ejercicio2 {

	static Scanner input;

	public static void main(String args[]) {

		/*
		 * 2. Realizá un programa que, siendo num1 y num2 variables enteras con valores
		 * 4 y 5, respectivamente, realice la operación correspondiente y muestre el
		 * resultado en pantalla: a. Suma b. Producto
		 */

		int num1 = 4;
		int num2 = 5;
		int a;
		int b;

		a = num1 + num2;

		System.out.println("El resultado de la suma es " + a);

		b = num1/num2;

		System.out.println("El producto " + b);
	}
}