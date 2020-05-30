package tp2;

import java.util.Scanner;

public class ejercicio13 {

	static Scanner input;

	public static void main(String[] args) {
		/*
		 * . Se desea realizar un programa para saber qu� prioridad darle a cada materia
		 * en cuanto a clases de apoyo de acuerdo a la necesidad de los alumnos. Al
		 * comenzar el programa, se pedir� la cantidad de alumnos que desea cargar.
		 * Luego, por cada alumno, se pedir� curso (a/b/c/d. Validar), y materia en la
		 * cual necesita clase de apoyo (taller/fundamentos/matem�tica). Una vez
		 * realizado el ingreso de datos, se deber� mostrar por pantalla cu�l fue la
		 * materia m�s requerida
		 * 
		 */
		input = new Scanner(System.in);

		int cantAlumnos;
		String cursoElegido;
		int contMateria1 = 0;
		int contMateria2 = 0;
		int contMateria3 = 0;
		String materia;
		
		System.out.println("Ingrese la cantidad de alumnos: ");
		cantAlumnos = input.nextInt();

		for (int i = 0; i < cantAlumnos; i++) {
			cursoElegido = pedirCurso();
			materia=pedirMateria();
			if (materia.contentEquals("matem�tica")) {
				contMateria3++;
			} else if (materia.contentEquals("fundamentos")) {
				contMateria2++;
			} else {
				contMateria1++;
			}
		}
		System.out.println(contMateria1);
		System.out.println(contMateria2);
		System.out.println(contMateria3);
		if (contMateria1 > contMateria2 && contMateria1 > contMateria3) {

			System.out.println("La materia con mas apoyo requerido es taller");
		}

		else if (contMateria2 > contMateria1 && contMateria2 > contMateria3) {
			System.out.println("La materia con mas apoyo requerido es fundamentos");

		}

		else {
			System.out.println("La materia con mas apoyo requerido es matem�tica");
		}

	}

	public static String pedirCurso() {
		input = new Scanner(System.in);
		String curso;
		System.out.println("ingrese el curso del alumno: ");
		curso = input.next();
		while (!curso.contentEquals("a") && !curso.contentEquals("b") && !curso.contentEquals("c")
				&& !curso.contentEquals("d")) {
			System.out.println("ingrese un curso correcto: ");
			curso = input.next();
		}

		return curso;
	}

	public static String pedirMateria() {
		input = new Scanner(System.in);
		String materia;
		System.out.println("ingrese materia que necesita apoyo: ");
		materia = input.next();
		while (!materia.contentEquals("taller") && !materia.contentEquals("fundamentos")
				&& !materia.contentEquals("matem�tica")) {
			System.out.println("ingrese una materia correcta: ");
			materia = input.next();
		}

		return materia;

	}

}