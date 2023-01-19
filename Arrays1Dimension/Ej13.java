import java.util.Scanner;

/*
 * Ej13.java
 * 
 * Daniel García Mesa 10/01/2023
 * 
 * Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
 * el programa mostrará el array y preguntará si el usuario quiere destacar el
 * máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
 * el número destacado entre dobles asteriscos.
 * 
 * 
 */


public class Ej13 {
	
	public static void main (String[] args) {
		
		Scanner s=new Scanner(System.in);
		int control=0;
		int max=0;
		int min=0;
		int[] array=new int[100];
		
		for(int i=0;i<100;i++){
			array[i]=(int)(Math.random()*501);
			if(i==0){
				max=array[0];
				min=array[0];
			}
			if(array[i]>max){
				max=array[i];
			}
			if(array[i]<min){
				min=array[i];
			}
			System.out.print(array[i]+"  ");
		}
		System.out.print("\nQue quiere destacar? (1 - minimo, 2 - maximo):");
		control=s.nextInt();
		if(control==1){
			for(int i=0;i<100;i++){
				if(array[i]==min){
					System.out.print("--"+array[i]+"--  ");
				}	else{
						System.out.print(array[i]+"  ");
				}
		}
		}	else if(control==2){
				for(int i=0;i<100;i++){
					if(array[i]==max){
						System.out.print("--"+array[i]+"--  ");
					}	else{
						System.out.print(array[i]+"  ");
					}
		}
			
		}
		
	}
}

