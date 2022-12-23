import java.util.Scanner;

/*
 * Ej17.java
 * 
 * Daniel García Mesa 21/12/2022
 * 
 * Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
 * Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
 * serán de 4 unidades. No hay que comprobar que los datos se introducen
 * correctamente; podemos suponer que el usuario los introduce bien. Dentro de
 * la pecera hay que colocar de forma aleatoria un pececito, que puede estar
 * situado en cualquiera de las posiciones que quedan en el hueco que forma el
 * rectángulo.
 * 
 */


public class Ej17 {
	
	public static void main (String[] args) {
		
		Scanner s=new Scanner(System.in);
		int alt=0;
		int anch=0;
		
		System.out.print("Introduzca la altura de la pecera: ");
		alt=s.nextInt();
		System.out.print("Introduzca la anchura de la pecera: ");
		anch=s.nextInt();
		
		int n1=(int)(Math.random()*(alt-2)+1);
		int n2=(int)(Math.random()*(anch-2)+1);
		
		for(int i=0;i<alt;i++){
			for(int j=0;j<anch;j++){
				if((i==0)||(i==(alt-1))||(j==0)||(j==(anch-1))){
					System.out.print("*");
				}	else if((i==n1)&&(j==n2)){
						System.out.print("&");
				}	else{
						System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}

