package Ej11;
import java.text.DecimalFormat;
public class TarjetaRegalo {
  
  int numero;
  Double saldo;

  public TarjetaRegalo( double saldo){
    this.saldo=saldo;
      int n= (int)(Math.random()*99999);
      numero+=n;
  }

  public void setSaldo(double saldo){
    this.saldo=saldo;
  }

  public double getSaldo(){
    return saldo;
  }
  public TarjetaRegalo fusionaCon(TarjetaRegalo t){

    TarjetaRegalo tarjetaFusion = new TarjetaRegalo(0.00);

    tarjetaFusion.saldo= this.getSaldo() + t.getSaldo() ;

    this.setSaldo(0.00);
    t.setSaldo(0.00);

    return tarjetaFusion;
  }

  void gasta(double gasto) {
    if (gasto > saldo) {
    System.out.printf("No tiene suficiente saldo para gastar %.2f€\n", gasto);
  } else {
    saldo -= gasto;
    }
    }
    @Override
public String toString() {
DecimalFormat dosDecimales = new DecimalFormat("0.00");
return "Tarjeta nº " + numero + " - Saldo " + dosDecimales.format(saldo);
}

    
}
