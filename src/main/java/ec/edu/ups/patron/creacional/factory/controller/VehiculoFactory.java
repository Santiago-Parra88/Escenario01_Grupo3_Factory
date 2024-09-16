/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.patron.creacional.factory.controller;

import ec.edu.ups.patron.creacional.factory.model.Auto;
import ec.edu.ups.patron.creacional.factory.model.Camion;
import ec.edu.ups.patron.creacional.factory.model.Camioneta;
import ec.edu.ups.patron.creacional.factory.model.Vehiculo;

/**
 *
 * @author Santiago Parra
 */
public class VehiculoFactory {
    public static Vehiculo crearVehiculoFactory(String tipoVehiculo, String placa, double avaluo, int cilindraje) {
     switch (tipoVehiculo) {
         case "auto":
             return new Auto(cilindraje, 5.5, avaluo, placa);
         case "camioneta":
             return new Camioneta(cilindraje, 15.5, avaluo, placa);
         case "camion":
             return new Camion(cilindraje, 15.5, avaluo, placa);
         default:
             throw new IllegalArgumentException("Parámetro inválido");
     }
 }
}
