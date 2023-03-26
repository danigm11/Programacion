package Ej6.Vehiculos;

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
