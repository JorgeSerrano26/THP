package tp2;

import java.util.Scanner;

public class ejercicio5 {
	
	static Scanner input;

	public static void main(String[] args) {
		/*
		 * Realizá un programa que lea una serie de números ingresados por el usuario
		 * mientras que el promedio entre todos sea menor a 20. 
		 * Informar la cantidad de valores leídos
		 */
		input = new Scanner(System.in);
		
		int numero;
		int acumulador=0, cantNumeros = 0;
		
		do {
			System.out.print("Ingrese un numero: ");
			numero = input.nextInt();
			
			acumulador += numero;
			cantNumeros++;
			
		}while( acumulador / cantNumeros < 20);
		input.close();
		System.out.println("La cantidad de numero ingresados es: " + cantNumeros );
		
		

	}

}
