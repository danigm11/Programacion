package Ej3;

import Ej3.Animales.Lagarto;
import Ej3.Animales.Mamifero;
import Ej3.Animales.Perro;
import Ej3.Animales.Gato;
import Ej3.Animales.Ave;
import Ej3.Animales.Pinguino;
import Ej3.Animales.Canario;
import Ej3.Animales.Sexo;
/*
 * PruebaAnimales.java
 * 
 * @author Daniel García Mesa 
 * 
 * Prueba algunas de las clases de animales y sus funciones
 * 
 */

public class PruebaAnimales {
  public static void main(String[] args) {
  Pinguino Manolo = new Pinguino(Sexo.MACHO);
  Manolo.come("palomitas");
  Manolo.programa();
  Perro tobi = new Perro(Sexo.MACHO);
  tobi.duerme();
  tobi.ladra();
  tobi.amamanta();
  tobi.cuidaCrias();
  Lagarto marco = new Lagarto(Sexo.MACHO);
  marco.tomaElSol();
  marco.duerme();
  }
 }
  
