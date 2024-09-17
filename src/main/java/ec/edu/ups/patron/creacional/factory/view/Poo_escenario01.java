/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.patron.creacional.factory.view;

import ec.edu.ups.patron.creacional.factory.controller.VehiculoFactory;
import ec.edu.ups.patron.creacional.factory.model.Vehiculo;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Grupo 3
 */
public class Poo_escenario01 {

    public static void main(String[] args) {
        Vector<Vehiculo> vehiculos = new Vector<>();
        Scanner scanner = new Scanner (System.in);
        String opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Añadir vehículo");
            System.out.println("2. Mostrar vehículos");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextLine();
            switch (opcion) {
                case"1":
                    System.out.print("Ingrese el tipo de vehículo (auto, camioneta, camion): ");
                    String tipoVehiculo = scanner.nextLine();
                    System.out.print("Ingrese la placa: ");
                    String placa = scanner.nextLine();
                    System.out.print("Ingrese el cilindraje: ");
                    int cilindraje = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese la avaluo: ");
                    double avaluo = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Ingrese la Porcentaje Impuesto a la Propiedad: ");
                    double impuesto = scanner.nextDouble();
                    scanner.nextLine();
                    try {
                        var vehiculoFactorty = new VehiculoFactory();
                        Vehiculo vehiculo= vehiculoFactorty.crearVehiculoFactory(tipoVehiculo) ;
                        vehiculo.setPlaca(placa);
                        vehiculo.setAvaluo(avaluo);
                        vehiculo.setCilindraje(cilindraje);
                        vehiculo.setImpuesto(impuesto);
                        vehiculo.setColor("rojo");
                        vehiculo.setMarca("chevro");
                        vehiculo.setModelo("cambiar");
                        vehiculos.add(vehiculo);
                        System.out.println("Vehículo añadido.");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case"2":
                    if (vehiculos.isEmpty()) {
                        System.out.println("No hay vehículos registrados.");
                    } else {
                        System.out.println("Vehículos registrados:");
                        for (Vehiculo v : vehiculos) {
                            System.out.println(v.getClass().getSimpleName() + " - Placa: " + v.getPlaca() + ": Costo de matrícula = " + v.costoMatricula());
                        }
                    }
                    break;
                case"3":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }while(!opcion.equals("3"));
    }
}
