import CuentasBancaria.CuentaAhorro;
import CuentasBancaria.CuentaBancaria;
import CuentasBancaria.CuentaCorriente;

public class CuentasBancarias {
  public static void main(String[] args) {
    
    
    CuentaCorriente cuenta1 = new CuentaCorriente("ES1234567890", 2000);
    CuentaAhorro cuenta2 = new CuentaAhorro("ES0987654321", 1200);
    
    cuenta1.ingresar(500);
    cuenta2.retirar(100);
    cuenta1.transferir(cuenta2, 300);
    
    System.out.println("Intereses cuenta 1: "+cuenta1.calcularIntereses());
    cuenta1.mostrarDatos();
    System.out.println();

    System.out.println("Intereses cuenta 2: "+cuenta2.calcularIntereses());
    cuenta2.mostrarDatos();
}
}
