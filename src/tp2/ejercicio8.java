package tp2;

import java.util.Scanner;

public class ejercicio8 {


	public static void main(String[] args) {
		/*
		 * Escribí la función booleana esMultiplo(int num1, int num2) que recibirá dos
		 * enteros y devolverá verdadero cuando el primero sea múltiplo de segundo (de
		 * lo contrario, devolverá falso). Para saber si un número es múltiplo de otro
		 * utilizá el operador % (módulo), que devuelve el resto de la división. Probá
		 * la función desde el main con los lotes de datos (5, 3) y (15, 3).
		 */

		if (esMultiplo(5, 3) == true) {
			System.out.println("es multiplo");
		} else {
			System.out.println("No es multiplo");
		}

		if (esMultiplo(15, 3) == true) {
			System.out.println("Es multiplo");
		} else {
			System.out.println("No es multiplo");
		}

	}

	public static boolean esMultiplo(int n1, int n2) {
		if (n1 % n2 == 0)
			return true;
		else
			return false;
	}
}