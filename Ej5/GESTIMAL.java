package Ej5;
import Ej5.Articulo.Articulo;
import java.util.Scanner;
/*
 * Daniel García Mesa 16/03/2023
 * 
 * Ejercicio 5 de arrays de objetos
 * 
 * Crea el programa GESTISIMAL (GESTIón SIMplificada de Almacén) para llevar el
 * control de los artículos de un almacén. De cada artículo se debe saber el código,
 * la descripción, el precio de compra, el precio de venta y el stock (número de
 * unidades).
 * 
 * 
 */
public class GESTIMAL {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numArticulos=0;
    int n=0;
    int eleccion=0;
    int cantidad=0;
    Articulo[] arrayArticulos= new Articulo[100];
    while(n!=7){
      System.out.println("Elija una opción: \n1.Listado\n2.Alta\n3.Baja\n4.Modificacion\n5.Entrada de mercancía\n6.Salida de mercancía\n7.Salir");
      n=s.nextInt();
      switch(n){
        //Listado de articulos
        case 1: {
          for(int i=0;i<numArticulos;i++){
            System.out.println("Articulo "+(i+1)+". "+arrayArticulos[i]);
          }
          break;
        //Alta de artículos
        }case 2: {
          System.out.println("Introduzca los datos del articulo que quiere dar de alta: ");
          System.out.println("(codigo, descripcion, precio compra, precio venta, stock): ");
          arrayArticulos[numArticulos] = new Articulo();
          System.out.print("Escriba el nuevo código: ");
          arrayArticulos[numArticulos].setCodigo(s.next());
          System.out.print("\nEscriba la nuevo descripción: ");
          arrayArticulos[numArticulos].setDescripcion(s.next());
          System.out.print("\nEscriba el nuevo precio de compra: ");
          arrayArticulos[numArticulos].setPrecioDeCompra(s.nextDouble());
          System.out.print("\nEscriba el nuevo precio de venta: ");
          arrayArticulos[numArticulos].setPrecioDeVenta(s.nextDouble());
          System.out.print("\nEscriba el nuevo Stock: ");
          arrayArticulos[numArticulos].setStock(s.nextInt());
          numArticulos+=1;
          break;
        //Baja de artículos
        }case 3: {
          for(int i=0;i<numArticulos;i++){
            System.out.println("Articulo "+(i+1)+". "+arrayArticulos[i]);
          }
          System.out.println("Seleccione el articulo que quiere eliminar: ");
          eleccion=s.nextInt();
          arrayArticulos[eleccion-1]=arrayArticulos[numArticulos];
          numArticulos-=1;
          break;
        //Modificación de artículos
        }case 4: {
          for(int i=0;i<numArticulos;i++){
            System.out.println("Articulo "+(i+1)+". "+arrayArticulos[i]);
          }
          System.out.println("Elija el articulo que quiere modificar: ");
          eleccion=s.nextInt();
          System.out.print("Escriba el nuevo código: ");
          arrayArticulos[eleccion-1].setCodigo(s.next());
          System.out.print("\nEscriba la nuevo descripción: ");
          arrayArticulos[eleccion-1].setDescripcion(s.next());
          System.out.print("\nEscriba el nuevo precio de compra: ");
          arrayArticulos[eleccion-1].setPrecioDeCompra(s.nextDouble());
          System.out.print("\nEscriba el nuevo precio de venta: ");
          arrayArticulos[eleccion-1].setPrecioDeVenta(s.nextDouble());
          System.out.print("\nEscriba el nuevo Stock: ");
          arrayArticulos[eleccion-1].setStock(s.nextInt());
          break;
        //Entrada de mercancía
        }case 5: {
          for(int i=0;i<numArticulos;i++){
            System.out.println("Articulo "+(i+1)+". "+arrayArticulos[i]);
          }
          System.out.println("Seleccione el articulo al que quiere aumentar su Stock: ");
          eleccion=s.nextInt();
          System.out.println("Escriba cuanto quiere aumentar el Stock: ");
          cantidad=s.nextInt();
          arrayArticulos[eleccion-1].setStock(arrayArticulos[eleccion-1].getStock()+cantidad);
          break;
        //Salida de mercancía
        }case 6: {
          for(int i=0;i<numArticulos;i++){
            System.out.println("Articulo "+(i+1)+". "+arrayArticulos[i]);
          }
          System.out.println("Seleccione el articulo al que quiere aumentar su Stock: ");
          eleccion=s.nextInt();
          System.out.println("Escriba cuanto quiere reducir el Stock: ");
          cantidad=s.nextInt();
          arrayArticulos[eleccion-1].setStock(arrayArticulos[eleccion-1].getStock()-cantidad);
          break;
        //Exit
        }case 7: {
          break;
        }
    }
    }
  }
}
