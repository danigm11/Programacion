/*
 * Ej11.java
 * 
 * Daniel García Mesa 17/01/2023
 * 
 * Realiza un programa que muestre por pantalla un array de 10 filas por 10
 * columnas relleno con números aleatorios entre 200 y 300. A continuación, el
 * programa debe mostrar los números de la diagonal que va desde la esquina
 * superior izquierda a la esquina inferior derecha, así como el máximo, el mínimo
 * y la media de los números que hay en esa diagonal.
 * 
 * 
 */


public class Ej11 {
	
	public static void main (String[] args){
		int fila=10;
		int col=10;
		int max=0;
		int min=0;
		double media=0;
		int[][] array = new int[fila][col];
			
			
		for(int i=0;i<fila;i++){
			System.out.println(" ");
			for(int j=0;j<col;j++){
				array[i][j]=(int)(Math.random()*101)+200;
				System.out.print(array[i][j]+"  ");
			}
		}
		for(int i=0;i<fila;i++){
			if(i==0){
				max=array[0][0];
				min=array[0][0];
			}
			if(array[i][i]>max){
				max=array[i][i];
			}	else if(array[i][i]<min){
					min=array[i][i];
			}
			media+=array[i][i];
		}
			
		System.out.println("\nMaximo= "+max+" Minimo= "+min);
		System.out.print("Media= "+(media/fila));
	}
}

