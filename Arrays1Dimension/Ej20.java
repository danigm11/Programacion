import java.util.Scanner;

/*
 * Ej20.java
 * 
 * Daniel García Mesa 16/01/2023
 * 
 * Implementa un programa que calcule la denominación ordinal de los reyes de
 * una secuencia histórica. El programa solicitará la cantidad de reyes que se
 * van a introducir, y a continuación recibirá los nombres de los reyes. Presentará
 * por pantalla dichos nombres, pero colocándoles el ordinal correspondiente. Así,
 * por ejemplo, si hay dos Felipes en los nombres de los reyes, el primero debería
 * aparecer como Felipe 1º y el segundo como Felipe 2º.
 * 
 * 
 */


public class Ej20 {
	
	public static void main (String[] args) {
		
		Scanner s=new Scanner(System.in);
		int tam=0;
		System.out.print("Introduzca la cantidad de reyes: ");
		tam=s.nextInt();
		String[] array=new String[tam];
		for(int i=0;i<tam;i++){
			System.out.print("Introduzca nombre del "+(i+1)+"º rey: ");
			array[i]=s.next();
		}
		System.out.println("Los reyes introducidos son: ");
		for(int i=0;i<tam;i++){
			int cont=1;
			for(int j=0;j<i;j++){
				if(array[i].equals(array[j])){
					cont++;
				}
			}
			System.out.println(array[i]+" "+cont+"º");
		}

	}
}

