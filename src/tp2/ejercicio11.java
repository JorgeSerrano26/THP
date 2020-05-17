package tp2;

import java.util.Scanner;

public class ejercicio11 {

	static Scanner input;

	public static void main(String[] args) {
		/*
		 * Realiz� un programa que al ingresar dos n�meros enteros positivos llamados A
		 * y B se calcule el producto de �stos a trav�s de sumas sucesivas. Por ejemplo,
		 * si los n�meros son 4 y 2, hacer 4 + 4; si son 5 y 3, hacer 5 + 5 + 5. �Qu�
		 * pasa si la diferencia entre los dos n�meros es muy grande? �Influye cu�l se
		 * usa para sumar y cu�l para contar la cantidad de sumas hechas?
		 */
		input = new Scanner(System.in);
		int numero;
		int numero2;
		int producto;

		numero = pedirNumero();
		numero2 = pedirNumero();
		producto = calcularProducto(numero, numero2);
		System.out.println("el producto es: "+ producto);

	}

	public static int pedirNumero() {
		input = new Scanner(System.in);
		int numero;
		System.out.println("Ingrese un numero positivo");
		numero = input.nextInt();
		while (numero < 1) {
			System.out.println("Ingrese un numero correcto");
			numero = input.nextInt();
		}
		return numero;
	}

	public static int calcularProducto(int numero, int numero2) {
		int producto=0;
		
		for(int i=0; i<numero2;i++) {
			producto=producto+numero;
		}
		
		return producto;
	}
}
/*
Pregunta 1 no habria diferencias funcionaria normalmente.
Pregunta 2 no, no influye siempre dara el mismo resultado por ejemplo si ingreso 3 y 5 nos da como resultado 15.
y si ingreso 5 y 3 da el mismo resultado.


 */