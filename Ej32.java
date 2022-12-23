import java.util.Scanner;

/*
 * Ej32.java
 * 
 * Daniel García Mesa 23/12/2022
 * 
 * Realiza un programa que pinte un sendero aleatorio. Los bordes se pintan con
 * el carácter “|”. La anchura del sendero siempre es la misma, los dos caracteres
 * del borde más cuatro caracteres en medio, en total 6 caracteres (incluyendo
 * espacios). A cada metro, el sendero puede continuar recto, girar un carácter a
 * la izquierda o girar un carácter a la derecha, por supuesto de forma aleatoria.
 * Por cada metro de sendero - representado por una línea - puede que haya un
 * obstáculo o puede que no, la probabilidad es del 50%. La posición del obstáculo
 * es aleatoria dentro de la línea. En caso de existir un obstáculo en un metro de
 * sendero (en una línea), puede ser una planta (carácter *) o una piedra (carácter
 * O), la probabilidad de que salga uno u otro es la misma. Recuerda que nunca
 * habrá más de un obstáculo por metro de sendero, habrá uno o ninguno.
 * 
 * 
 */


public class Ej32 {
	
	public static void main (String[] args) {
		
		Scanner s=new Scanner(System.in);
		int largo=0;
		int n=0;
		String obstaculo="";
		System.out.print("Introduzca la longitud del sendero: ");
		largo=s.nextInt();
		for(int i=0;i<largo;i++){
			int n1=(int)(Math.random()*2 + 1);
			int n2=(int)(Math.random()*3 + 1);
			if(n1==1){
				obstaculo="0";
			}	else{
					obstaculo="*";
			}
			n=(int)(Math.random()*10);
			if(n2==1){
			System.out.print("     ");
			}	else if(n2==2){
					System.out.print("      ");
				}	else{
						System.out.print("    ");
				}
			for(int j=0;j<6;j++){
				if((j==0)||(j==5)){
					System.out.print("|");
				}	else if(j==n){
						System.out.print(obstaculo);
				}	else{
						System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
	}
}

