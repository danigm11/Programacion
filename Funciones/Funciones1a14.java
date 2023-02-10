import java.util.Scanner;

/*
 * Funciones1a14.java
 * 
 * Daniel García Mesa 27/01/2023
 * 
 * Funciones Ejs 1 a 14 y Ejercicios 15 y 16
 * 
 * 
 */


public class Funciones1a14 {
	
	public static void main (String[] args) {
		
		System.out.println("Numeros primos: ");
		
		for(int i=1;i<1001;i++){	
			if(esPrimo(i)){
				System.out.print("  "+i+"  ");
			}
		}
		System.out.println("Numeros capicua: ");
		
		for(int i=1;i<100000;i++){	
			if(esCapicua(i)){
				System.out.print("  "+i+"  ");
			}
		}
	}
	
		/*
	* Comprueba si un número es primo o no
	*
	* @param n el número que queremos comprobar
	* @return primo True=Primo , False = no primo
	*/
	
	public static boolean esPrimo(int n){
		
		boolean primo=false;
		int cont=0;
		int aux=n+1;
		
		
			for(int i=2;i<n/2;i++){
				if(n%i==0){
				cont++;
			}
		}
		if (cont==0){
			primo=true;
		}
		return primo;
	}
	public static int siguientePrimo(int n){
		
		boolean primo=false;
		int aux=n+1;
		while(!esPrimo(aux)){
			aux++;
		}
		return aux;
	}
		
	/*
	* Cuenta los dígitos de un número
	*
	* @param n el número que queremos contar sus dígitos
	* @return i el número de dígitos
	*/
	public static int digitos(int n){
		
		int i=0;
		do{
			n/=10;
			i++;
		}while(n>0);		
		return i;
	}
	/*
	* Voltea un número
	*
	* @param n el número que queremos voltear
	* @return num el número volteado
	*/
	public static int voltea(int n){
		
		int i=0;
		int num=0;
		do{
			num+=n%10;
			num*=10;
			n/=10;
			i++;
		}while(n>0);
		num/=10;		
		return num;
	}
		/*
	* Comprueba si un número es capicúa
	*
	* @param n el número que queremos comprobar
	* @return esCapicua Si es capicúa o no.
	*/
	public static boolean esCapicua(int n){
		
		boolean esCapicua= false;
		int i=0;
		int aux=n;
		int num=0;
		do{
			num+=n%10;
			num*=10;
			n/=10;
			i++;
		}while(n>0);
		num/=10;
		
		if(aux==num){
			esCapicua=true;
		}
		return esCapicua;
	}
	
	/*
	* Calcula una potencia a partir de un exponente y una base
	*
	* @param base , exponente 
	* @return el resultado de la operación
	*/
	
	public static int potencia(int base, int exponente){
		
		int potencia=1;
		for(int i=0;i<exponente;i++){
			potencia*=base;
		}
		return potencia;
	}
	/*
	* Calcula el dígito en una posición dada de un número dado
	*
	* @param n, pos número y posición
	* @return n el resultado de la operación
	*/
	public static int digitoN(int n, int pos){
		
		n=voltea(n);
		for(int i=0;i<pos;i++){
			n/=10;
		}
		return n%10;
	}
	/*
	* Calcula la posición de la primera ocurrencia de un dígito dentro de un entero
	*
	* @param n, dig número y digito
	* @return n la posición del dígito
	*/
	public static int posicionDeDigito(int n, int dig){
		
		int digitos=0;
		int aux=0;
		digitos=digitos(n);
		
		for(int i=0;i<digitos;i++){
			if(n%10==dig){
				return (digitos-i+1);
			}
			n=n/10;
		}
		return (-1);
	}
	/*
	* Le quita a un numero n digitos por detrás
	*
	* @param n, detras número y número de digito
	* @return n el número tras quitarle dígitos
	*/
	public static int quitaPorDetras(int n, int detras){
		
		for(int i=0;i<detras;i++){
			n=n/10;
		}
		return n;
	}
	/*
	* Le quita a un numero n digitos por delante
	*
	* @param n, delante número y número de digito
	* @return n el número tras quitarle dígitos
	*/
	public static int quitaPorDelante(int n, int delante){
		
		n=voltea(n);
		n=voltea(quitaPorDetras(n,delante));
		
		return n;
	}
	/*
	* Le añade a un numero un digito por detrás
	*
	* @param n, ndetras número original y número que pegar
	* @return n el número tras pegarle el dígito
	*/
	public static int pegaPorDetras(int n, int ndetras){
		
		n=n*10;
		n+=ndetras;
		return n;
	}
	/*
	* Le añade a un numero un digito por delante
	*
	* @param n, ndelante número original y número que pegar
	* @return n el número tras pegarle el dígito
	*/
	public static int pegaPorDelante(int n, int ndelante){
		
		n=voltea(n);
		n=voltea(pegaPorDetras(n,ndelante));
		
		return n;
	}
	/*
	* Coge un trozo de un numero
	*
	* @param n, posinical, posfinal número, pos inicial y pos final
	* @return n el trozo de número 
	*/
	public static int trozoDeNumero(int n, int posinicial, int posfinal){
		n=quitaPorDetras(n,digitos(n)-posfinal);
		n=quitaPorDelante(n,posinicial);
		return n;
	}
	/*
	* Junta 2 números
	*
	* @param n, n2 los 2 números que juntar
	* @return n el número tras juntar los 2 anteriores
	*/
	public static int juntaNumeros(int n, int n2){
		
		int x=digitos(n2);
		
		for(int i=0;i<x;i++){
			n*=10;
		}
		n+=n2;
		return n;
	}
}

