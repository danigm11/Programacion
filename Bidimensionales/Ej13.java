/*
 * Ej13.java
 * 
 * Daniel García Mesa 17/01/2023
 * 
 * Realiza un programa que calcule la estatura media, mínima y máxima en
 * centímetros de personas de diferentes países. El array que contiene los
 * nombres de los paises es el siguiente: pais = {“España”, “Rusia”, “Japón”,
 * “Australia”}. Los datos sobre las estaturas se deben simular mediante un
 * array de 4 filas por 10 columnas con números aleatorios generados al azar entre
 * 140 y 210. Los decimales de la media se pueden despreciar. Los nombres de
 * los países se deben mostrar utilizando el array de países (no se pueden escribir
 * directamente).
 * 
 * 
 */


public class Ej13 {
	
	public static void main (String[] args) {
		int fila=4;
		int col=10;
		int c=0;
		int max=0;
		int min=0;
		double media=0;
		int[][] array = new int[fila][col];
		String[] arrayPaises = new String[fila];
		arrayPaises[0]="España";
		arrayPaises[1]="Rusia";
		arrayPaises[2]="Japon";
		arrayPaises[3]="Australia";
		
		System.out.println("                                                              MED   MIN   MAX");
		for(int i=0;i<fila;i++){
			System.out.printf("%-10s :",arrayPaises[i]);
			for(int j=0;j<col;j++){
				array[i][j]=(int)(Math.random()*71)+140;
				System.out.printf("%-5s",array[i][j]);
				if(j==0){
					max=array[i][j];
					min=array[i][j];
					media=0;
				}
				if(array[i][j]>max){
					max=array[i][j];
				}	else if(array[i][j]<min){
					min=array[i][j];					
				}
				media+=array[i][j];
			}
			System.out.println((int)media/col+"   "+min+"   "+max);
		}
	}
}

