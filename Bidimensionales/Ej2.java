import java.util.Scanner;

/*
 * Ej2.java
 * 
 * Daniel García Mesa 13/01/2023
 * 
 * Escribe un programa que pida 20 números enteros. Estos números se deben
 * introducir en un array de 4 filas por 5 columnas. El programa mostrará las
 * sumas parciales de filas y columnas igual que si de una hoja de cálculo se
 * tratara. La suma total debe aparecer en la esquina inferior derecha.
 * 
 */


public class Ej2 {
	
	public static void main (String[] args) {
		int[][] array = new int[4][5];
		int suma=0;
		int suma1=0;
		Scanner s=new Scanner(System.in);
		
		
		for(int i=0;i<4;i++){
			for(int j=0;j<5;j++){
				System.out.print("Introduzca un numero entero: ");
				array[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<4;i++){
			for(int j=0;j<5;j++){
				System.out.print(array[i][j]+" ");
				suma+=array[i][j];
			}
			System.out.println(" La suma es: "+suma);
			suma1+=suma;
			suma=0;
		}
		for(int j=0;j<5;j++){
			for(int i=0;i<4;i++){
				suma+=array[i][j];
			}
			System.out.println(" La suma  de la columna "+(j+1)+" es: "+suma);
			suma=0;
		}
		System.out.println("La suma total es: "+suma1);
	}
}

