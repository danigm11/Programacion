/*
 * LeeNumerosDec.java
 * 
 * Daniel García Mesa 8/11/2022
 * 
 *
 */
 

public class LeeNumerosDec {
	
	public static void main(String[] args) {
		String linea;
		
		//lee 2 números reales por consola utilizando los métodos System.console().readLine() y DoubleInteger.parseDouble( linea ) 
		
		System.out.print("Por favor, introduce un número: ");
		linea = System.console().readLine();
		double primerNumero;
		primerNumero = Double.parseDouble( linea );
		System.out.print("introduce otro, por favor: ");
		linea = System.console().readLine();
		double segundoNumero;
		segundoNumero = Double.parseDouble( linea );
		
		//Muestra los números leídos por pantalla utilizando el método System.out.print().
		
		System.out.print("El primer número introducido es " + primerNumero);
		System.out.println(" y el segundo es " + segundoNumero);

	}

}
