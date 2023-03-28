package Ej8y9.Terminales;
/*
 * Terminal.java
 * 
 * @author Daniel García Mesa 
 * 
 * Clase terminal, contiene el numero, el tiempo de conversación y una función para llamar
 * 
 */
public class Terminal {
  private String numero;
  private int tiempoDeConversacion; // tiempo de conversación en segundos
  public Terminal(String numero) {
    this.numero = numero;
    this.tiempoDeConversacion = 0;
  }
  public String getNumero() {
    return numero;
  }
  public void setNumero(String numero) {
    this.numero = numero;
  }
  public int getTiempoDeConversacion() {
    return tiempoDeConversacion;
  }
  public void setTiempoDeConversacion(int tiempoDeConversacion) {
    this.tiempoDeConversacion = tiempoDeConversacion;
  }
  @Override
  public String toString() {
    return "Nº " + numero + " - " + this.tiempoDeConversacion + "s de conversación ";
  }
  public void llama(Terminal t, int segundosDeLlamada) {
    this.tiempoDeConversacion += segundosDeLlamada;
    t.tiempoDeConversacion += segundosDeLlamada;
  }
 }
  
