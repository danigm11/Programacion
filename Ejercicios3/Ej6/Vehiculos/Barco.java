package Ej6.Vehiculos;
/*
 * Barco.java
 * 
 * @author Daniel García Mesa 
 * 
 * 23/03/2023
 * 
 */
public class Barco extends Acuatico{
  private boolean tieneMotor;

  public boolean isTieneMotor() {
    return tieneMotor;
  }

  public void setTieneMotor(boolean tieneMotor) {
    this.tieneMotor = tieneMotor;
  }
  @Override
  public void imprimir(){
    super.imprimir();
    if(tihs.tieneMotor==true){
      System.out.println("Tiene motor");
    }
  }
}
