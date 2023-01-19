/*
 * Ej12.java
 * 
 * Daniel García Mesa 17/01/2023
 * 
 * Realiza un programa que muestre por pantalla un array de 9 filas por 9
 * columnas relleno con números aleatorios entre 500 y 900. A continuación, el
 * programa debe mostrar los números de la diagonal que va desde la esquina
 * inferior izquierda a la esquina superior derecha, así como el máximo, el mínimo
 * y la media de los números que hay en esa diagonal.
 * 
 * 
 */


public class Ej12 {
	
	public static void main (String[] args){
		int fila=9;
		int col=9;
		int c=0;
		int max=0;
		int min=0;
		double media=0;
		int[][] array = new int[fila][col];
			
			
		for(int i=0;i<fila;i++){
			System.out.println(" ");
			for(int j=0;j<col;j++){
				array[i][j]=(int)(Math.random()*401)+500;
				System.out.print(array[i][j]+"  ");
			}
		}
		for(int i=(fila-1);i>=0;i--){
			if((i==(fila-1))&&(c==0)){
				max=array[i][c];
				min=array[i][c];
			}
			if(array[i][c]>max){
				max=array[i][c];
			}	else if(array[i][c]<min){
				min=array[i][c];
			}
			media+=array[i][c];
			c++;
  	}
			
		System.out.println("\nMaximo= "+max+" Minimo= "+min);
		System.out.print("Media= "+(media/fila));
	}
}
