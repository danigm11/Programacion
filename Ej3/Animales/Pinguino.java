package Ej3.Animales;
/*
 * Pinguino.java
 * 
 * @author Daniel García Mesa 
 * 
 * Clase pinguino, hereda de Ave
 * 
 */
public class Pinguino extends Ave {
  public Pinguino() {
  }
  public Pinguino(Sexo s) {
    super(s);
  }
  public void vuela() {
    System.out.println("Soy un pingüino, no puedo volar");
  }
  public void programa() {
    System.out.println("Soy un pingüino programador, estoy programando en Java");
  }
  public void nada() {
    System.out.println("Estoy nadando");
  }
 }
  
