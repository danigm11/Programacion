package Ej5.Articulo;

import java.util.ArrayList;

public class Articulo {
  private String codigo;
  private String descripcion;
  private double precioDeCompra;
  private double precioDeVenta;
  private int stock;

  public Articulo(String codigo, String descripcion, double precioDeCompra,double precioDeVenta, int stock){
    this.codigo= codigo;
    this.descripcion= descripcion;
    this.precioDeCompra= precioDeCompra;
    this.precioDeVenta= precioDeVenta;
    this.stock= stock;
  }
  public Articulo(){
    
  }
  public String getCodigo() {
    return codigo;
  }
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }
  public String getDescripcion() {
    return descripcion;
  }
  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }
  public double getPrecioDeCompra() {
    return precioDeCompra;
  }
  public void setPrecioDeCompra(double precioDeCompra) {
    this.precioDeCompra = precioDeCompra;
  }
  public double getPrecioDeVenta() {
    return precioDeVenta;
  }
  public void setPrecioDeVenta(double precioDeVenta) {
    this.precioDeVenta = precioDeVenta;
  }
  public int getStock() {
    return stock;
  }
  public void setStock(int stock) {
    this.stock = stock;
  }
  @Override
  public String toString() {
    String cadena = "------------------------------------------";
    cadena += "\nCódigo: " + this.codigo;
    cadena += "\nDescripción: " + this.descripcion;
    cadena += "\nPrecio de compra: " + this.precioDeCompra;
    cadena += "\nPrecio de venta: " + this.precioDeVenta;
    cadena += "\nStock: " + this.stock + " unidades";
    cadena += "\n------------------------------------------";
    return cadena;
    }
  /**
   * Función que encuentra la posición de un artículo a partir de su código
   * Devuelve -1 si el código no existe
   * 
   * @param codigo
   * @return la posición
   */
  public static int posicion(String codigo, ArrayList<Articulo> arrayArticulos){
    int p = -1;
    int i=0;

    while((i<arrayArticulos.size())&&(codigo.equals((arrayArticulos.get(i)).getCodigo()))){
      
      if(codigo.equals((arrayArticulos.get(i)).getCodigo())){
        p=i;
      }
      i++;
    }

    return p;
  }
}
