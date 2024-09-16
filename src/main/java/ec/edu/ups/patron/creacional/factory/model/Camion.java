/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.patron.creacional.factory.model;

/**
 *
 * @author Santiago Parra
 */
public class Camion extends Vehiculo{
    public Camion(int cilindraje, double impuesto, double avaluo, String placa) {
        super(cilindraje, impuesto, avaluo, placa);
    }
    @Override
    public double costoMatricula() {
        return (this.getAvaluo() + this.getImpuesto() + this.getCilindraje()) * 15;
    } 
}
