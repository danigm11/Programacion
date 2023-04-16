package Ej2;

/**
 * 
 * @author Daniel García Mesa
 * @since 14.04.2023
 * 
 *        Modifica la clase Gato vista anteriormente añadiendo el método
 *        apareaCon.
 *        Este método debe comprobar que los gatos son de distinto sexo, tras lo
 *        cual, genera un nuevo gato. Por ejemplo, sería válido algo como Gato
 *        cria
 *        = garfield.apareaCon(lisa). En caso de que los gatos sean del mismo
 *        sexo,
 *        el método debe generar la excepción ExcepcionApareamientoImposible.
 *        Crea un
 *        programa desde el que se pruebe el método
 */
public class Gato extends Mamifero {
  private String raza;

  public Gato(Sexo s, String r) {
    super(s);
    this.raza = r;
  }

  public Gato(Sexo s) {
    super(s);
    this.raza = "siamés";
  }

  public Gato(String r) {
    super(Sexo.HEMBRA);
    this.raza = r;
  }

  public Gato() {
    super(Sexo.HEMBRA);
    raza = "siamés";
  }

  /**
   * 
   * Función para aparear a 2 gatos, lanza una excepción
   * si son 2 gatos del mismo sexo
   * 
   * @param Gato gato2 es el gato con el que se aparea
   * 
   */
  public void apareaCon(Gato gato2) throws ExcepcionApareamientoImposible {
    if (gato2.getSexo() != this.getSexo()) {
      System.out.print("Los gatos se aparean");
      Gato cria = new Gato();
    } else {
      throw new ExcepcionApareamientoImposible();
    }
  }

  public void maulla() {
    System.out.println("Miauuuu");
  }

  public void ronronea() {
    System.out.println("rrrrrr");
  }

  public void come(String comida) {
    if (comida.equals("pescado")) {
      System.out.println("Hmmmm, gracias");
    } else {
      System.out.println("Lo siento, yo solo como pescado");
    }
  }

  public void peleaCon(Gato contrincante) {
    if (this.getSexo() == Sexo.HEMBRA) {
      System.out.println("no me gusta pelear");
    } else {
      if (contrincante.getSexo() == Sexo.HEMBRA) {
        System.out.println("no peleo contra gatitas");
      } else {
        System.out.println("ven aquí que te vas a enterar");
      }
    }
  }

  public void limpiate() {
    System.out.println("Me estoy lamiendo");
  }

  public void caza() {
    System.out.println("Estoy cazando ratones");
  }
}
