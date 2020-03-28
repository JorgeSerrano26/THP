package tp1;

import java.util.Scanner;

public class ejercicio12 {

	static Scanner input;

	public static void main(String[] args) {

		/*
		 * En un casino de juegos se desea mostrar los mensajes respectivos por el
		 * puntaje obtenido en el lanzamiento de tres dados de un cliente, de acuerdo a
		 * los siguientes resultados: • Si los tres dados son seis, mostrar el mensaje
		 * “Excelente” • Si dos dados son seis, mostrar el mensaje “Muy bien” • Si un
		 * dado es seis, mostrar el mensaje “Regular” • Si ningún dado se obtiene seis,
		 * mostrar el mensaje “Insuficiente”
		 * 
		 */
		input = new Scanner(System.in);

		System.out.print("Ingrese resultado primer dado: ");
		int dado1 = input.nextInt();

		System.out.print("Ingrese resultado segundo dado: ");
		int dado2 = input.nextInt();

		System.out.print("Ingrese resultado tercer dado: ");
		int dado3 = input.nextInt();
		input.close();

		if (dado1 == 6 && dado2 == 6 && dado3 == 6) {
			System.out.println("Excelente");
		} else if (dado1 == 6 && dado2 == 6 && dado3 != 6 || dado1 == 6 && dado3 == 6 && dado2 != 6
				|| dado2 == 6 && dado3 == 6 && dado1 != 6) {
			System.out.println("Muy Bien");
		} else if (dado1 == 6 || dado2 == 6 || dado3 == 6) {
			System.out.println("Regular");

		} else {
			System.out.println("Insuficiente");
		}

	}
}