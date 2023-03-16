package Ej1y2.Gato;
public class Gato {
  private String raza;
  private String nombre;
  private String color;
  private static int sardinas=10;

  public Gato (String nombre, String raza, String color) {
    this.raza = raza;
    this.nombre = nombre;
    this.color = color;
   }
   public Gato () {
    
   }
  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
  public void come( int come){
    while((Gato.sardinas>-1)&&(come>0)){
      if (Gato.sardinas>0){
        System.out.print("Ñam ");
        Gato.sardinas--;
        come--;
      } else if(Gato.sardinas==0){
        System.out.print("Ya no hay sardinas. ");
        Gato.sardinas--;
      }
    }
  }
}
  