package Astros;
/*
 * Satelite.java
 * 
 * @author Daniel García Mesa 
 * 
 * 21/03/2023
 * 
 * Clase satelite, contiene los atributos de cada satelite.
 * 
 * 
 */
public class Satelite extends Astro {
  
  private String nombre;
  private double distanciaPlaneta;
  private int orbitaPlaneta;
  private String nombrePlaneta;
  

  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public double getDistanciaPlaneta() {
    return distanciaPlaneta;
  }
  public void setDistanciaPlaneta(double distanciaPlaneta) {
    this.distanciaPlaneta = distanciaPlaneta;
  }
  public int getOrbitaPlaneta() {
    return orbitaPlaneta;
  }
  public void setOrbitaPlaneta(int orbitaPlaneta) {
    this.orbitaPlaneta = orbitaPlaneta;
  }
  public String getNombrePlaneta() {
    return nombrePlaneta;
  }
  public void setNombrePlaneta(String nombrePlaneta) {
    this.nombrePlaneta = nombrePlaneta;
  }
  public Satelite(String nombre, double distanciaPlaneta, int orbitaPlaneta, String nombrePlaneta){
    super();
    this.nombre=nombre;
    this.distanciaPlaneta=distanciaPlaneta;
    this.orbitaPlaneta=orbitaPlaneta;
    this.nombrePlaneta=nombrePlaneta;
  }
  public Satelite(){
    super();
  }
  @Override
  public String toString() {
    String cadena = "------------------------------------------";
    cadena += "\nNombre: " + this.nombre;
    cadena += "\nMasa: " + this.masa;
    cadena += "Kg\nTemperatura: " + this.temperatura;
    cadena += "º\nGravedad: " + this.gravedad;
    cadena += "G\nHoras de rotación: " + this.rotacion_eje;
    cadena += "\nRadio: " + this.radio;
    cadena += "Km\nDistancia a su planeta: " + this.distanciaPlaneta;
    cadena += "Km\nDias de orbita alrededor de su planeta: " + this.orbitaPlaneta;

    cadena += "\n------------------------------------------";
    return cadena;
    }

}
