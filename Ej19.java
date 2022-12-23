/*
 * E19.java
 * 
 * Daniel García Mesa 22/12/2022
 * 
 * Escribe un programa que muestre 50 números enteros aleatorios comprendidos 
 * entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra luego
 * el máximo de los pares el mínimo de los impares y la media de todos los
 * números generados.
 * 
 */


public class Ej19 {
	
	public static void main (String[] args) {
		
		int suma=0;
		double media=0;
		int max=0;
		int min=200;
		
		for(int i=0;i<50;i++){
			int x=(int)(Math.random()*300-100);
			System.out.print(x+" ");
			suma+=x;
			if((x%2==0)&&(x>max)){
				max=x;
			}
			if((x%2!=0)&&(x<min)){
				min=x;
			}
		}
		media=suma/50;
		System.out.println("\nEl maximo es: "+max);
		System.out.println("El minimo es: "+min);
		System.out.printf("La media es: %.2f",media);
	}
}
