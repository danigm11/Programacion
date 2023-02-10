import misFunciones.Geometria;
import java.util.Scanner;
/*
 * Daniel García Mesa 9/02/2023
 * 
 * Ejercicio21.java
 * 
 * Escribe un programa que muestre un menú con 2 opciones: “1.Circunferencia” y “2.Área”.
 * En ambas se le pedirá al usuario que introduzca un radio y luego se le mostrará el cálculo
 * oportuno.
 * 
 */
public class Ejercicio21 {
  public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    int n=0;
    double r=0;
    do{
      r=pideRadio();
      n=menu();
      switch(n){
        case 1:{
          System.out.println("La longitud de la circunferencia es: "+Geometria.circunferencia(r)+" centimetros");
          break;
        }case 2:{
          System.out.println("El area del circulo es: "+Geometria.areaCirculo(r)+" centimetros cuadrados");
          break;
        }case 3:{
          System.out.println("El volumen de la esfera es: "+Geometria.voluemEsfera(r)+" centimetros cubicos");
          break;
        }case 4:{
          System.out.println("La longitud de la circunferencia es: "+Geometria.circunferencia(r)+" centimetros");
          System.out.println("El area del circulo es: "+Geometria.areaCirculo(r)+" centimetros cuadrados");
          System.out.println("El volumen de la esfera es: "+Geometria.voluemEsfera(r)+" centimetros cubicos");
          break;
        }case 0:{
          System.out.println("Hasta pronto!");
          break;
        }default:{
          System.out.println("ERROR");
          break;
        }
      } 
    }while(n!=0);
  }
  /* Un menú con varias opciones 
   *
   * @return La elección del menú
   */
  public static int menu(){
    int res=0;
    Scanner s= new Scanner(System.in);
    System.out.print("Elija una opción(1-Circunferencia, 2-Area, 3-Volumen, 4-Todas, 0-Salir):");
    res=s.nextInt();
    return res;
  }
  /* Pide el tamaño de un radio 
   *
   * @return El tamaño del radio
   */
  public static double pideRadio(){
    double radio=0;
    Scanner s= new Scanner(System.in);
    System.out.print("Introduzca el tamanyo del radio:");
    radio=s.nextDouble();
    return radio;
  }
}
