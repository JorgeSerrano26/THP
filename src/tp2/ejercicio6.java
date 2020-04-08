package tp2;

import java.util.Scanner;

public class ejercicio6 {

	static Scanner input;
	public static final int CANT_ALUMNOS = 3;

	public static void main(String[] args) {
		/*
		 * Realizá un programa en el cual se pida el nombre y el promedio de 10 alumnos.
		 * Al finalizar, debe mostrar por pantalla el nombre y el promedio del mejor.
		 */
		input = new Scanner(System.in);
		
		String nombre;
		float promedio;
		String[] alumnosMayorPromedio = new String[CANT_ALUMNOS];
		
		float maxPromedio = 0;
		int cantMayorPromedio = 0;
		
		for(int i=0;i < CANT_ALUMNOS; i++) {
			
			System.out.print("Ingrese nombre de alumno: ");
			nombre = input.next();
			System.out.print("Ingrese promedio de alumno: ");
			promedio = input.nextFloat();
			
			if(promedio > maxPromedio) {
				
				alumnosMayorPromedio = new String[CANT_ALUMNOS];
				cantMayorPromedio = 0;
				
				alumnosMayorPromedio[cantMayorPromedio] = nombre;
				cantMayorPromedio++;
				
				maxPromedio = promedio;
				
			}else if(promedio == maxPromedio) {
				alumnosMayorPromedio[cantMayorPromedio] = nombre;
				cantMayorPromedio++;
			}
		}
		System.out.println("Los alumnos con el mayor promedio: "+ maxPromedio + " son");
		for(int i = 0; i < cantMayorPromedio; i++) {
			System.out.println(alumnosMayorPromedio[i]);
		}

		input.close();

	}

}
