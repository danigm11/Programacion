package CuentasBancaria;
/*
 * CuentaBancaria.java
 * 
 * @author Daniel García Mesa 
 * 
 * 25/03/2023
 * 
 */
public abstract class CuentaBancaria {
  private String iban;
  private double saldo;
  private static double interesAnualBasico = 0.02;

  public CuentaBancaria(String iban, double saldo) {
      this.iban = iban;
      this.saldo = saldo;
  }

  public String getIban() {
      return iban;
  }

  public double getSaldo() {
      return saldo;
  }
  public void setIban(String iban) {
    this.iban = iban;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }
  public static double getInteresAnualBasico() {
    return interesAnualBasico;
  }

  public static void setInteresAnualBasico(double interesAnualBasico) {
    CuentaBancaria.interesAnualBasico = interesAnualBasico;
  }
  public void añadir(double cantidad) {
    saldo += cantidad;
  }
  public void ingresar(double cantidad) {
      añadir(cantidad);
  }

  public void retirar(double cantidad) {
      añadir(-cantidad);
  }

  public void transferir(CuentaBancaria cuenta2, double cantidad) {
      retirar(cantidad);
      cuenta2.ingresar(cantidad);
  }

  public abstract double calcularIntereses();

  public void mostrarDatos() {
      System.out.println("IBAN: " + iban);
      System.out.println("Saldo: " + saldo);
  }

  
}
