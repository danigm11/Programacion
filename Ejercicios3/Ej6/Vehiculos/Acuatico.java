package Ej6.Vehiculos;

public class Acuatico extends Vehiculo{
  private double eslora;

  public double getEslora() {
    return eslora;
  }

  public void setEslora(double eslora) {
    this.eslora = eslora;
  }
  public Acuatico(){
    super();
  }
  public Acuatico(int eslora){
    super();
    this.eslora=eslora;
  }
  @Override
  public void imprimir(){
    System.out.println("Vehículo acuático: ");
    super.imprimir();
    System.out.println("Eslora: "+this.eslora);
  }
}
