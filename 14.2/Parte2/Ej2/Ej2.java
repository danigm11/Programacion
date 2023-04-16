package Ej2;
import Ej2.ExcepcionApareamientoImposible;

/**
 * 
 * @author Daniel García Mesa
 * @since 14.04.2023
 * 
 *        Este programa prueba la clase gato y atrapa una excepción
 *        del tipo ApareamientoImposible creada por mí
 */

public class Ej2 {
  public static void main(String[] args) {
    Gato gato1 = new Gato(Sexo.MACHO);
    Gato gato2 = new Gato(Sexo.MACHO);
    try {
      gato1.apareaCon(gato2);
    } catch (ExcepcionApareamientoImposible e) {
      System.out.println("Dos gatos del mismo sexo no se pueden aparear.");
    }
  }

}
