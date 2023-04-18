package Ej6.Vehiculos;

public class Coche extends Terrestre{
  private boolean aire;
  public boolean isAire() {
    return aire;
  }
  public void setAire(boolean aire) {
    this.aire = aire;
  }
  public Coche(){
    super();
  }
  @Override
  public void imprimir(){
    super.imprimir();
    if(this.aire==true){
      System.out.println("Tiene aire acondicionado ");
    }
  }
}
