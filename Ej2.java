import java.util.Scanner;

/*
 * Ej2.java
 * 
 * Daniel García Mesa 15/11/2022
 * 
 * Realiza un programa que pida una hora por teclado y que muestre luego buenos
 * días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
 * 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
 * horas, los minutos no se deben introducir por teclado.
 * 
 * 
 */


public class Ej2 {
	
	public static void main (String[] args) {
		
		int hora=0;
		Scanner s=new Scanner(System.in);
		
		System.out.print("Introduzca una hora del día (entre 0 y 24): ");
		hora=s.nextInt();
		
		
		if((hora>=6)&&(hora<=12)){
			System.out.print("Buenos días!");
		} else if((hora>=13)&&(hora<=20)){
				System.out.print("Buenas tardes!"); 
		} else if((hora>=0)&&(hora<=5)||(hora>=21)&&(hora<=24)){
				System.out.print("Buenas noches!"); 
		} else 
				System.out.print("Hora incorrecta!");
		
	}
}

