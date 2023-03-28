package Ej6.Vehiculos;
/*
 * Avion.java
 * 
 * @author Daniel García Mesa 
 * 
 * 23/03/2023
 * 
 */
public class Avion extends Aereo{
  private double tiempoMaximo;

  public double getTiempoMaximo() {
    return tiempoMaximo;
  }

  public void setTiempoMaximo(double tiempoMaximo) {
    this.tiempoMaximo = tiempoMaximo;
  }
  public Avion(int numAsientos){
    super(numAsientos);
  }
  @Override
  public void imprimir(){
    super.imprimir();
    System.out.println("Tiempo máximo de vuelo: "+this.tiempoMaximo);
  }
}
