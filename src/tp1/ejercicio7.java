package tp1;

import java.util.Scanner;

public class ejercicio7 {
	static Scanner input;

	public static void main(String args[]) {

		/*
		 * 7. Realizá un programa que al ingresar por teclado tres números enteros num1,
		 * num2 y num3, muestre el valor del mayor de todos. En caso de igualdad entre
		 * los tres imprimir "Los números son iguales". 
		 * Test1: num1 = 12, num2 = 4, num3= 7. 
		 * Resultado esperado: El mayor número es num1 
		 * 
		 * Test2: num1 = 2, num2 =
		 * 65, num3= 8. Resultado esperado: El mayor número es num2 Test3: num1 = 3,
		 * num2 = 10, num3= 28. Resultado esperado: El mayor número es num3 Test4: num1
		 * = 5, num2 = 5, num3= 5. Resultado esperado: Los números son iguales
		 */
		input = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.print("Ingrese numero 1: ");
		num1 = input.nextInt();
		
		System.out.print("Ingrese numero 2: ");
		num2 = input.nextInt();
		
		System.out.print("Ingrese numero 3: ");
		num3 = input.nextInt();
		
		input.close();
		
		if(num1 > num2 && num1 > num3) {
			System.out.print("El numero "+ num1 +" es el mas grande");
		}else if(num2 > num1 && num2 > num3) {
			System.out.print("El numero "+ num2 +" es el mas grande");
		}else if(num3 > num1 && num3 > num2) {
			System.out.print("El numero "+ num3 +" es el mas grande");
		}else {
			System.out.print("Los numeros son iguales");
		}
		
		
	}
}
