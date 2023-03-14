package Ej3.Animales;

public class Perro extends Mamifero {
  public Perro (Sexo s) {
  super(s);
  }
  public Perro () {
  super(Sexo.HEMBRA);
  }
  public void ladra() {
  System.out.println("Woof woof");
  }
  public void dameLaPata() {
  System.out.println("Toma mi patita");
  }
  public void caza() {
    System.out.println("Estoy cazando perdices");
}
}
