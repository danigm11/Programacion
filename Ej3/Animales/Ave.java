package Ej3.Animales;

public class Ave extends Animal {
  public Ave() {
  super(Sexo.HEMBRA);
  }
  public Ave(Sexo s) {
  super(s);
  }
  public void ponHuevo() {
  if (this.getSexo() == Sexo.MACHO) {
  System.out.println("Soy macho, no puedo poner huevos");
  } else {
  System.out.println("Pone un huevo");
  }
  }
  public void caza() {
    System.out.println("Estoy cazando gusanos");
  }
  public void vuela() {
  System.out.println("Estoy volando");
  }
  }