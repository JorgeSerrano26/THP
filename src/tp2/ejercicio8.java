package tp2;

import java.util.Scanner;

public class ejercicio8 {


	public static void main(String[] args) {
		/*
		 * Escrib� la funci�n booleana esMultiplo(int num1, int num2) que recibir� dos
		 * enteros y devolver� verdadero cuando el primero sea m�ltiplo de segundo (de
		 * lo contrario, devolver� falso). Para saber si un n�mero es m�ltiplo de otro
		 * utiliz� el operador % (m�dulo), que devuelve el resto de la divisi�n. Prob�
		 * la funci�n desde el main con los lotes de datos (5, 3) y (15, 3).
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