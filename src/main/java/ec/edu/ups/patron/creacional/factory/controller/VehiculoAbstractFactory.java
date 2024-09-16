/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.patron.creacional.factory.controller;

import ec.edu.ups.patron.creacional.factory.model.Vehiculo;

/**
 *
 * @author Santiago Parra
 */
public abstract class VehiculoAbstractFactory {
   public abstract Vehiculo crearVehiculoFactory(String tipovehiculo);   
}
