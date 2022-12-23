/*
 * Ej16.java
 * 
 * Daniel García Mesa 21/12/2022
 * 
 * Realiza un simulador de máquina tragaperras simplificada que cumpla los
 * siguientes requisitos:
 * a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
 * figuras posibles: corazón, diamante, herradura, campana y limón.
 * b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha
 * perdido”.
 * c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
 * ha recuperado su moneda”.
 * d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
 * 10 monedas”.
 *  
 */


public class Ej16 {
	
	public static void main (String[] args) {
		String figura="";
		int limon=0;
		int cora=0;
		int camp=0;
		int herr=0;
		int diam=0;
		for(int i=0;i<3;i++){
				
				int n=(int)(Math.random()*5+1);
				
				switch(n){
					case 1:{
						figura="Limón";
						limon++;
						break;
					}
					case 2:{
						figura="Corazón";
						cora++;
						break;
					}
					case 3:{
						figura="Herradura";
						herr++;
						break;
					}
					case 4:{
						figura="Campana";
						camp++;
						break;
					}
					case 5:{
						figura="Diamante";
						diam++;
						break;
					}				
				}
				System.out.print(figura+" ");
			}
			if((cora==2)||(diam==2)||(camp==2)||(limon==2)||(herr==2)){
				System.out.print("\nBien, ha recuperado su moneda");
			}	else if((cora==3)||(diam==3)||(camp==3)||(limon==3)||(herr==3)){
					System.out.print("\nEnhorabuena, ha ganado 10 monedas");
				}	else{
						System.out.print("\nLo siento, ha perdido");
				}
	}
}

