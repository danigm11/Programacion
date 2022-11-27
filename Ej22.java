import java.util.Scanner;

/*
 * Ej22.java
 * 
 * Daniel García Mesa 24/11/2022
 * 
 * Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
 * hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
 * Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
 * por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
 * a las 15:00h.
 * 
 */


public class Ej22 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		
		Scanner s=new Scanner(System.in);
		int n=0;
		int h=0;
		int m=0;
		int total=0;
		
		//lectura de datos por pantalla
		
		System.out.print("Introduzca un día de la semana(1-5): ");
		n=s.nextInt();
		System.out.print("Introduzca una hora(0-23)");
		h=s.nextInt();
		System.out.print("Introduzca un minuto(0-59)");
		m=s.nextInt();
		
		//Cálculp y salida por pantalla
		
			switch(n){
			case 1:
				total=(((4*24+14-h)*60)+(60-m));
				break;
			case 2:
				total=(((3*24+14-h)*60)+(60-m));
				break;
			case 3:
				total=(((2*24+14-h)*60)+(60-m));
				break;
			case 4:
				total=(((24+14-h)*60)+(60-m));
				break;
			case 5:
				total=(((14-h)*60)+(60-m));
				break;
			default:
				System.out.print("Fecha equivocada");
			}
			System.out.print("Para el fin de semana quedan: "+total+" minutos.");
	}
}

