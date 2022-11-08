/*
 * Ej1.java
 * 
 *Daniel García Mesa 8/11/2022
 * 
 * Ejercicio 1
 * Realiza un programa que pida dos números y que luego muestre el resultado
 * de su multiplicación.
 * 
 * 
 */


public class Ej1 {
	
  public static void main (String[] args) {
	  
	String linea;
	double num1=0;
	double num2=0;
	double total=0;
	
	//Lee por teclado el primer número.
	
	System.out.print("Introduzca el primer numero:");
	linea = System.console().readLine();
	num1 = Double.parseDouble( linea );

    //Lee por teclado el segundo número.
    
    System.out.print("introduce otro, por favor: ");
	linea = System.console().readLine();
	num2 = Double.parseDouble( linea );
    
    //Calcula el total de la multiplicación de los 2 números leídos anteriormente.
    
    total = (num1*num2);
    
    //Muestra por pantalla el resultado de la multiplicación.
    
	System.out.println("El resultado de multiplicarlos es: "+total);
	}
}

