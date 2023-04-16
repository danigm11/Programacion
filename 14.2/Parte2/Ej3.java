import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Daniel García Mesa 
 * @since 14/04/2023
 * 
 * Programa que provoca y trata varios tipos de excepción aleatoriamente
 */
public class Ej3 {
  public static void main(String[] args) {

    int n = 0;
    Scanner s = new Scanner(System.in);
    while (n != 6) {
      System.out.print(
          "-1Error StackOverflow\n-2Error NumberFormatException\n-3Error ArrayIndexOutOfBoundsException\n-4Error FileNotFoundException\n-5Error ArithmeticException\n-6 Salir.\n");
      n = (int)(Math.random()*6+1);
      System.out.println("Número elegido:"+n);
      try {
        switch (n) {
          case 1:

            funcion1(100);
            break;
          case 2:
            funcion2("hola");
            break;
          case 3:
            funcion3(3);

            break;
          case 4:
            funcion4();

            break;
          case 5:

            funcion5(3);

            break;
          case 6:
            break;
          default:
            System.out.println("Prueba otra vez");
        }
      } catch (StackOverflowError e) {
        System.out.println("Error de stack overflow");
      } catch (ArithmeticException e) {
        System.out.println("Error de operación aritmética");
      } catch (FileNotFoundException e) {
        System.out.println("Error de archivo no encontrado");
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Error de límites del array");
      } catch (NumberFormatException e) {
        System.out.println("Error de formato de número");
      }
    }
  }

  public static int funcion1(int num) {

    if (num == 0) {
      return 1;
    } else {
      return num * funcion1(num + 1);
    }
  }

  public static int funcion2(String a) {
    int n = Integer.parseInt(a);
    return n;
  }

  public static int funcion3(int n) {
    int[] array = new int[n];
    return array[n + 1];
  }

  public static void funcion4() throws FileNotFoundException {
    File file = new File("ruta/al/archivo.txt");
    Scanner scanner = new Scanner(file);
  }

  public static int funcion5(int n) {
    return n / 0;
  }

}