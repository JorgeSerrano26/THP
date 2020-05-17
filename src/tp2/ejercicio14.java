package tp2;

import java.util.Scanner;

public class ejercicio14 {
	
	private static Scanner input;
	private static final int LIMITE_PROMO = 30;
	private static final int ABONO_BASE = 8500;
	private static final int COSTO_VIAJE_ADICIONAL = 100;
	private static final int MIN_ADICIONALES = 0;
	private static final int MAX_ADICIONALES = 1000;
	private static final int DESCUENTO_PROMO = 10;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		String empresa;
		int adicionales, contEmpresas = 0;
		double importe, total = 0, masCara = 0, prom;
		
		empresa = pedirEmpresa();
		
		while (!empresa.toLowerCase().equals("fin")) {
			contEmpresas++;
			adicionales=pedirAdicionales();
			importe = calcularImporte(adicionales);
			
			if (importe > masCara) {
				masCara = importe;
			}
			
			System.out.println("La empresa " + empresa + " debe pagar $" + importe);
			total+= importe;
			empresa=pedirEmpresa();
		}

		if (contEmpresas > 0) {
			prom = total / contEmpresas;
			System.out.println("El promedio pagado por empresa fue de $" + prom);
			System.out.println("La factura mas cara abonada fue de $" + masCara);
		} else {
			System.out.println("No participaron empresas");
		}
		
		input.close();
	}
	
	public static String pedirEmpresa() {
		String empresa;
		
		System.out.println("Ingrese nombre de la empresa: Si no desea saber los datos de ninguna empresa ingrese 'fin'");
		empresa = input.next();
		while (empresa.isEmpty()) {
			System.out.println("El campo no puede estar vacio");
			System.out.println("Error. Ingrese nombre de la empresa: Si no desea saber los datos de ninguna empresa ingrese 'fin'");
			empresa = input.next();
		}
		
		return empresa;
	}
	
	public static int pedirAdicionales() {
		int adicionales;
		
		System.out.print("Ingrese cantidad de viajes adicionales: ");
		adicionales = input.nextInt();
		while(adicionales < MIN_ADICIONALES || adicionales > MAX_ADICIONALES) {
			System.out.println("Ingrese una cantidad de viajes adicionales permitida (entre "+MIN_ADICIONALES+" a "+MAX_ADICIONALES);
			System.out.println("Ingrese cantidad de viajes adicionales: ");
			adicionales = input.nextInt();
		}
		
		return adicionales;
	}
	
	public static double calcularImporte(int adicionales) {
		double importe;
		importe = ABONO_BASE + COSTO_VIAJE_ADICIONAL * adicionales;
		if (adicionales > LIMITE_PROMO) {
			importe = importe - (importe * DESCUENTO_PROMO / 100);
		}
		return importe;
	}

}
