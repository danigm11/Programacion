import java.util.Scanner;

/*
 * Ej11.java
 * 
 * Daniel García Mesa 21/11/2022
 * 
 * Escribe un programa que dada una hora determinada (horas y minutos), calcule
 * los segundos que faltan para llegar a la medianoche.
 * 
 * 
 */


public class Ej11 {
	
	public static void main (String[] args) {
		int n=0;
		int min=0;
		int total=0;
		Scanner s;
		s=new Scanner(System.in);
		System.out.print("Introduzca la hora del día (0-23): ");
		n=s.nextInt();
		n+=1;
		System.out.print("Introduzca el minuto(0-59): ");
		min=s.nextInt();
		
		switch(n){
			case 1:
				total=(3600*23+(3600-(min*60)));
				break;
			case 2:
				total=(3600*22+(3600-(min*60)));
				break;
			case 3:
				total=(3600*21+(3600-(min*60)));
				break;
			case 4:
				total=(3600*20+(3600-(min*60)));
				break;
			case 5:
				total=(3600*19+(3600-(min*60)));
				break;	
			case 6:
				total=(3600*18+(3600-(min*60)));
				break;
			case 7:
				total=(3600*17+(3600-(min*60)));
				break;
			case 8:
				total=(3600*16+(3600-(min*60)));
				break;
			case 9:
				total=(3600*15+(3600-(min*60)));
				break;
			case 10:
				total=(3600*14+(3600-(min*60)));
				break;
			case 11:
				total=(3600*13+(3600-(min*60)));
				break;
			case 12:
				total=(3600*12+(3600-(min*60)));
				break;
			case 13:
				total=(3600*11+(3600-(min*60)));
				break;
			case 14:
				total=(3600*10+(3600-(min*60)));
				break;
			case 15:
				total=(3600*9+(3600-(min*60)));
				break;
			case 16:
				total=(3600*8+(3600-(min*60)));
				break;
			case 17:
				total=(3600*7+(3600-(min*60)));
				break;	
			case 18:
				total=(3600*6+(3600-(min*60)));
				break;
			case 19:
				total=(3600*5+(3600-(min*60)));
				break;
			case 20:
				total=(3600*4+(3600-(min*60)));
				break;
			case 21:
				total=(3600*3+(3600-(min*60)));
				break;
			case 22:
				total=(3600*2+(3600-(min*60)));
				break;
			case 23:
				total=(3600*1+(3600-(min*60)));
				break;
			case 24:
				total=(3600-(min*60));
				break;		
			default:
			System.out.print("Fecha equivocada");
		}
		System.out.print("Quedan "+total+" segundos para medianoche");
		
	}
}

