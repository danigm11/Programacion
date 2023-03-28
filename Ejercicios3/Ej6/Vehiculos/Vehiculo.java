package Ej6.Vehiculos;
/*
 * Vehiculo.java
 * 
 * @author Daniel García Mesa 
 * 
 * 23/03/2023
 * 
 * 
 * 
 */
public abstract class Vehiculo {

  private String matricula;
  private String modelo;
  public String getMatricula() {
    return matricula;
  }
  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }
  public String getModelo() {
    return modelo;
  }
  public void setModelo(String modelo) {
    this.modelo = modelo;
  }
  public Vehiculo(){

  }
  public void imprimir(){
    System.out.println("Modelo: "+this.modelo);
    System.out.println("Matrícula: "+this.matricula);
  }
}
