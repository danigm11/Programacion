package Astros;
/*
 * Astro.java
 * 
 * @author Daniel García Mesa 
 * 
 * 21/03/2023
 * 
 * Clase astros, clase abstracta de la cual heredan planeta y satélite.
 * 
 * 
 */

public abstract class Astro{

  protected double masa = 1.9*(Math.pow(10,30));
  protected double temperatura;
  protected double gravedad;
  protected int rotacion_eje;
  protected double radio;

  public double getMasa() {
    return masa;
  }
  public void setMasa(double masa) {
    this.masa = masa;
  }
  public double getTemperatura() {
    return temperatura;
  }
  public void setTemperatura(double temperatura) {
    this.temperatura = temperatura;
  }
  public double getGravedad() {
    return gravedad;
  }
  public void setGravedad(double gravedad) {
    this.gravedad = gravedad;
  }
  public int getRotacion_eje() {
    return rotacion_eje;
  }
  public void setRotacion_eje(int rotacion_eje) {
    this.rotacion_eje = rotacion_eje;
  }
  public double getRadio() {
    return radio;
  }
  public void setRadio(double radio) {
    this.radio = radio;
  }
  public Astro(){
  }
  /**
    * Muestra los datos de un Astro.
    *
    * @param k kilómetros a recorrer
    */
  public void muestra(){
    toString();

  }
  @Override
  public String toString() {
    String cadena = "------------------------------------------";
    cadena += "\nMasa: " + this.masa;
    cadena += "\nTemperatura: " + this.temperatura;
    cadena += "\nGravedad: " + this.gravedad;
    cadena += "\nHoras de rotación: " + this.rotacion_eje;
    cadena += "\nRadio: " + this.radio;
    cadena += "\n------------------------------------------";
    return cadena;
    }
}