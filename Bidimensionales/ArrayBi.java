/*
 * ArrayBi.java
 * 
 * Daniel García Mesa 17/01/2023
 * 
 * Crear ejemplo de la pizarra con un array bidimensional
 * 
 * 
 */


public class ArrayBi {
	
	public static void main (String[] args) {
		
		int fila=5;
		int col=10;
		int[][] array= new int[fila][col];
		
		for(int i=0;i<fila;i++){
			System.out.println("");
			for(int j=0;j<col;j++){
				array[i][j]=((j*10)+(i*2));
				System.out.printf("%-3s",array[i][j]);
			}
		}
		
	}
}

