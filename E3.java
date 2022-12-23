/*
 * E3.java
 * 
 * Daniel García Mesa 20/12/2022
 * 
 * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
 * de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 * 
 * 
 */


public class E3 {
	
	public static void main (String[] args) {
		int n=(int)(Math.random()*4+1);
		int p=(int)(Math.random()*10+1);
			
		
		
		switch (p){
			case 1:{
				System.out.print("As");
				break;
			}
			case 8:{
				System.out.print("Sota");
				break;
			}
			case 9:{
				System.out.print("Caballo");
				break;
			}
			case 10:{
				System.out.print("Rey");
				break;
			}
			default:{
				System.out.print(p);
			}
			
		}														 
		switch(n){
			case 1:{
				System.out.print(" de bastos");
				break;
			}
			case 2:{
				System.out.print(" de oros");
				break;
			}
			case 3:{
				System.out.print(" de copas");
				break;
			}
			case 4:{
				System.out.print(" de espadas");
				break;
			}
		}	
		
	}
}

