/*
 * E1.java
 * 
 * Daniel García Mesa 16/12/2022
 * 
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
 * también la suma total (los puntos que suman entre los tres dados).
 * 
 */


public class E1 {
	
	public static void main (String[] args) {
		
		int suma=0;
		int x=(int)(Math.random()*6 + 1);
		int x2=(int)(Math.random()*6 + 1);
		int x3=(int)(Math.random()*6 + 1);
		
		suma=(x+x2+x3);
		System.out.println("Tirada de 3 dados: "+x+" "+x2+" "+x3);
		System.out.print("Suma de las tiradas: "+suma);
		
	}
}

