package CuentasBancaria;
public class CuentaAhorro extends CuentaBancaria {
  private static double saldoMinimo = 1000;

  public CuentaAhorro(String iban, double saldo) {
      super(iban, saldo);
  }

  @Override
  public double calcularIntereses() {
      double intereses;
      if (getSaldo() < saldoMinimo) {
          intereses = getSaldo() * getInteresAnualBasico() / 2;
      } else {
          intereses = getSaldo() * getInteresAnualBasico() * 2;
      }
      añadir(intereses);
      return intereses;
  }

  public static double getSaldoMinimo() {
      return saldoMinimo;
  }

  public static void setSaldoMinimo(double saldoMinimo) {
      CuentaAhorro.saldoMinimo = saldoMinimo;
  }
}
