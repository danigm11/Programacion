import java.util.Scanner;

/*
 * Ej10.java
 * 
 * Daniel García Mesa 21/11/2022
 * 
 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de
 * nacimiento.
 */


public class Ej10 {
	
	public static void main (String[] args) {
		
		int n=0;
		double dia=0;
		Scanner s;
		s=new Scanner(System.in);
		System.out.print("Introduzca el mes de nacimiento(1-12): ");
		n=s.nextInt();
		System.out.print("Introduzca el dia del mes(1-31): ");
		dia=s.nextDouble();
		
		switch(n){
			case 1:
				if((dia>0.0)&&(dia<20.0)){
					System.out.print("Capricornio ");
				}	else if((dia>19.0)&&(dia<32.0)){
						System.out.print("Acuario ");
				} else{
					  System.out.print("Fecha equivocada");
				}
				break;
			case 2:
				
				if((dia>0)&&(dia<19)){
					System.out.print("Acuario ");
				}	else if((dia>18)&&(dia<30)){
						System.out.print("Piscis ");
				} else{
					  System.out.print("Fecha equivocada");
				}
				break;
			case 3:
				if((dia>0)&&(dia<21)){
					System.out.print("Piscis ");
				}	else if((dia>20)&&(dia<32)){
						System.out.print("Aries ");
				} else{
					  System.out.print("Fecha equivocada");
				}
				break;
			case 4:
				if((dia>0)&&(dia<20)){
					System.out.print("Aries ");
				}	else if((dia>19)&&(dia<31)){
						System.out.print("Tauro ");
				} else{
					  System.out.print("Fecha equivocada");
				}
				break;
			case 5:
				if((dia>0)&&(dia<21)){
					System.out.print("Tauro ");
				}	else if((dia>15)&&(dia<32)){
					System.out.print("Géminis ");
				} else{
					  System.out.print("Fecha equivocada");
				}
				break;	
			case 6:
				if((dia>0)&&(dia<20)){
					System.out.print("Géminis ");
				}	else if((dia>19)&&(dia<31)){
					System.out.print("Cáncer ");
				} else{
					  System.out.print("Fecha equivocada");
				}
				break;
			case 7:
				if((dia>0)&&(dia<23)){
					System.out.print("Cáncer ");
				}	else if((dia>22)&&(dia<32)){
						System.out.print("Leo ");
				} else{
					  System.out.print("Fecha equivocada");
				}
				break;
			case 8:
					if((dia>0)&&(dia<23)){
					System.out.print("Leo ");
				}	else if((dia>22)&&(dia<32)){
					System.out.print("Virgo ");
				} else{
					  System.out.print("Fecha equivocada");
				}
				break;
			case 9:
				if((dia>0)&&(dia<24)){
					System.out.print("Virgo ");
				}	else if((dia>23)&&(dia<32)){
						System.out.print("Libra ");
				} else{
					  System.out.print("Fecha equivocada");
				}
				break;
			case 10:
				if((dia>0)&&(dia<23)){
					System.out.print("Libra ");
				}	else if((dia>22)&&(dia<32)){
						System.out.print("Escorpio ");
				} else{
					  System.out.print("Fecha equivocada");
				}
				break;
			case 11:
				if((dia>0)&&(dia<22)){
					System.out.print("Escorpio ");
				}	else if((dia>21)&&(dia<32)){
						System.out.print("Sagitario ");
				} else{
					  System.out.print("Fecha equivocada");
				}
				break;
			case 12:
				if((dia>0)&&(dia<22)){
					System.out.print("Sagitario ");
				}	else if((dia>21)&&(dia<32)){
					System.out.print("Capricornio ");
				} else{
					  System.out.print("Fecha equivocada");
				}
				break;	
			default:
			System.out.print("Fecha equivocada");
		}
		
	}
}

