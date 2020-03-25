package tp1;

import java.util.Scanner;

public class ejercicio5 {
	static Scanner input;

	public static void main(String args[]) {
		/*
		 * 5. Realizá un programa que, dados dos números enteros num1 y num2 cargados
		 * desde teclado por el usuario, muestre el resultado de la división del primero
		 * por el segundo siguiendo el formato num1 + “ / “ + num2 + “ = “ + resultado.
		 * En el caso de que el segundo valor num2 sea cero, mostrar el siguiente
		 * mensaje de error: “No se puede dividir por cero”.
		 * 
		 */
		input = new Scanner(System.in);
		
		int num1,num2;
		
		System.out.print("Ingrese numero 1: ");
		num1 = input.nextInt();
		
		System.out.print("Ingrese numero 2: ");
		num2 = input.nextInt();
		
		if(num2 == 0) {
			System.out.print("Nose se puede dividir por 0");
		}else {
			int resultado = num1/num2;
			System.out.print(num1 + "/"+num2+"="+resultado);
		}
		
	}
}
