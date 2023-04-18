package Ej6.Vehiculos;

public class Terrestre extends Vehiculo{

  private int numRuedas;
  
  public int getNumRuedas() {
    return numRuedas;
  }

  public void setNumRuedas(int numRuedas) {
    this.numRuedas = numRuedas;
  }

  public Terrestre(){
    super();
  }
  @Override
  public void imprimir(){
    System.out.println("Vehículo terrestre: ");
    super.imprimir();
    System.out.println("Número de ruedas: "+this.numRuedas);
  }

}
