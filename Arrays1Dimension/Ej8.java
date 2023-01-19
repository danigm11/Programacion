import java.util.Scanner;

/*
 * Ej8.java
 * 
 * Daniel García Mesa 10/01/2023
 * 
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes
 * de un determinado año y que muestre a continuación un diagrama de barras
 * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
 * de asteriscos o cualquier otro carácter.
 * 
 */


public class Ej8 {
	
	public static void main (String[] args) {
		
		int[] array = new int[12];
		int n1=0;
		int n2=0;
		Scanner s=new Scanner(System.in);
		for(int i=0;i<12;i++){
			if(i==0){
				System.out.print("Introduzca la temperatura del primer mes: ");
			}	else{
					System.out.print("Introduzca la temperatura del mes "+(i+1)+":");
			}
			array[i]=s.nextInt();
		}
		System.out.println("Diagramas de temperaturas: ");
		System.out.println(" ");
		for(int j=0;j<12;j++){
			for(int i=0;i<array[j];i++){
				System.out.print("|");
			}
			System.out.println(" ");
		}
		
	}
}
