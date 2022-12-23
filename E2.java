/*
 * E2.java
 * 
 * Daniel García Mesa 20/12/2022
 * 
 * Realiza un programa que muestre al azar el nombre de una carta de la baraja
 * francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes
 * y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son
 * numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el 1)
 * 
 */


public class E2 {
	
	public static void main (String[] args) {
		int n=(int)(Math.random()*4+1);
		int p=(int)(Math.random()*13+1);
			
		
		
		switch (p){
			case 1:{
				System.out.print("A");
				break;
			}
			case 11:{
				System.out.print("J");
				break;
			}
			case 12:{
				System.out.print("Q");
				break;
			}
			case 13:{
				System.out.print("K");
				break;
			}
			default:{
				System.out.print(p);
			}
			
		}														 
		switch(n){
			case 1:{
				System.out.print(" de picas");
				break;
			}
			case 2:{
				System.out.print(" de corazones");
				break;
			}
			case 3:{
				System.out.print(" de diamantes");
				break;
			}
			case 4:{
				System.out.print(" de treboles");
				break;
			}
		}		
		
	}
}

