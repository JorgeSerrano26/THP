package tp1;

import java.util.Scanner;

public class ejercicio13 {

	static Scanner input;
	
	public static final int MORE_40_HOURS = 20;
	public static final int LESS_40_HOURS = 16;
	
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
		
		System.out.println("Ingrese la cantidad de horas trabajadas: ");
		hours = input.nextInt();
		input.close();
		
		if(hours<=40) {
			totalToPay = hours * LESS_40_HOURS;
		}else {
			totalToPay = (40 * LESS_40_HOURS) + ( (hours - 40) * MORE_40_HOURS); 
		}
		System.out.print("Se pagaran: $"+ totalToPay);
	}
}
