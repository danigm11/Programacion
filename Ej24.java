import java.util.Scanner;

/*
 * Ej24.java
 * 
 * Daniel García Mesa 25/11/2022
 * 
 * Escribe un programa que genere la nómina (bien desglosada) de un empleado
 * según las siguientes condiciones:
 * • Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe
 * de proyecto), los días que ha estado de viaje visitando clientes durante el
 * mes y su estado civil (1 - Soltero, 2 - Casado).
 * • El sueldo base según el cargo es de 950, 1200 y 1600 euros según
 * si se trata de un prog. junior, un prog. senior o un jefe de proyecto
 * respectivamente.
 * • Por cada día de viaje visitando clientes se pagan 30 euros extra en
 * concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será de
 * un 25% en caso de estar soltero y un 20% en caso de estar casado.
 * 
 * 
 */


public class Ej24 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		
		Scanner s=new Scanner(System.in);
		int rango=0;
		double sueldo=0;
		double dias=0;
		int civ=0;
		double irpf=0;
		double dietas=30;
		double total=0;
		
		//lectura de datos por pantalla
		
		System.out.print("1-Programador Junior\n2 -Programador Senior\n3 -Jefe de proyecto \nIntroduzca el cargo del empleado: ");
		rango=s.nextInt();
		System.out.print("Introduzca cuantos dias ha estado visitando clientes: ");
		dias=s.nextInt();
		System.out.print("Introduzca su estado civil (1-soltero, 2-casado): ");
		civ=s.nextInt();
		
		//Cálculos
		
		dietas*=dias;
		
		switch(rango){
			case 1:
				sueldo=950;
				break;	
			case 2:
				sueldo=1200;
				break;
			case 3:
				sueldo=1600;
				break;
			
		}
		if(civ==1){
			irpf=0.25;
		}	else if(civ==2){
			irpf=0.2;
		}
		
		
		//salida por pantalla
		
		System.out.println("--------------------------");
		System.out.printf("| Sueldo base: %.2f",sueldo);
		System.out.println("    |\n| Dietas: "+dietas+"	         |");
		System.out.println("--------------------------");
		System.out.println("| Sueldo bruto: "+(sueldo+dietas)+"    |");
		System.out.println("| Retención IRPF: "+(irpf*(sueldo+dietas))+"  |");
		System.out.println("--------------------------");
		System.out.println("| Sueldo neto: "+((sueldo+dietas)-(irpf*(sueldo+dietas)))+"     |");
		System.out.println("--------------------------");

		
		
	}
}

