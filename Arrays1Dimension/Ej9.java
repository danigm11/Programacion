import java.util.Scanner;

/*
 * Ej9.java
 * 
 * Daniel García Mesa 10/01/2023
 * 
 * Realiza un programa que pida 8 números enteros y que luego muestre esos
 * números junto con la palabra “par” o “impar” según proceda.
 * 
 * 
 */


public class Ej9 {
	
	public static void main (String[] args) {
		
		int[] array = new int[8];
		Scanner s=new Scanner(System.in);
		
		for(int i=0;i<8;i++){
			if(i==0){
				System.out.print("Introduzca el primer numero: ");
			}	else{
					System.out.print("Introduzca el siguiente numero: ");
			}
			array[i]=s.nextInt();
		}
		for(int i=0;i<8;i++){
			if((array[i]%2)==0){
				System.out.print("Par "+array[i]+"  ");
			}	else{
					System.out.print("Impar "+array[i]+"  ");
			}
			
		}
		
	}
}

