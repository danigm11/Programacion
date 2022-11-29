import java.util.Scanner;

/*
 * Ej7.java
 * 
 * Daniel García Mesa 29/11/2022
 * 
 * 
 * Realiza el control de acceso a una caja fuerte. La combinación será un
 * número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
 * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
 * y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 * 
 */


public class Ej7 {
	
	public static void main (String[] args) {
		
		Scanner s=new Scanner(System.in);
		int contraseña=1234;
		int cont=1;
		int i=0;
		
		while((cont<=4)&&(i!=1234)){
			cont++;
			System.out.print("Introduzca la contraseña de la caja fuerte: ");
			i=s.nextInt();
			if(i==1234){
				System.out.println("La caja fuerte se ha abierto satisfactoriamente");
			}
		}
	}
}

