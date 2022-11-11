import java.util.Scanner;

/*
 * Ej3Scanner.java
 * 
 * Daniel garcía Mesa 11/11/2022
 *  
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
 * convertir debe ser introducida por teclado.
 * 
 * 
 */


public class Ej3Scanner {
	
  public static void main (String[] args) {
	  
		Scanner s=new Scanner(System.in);
		double euros=0;
		double ptas=166.386;
		double total=0;
	
		//Lee por teclado el número de pesetas.
	
		System.out.print("Introduzca una cantidad en pesetas:");
		euros = s.nextDouble();

		//Comvierte el número de pesetas en euros y lo guarda en la variable total.
    
    total = (euros/ptas);
    
    //Muestra el total de pesetas por pantalla.
    
   	System.out.printf(euros+" Pesetas en euros es: "+" %.2f ",total);
	}
}
