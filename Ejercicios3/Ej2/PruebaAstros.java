import Astros.Astro;
import Astros.Planeta;
import Astros.Satelite;
public class PruebaAstros {
  public static void main(String[]args){
  Planeta saturno = new Planeta();
  saturno.setNombre("saturno");
  saturno.setMasa(100.00);
  saturno.setDistanciaSol(3500);
  saturno.setRadio(150.00);
  saturno.setTemperatura(150.00);
  saturno.setGravedad(15);
  saturno.setRotacion_eje(32);
  saturno.setOrbitaSol(700);
  Satelite titan = new Satelite();
  titan.setGravedad(6.7);
  titan.setMasa(45.40);
  titan.setRadio(80.00);
  titan.setRotacion_eje(17);
  titan.setNombre("titan");
  titan.setNombrePlaneta("saturno");
  titan.setDistanciaPlaneta(1.9*(Math.pow(10,30)));
  titan.setOrbitaPlaneta(35);
  saturno.orbita(titan);
  System.out.println(saturno);
  System.out.println(titan);


  }
}
