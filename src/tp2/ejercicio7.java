package tp2;

import java.util.Scanner;

public class ejercicio7 {

	static Scanner input;

	public static final String USERNAME = "Binker";
	public static final String PASSWORD = "Binker123";

	public static void main(String[] args) {
		/*
		 * El ingreso a un sitio web se valida por nombre de usuario y contraseña.
		 * Realizar un programa que impida que el usuario ingrese hasta poner los datos
		 * correctos. Si intenta más de 3 veces erróneamente, se debe mostrar el mensaje
		 * “Se ha bloqueado su cuenta”, de lo contrario, mostrar “Ha ingresado
		 * correctamente”.
		 */

		input = new Scanner(System.in);
		
			int totalAttempts = 3;
			
			do 
			{
				 System.out.println("Ingrese usuario: ");
			     String username = input.next();
			     System.out.println("Ingrese contraseña: ");
			     String password = input.next();
			     
			        if (username.equals(USERNAME) && password.equals(PASSWORD)) {
			        	
				        System.out.println("Ha ingresado correctamente");
			            totalAttempts=0;
			        }
			        else {

			        	totalAttempts--;
				        System.out.println("Incorrecto, le quedan " +totalAttempts+ " intentos");
				        if(totalAttempts==0) {System.out.println("Se ha bloqueado su cuenta");}
			        }

			}
		    while (totalAttempts != 0);


			
		input.close();

	}

}