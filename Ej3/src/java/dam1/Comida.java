/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dam1;

/**
 *
 * @author Dani
 */
public class Comida {
    private String nombre;
    private double precio;
    private double cantidad;
    public static double total;
    
    public Comida(String nombre, double precio, double cantidad){
        this.nombre=nombre;
        this.precio = precio;
        this.cantidad=cantidad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public double getPrecio(){
        return this.precio;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }
    public double getCantidad(){
        return this.cantidad;
    }
    public double subtotal(){
        return this.getCantidad() * this.getPrecio();
    }
    public static double getTotal(){
        return total;
    }
    public static void setTotal(double n){
        total = n;
    }
    public static String escribirComida(Comida comida){
        total+=comida.subtotal();
        return("<tr><td>"+comida.getNombre()+"</td><td>"+comida.getPrecio()+"</td><td>"+comida.getCantidad()+"</td><td>"+comida.subtotal()+"€</td></tr>");
    }
}
