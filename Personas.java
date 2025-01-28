//leer nombre y edad de 10 personas y visualizar el nombre de las que tienen más edad

import java.util.Scanner;
import java.util.InputMismatchException;

public class Personas {

	public static void main(String[] args) {
		String nombre=" ";
		int nota=0;
		int notaMayor=0;
		String nombreMayor=" ";
		int contador=1;
		int array[]= new int[6];
		int j=0;
		array[j]=nota;

	for(int i=1; i<=5; i++)
	{	
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Nombre del alumno nº " + contador);
		nombre = scan.nextLine();   
		
	boolean esCorrecto=false;
	while(!esCorrecto)
	{
	try{        

		System.out.println("Introduce la nota:"); 
		nota = scan.nextInt(); 
		
		if(nota<0 || nota>10)
		{
			throw new IllegalArgumentException("nota incorrecta");
		}
	esCorrecto=true;
	}
	catch(InputMismatchException e){
		System.out.println("no es posible");
				scan.nextLine();

	}
	catch(IllegalArgumentException e2){
		System.out.println(e2.getMessage());
			scan.nextLine();
	}
	}
	if(nota>notaMayor){
		notaMayor=nota;
		nombreMayor=nombre;
	}
		contador++;
	}
	if (array[j]==notaMayor){
		System.out.println("las posiciones con las notas mayores son: " + array[j]);
		}
	
	System.out.println("el nombre de mayor edad es: " + nombreMayor + " con la edad: " + notaMayor);

	}
	
}