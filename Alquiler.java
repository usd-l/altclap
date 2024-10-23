/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author criss
 */
public interface Alquiler {
    
     // Tarifa base por día de alquiler
    int TARIFA_BASE_ALQUILER = 30000;
    
    /**
     * Calcula el costo del alquiler basado en el número de días.
     *
     * @param dias el número de días para los que se desea alquilar el vehículo
     * @return el costo total del alquiler
     * 
     * costo_dias_alquiler se utilizara en Gestionar en el apartado de CostoTotal en la linea 50
     */
    double costo_dias_alquiler(int dias);
    
}
