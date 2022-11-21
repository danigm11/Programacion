import java.util.Scanner;

/*
 * Areas.java
 * 
 * Daniel García Mesa
 * 
 * Menú con áreas de rombo, triángulo, romboide y trapecio.
 * 
 */


public class Areas {
	
	public static void main (String[] args) {
		
		Scanner s= new Scanner(System.in);
		int n=0;
		double base=0;
		double base2=0;
		double altura=0;
		double res=0;
		System.out.print("Seleccione el área que quiera calcular:\n--------------------------------------\n     1 para triángulo \n     2 para rombo\n     3 para romboide\n     4 para trapecio\n");
		n=s.nextInt();
		
		switch(n){
			case 1:
			System.out.println("Área de un triángulo");
			System.out.print("Introduzca la base: ");
			base=s.nextDouble();
			System.out.print("Introduzca la altura: ");
			altura=s.nextDouble();
			res=(base*altura/2);
			System.out.print("Área del triángulo= ");
			System.out.printf("%.4f",res);
			break;
			case 2:
			System.out.println("Área de un rombo");
			System.out.print("Introduzca la diagonal mayor: ");
			base=s.nextDouble();
			System.out.print("Introduzca la diagonal menor: ");
			altura=s.nextDouble();
			res=(base*altura/2);
			System.out.print("Área del rombo= ");
			System.out.printf("%.4f",res);
			break;
			case 3:
			System.out.println("Área de un romboide");
			System.out.print("Introduzca la base: ");
			base=s.nextDouble();
			System.out.print("Introduzca la alturaide: ");
			altura=s.nextDouble();
			res=(base*altura);
			System.out.print("Área del romboide= ");
			System.out.printf("%.4f",res);
			break;
			case 4:
			System.out.println("Área de un trapecio");
			System.out.print("Introduzca la base menor: ");
			base=s.nextDouble();
			System.out.print("Introduzca la base mayor: ");
			base2=s.nextDouble();
			System.out.print("Introduzca la altura: ");
			altura=s.nextDouble();
			res=((base+base2)/2*altura);
			System.out.print("Área del trapecio= ");
			System.out.printf("%.4f",res);
			break;
			default:
			System.out.print("Número incorrecto ");
			break;
		}
	}
}

