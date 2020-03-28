package tp1;

import java.util.Scanner;

public class ejercicio15 {
	
	static Scanner input;

	public static void main(String[] args) {
		/*
		 * Existen dos reglas que identifican dos conjuntos de valores: 
		 * - El número es de un solo dígito. 
		 * - El número es impar. A partir de estas reglas, creá un
		 * algoritmo que asigne a las variables booleanas 
		 * estaEnA, estaEnB, estaEnAmbos y noEstaEnNinguno 
		 * el valor verdadero o falso, según corresponda, para indicar
		 * si el valor ingresado pertenece al primer conjunto, al segundo, a ambos o a
		 * ninguno, respectivamente. Definí un lote de prueba de varios números y probá
		 * el algoritmo, escribiendo los resultados.
		 */
		boolean unDigito = false, esImpar = false, 
				estaEnAmbos = false, noEstaEnNinguno = false;
		
		input = new Scanner(System.in);
		int num;
		System.out.print("Ingrese un numero: ");
		num = input.nextInt();
		input.close();
		
		if(num-10 < 0 && num%2==1 ) {
			estaEnAmbos = true;
			System.out.println("Esta en ambos conjuntos");
		}else if(num-10 < 0 ) {
			unDigito = true;
			System.out.println("Es de un digito");
		}else if(num%2==1){
			esImpar = true;
			System.out.println("Es impar");
		}else{
			noEstaEnNinguno = true;
			System.out.println("No esta en ningun conjunto");
		}
		
		
		
	}
}
