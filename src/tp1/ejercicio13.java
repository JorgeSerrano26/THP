package tp1;

import java.util.Scanner;

public class ejercicio13 {

	static Scanner input;
	
	public static final int more40hours = 20;
	public static final int less40hours = 16;
	
	public static void main(String[] args) {

		/*
		 * Un obrero necesita calcular su salario semanal, el cual se obtiene de la
		 * siguiente manera: 
		 * • Si trabaja 40 horas o menos se le paga $16 por hora
		 * (crear una constante para almacenar el 16) 
		 * • Si trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra.
		 * (crear una constante para almacenar el 20) 
		 * Pedir al usuario que ingrese la
		 * cantidad de horas trabajadas en la semana, y mostrar por pantalla el salario
		 * correspondiente.		  
		 */

		input = new Scanner(System.in);
		int hours, totalToPay;
		
		System.out.prinln("Ingrese la cantidad de horas trabajadas: ");
		hours = input.nextInt();
		
		if(hours<=40) {
			totalToPay = hours * less40hours;
		}else {
			totalToPay = (40 * less40hours) + ( (hours - 40) * more40hours); 
		}
		System.out.print("Se pagaran: $"+ totalToPay);
	}
}
