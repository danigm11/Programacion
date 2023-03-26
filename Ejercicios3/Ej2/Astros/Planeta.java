package Astros;
/*
 * Planeta.java
 * 
 * @author Daniel García Mesa 
 * 
 * 21/03/2023
 * 
 * Clase planeta, contiene atributos de los planetas y un array de satelites que orbitan
 * a su alrededor
 * 
 * 
 */
public class Planeta extends Astro {
  
  private String nombre;
  private double distanciaSol;
  private int orbitaSol;
  private boolean tieneSatelites = false;
  int numSatelites =0;
  private Satelite[] arraySatelites;

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getDistanciaSol() {
    return distanciaSol;
  }

  public void setDistanciaSol(double distanciaSol) {
    this.distanciaSol = distanciaSol;
  }

  public int getOrbitaSol() {
    return orbitaSol;
  }

  public void setOrbitaSol(int orbitaSol) {
    this.orbitaSol = orbitaSol;
  }

  public boolean isTieneSatelites() {
    return tieneSatelites;
  }

  public void setTieneSatelites(boolean tieneSatelites) {
    this.tieneSatelites = tieneSatelites;
  }
  public Planeta(){
    super();
    this.arraySatelites = new Satelite[100];

  }
  public Planeta(String nombre,double masa,double temperatura, double distanciaSol, int orbitaSol){
    super();
    this.arraySatelites = new Satelite[100];
    this.nombre=nombre;
    this.distanciaSol=distanciaSol;
    this.orbitaSol=orbitaSol;
  }
  /*
   * Esta funcion orbita asocia satelites al planeta alrededor del que orbitan introduciendolos
   * en un array de satelites que pertenecen al planeta
   * 
   * @params x es el satelite que quieres asociar al planeta 
   */
  public void orbita(Satelite x){
    tieneSatelites=true;
    arraySatelites[numSatelites]=x;
    numSatelites+=1;
    
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
    cadena += "\nDistancia al sol: " + this.distanciaSol;
    cadena += "Km\nDias de orbita alrededor del Sol: " + this.orbitaSol;
    if(tieneSatelites==true){
      cadena += "\nSatelites: \n";
      for(int i=0;i<numSatelites;i++){
        cadena += ""+arraySatelites[i].getNombre()+"\n";
      }
    }
    cadena += "\n------------------------------------------";
    return cadena;
    }
}
