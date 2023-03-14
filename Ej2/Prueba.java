package Ej2;
import java.util.Scanner;

import Ej2.Vehiculos.Bicicleta;
import Ej2.Vehiculos.Coche;
import Ej2.Vehiculos.Vehiculo;

public class Prueba {

public static void main(String[] args) {

  int menu = 0;
  int km;
  Scanner s= new Scanner(System.in);

  Bicicleta bici = new Bicicleta();
  Coche bmwm3 = new Coche();

  while (menu != 8) {

  System.out.println("1. Anda con la bicicleta");
  System.out.println("2. Haz el caballito con la bicicleta");
  System.out.println("3. Anda con el coche");
  System.out.println("4. Derrapa con el coche");
  System.out.println("5. Ver kilometraje de la bicicleta");
  System.out.println("6. Ver kilometraje del coche");
  System.out.println("7. Ver kilometraje total");
  System.out.println("8. Salir");
  System.out.println("Elige una opción (1-8): ");
  menu = s.nextInt();
  switch (menu) {
  case 1:
  System.out.print("¿Cuántos kilómetros quiere recorrer? ");
  km = s.nextInt();
  bici.anda(km);
  break;
  case 2:
  bici.caballito();
  break;
  case 3:
  System.out.print("¿Cuántos kilómetros quiere recorrer? ");
  km = Integer.parseInt(System.console().readLine());
  bmwm3.anda(km);
  break;
  case 4:
  bmwm3.derrapa();
  break;
  case 5:
  System.out.println("La bicicleta lleva recorridos ");
  System.out.println(bici.getKilometrosRecorridos() + " Km");
  break;
  case 6:
  System.out.println("El coche lleva recorridos ");
  System.out.println(bmwm3.getKilometrosRecorridos() + " Km");
  break;
  case 7:
  System.out.println("Los vehículos llevan recorridos ");
  System.out.println(Vehiculo.getKilometrosTotales() + " Km");
  default:
  } 
  }
  }
  }