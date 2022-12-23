/*
 * E4.java
 * 
 * Daniel García Mesa 16/12/2022
 * 
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
 * también la suma total (los puntos que suman entre los tres dados).
 * 
 */


public class E4 {
	
	public static void main (String[] args) {
		

		for(int i=0;i<20;i++){
			int x=(int)(Math.random()*11);
			System.out.print(x+" ");
		}
		
	}
}
