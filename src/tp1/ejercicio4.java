package tp1;

import java.util.Scanner;


public class ejercicio4
{
	static Scanner input;
	
    public static void main( String[] args )
    {
        int num1, num2;

        input = new Scanner(System.in);

        System.out.print( "Introduzca primer número: " );
        num1 = input.nextInt();

        System.out.print( "Introduzca segundo número: " );
        num2 = input.nextInt();

       

        System.out.println( "La suma entre " + num1 + " y " + num2 + " da como resultado " + (num1+num2) + "." );
    }
}