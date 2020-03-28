package tp1;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ejercicio11 {

	static Scanner input;

	public static void main(String[] args) {

		/*
		 * Realizá un programa que resuelva el siguiente problema: Deberás solicitar el
		 * ingreso de una fecha de compra (String en el siguiente formato: YYYYMMDD), un
		 * nombre de comprador, un nombre de producto y una cantidad y precio del
		 * producto comprado. Mostrá a modo de ticket, la información ingresada y el
		 * monto a pagar. Modelo de Ticket: Fecha de Compra: YYYYMMDD Nombre del
		 * Comprador: xxxxx xxxxx Producto solicitado: xxxxx Cantidad solicitada: xx
		 * Precio Unitario: $xxx Total a Pagar: $xxxxx
		 */
		input = new Scanner(System.in);

		int totalPagar;

		System.out.println("Ingrese fecha de compra en formato YYYY/MM/DD: ");
		String fecha = input.nextLine();

		System.out.println("Ingrese nombre del comprador: ");
		String nombre = input.nextLine();

		System.out.println("Ingrese nombre del producto: ");
		String nombreProducto = input.nextLine();

		System.out.println("Ingrese cantidad del producto: ");
		int cantidadProducto = input.nextInt();

		System.out.println("Ingrese precio del producto: ");
		int precioProducto = input.nextInt();

		input.close();

		totalPagar = precioProducto * cantidadProducto;

		System.out.println("Fecha de compra: " + fecha);
		System.out.println("Nombre del comprador: " + nombre);
		System.out.println("Producto solicitado: " + nombreProducto);
		System.out.println("Cantidad solicitada: " + cantidadProducto);
		System.out.println("Precio unitario: $" + precioProducto);
		System.out.println("Total a pagar: $" + totalPagar);

	}
}