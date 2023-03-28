package Ej2.Vehiculos;
/*
 * Coche.java
 * 
 * @author Daniel García Mesa 
 * 
 * Clase coche, clase que hereda de vehículo y tiene una función para encender las luces
 * 
 * 
 */
public class Coche extends Vehiculo{
  
  public Coche() {
    super();
    }
    
    public void luces() {
      System.out.println("Enciende las luces");
    }
}
