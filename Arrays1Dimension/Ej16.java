import java.util.Scanner;

/*
 * Ej16.java
 * 
 * Daniel García Mesa 12/01/2023
 * 
 * Escribe un programa que rellene un array de 20 elementos con números enteros
 * aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación el
 * programa mostrará el array y preguntará si el usuario quiere resaltar los
 * múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el array
 * escribiendo los números que se quieren resaltar entre corchetes.
 * 
 * 
 */

public class Ej16 {
	
	public static void main (String[] args) {
		
		Scanner s=new Scanner(System.in);
		int control=0;
		int[] array=new int[20];
		
		for(int i=0;i<20;i++){
			array[i]=(int)(Math.random()*401);
			System.out.print(array[i]+"  ");
		}
		System.out.print("\nQue quiere destacar? (1 - multiplos 5, 2 - multiplos 7): ");
		control=s.nextInt();
		if(control==1){
			for(int i=0;i<20;i++){
				if(array[i]%5==0){
					System.out.print("["+array[i]+"]  ");
				}	else{
						System.out.print(array[i]+"  ");
				}
		}
		}	else if(control==2){
				for(int i=0;i<20;i++){
					if(array[i]%7==0){
					System.out.print("["+array[i]+"]  ");
				}	else{
						System.out.print(array[i]+"  ");
				}
		}
			
		}
		
	}
}
