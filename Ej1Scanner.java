import java.util.Scanner;

/*
 * Ej1Scanner.java
 * 
 *Daniel García Mesa 11/11/2022
 * 
 * Ejercicio 1
 * Realiza un programa que pida dos números y que luego muestre el resultado
 * de su multiplicación.
 * 
 * 
 */


public class Ej1Scanner {
	
  public static void main (String[] args) {
	  
	Scanner s=new Scanner(System.in);
	double num1=0;
	double num2=0;
	double total=0;
	
	//Lee por teclado el primer número.
	
	System.out.print("Introduzca el primer numero:");
	num1 = s.nextDouble();

    //Lee por teclado el segundo número.
    
    System.out.print("introduce otro, por favor: ");
	num2 = s.nextDouble();
    
    //Calcula el total de la multiplicación de los 2 números leídos anteriormente.
    
    total = (num1*num2);
    
    //Muestra por pantalla el resultado de la multiplicación.
    
	System.out.println("El resultado de multiplicarlos es: "+total);
	}
}

