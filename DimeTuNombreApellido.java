/*
 * DimeTuNombreApellido.java
 * 
 * Daniel García Mesa 8/11/2022
 * 
 * 
 * 
 * 
 */

public class DimeTuNombreApellido {
	
	public static void main(String[] args) {
		String nombre;
		String apellido;
		System.out.print("Por favor, dime tu nombre: ");
		nombre = System.console().readLine();
		System.out.print("Por favor, dime tus apellidos: ");
		apellido = System.console().readLine();
		System.out.println("Hola " + nombre +" "+apellido+ ", ¡encantado de conocerte!");
}

}
