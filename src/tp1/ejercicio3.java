package tp1;

import java.util.Scanner;

public class ejercicio3 {

	static Scanner input;

	public static void main(String args[]) {
		/*
		 * Realizá un programa que muestre por pantalla un mensaje pidiéndole al usuario
		 * que ingrese su nombre, y luego muestre un mensaje de bienvenida incluyendo el
		 * mismo.
		 */
		input = new Scanner(System.in);
		
		System.out.print("Ingrese su nombre: ");
		
		String name = input.nextLine();
		input.close();
		
		System.out.println("Bienvenido a eclipse " + name);
	}
}
