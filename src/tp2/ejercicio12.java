package tp2;

import java.util.Scanner;

public class ejercicio12 {
	
	static Scanner input;
	
	public static void main(String[] args) {
		/*
		 * 12. Realizar un programa en el cual se pida el ingreso de dos números enteros num1 y num2 y el signo
		de la operación (“+” para sumar, “-” para restar, “/” para dividir, 
		“*” para multiplicar y “%” para obtener el
		resto o módulo). Mientras que la operación no sea “f” (de “fin”) aplicar la operación elegida a n1 y n2.
		Tener en cuenta que la división por 0 es imposible. Realizar una función para cada operación, que
		reciba por parámetros n1 y n2, y retorne el resultado de hacer la operación entre los dos números.
		 */
		input = new Scanner(System.in);
		String operacion;
		int num1, num2, resultado;
		
		operacion = pedirOperacion();
		while(!operacion.equals("f")) {
			num1 = pedirNumero();
			num2 = pedirNumero();
			while(num2 == 0 && operacion.equals("/") ) {
				System.out.print("No se puede dividir por 0");
				num2 = pedirNumero();
			}
			resultado = calcular(num1, num2, operacion);
			System.out.println("***************************************");
			System.out.println("El resultado de: " + num1 + operacion + num2 +" = "+ resultado);
			System.out.println("***************************************");
			operacion = pedirOperacion();
		}
		input.close();
	}
	public static String pedirOperacion() {
		String operacion;
		System.out.println("Sumar = '+'");
		System.out.println("Restar = '-'");
		System.out.println("Multiplicar = '*'");
		System.out.println("Dividir = '/'");
		System.out.println("Finalizar = 'f'");
		System.out.println("Ingrese operación: ");
		operacion = input.next().toLowerCase();
		while(!operacion.equals("+") && !operacion.equals("-") && !operacion.equals("*") 
				&& !operacion.equals("/") && !operacion.equals("f")) {
			System.out.println("Error. Ingrese operación: ");
			operacion = input.next().toLowerCase();
		}
		return operacion;
	}
	public static int pedirNumero() {
		int numero;
		System.out.print("Ingrese numero");
		numero = input.nextInt();
		return numero;
	}
	public static int calcular(int n1, int n2, String operacion) {
		int resultado;
		switch(operacion) {
			case "+":
				resultado = n1 + n2;
				break;
			case "-":
				resultado = n1 + n2;
				break;
			case "*":
				resultado = n1 * n2;
				break;
			case "/":
				resultado = n1 / n2;
				break;
			default:
				resultado = 0;
				break;
		}
		return resultado;
	}
}
