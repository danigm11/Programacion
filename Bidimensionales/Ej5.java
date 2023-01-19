/*
 * Ej5.java
 * 
 * Daniel García Mesa 17/01/2023
 * 
 * Realiza un programa que rellene un array de 6 filas por 10 columnas con
 * números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
 * continuación, el programa deberá dar la posición tanto del máximo como del
 * mínimo.
 * 
 * 
 */


public class Ej5 {
	
	public static void main (String[] args){
			int fila=6;
			int col=10;
			int max=0;
			int min=0;
			int pos1=0;
			int pos2=0;
			int pos3=0;
			int pos4=0;
			int[][] array = new int[fila][col];
			
			
			for(int i=0;i<fila;i++){
				System.out.println(" ");
				for(int j=0;j<col;j++){
					array[i][j]=(int)(Math.random()*1001);
					System.out.print(array[i][j]+"  ");
					if((i+j)==0){
						max=array[0][0];
						min=array[0][0];
					}
					if(array[i][j]>max){
						max=array[i][j];
						pos1=i;
						pos2=j;
					}	else if(array[i][j]<min){
						min=array[i][j];
						pos3=i;
						pos4=j;
					}
				}
			}
		System.out.print("\nMaximo= "+max+" pos: "+pos1+" "+pos2);
		System.out.print("\nMinimo= "+min+" pos: "+pos3+" "+pos4);
	}
}

