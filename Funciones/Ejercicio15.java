import misFunciones.FunciArrays;
/*
 * Daniel García Mesa 7/02/2023
 * 
 * Ejercicio15.java
 * 
 * Escribe un programa que cree un array de tamaño 100 con los primeros 100 números
 * naturales. Luego muestra la suma total y la media. Implementa una función que calcule la
 * suma de un array y otra que calcule la media de un array.
 * 
 */
public class Ejercicio15 {
  public static void main(String[]args){
    int[] array = new int[100];

    for(int i=0;i<100;i++){
      array[i]=i+1;
    }
    System.out.println("La suma del array es: "+FunciArrays.sumaArrayInt(array));
    System.out.println("La media del array es: "+FunciArrays.mediaArrayInt(array));
  }
}
