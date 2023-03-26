package CuentasBancaria;
public class CuentaCorriente extends CuentaBancaria {

    public CuentaCorriente(String iban, double saldo) {
        super(iban, saldo);
    }

    @Override
    public double calcularIntereses() {
        double intereses = getSaldo() * getInteresAnualBasico();
        añadir(intereses);
        return intereses;
    }
}
