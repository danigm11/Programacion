/*
 * E5.java
 * 
 * Daniel García Mesa 16/12/2022
 * 
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 * separados por espacios. Muestra también el máximo, el mínimo y la media
 * de esos números.
 * 
 * 
 */


public class E5 {
	
	public static void main (String[] args) {
		
		int suma=0;
		double media=0;
		int max=0;
		int min=199;
		
		for(int i=0;i<50;i++){
			int x=(int)(Math.random()*100+100);
			System.out.print(x+" ");
			suma+=x;
			if(x>max){
				max=x;
			}
			if(x<min){
				min=x;
			}
		}
		media=suma/50;
		System.out.println("\nEl maximo es: "+max);
		System.out.println("El minimo es: "+min);
		System.out.printf("La media es: %.2f",media);
	}
}

