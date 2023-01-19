import java.util.Scanner;

/*
 * Ejemplo1.java
 * 
 * Daniel García Mesa 9/1/2023
 * 
 * Array de 10 posiciones, 0 a 5 2 elevado a posición, 6 al 9 como en el ejemplo.
 * 1-Mostrar todos elementos y posiciones.
 * 2-Preguntar cual mostrar.
 * 3-Mostrar posiciones pares y su suma. 
 * 
 */


public class Ejemplo1 {
	
	public static void main (String[] args) {
		
		System.out.println("-------Apartado 1-------- ");	
		int[] array = new int[10];
		
		for(int i=0;i<6;i++){
			array[i]=(int)Math.pow(2,i);
			System.out.println("Poiscion "+i+": "+array[i]);
		}		
		array[6] = array[2] * 10;
		array[7] = array[2] / 10;
		array[8] = array[0] + array[1] + array[2];
		array[9] = array[8];
		for(int i=6;i<10;i++){
			System.out.println("Poiscion "+i+": "+array[i]);
		}		
		
		System.out.println("-------Apartado 2-------- ");	
		int n=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Introduzca una posicion (1 al 10): ");
		n=s.nextInt();
		System.out.println("Poiscion "+n+": "+array[n]);
		
		System.out.println("-------Apartado 3-------- ");
		int suma=0;
		for(int i=0;i<10;i++){
			if(i%2==0){
				System.out.println("Poiscion "+i+": "+array[i]);
				suma+=array[i];
			}
		}	
		System.out.println("Suma: "+suma);
		
	}
}

