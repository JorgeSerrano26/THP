package tp2;

import java.util.Scanner;

public class ejercicio16 {

	private static Scanner input;
	
	private static final int MENU_CLASICO = 300;
	private static final int MENU_CELIACOS = 310;
	private static final int MENU_KOSHER = 430;
	private static final int MENU_LIGHT = 290;
	private static final int COSTO_BEBIDAS = 30;
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		boolean calcularCatering;
		int cantidadInvitados;
		String tipoMenu;
		int cantidadPorMenu;
		int invitadosRestantes=0;
		int contCeliacos=0,contClasicos=0,contKosher=0,contLight=0;
		
		calcularCatering = calcularCatering();
		if(calcularCatering) {
			cantidadInvitados = ingresarCantInvitados();
			invitadosRestantes = cantidadInvitados;
			tipoMenu = ingresarTipoMenu();
			while (!tipoMenu.equals("fin") && invitadosRestantes != 0) {
				cantidadPorMenu = ingresarCantPorMenu(invitadosRestantes, tipoMenu);
				invitadosRestantes -= cantidadPorMenu;
				
				switch (tipoMenu) {
				case "celiaco":
					contCeliacos+=cantidadPorMenu;
					break;
				case "clasico":
					contClasicos+=cantidadPorMenu;
					break;
				case "kosher":
					contKosher+=cantidadPorMenu;
					break;
				case "light":
					contLight+=cantidadPorMenu;
					break;
				}
				if (invitadosRestantes!=0) {
					tipoMenu = ingresarTipoMenu();
				}	
			}
			mostrarResultados(cantidadInvitados, invitadosRestantes, contCeliacos, contClasicos, contLight, contKosher);
		}else {
			System.out.println("Cuando quiera calcular el precio por favor ejecute la applicacion");
		}

		input.close();
	}
	
	public static void mostrarResultados(int cantidadInvitados,
			int invitadosRestantes,int contCeliacos,
			int contClasicos,int contLight,int contKosher) {
		int costoTotal,costoBebidas, costoComida;
		
		System.out.println("El total de personas invitadas es: " + cantidadInvitados);
		System.out.println("La cantidad de personas que comen del menu Clasico son: " + contClasicos);
		System.out.println("La cantidad de personas que comen del menu Clasico son: " + contCeliacos);
		System.out.println("La cantidad de personas que comen del menu Clasico son: " + contKosher);
		System.out.println("La cantidad de personas que comen del menu Clasico son: " + contLight);
		System.out.println("La cantidad de personas que todavia no tienen un menu seleccionado son: " + invitadosRestantes);
		
		costoComida = calcularCostoComida(contCeliacos,contClasicos,contKosher,contLight);
		
		costoBebidas = cantidadInvitados * COSTO_BEBIDAS;
		
		System.out.println("El costo de la comida es de $" + costoComida);
		System.out.println("El costo de las bebidas es de $" + costoBebidas);
		
		costoTotal=costoBebidas+costoComida;
		
		if (invitadosRestantes==0) {
			System.out.println("El costo total de la fiesta hasta ahora es de $" + costoTotal);
		}else {
			System.out.println("El costo total de la fiesta hasta ahora es de $" + costoTotal+", todavia le quedan seleccionar el menu de "+invitadosRestantes+" invitados");
		}
	}
	
	public static int calcularCostoComida(int celiaco, int clasico, int kosher, int light) {
		int costo;
		costo = (celiaco * MENU_CELIACOS) + (clasico * MENU_CLASICO) + (kosher * MENU_KOSHER) + (light * MENU_LIGHT);
		return costo;
	}
	
	public static int ingresarCantPorMenu(int total, String menu) {
		int cant;
		
		System.out.println("Ingrese la cantidad que comen del menu "+ menu);
		cant=input.nextInt();
		while ((total-cant)<0) {
			System.out.println("Error. Ha ingresado más cantidad de platos que de invitados. Quedan "+total+" invitados para seleccionar el tipo de comida");
			System.out.println("Ingrese la cantidad que comen del menu "+ menu);
			cant=input.nextInt();
		}
		return cant;
	}
	
	public static String ingresarTipoMenu() {
		String tipoMenu;
		
		System.out.println("Ingrese el tipo de menu (clásico/celiaco/kosher/light/fin)");
		tipoMenu=input.next();
		while (!tipoMenu.toLowerCase().equals("celiaco") 
				&& !tipoMenu.toLowerCase().equals("clasico")
				&&!tipoMenu.toLowerCase().equals("kosher")
				&&!tipoMenu.toLowerCase().equals("light")
				&&!tipoMenu.toLowerCase().equals("fin")) {
			System.out.println("Ingrese un tipo de menu valido (clásico/celiaco/kosher/light/fin)");
			tipoMenu = input.next();
		}
		return tipoMenu.toLowerCase();
	}
	
	public static boolean calcularCatering() {
		String validacion;
		
		System.out.println("Ingrese 'S' para calcular el precio total del catering o 'N' si no lo desea calcular");
		validacion=input.next();
		while (!validacion.toLowerCase().equals("s") && !validacion.toLowerCase().equals("n")) {
			System.out.println("Ingreso incorrecto");
			System.out.println("Ingrese 'S' para calcular el precio total del catering o 'N' si no lo desea calcular");
			validacion = input.next();		
		}
		
		if(validacion.contentEquals("s")) {
			return true;
		}
		return false;
	}
	
	public static int ingresarCantInvitados() {
		int cantInvitados;
		
		System.out.println("Ingrese la cantidad de invitados");
		cantInvitados=input.nextInt();
		while (cantInvitados < 1) {
			System.out.println("La cantidad de invitados tiene que ser mayor a 0. Ingrese la cantidad de invitados");
			cantInvitados = input.nextInt();
		}
		return cantInvitados;
	}

}
