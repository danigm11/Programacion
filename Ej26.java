import java.util.Scanner;

/*
 * Ej26.java
 * 
 * Daniel García Mesa 25/11/2022
 * 
 * Realiza un programa que calcule el precio de unas entradas de cine en función
 * del número de personas y del día de la semana. El precio base de una entrada
 * son 8 euros. El miércoles (día del espectador), el precio base es de 5 euros. Los
 * jueves son el día de la pareja, por lo que la entrada para dos cuesta 11 euros.
 * Con la tarjeta CineCampa se obtiene un 10% de descuento. Si un jueves, un
 * grupo de 6 personas compran entradas, el precio total sería de 33 euros ya
 * que son 3 parejas; pero si es un grupo de 7, pagarán 3 entradas de pareja más
 * 1 individual que son 41 euros (33 + 8).
 * 
 * 
 */


public class Ej26 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		
		Scanner s=new Scanner(System.in);
		int num=0;
		int dia=0;
		double precio=0;
		double total=0;
		double desc=0;
		String tarjeta="";
		
		//lectura de datos por pantalla
		
		System.out.print("Introduzca el numero de entradas: ");
		num=s.nextInt();
		System.out.print("Introduzca el dia de la semana(1-7): ");
		dia=s.nextInt();
		System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
		tarjeta=s.next();
		
		//Cálculo del precio
		switch(dia){
		case 1:{
		precio=8;
		break;
		}
		case 2:{
		precio=8;
		break;
		}
		case 3:{
		precio=5;
		break;
		}
		case 4:{
		precio=5.50;
		break;
		}
		case 5:{
		precio=8;
		break;
		}
		case 6:{
		precio=8;
		break;
		}
		case 7:{
		precio=8;
		break;
		}
		}
		if(dia==4){
			total=2.50;
		}
		total+=(precio*num);
		if (tarjeta.equalsIgnoreCase("s")){
		desc=total*0.1;
		}
		
		//Salida por pantalla
		
		System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
		System.out.println("Entradas individuales: "+num);
		System.out.println("Precio por entradas individuales: "+precio);
		System.out.println("Total. "+total);
		System.out.println("Descuento: "+desc);
		System.out.println("A pagar: "+(total-desc));
		
	}
}

