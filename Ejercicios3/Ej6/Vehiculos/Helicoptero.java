package Ej6.Vehiculos;

public class Helicoptero extends Aereo{
  private int numHelices;
  public int getNumHelices() {
    return numHelices;
  }
  public void setNumHelices(int numHelices) {
    this.numHelices = numHelices;
  }
  public Helicoptero(int numAsientos){
    super(numAsientos);
  }
  @Override
  public void imprimir(){
    super.imprimir();
    System.out.println("Número de hélices: "+this.numHelices);
  }
}
