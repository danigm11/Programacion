package Ej6;

import Ej6.Vehiculos.Vehiculo;
import Ej6.Vehiculos.Coche;
import Ej6.Vehiculos.Helicoptero;
import Ej6.Vehiculos.Moto;
import Ej6.Vehiculos.Submarino;
import Ej6.Vehiculos.Terrestre;

import javax.swing.JTextArea;

import Ej6.Vehiculos.Acuatico;
import Ej6.Vehiculos.Aereo;
import Ej6.Vehiculos.Avion;
import Ej6.Vehiculos.Barco;

public class Programa {
  public static void main(String[] args){

    Coche corsa = new Coche();
    corsa.setMatricula("4444AAA");
    corsa.setAire(true);
    corsa.setModelo("Opel_corsa");

    Avion jet = new Avion(4);

    jet.setModelo("AC130");
    jet.setMatricula("332223AABB");
    jet.setTiempoMaximo(5);
    jet.imprimir();
      
    Acuatico acuatico = new Acuatico(5);
    acuatico.setMatricula("111ABCDASCFRTE");
    acuatico.setModelo("acuatico_2.0");
    acuatico.imprimir();

    Terrestre terrestre = new Terrestre();
    acuatico.setMatricula("4444ABB");
    acuatico.setModelo("acuatico_2.0");
    acuatico.imprimir();

    Aereo aereo = new Aereo(8);
    acuatico.setMatricula("442244AAAB");
    acuatico.setModelo("aereo3.0");
    acuatico.imprimir();

    Barco barco = new Barco();
    barco.setEslora(5);
    barco.setMatricula("456ABCDASCFRTE");
    barco.setModelo("Catamarán");
    barco.setTieneMotor(false);

    Helicoptero helicoptero = new Helicoptero(2);
    helicoptero.setNumHelices(4);
    helicoptero.setMatricula("443355CCAA");
    helicoptero.setModelo("H15");
    helicoptero.imprimir();

    Moto moto = new Moto();
    moto.setColor("rojo");
    moto.setMatricula("443CCD");
    moto.setModelo("Sh-125");
    moto.setNumRuedas(2);
    moto.imprimir();

    Submarino submarino = new Submarino();
    submarino.setEslora(10);
    submarino.setMatricula("333ABCDASCFRTE");
    submarino.setModelo("sub-01");
    submarino.setProfundidadMaxima(1500);
    submarino.imprimir();
  }
  
}
