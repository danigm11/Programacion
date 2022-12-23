/*
 * Ej11.java
 * 
 * Daniel García Mesa 20/12/2022
 * 
 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
 * aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
 * final aparecerá el número de suspensos, el número de suficientes, el número
 * de bienes, etc.
 *  
 */


public class Ej11 {
	
	public static void main (String[] args) {
		
		int suspenso=0;
		int bien=0;
		int suficiente=0;
		int notable=0;
		int sobre=0;
		
		for(int i=0;i<20;i++){
			
			int n=(int)(Math.random()*5);
			switch(n){
				case 0:{
					suspenso++;
					break;
				}
				case 1:{
					suficiente++;
					break;
				}case 2:{
					bien++;
					break;
				}case 3:{
					notable++;
					break;
				}case 4:{
					sobre++;
					break;
				}
			}
		}
		System.out.print("Insuficientes: "+suspenso+" Suficientes: "+suficiente+" Bien: "+bien+" Notables: "+notable+" Sobresalientes: "+sobre);
	
	}
}



