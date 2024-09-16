/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.patron.creacional.factory.model;

/**
 *
 * @author Grupo 3
 */
public class Camion extends Vehiculo{
    
    @Override
    public double costoMatricula() {
        return (this.getAvaluo() + this.getImpuesto() + this.getCilindraje()) * 15;
    } 
}
