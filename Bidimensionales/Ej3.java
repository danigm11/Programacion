/*
 * Ej3.java
 * 
 * Daniel García Mesa 13/01/2023
 * 
 * Modifica el programa anterior de tal forma que los números que se introducen
 * en el array se generen de forma aleatoria (valores entre 100 y 999).
 * 
 */


public class Ej3 {
	
	public static void main (String[] args) {
		int[][] array = new int[4][5];
		int suma=0;
		int suma1=0;
		
		
		for(int i=0;i<4;i++){
			for(int j=0;j<5;j++){
				array[i][j]=(int)(Math.random()*900)+100;
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

