package tp2;

import java.util.Scanner;

public class ejercicio4 {

	static Scanner input;

	public static void main(String args[]) {

		/*
		 * Realizar un programa en el cual se pida al usuario el ingreso de dos números
		 * enteros num1 y num2, cuya relación de valores es que el primero es menor o
		 * igual al segundo y mostrar por pantalla la secuencia de números que existe
		 * entre ambos: 
		 * 
		 * a) Incluyéndolos; 
		 * b) Excluyéndolos. 
		 * 
		 * Obs: Validar que el primer número sea menor o igual al segundo. 
		 * Pedir el ingreso de ambos números las
		 * veces que sea necesario hasta que se cumpla dicha condición. 
		 * ¿Qué pasaría si
		 * esta validación no la realizáramos y el ingreso es incorrecto?
		 * 
		 */
		input = new Scanner(System.in);
		
		int num1,num2;
		
		do{
			System.out.println("Ingrese el primer numero: "); 
			num1 = input.nextInt();
			
			System.out.println("Ingrese el segundo numero: "); 
			num2 = input.nextInt();
		}while(num1 > num2);
		
		input.close();
		
		//Incluyendolos
		System.out.println("Incluyendolos: "); 
		for(int i = num1; i <= num2; i++) {
			System.out.println(i); 
		}
		
		//Exluyendolos
		System.out.println("Exluyendolos: "); 
		for(int i = num1+1; i < num2; i++) {
			System.out.println(i); 
		}
	}
}
