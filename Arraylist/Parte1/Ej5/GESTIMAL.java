package Ej5;

import Ej5.Articulo.Articulo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Daniel García Mesa
 * @since 16/03/2023
 * 
 *        Ejercicio 5 de arrays de objetos con ArrayList
 * 
 *        Crea el programa GESTISIMAL (GESTIón SIMplificada de Almacén) para
 *        llevar el
 *        control de los artículos de un almacén. De cada artículo se debe saber
 *        el código,
 *        la descripción, el precio de compra, el precio de venta y el stock
 *        (número de
 *        unidades).
 * 
 * 
 */

public class GESTIMAL {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numArticulos = 0;
    int n = 0;
    int eleccion = 0;
    String codigo;
    int cantidad = 0;
    ArrayList<Articulo> arrayArticulos = new ArrayList<Articulo>();
    // Articulo[] arrayArticulos= new Articulo[100];
    while (n != 7) {
      System.out.println(
          "Elija una opción: \n1.Listado\n2.Alta\n3.Baja\n4.Modificacion\n5.Entrada de mercancía\n6.Salida de mercancía\n7.Salir");
      n = s.nextInt();
      switch (n) {
        // Listado de articulos, solo funciona si hay artículos creados
        case 1: {
          if (!arrayArticulos.isEmpty()) {
            for (int i = 0; i < numArticulos; i++) {
              System.out.println("Articulo " + (i + 1) + ". " + arrayArticulos.get(i));
            }
          } else {
            System.out.println("No hay artículos.");
          }
          break;
          // Alta de artículos
        }
        case 2: {
          System.out.println("Introduzca los datos del articulo que quiere dar de alta: ");
          System.out.println("(codigo, descripcion, precio compra, precio venta, stock): ");
          arrayArticulos.add(new Articulo());
          System.out.print("Escriba el nuevo código: ");
          arrayArticulos.get(arrayArticulos.size() - 1).setCodigo(s.next());
          System.out.print("\nEscriba la nuevo descripción: ");
          arrayArticulos.get(arrayArticulos.size() - 1).setDescripcion(s.next());
          System.out.print("\nEscriba el nuevo precio de compra: ");
          arrayArticulos.get(arrayArticulos.size() - 1).setPrecioDeCompra(s.nextDouble());
          System.out.print("\nEscriba el nuevo precio de venta: ");
          arrayArticulos.get(arrayArticulos.size() - 1).setPrecioDeVenta(s.nextDouble());
          System.out.print("\nEscriba el nuevo Stock: ");
          arrayArticulos.get(arrayArticulos.size() - 1).setStock(s.nextInt());
          numArticulos += 1;
          break;
          // Baja de artículos, solo funciona si hay artículos creados
        }
        case 3: {
          if (!arrayArticulos.isEmpty()) {
            for (int i = 0; i < numArticulos; i++) {
              System.out.println("Articulo " + (i + 1) + ". " + arrayArticulos.get(i));
            }
            System.out.println("Escriba el código del articulo que quiere eliminar: ");
            arrayArticulos.remove(Articulo.posicion(s.next(), arrayArticulos));
          } else {
            System.out.println("No hay artículos.");
          }
          break;
          // Modificación de artículos, solo funciona si hay artículos creados
        }
        case 4: {
          if (!arrayArticulos.isEmpty()) {
            for (int i = 0; i < numArticulos; i++) {
              System.out.println("Articulo " + (i + 1) + ". " + arrayArticulos.get(i));
            }
            System.out.println("Elija el articulo que quiere modificar: ");
            eleccion = s.nextInt();
            System.out.print("Escriba el nuevo código: ");
            arrayArticulos.get(eleccion - 1).setCodigo(s.next());
            System.out.print("\nEscriba la nuevo descripción: ");
            arrayArticulos.get(eleccion - 1).setDescripcion(s.next());
            System.out.print("\nEscriba el nuevo precio de compra: ");
            arrayArticulos.get(eleccion - 1).setPrecioDeCompra(s.nextDouble());
            System.out.print("\nEscriba el nuevo precio de venta: ");
            arrayArticulos.get(eleccion - 1).setPrecioDeVenta(s.nextDouble());
            System.out.print("\nEscriba el nuevo Stock: ");
            arrayArticulos.get(eleccion - 1).setStock(s.nextInt());
          } else {
            System.out.println("No hay artículos.");
          }
          break;
          // Entrada de mercancía, solo funciona si hay artículos creados
        }
        case 5: {
          if (!arrayArticulos.isEmpty()) {
            for (int i = 0; i < numArticulos; i++) {
              System.out.println("Articulo " + (i + 1) + ". " + arrayArticulos.get(i));
            }
            System.out.println("Seleccione el articulo al que quiere aumentar su Stock: ");
            eleccion = s.nextInt();
            System.out.println("Escriba cuanto quiere aumentar el Stock: ");
            cantidad = s.nextInt();
            arrayArticulos.get(arrayArticulos.size()).setStock(arrayArticulos.get(eleccion - 1).getStock() + cantidad);
          } else {
            System.out.println("No hay artículos.");
          }
          break;
          // Salida de mercancía, solo funciona si hay artículos creados
        }
        case 6: {
          if (!arrayArticulos.isEmpty()) {
            for (int i = 0; i < numArticulos; i++) {
              System.out.println("Articulo " + (i + 1) + ". " + arrayArticulos.get(i));
            }
            System.out.println("Seleccione el articulo al que quiere reducir su Stock: ");
            eleccion = s.nextInt();
            System.out.println("Escriba cuanto quiere reducir el Stock: ");
            cantidad = s.nextInt();
            arrayArticulos.get(arrayArticulos.size()).setStock(arrayArticulos.get(eleccion - 1).getStock() - cantidad);
          } else {
            System.out.println("No hay artículos.");
          }
          break;
          // Exit
        }
        case 7: {
          break;
        }
      }
    }
  }
}