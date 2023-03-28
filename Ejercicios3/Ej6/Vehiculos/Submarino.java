package Ej6.Vehiculos;
/*
 * Submarino.java
 * 
 * @author Daniel García Mesa 
 * 
 * 23/03/2023
 * 
 */
public class Submarino extends Acuatico{
  private double profundidadMaxima;

  public double getProfundidadMaxima() {
    return profundidadMaxima;
  }

  public void setProfundidadMaxima(double profundidadMaxima) {
    this.profundidadMaxima = profundidadMaxima;
  }
  @Override
  public void imprimir(){
    super.imprimir();
    System.out.println("Profundidad máxima: "+this.profundidadMaxima);
  }
}
