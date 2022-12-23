import java.util.Scanner;

/*
 * Ej20.java
 * 
 * Daniel García Mesa 22/12/2022
 * 
 * Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
 * agua. La capacidad será indicada por el usuario. La cuba se llenará con una
 * cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
 * pueda admitir. El ancho de la cuba no varía.
 * 
 * 
 */


public class Ej20 {
	
	public static void main (String[] args) {
		
		Scanner s=new Scanner(System.in);
		int cap=0;
		
		System.out.print("Introduzca la capacidad: ");
		cap=s.nextInt();
		
		int n1=(int)(Math.random()*(cap-1)+1);

		
		for(int i=0;i<cap;i++){
			for(int j=0;j<6;j++){
				if(i==(cap-1)||(j==0)||(j==5)){
					System.out.print("*");
				}	else if((i<n1)){
						System.out.print(" ");
				}	else{
						System.out.print("=");
				}
			}
			System.out.println("");
		}
	}
}
		


