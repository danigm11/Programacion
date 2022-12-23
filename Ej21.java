/*
 * Ej21.java
 * 
 * Daniel García Mesa 22/12/2022
 * 
 * Realiza un programa que genere una secuencia de cinco monedas de curso
 * legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos,
 * 5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
 * posiciones posibles son cara y cruz.
 * 
 */


public class Ej21  {
	
	public static void main (String[] args) {
		
		int n=0;
		int c=0;
		String moneda="";
		
		for(int i=0;i<5;i++){
			n=(int)(Math.random()*8+1);
			c=(int)(Math.random()*2+1);
			
			switch(n){
				case 1:{
					moneda="1 cent";
					break;
				}
				case 2:{
					moneda="2 cent";
					break;
				}
				case 3:{
					moneda="5 cent";
					break;
				}
				case 4:{
					moneda="10 cent";
					break;
				}
				case 5:{
					moneda="20 cent";
					break;
				}
				case 6:{
					moneda="50 cent";
					break;
				}
				case 7:{
					moneda="1 Euro";
					break;
				}
				case 8:{
					moneda="2 Euros";
					break;
				}
			}
			System.out.print(moneda+" ");
			if(c==1){
				System.out.println("cara");
			}	else{
					System.out.println("cruz");
			}
		}
	}
}

