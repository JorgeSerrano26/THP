package tp2;

import java.util.Scanner;

public class ejercicio15 {

	static Scanner input;

	public static final int ABONO_A = 2;
	public static final double ABONO_B_HASTA5 = 2;
	public static final double ABONO_B_MAS5 = 1.5;
	public static final int ABONO_C = 1;
	public static final int TOPE_ABONO_C = 10;

	public static void main(String args[]) {
		input = new Scanner(System.in);
		int codigo;
		int duracionLlamada;
		String tipoAbono;
		double costoLlamada;
		double acumAbonoA = 0;
		double acumAbonoB = 0;
		double acumAbonoC = 0;
		int acumLlamadaMasLarga=0;
		int contMenosDe6=0;
		int contLlamadas=0;
		double precioPromedioLlamadas;
		codigo = pedirCodigo();

		while (codigo != 0) {

			duracionLlamada = pedirDuracionLlamada();
			if(duracionLlamada>acumLlamadaMasLarga) {
				acumLlamadaMasLarga=duracionLlamada;
			}
			if(duracionLlamada<6) {
				contMenosDe6++;
			}
			tipoAbono = pedirTipoAbono();
			costoLlamada = calcularCostoLlamada(tipoAbono, duracionLlamada);
			if (tipoAbono.contentEquals("a")) {
				acumAbonoA = acumAbonoA + costoLlamada;
			} else if (tipoAbono.contentEquals("b")) {
				acumAbonoB = acumAbonoB + costoLlamada;
			} else {
				acumAbonoC = acumAbonoC + costoLlamada;
			}
			System.out.println("El costo de la llamada es de: " + costoLlamada);
			contLlamadas++;
			codigo = pedirCodigo();
		}
		
		System.out.println("El abono A debe recaudar un total de $"+acumAbonoA);
		System.out.println("El abono B debe recaudar un total de $"+acumAbonoB);
		System.out.println("El abono C debe recaudar un total de $"+acumAbonoC);	
		System.out.println("La llamada mas larga fue de "+acumLlamadaMasLarga+" minutos");
		System.out.println("La cantidad de llamadas que duraron menos de 6 minutos fueron "+contMenosDe6);	
		double recaudacionTotal=acumAbonoA+acumAbonoB+acumAbonoC;
		System.out.println("El precio promedio por llamada fue de $"+(recaudacionTotal/contLlamadas));
	
		input.close();
	}

	public static int pedirDuracionLlamada() {
		input = new Scanner(System.in);

		int duracionLlamada;

		System.out.println("Ingrese duracion de la llamada: ");
		duracionLlamada = input.nextInt();

		while (duracionLlamada <= 0) {
			System.out.println("Ingrese una duracion de la llamada correcta: ");
			duracionLlamada = input.nextInt();

		}

		return duracionLlamada;
	}

	public static int pedirCodigo() {
		input = new Scanner(System.in);
		int codigo;

		System.out.println("ingrese el codigo de cliente: ");
		codigo = input.nextInt();
		if (codigo != 0) {
			while (codigo < 10001 || codigo > 99999) {
				System.out.println("ingrese un codigo de cliente correcto: ");
				codigo = input.nextInt();
			}
		}
		return codigo;
	}

	public static String pedirTipoAbono() {
		input = new Scanner(System.in);

		String tipoAbono;

		System.out.println("Ingrese tipo de abono: ");
		tipoAbono = input.next();

		while (!tipoAbono.contentEquals("a") && !tipoAbono.contentEquals("b") && !tipoAbono.contentEquals("c")
				&& !tipoAbono.contentEquals("d")) {
			System.out.println("Ingrese tipo de abono correcto: ");
			tipoAbono = input.next();
		}

		return tipoAbono;
	}

	public static double calcularCostoLlamada(String tipoAbono, int duracion) {
		double costoLlamada = 0;

		switch (tipoAbono) {

		case "a":
			costoLlamada = duracion * ABONO_A;
			break;

		case "b":
			if (duracion <= 5) {
				costoLlamada = duracion * ABONO_B_HASTA5;
			} else {
				costoLlamada = duracion * ABONO_B_MAS5;
			}
			break;
		case "c":
			for (int i = 0; i < duracion; i++) {
				if (i < TOPE_ABONO_C) {
					costoLlamada = costoLlamada + ABONO_C;
				} else {
					costoLlamada = costoLlamada + 0;
				}
			}
			break;

		default:
			break;

		}

		return costoLlamada;
	}

}