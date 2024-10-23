/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

/**
 *
 * @author criss
 */
public class Gestionar {
    
    public ArrayList<Vehiculo> listaVehiculos;
    
    // Constructor
    public Gestionar() {
        listaVehiculos = new ArrayList<>();
    }
    // Busca un vehículo por su código
    public boolean buscarFlota(String codigo) {
        for (Vehiculo codVehic : listaVehiculos){
            if(codVehic.getCodigo().equalsIgnoreCase(codigo)){
                return  true;
            }
        }
        return false;
    }
    
    // Agrega un vehículo a la lista
    public void AgregarVehiculo(Vehiculo addVeh){
        if (!buscarFlota(addVeh.getCodigo())){
            listaVehiculos.add(addVeh);
            System.out.println("Agregado Exitosamente.");
        } else{
            System.out.println("Ya existe este codigo");
        }
    }
    // Muestra la información de todos los vehículos
    public void MostrarInformacion(){
        for (Vehiculo vehi : listaVehiculos){
            vehi.mostrarInformacion();
        }
    }
    // Cuenta la cantidad de vehículos
    public int ContarVehiculos(){
        return listaVehiculos.size();
    }
    // Calcula el costo total del alquiler
    public double CostoTotal(){
        double costoTotal = 0;
        for (Vehiculo costoVehi : listaVehiculos){
            costoTotal += costoVehi.costo_dias_alquiler(costoVehi.getDiasRenta());
        }
        return costoTotal;
    }
    
}
