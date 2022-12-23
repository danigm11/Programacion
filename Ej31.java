import java.util.Scanner;

/*
 * Ej31.java
 * 
 * Daniel García Mesa 23/12/2022
 * 
 * Realiza el juego del “Craps”. Las reglas son las siguientes: Al comenzar la
 * partida, el jugador introduce la cantidad de dinero que quiere apostar. Se
 * muestra la tirada aleatoria de dos dados. Si entre los dos dados suman 7 u
 * 11, el jugador gana la misma cantidad que apostó y termina la partida. Por ej.
 * si apostó 1000 €, gana otros 1000 € y acaba con 2000 €. Si entre los dos dados
 * suman 2, 3 o 12, el jugador pierde todo su dinero y termina la partida. Si no se
 * da ninguno de los casos anteriores, es decir si sale 4, 5, 6, 8, 9 o 10, el juego
 * entra en una segunda etapa. En esta etapa, el jugador buscará volver a obtener
 * ese número en los dados. Si consigue repetir ese número, gana. Si sale un 7,
 * pierde. Si sale otro número, tiene que seguir tirando
 * 
 */


public class Ej31 {
	
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int n=0;
		int suma=0;
		int suma1=0;
		
		System.out.print("Introduzca la cantidad de dinero a apostar: ");
		n=s.nextInt();
		
		int x=(int)(Math.random()*6 + 1);
		int x2=(int)(Math.random()*6 + 1);
		
		suma=(x+x2);
		System.out.println("Tirada de 2 dados: "+x+" "+x2);
		System.out.println("Suma de las tiradas: "+suma);
		suma1=suma;
		
		if((suma==7)||(suma==11)){
			System.out.print("Felicidades has ganado: "+n+" euros.");
			
		}	else if((suma==2)||(suma==3)||(suma==12)){
				System.out.print("Lo siento has perdido");
			}	else{
					do{
						System.out.println("Nueva tirada:");
						 x=(int)(Math.random()*6 + 1);
						 x2=(int)(Math.random()*6 + 1);
		
						suma=(x+x2);
						System.out.println("Tirada de 2 dados: "+x+" "+x2);
						System.out.println("Suma de las tiradas: "+suma);
						
						if(suma==7){
							System.out.print("Lo siento has perdido");
						}	else if(suma==suma1){
								System.out.print("Felicidades has ganado: "+n+" euros.");
						}
					}while((suma!=suma1)||(suma==7));		
			}
		
		
	}
}

