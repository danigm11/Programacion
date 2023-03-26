package Ej6.Vehiculos;

public class Aereo extends Vehiculo{
  private final int numAsientos;

  public int getNumAsientos() {
    return numAsientos;
  }

  public Aereo(int numAsientos){
    super();
    this.numAsientos=numAsientos;
  }
  @Override
  public void imprimir(){
    System.out.println("Vehículo aéreo: ");
    super.imprimir();
    System.out.println("Número de asientos: "+this.numAsientos);
  }
}
