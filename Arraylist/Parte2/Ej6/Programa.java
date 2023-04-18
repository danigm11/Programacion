package Ej6;

import Ej6.Vehiculos.Vehiculo;
import Ej6.Vehiculos.Coche;
import Ej6.Vehiculos.Helicoptero;
import Ej6.Vehiculos.Moto;
import Ej6.Vehiculos.Submarino;
import Ej6.Vehiculos.Terrestre;

import java.util.ArrayList;



import Ej6.Vehiculos.Acuatico;
import Ej6.Vehiculos.Aereo;
import Ej6.Vehiculos.Avion;
import Ej6.Vehiculos.Barco;

public class Programa {
  public static void main(String[] args){

    ArrayList<Vehiculo> arrayVehiculos= new ArrayList<Vehiculo>();
    Coche corsa = new Coche();
    corsa.setMatricula("4444AAA");
    corsa.setAire(true);
    corsa.setModelo("Opel_corsa");
    arrayVehiculos.add( corsa);

    Avion jet = new Avion(4);

    jet.setModelo("AC130");
    jet.setMatricula("332223AABB");
    jet.setTiempoMaximo(5);
    arrayVehiculos.add( jet);
      
    Acuatico acuatico = new Acuatico(5);
    acuatico.setMatricula("111ABCDASCFRTE");
    acuatico.setModelo("acuatico_2.0");
    arrayVehiculos.add(acuatico);

    Terrestre terrestre = new Terrestre();
    acuatico.setMatricula("4444ABB");
    acuatico.setModelo("terrestre_2.0");
    arrayVehiculos.add(terrestre);

    Aereo aereo = new Aereo(8);
    acuatico.setMatricula("442244AAAB");
    acuatico.setModelo("aereo3.0");
    arrayVehiculos.add(aereo);

    Barco barco = new Barco();
    barco.setEslora(5);
    barco.setMatricula("456ABCDASCFRTE");
    barco.setModelo("Catamarán");
    barco.setTieneMotor(false);
    arrayVehiculos.add(barco);

    Helicoptero helicoptero = new Helicoptero(2);
    helicoptero.setNumHelices(4);
    helicoptero.setMatricula("443355CCAA");
    helicoptero.setModelo("H15");
    arrayVehiculos.add(helicoptero);

    Moto moto = new Moto();
    moto.setColor("rojo");
    moto.setMatricula("443CCD");
    moto.setModelo("Sh-125");
    moto.setNumRuedas(2);
    arrayVehiculos.add(moto);

    Submarino submarino = new Submarino();
    submarino.setEslora(10);
    submarino.setMatricula("333ABCDASCFRTE");
    submarino.setModelo("sub-01");
    submarino.setProfundidadMaxima(1500);
    arrayVehiculos.add(submarino);

    for(int i=0;i<arrayVehiculos.size();i++){
      arrayVehiculos.get(i).imprimir();
      System.out.println("---------------------------------------------");
    }
  }
  
}
