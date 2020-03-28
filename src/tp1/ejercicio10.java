package tp1;

import java.util.Scanner;

public class ejercicio10 {

	static Scanner input;

	public static final int HORA_APERTURA = 10;
	public static final int HORA_CIERRE = 18;

	public static void main(String[] args) {

		/*
		 * Realizá un programa que resuelva el siguiente problema: Nos piden desarrollar
		 * un programa que informe si un estacionamiento se encuentra o no abierto según
		 * la hora ingresada por el usuario. Nosotros sabemos que el estacionamiento se
		 * encuentra abierto entre las 10 y las 18hs. (Crear constante HORA_APERTURA =
		 * 10, y HORA_CIERRE = 18). Al iniciar el programa, se le pedirá al usuario que
		 * ingrese la hora, y deberemos setear una variable booleana llamada estaAbierto
		 * en true o false, según corresponda, e informar por pantalla mediante la misma
		 * si el estacionamiento se encuentra abierto o no. Obs: En el caso de que el
		 * usuario ingrese una hora menor a 0 o mayor a 24, mostrar el mensaje: “Ha
		 * ingresado una hora incorrecta”
		 * 
		 */
		input = new Scanner(System.in);

		System.out.print("Ingrese horario: ");
		int hour = input.nextInt();
		boolean estaAbierto = true; /* no se pide el uso de esta variable */

		if (hour >= HORA_APERTURA && hour <= HORA_CIERRE) {
			estaAbierto = true;
			System.out.print("Estacionamiento abierto ");
		} else if (hour >= 0 && hour <= 24) {
			estaAbierto = false;
			System.out.print("Estacionamiento cerrado ");
		} else {
			System.out.print("Ha ingresado una hora incorrecta");
		}
		input.close();
		/*
		 * En este ejercicio se podria haber utilizado estructuras repetitivas pero se
		 * comprende que esto no fue un tema dado hasta el momento
		 */

	}
}