package CuentasBancaria;
/*
 * CuentaCorriente.java
 * 
 * @author Daniel García Mesa 
 * 
 * 25/03/2023
 * 
 * 
 * 
 */
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
