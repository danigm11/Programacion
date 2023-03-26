package Ej6.Vehiculos;

public class Moto extends Terrestre{
  private String color;

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
  @Override
  public void imprimir(){
    super.imprimir();
    System.out.println("Color: "+this.color);
  }
}
