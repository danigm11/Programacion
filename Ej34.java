import java.util.Scanner;

/*
 * Ej34.java
 * 
 * Daniel García Mesa 6/12/2022 
 *  
 * Escribe un programa que pida dos números por teclado y que luego mezcle en
 * dos números diferentes los dígitos pares y los impares. Se van comprobando los
 * dígitos de la siguiente manera: primer dígito del primer número, primer dígito
 * del segundo número, segundo dígito del primer número, segundo dígito del
 * segundo número, tercer dígito del primer número… Para facilitar el ejercicio,
 * podemos suponer que el usuario introducirá dos números de la misma longitud
 * y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar de
 * int donde sea necesario para admitir números largos.
 * 
 */


public class Ej34 {
	
	public static void main (String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=0;
		int x=0;
		int diez=1;
		long par=0;
		long impar=0;
		do{
			System.out.print("Introduzca un número: ");
			n=s.nextInt();
			System.out.print("Introduzca otro número: ");
			x=s.nextInt();
		}while((n<=0)||(x<=0));
		
		while((n>0)||(x>0)){
			
			if((x>0)&&(x%2==0)){
				
				par+=(x%10);
				par*=10;
			}	else if((x>0)&&(x%2==1)){
				
					impar+=(x%10);
					impar*=10;
			}
			x=x/10;
			
			if((n>0)&&(n%2==0)){
				
				par+=(n%10);
				par*=10;
			}	else if((n>0)&&(n%2==1)){
				
					impar+=(n%10);
					impar*=10;
			}
			n=n/10;	
		}
		par/=10;
		impar/=10;
		System.out.print("El número formado por los dígitos pares es: ");
		while(par>0){
			System.out.print(par%10);
			par/=10;
		}
		System.out.print("\nEl número formado por los dígitos impares es: ");
		while(impar>0){
			System.out.print(impar%10);
			impar/=10;
		}

		
		
	}
}

