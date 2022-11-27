import java.util.Scanner;

/*
 * Ej21.java
 * 
 * Daniel García Mesa 24/11/2022
 * 
 * Calcula la nota de un trimestre de la asignatura Programación. El programa
 * pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
 * Si la media de los dos controles da un número mayor o igual a 5, el alumno
 * está aprobado y se mostrará la media. En caso de que la media sea un número
 * menor que 5, el alumno habrá tenido que hacer el examen de recuperación que
 * se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál
 * ha sido el resultado de la recuperación? (apto/no apto). Si el resultado
 * de la recuperación es apto, la nota será un 5; en caso contrario, se mantiene
 * la nota media anterior.
 * 
 * 
 */


public class Ej21 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		
		Scanner s=new Scanner(System.in);
		double nota=0;
		double nota2=0;
		double media=0;
		int apto=0;
		
		//Lectura de notas
		
		System.out.print("Introduzca nota primer examen: ");
		nota=s.nextDouble();
		System.out.print("Introduzca nota segundo examen: ");
		nota2=s.nextDouble();
		
		//Cálculo media
		
		media=(nota+nota2)/2;
		
		//Salida por pantalla 
		
		if(media>=5){
			System.out.print("El alumno está aprobado con media: "+media);
		} else{
				System.out.print("Introduzca nota examen recuperación(1 para apto/2 para no apto): ");
				apto=s.nextInt();
				if(apto==1){
					System.out.print("El alumno está aprobado con media 5");
				}	else{
					System.out.print("El alumno no está aprobado con media: "+media);
				}
		}	
	}
}

