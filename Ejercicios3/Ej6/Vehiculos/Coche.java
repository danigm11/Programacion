package Ej6.Vehiculos;
/*
 * Coche.java
 * 
 * @author Daniel García Mesa 
 * 
 * 23/03/2023
 * 
 */
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
    if(tihs.aire==true){
      System.out.println("Tiene aire acondicionado ");
    }
  }
}
