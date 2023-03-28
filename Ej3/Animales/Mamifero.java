package Ej3.Animales;
/*
 * Mamifero.java
 * 
 * @author Daniel García Mesa 
 * 
 * Clase mamifero, hereda de Animal
 * 
 */
public abstract class Mamifero extends Animal {
  public Mamifero () {
    super();
  }
  public Mamifero (Sexo s) {
    super(s);
  }
  public void amamanta() {
    if (this.getSexo() == Sexo.MACHO) {
     System.out.println("Soy macho, no puedo amamantar :(");
    } else {
        System.out.println("Toma pecho, hazte grande");
    }
  }
  public void cuidaCrias() {
    System.out.println("Estoy cuidando mis crias");
  }
  public void corre() {
    System.out.println("Estoy corriendo");
  }
 }
