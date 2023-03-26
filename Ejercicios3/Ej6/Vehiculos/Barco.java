package Ej6.Vehiculos;

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
