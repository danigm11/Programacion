/*
 * Ej7.java
 * 
 * Daniel García Mesa 20/12/2022
 * 
 * Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
 * para los 14 partidos y el pleno al quince (15 filas).
 * 
 * 
 */


public class E7  {
	
	public static void main (String[] args) {
		
		
		
		System.out.println("Apuesta1 	Apuesta2 	Apuesta3");
		for(int i=0;i<15;i++){
			int n1=(int)(Math.random()*3);
			int n2=(int)(Math.random()*3);
			int n3=(int)(Math.random()*3);
			if(n1==0){
				System.out.print("   X");
			}	else{
					System.out.print("   "+n1);
			}
			System.out.print("               ");
			if(n2==0){
				System.out.print("X");
			}	else{
					System.out.print(n2);
			}
			System.out.print("              ");
			if(n3==0){
				System.out.println("X");
			}	else{
					System.out.println(n3);
			}
		}
		
	}
}

