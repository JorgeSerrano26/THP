package tp1;

import java.util.Scanner;

public class ejercicio9 {
	static Scanner input;
	static String name = "Jorge";

	public static void main(String args[]) {
	/*
	 * 9. Realizá un programa que resuelva el siguiente problema: Tres personas
	 * aportan diferente capital a una sociedad. Se desea saber qué porcentaje del
	 * total aportó cada una (indicando nombre y porcentaje) y cuál es el monto del
	 * total aportado por las tres. 
	 * Pedir por pantalla el ingreso del capital
	 * aportado por cada una de las personas y luego mostrar lo pedido en el
	 * siguiente formato: Nombre: capital aportado: $ … , Porcentaje del capital:
	 * %.... , Monto total aportado: $ ….
	 */
		
		input=new Scanner(System.in);
		
		String[] names = new String[3];
		Float[] capitals = new Float[3];
		float totalAmount = 0;
		
		System.out.print("Ingrese nombre de la 1er persona: ");
		names[0] = input.next();
		System.out.println("Ingrese cuanto aporto "+ names[0] +": ");
		capitals[0] = input.nextFloat();

		System.out.print("Ingrese nombre de la 2er persona: ");
		names[1] = input.next();
		System.out.println("Ingrese cuanto aporto "+ names[1] +": ");
		capitals[1] = input.nextFloat();
		
		System.out.print("Ingrese nombre de la 3er persona: ");
		names[2] = input.next();
		System.out.println("Ingrese cuanto aporto "+ names[2] +": ");
		capitals[2] = input.nextFloat();
		
		totalAmount = capitals[0]+capitals[1]+capitals[2];
		System.out.println("El total aportado es: " + totalAmount);
		System.out.println(names[0] + " aporto $"+ capitals[0] +". Es el "+ (capitals[0]*100/totalAmount) + "%");
		System.out.println(names[1] + " aporto $"+ capitals[1] +". Es el "+ (capitals[1]*100/totalAmount) + "%");
		System.out.println(names[2] + " aporto $"+ capitals[2] +". Es el "+ (capitals[2]*100/totalAmount) + "%");
		
		
		input.close();
		
	}
		
		
}
