import java.util.Scanner;

/*
 * Ej14.java
 * 
 *  Daniel García Mesa 12/01/2023
 * 
 * Escribe un programa que pida 8 palabras y las almacene en un array. A
 * continuación, las palabras correspondientes a colores se deben almacenar al
 * comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
 * auxiliares como quieras. Los colores que conoce el programa deben estar en
 * otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
 * blanco y morado.
 * 
 * 
 */


public class Ej14 {
	
	public static void main (String[] args) {
		
		int tam=8;
		int[] array= new int[tam];
		String[] array2= new String[tam];
		String[] array3= new String[tam];
		String[] array4= new String[tam];
		int n=0;
		int cont=0;
		int cont2=0;
		Scanner s=new Scanner(System.in);
		
		for(int i=0;i<tam;i++){
			System.out.print("Introduzca una palabra:");
			array2[i]=s.next();
		}
		
		System.out.println("Array original:");
		System.out.println("┌───────────┬───────────┬───────────┬───────────┬───────────┬───────────┬───────────┬───────────┐");
		System.out.print("|");
		
		for(int i=0;i<tam;i++){

			array[i]=i;
			System.out.printf("%-10s |",array[i]);
		}
		System.out.print("\n|");
		for(int i=0;i<tam;i++){
			System.out.printf("%-10s |",array2[i]);
		}
		
		for(int i=0;i<tam;i++){
			if((array2[i].equals("verde"))||(array2[i].equals("azul"))||(array2[i].equals("rojo"))||(array2[i].equals("amarillo"))||(array2[i].equals("rosa"))||(array2[i].equals("negro"))||(array2[i].equals("naranja"))||(array2[i].equals("blanco"))||(array2[i].equals("morado"))){
				array3[cont]=array2[i];
				cont++;
			}	else{
				array4[cont2]=array2[i];
				cont2++;
			}
		}
		for(int i=0;i<(tam-cont);i++){
			array3[cont+i]=array4[i];
		}
		
		System.out.println("\nArray resultado:");
		System.out.println("┌───────────┬───────────┬───────────┬───────────┬───────────┬───────────┬───────────┬───────────┐");
		System.out.print("|");
		
		for(int i=0;i<tam;i++){

			array[i]=i;
			System.out.printf("%-10s |",array[i]);
		}
		System.out.print("\n|");
		for(int i=0;i<tam;i++){
			System.out.printf("%-10s |",array3[i]);
			
		}
	}
}

