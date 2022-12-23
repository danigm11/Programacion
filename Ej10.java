/*
 * Ej10.java
 * 
 * Daniel García Mesa 20/12/2022
 * 
 * Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
 * El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno
 * de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud aleatoria
 * entre 1 y 40 caracteres.
 *  
 */


public class Ej10 {
	
	public static void main (String[] args) {
		
		String c="";
		
		for(int i=0;i<10;i++){
			int n=(int)(Math.random()*7);
			int n1=(int)(Math.random()*40);
			switch(n){
				case 0:{
					c="*";
					break;
				}
				case 1:{
					c="-";
					break;
				}case 2:{
					c="=";
					break;
				}case 3:{
					c=".";
					break;
				}case 4:{
					c="|";
					break;
				}case 5:{
					c="@";
					break;
				}
			}
			for(int j=0;j<n1;j++){
				System.out.print(c);
			}
			System.out.println("");
		}
	
	}
}

