import java.util.Scanner;

/*
 * Ej7.java
 * 
 * Daniel García Mesa 10/01/2023
 * 
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
 * muestre por pantalla separados por espacios. El programa pedirá entonces por
 * teclado dos valores y a continuación cambiará todas las ocurrencias del primer
 * valor por el segundo en la lista generada anteriormente. Los números que se
 * han cambiado deben aparecer entrecomillados.
 * 
 * 
 */


public class Ej7 {
	
	public static void main (String[] args) {
		
		int[] array = new int[100];
		int n1=0;
		int n2=0;
		Scanner s=new Scanner(System.in);
		
		for(int i=0;i<100;i++){
			array[i]=(int)(Math.random()*21);
			System.out.print(array[i]+"  ");
		}
		System.out.println("");
		System.out.print("Escriba el valor a cambiar: ");
		n1=s.nextInt();
		System.out.print("Escriba el valor por el que cambiar: ");
		n2=s.nextInt();
		for(int i=0;i<100;i++){
			if(array[i]==n1){
				System.out.print("''"+n2+"''  ");
			}	else{
				System.out.print(array[i]+"  ");
			} 
		}
	}
}
