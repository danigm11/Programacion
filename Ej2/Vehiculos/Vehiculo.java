package Ej2.Vehiculos;
public abstract class Vehiculo {
  
  private static int vehiculosCreados = 0;
  private static int kilometrosTotales = 0;
  private int kilometrosRecorridos;
  
  public Vehiculo() {
    this.kilometrosRecorridos = 0;
    }
    public int getKilometrosRecorridos() {
    return this.kilometrosRecorridos;
    }
    public static int getKilometrosTotales() {
    return Vehiculo.kilometrosTotales;
    }
    /**
    * Hace que un vehículo recorra una distancia determinada.
    *
    * @param k kilómetros a recorrer
    */
    public void anda(int k) {
    this.kilometrosRecorridos += k;
    Vehiculo.kilometrosTotales += k;
    }
    
}
