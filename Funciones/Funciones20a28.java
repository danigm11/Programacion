import java.util.Scanner;

/*
 * Funciones20a28.java
 * 
 * Daniel García Mesa 31/01/2023
 * 
 * Crea una biblioteca de funciones para arrays (de una dimensión) de números
 * enteros que contenga las siguientes funciones:
 * 
 * 
 */


public class Funciones20a28 {
	
	public static void main (String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int[] array=generaArrayInt(5,2,12);
		int n=10;
		
		muestraArray(array);
		array=rotaIzquierdaArrayInt(array);
		muestraArray(array);
	}
	
	/*
	* Genera un array de tamaño n con números aleatorios
  * cuyo intervalo (mínimo y máximo) se indica como parámetro.
	*
	* @param n (longitud), min(minimo valor posible), max(maximo valor posible)   
	* @return el array generado
	*/
	
	public static int[] generaArrayInt(int n, int min, int max){
		
		int[] array= new int[n];
		int x=max-min;
		for(int i=0;i<n;i++){
			array[i]=(int)(Math.random()*x)+min;
		}
		return array;
	}
	
	public static void muestraArray(int x[]) {
		for (int i = 0; i < x.length; i++) {
    System.out.print(x[i] + " ");
		}
		System.out.println();
	}
	/*
	* Devuelve el mínimo del array que se pasa como parámetro
	*
	* @param array   
	* @return x, el minimo del array
	*/
	
	public static int minimoArrayInt(int[] array){
		
		int x=0;
		for(int i=0;i<array.length;i++){
			if((i==0)||(array[i]<x)){
				x=array[i];
			}
		}
		return x;
	}
	/*
	* Devuelve el máximo del array que se muestra como parámetro
	*
	* @param array   
	* @return x, el máximo del array
	*/
	
	public static int maximoArrayInt(int[] array){
		
		int x=0;
		for(int i=0;i<array.length;i++){
			if((i==0)||(array[i]>x)){
				x=array[i];
			}
		}
		return x;
	}
	/*
	* Devuelve la media del array que se pasa como parámetro
	*
	* @param array   
	* @return suma/array.length, la media del array
	*/
	
	public static double mediaArrayInt(int[] array){
		
		double suma=0;
		for(int i=0;i<array.length;i++){
			suma+=array[i];
		}
		return (suma/array.length);
	}
	/*
	* Devuelve si un número está en un array o no
	*
	* @param array   
	* @return esta, booleano que indica si está o no dentro del array
	*/
	
	public static boolean estaEnArrayInt(int[] array, int n){
		
		boolean esta=false;
		
		for(int i=0;i<array.length;i++){
			if(array[i]==n){
				esta=true;
			}
		}
		return esta;
	}
	/*
	* Devuelve la posición un número en un array
	*
	* @param array, n número que buscar en el array
	* @return i posicion del numero dentro del array, -1 en caso de no encontrarlo
	*/
	
	public static int posicionEnArray(int[] array, int n){
		
		for(int i=0;i<array.length;i++){
			if(array[i]==n){
				return i;
			}
		}
		return -1;
	}
	/*
	* Voltea un array
	*
	* @param array
	* @return arrayv array volteado
	*/
	
	public static int[] volteaArrayInt(int[] array){
		
		int[] arrayv = new int[array.length];
		int x=array.length-1;
		for(int i=0;i<array.length;i++){
			arrayv[x]=array[i];
			x--;
		}
		return arrayv;
	}
	/*
	* Rota a la derecha un array
	*
	* @param array
	* @return arrayv array rotado
	*/
	
	public static int[] rotaDerechaArrayInt(int[] array){
		
		int[] arrayv = new int[array.length];
		int x=1;
		for(int i=0;i<array.length;i++){
			if(i==array.length-1){
				arrayv[0]=array[i];
			}	else{
				arrayv[x]=array[i];
				x++;
			}
			
		}
		return arrayv;
	}
	/*
	* Rota a la izquierda un array
	*
	* @param array
	* @return arrayv array rotado
	*/
	
	public static int[] rotaIzquierdaArrayInt(int[] array){
		
		int[] arrayv = new int[array.length];
		int x=1;
		for(int i=0;i<array.length;i++){
			if(i==array.length-1){
				arrayv[i]=array[0];
			}	else{
				arrayv[i]=array[x];
				x++;
			}
			
		}
		return arrayv;
	}
}

