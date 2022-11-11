import java.util.Scanner;

/*
 * 
 * Ejercicio2Scanner.java
 * 
 * Daniel García Mesa 11/11/2022
 * 
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
 * convertir debe ser introducida por teclado.
 * 
 * 
 */


public class Ej2Scanner {
	
  public static void main (String[] args) {
	  
	Scanner s= new Scanner(System.in);
	double euros=0;
	double ptas=166.386;
	double total=0;
	
	//Lee por teclado el número de euros.
	
	System.out.print("Introduzca una cantidad en euros:");
	euros =s.nextDouble();

  //Comvierte el número de euros en pesetas y lo guarda en la variable total.
    
    total = (euros*ptas);
    
    //Muestra el total de pesetas por pantalla.
    
    
	System.out.println(euros+" Euros en pesetas es: "+(int)total);
	}
}
