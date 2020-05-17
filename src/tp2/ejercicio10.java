package tp2;

import java.util.Scanner;


public class ejercicio10 {
	
	static Scanner input;
	public static final int FIN_INGRESO_CORREDOR = 0;
	public static void main(String[] args) {
		/*
	 El club de corredores nos pide un programa para obtener estadísticas de la carrera de 10
	km. El mismo consiste en ingresar, por teclado, el número de corredor, las
	horas, los minutos y los segundos que tardo en realizar la carrera. 
	Tener en cuenta que al ingresar 0 como el número de corredor, 
	finaliza el programa y debe mostrar por pantalla:
	a) El ganador
	b) El promedio en segundos de los corredores.
	c) El porcentaje de corredores que realizaron la carrera en menos de una hora.
	Programar y utilizar la función devolverSegundos que recibe como parámetros horas, minutos y
	segundos.
	 	*/
		input = new Scanner(System.in);
		int numCompetidor, cantCorredores = 0, cantCorredoresHora = 0;
		int masRapidoEnSegundos=0, numGanador = 0;
		int tiempoEnSegundos, horas, minutos, segundos;
		int acumSegundos = 0;
		
		numCompetidor = ingresarNumero("Ingrese numero del competidor | '0' = fin de datos: ");
		while(numCompetidor != 0) {
			cantCorredores++;
			
			horas = ingresarNumero("Ingrese cantidad de horas");
			minutos = ingresarNumero("Ingrese cantidad de minutos");
			segundos = ingresarNumero("Ingrese cantidad de segundos");
			
			tiempoEnSegundos = pasarASegundos( horas, minutos, segundos);
			System.out.println("Segundos : " + tiempoEnSegundos);
			
			/* Si es el primero, es el mas rapido */
			if(cantCorredores == 1 || tiempoEnSegundos < masRapidoEnSegundos  ) {
				masRapidoEnSegundos = tiempoEnSegundos;
				numGanador = numCompetidor;
			}
			
			if(horas == 0) {
				cantCorredoresHora++;
			}
			
			acumSegundos += tiempoEnSegundos;
			
			numCompetidor = ingresarNumero("Ingrese numero del competidor | '0' = fin de datos: ");
		}
		if(cantCorredores == 0) {
			System.out.print("No se ingresaron corredores");
		}else {
			System.out.println("El ganador es el numero: " + numGanador);
			System.out.println("El promedio de segundos es de " + (acumSegundos / cantCorredores));
			System.out.println("El porcetaje de corredores que terminaron en una hora es de: "+ (cantCorredoresHora*100/cantCorredores));
		}
		input.close();
	}
	public static int ingresarNumero(String msj) {
		int numero;
		System.out.print(msj);
		numero = input.nextInt();
		while(numero < 0) {
			System.out.print("Error. " + msj);
			numero = input.nextInt();
		}
		return numero;
	}
	
	public static int obtenerMasRapido(int menorTiempo, int tiempoCorredor) {
		int menor = menorTiempo;
		if(tiempoCorredor < menorTiempo ) {
			menor = tiempoCorredor;
		}
		return menor;
	}
	public static int pasarASegundos(int horas, int minutos,int segundos) {
		return (int) ( horas * Math.pow(60,2) + minutos * 60 + segundos );
	}
	
}
