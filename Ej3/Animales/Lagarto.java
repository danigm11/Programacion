package Ej3.Animales;
/*
 * Lagarto.java
 * 
 * @author Daniel García Mesa 
 * 
 * Clase Lagarto, hereda de Animal
 * 
 */
public class Lagarto extends Animal {
  public Lagarto() {
  }
  public Lagarto(Sexo s) {
    super(s);
  }
  public void tomaElSol() {
    System.out.println("Estoy tomando el Sol");
  }
  public void trepa() {
    System.out.println("Trepa un árbol");
  }
  public void escondete() {
    System.out.println("Me he escondido, ya no me puedes ver");
  }
 }
  
