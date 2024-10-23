/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author criss
 */
public class Motocicleta extends Vehiculo{
    //Clase hija de Vehiculo
    Scanner leer = new Scanner(System.in);
    
    private int cilindrada; //Cilindrada de la moto
    
    
    // Constructor por defecto
    public Motocicleta() {
    }

    public Motocicleta(int cilindrada, String codigo, String modelo, int año, int diasRenta, double kilometraje, boolean reqSeguro) {
        super(codigo, modelo, año, diasRenta, kilometraje, reqSeguro);
        this.cilindrada = cilindrada;
    }
    
    // Métodos getters y setters
    
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    
    //Mostrar Informacion
    @Override
    public void mostrarInformacion() {
        System.out.println("Codigo " + codigo +
                " Modelo " + modelo +
                " Año " + año +
                " Dias Renta " + diasRenta +
                " Kilometraje: " + kilometraje +
                " Seguro adicional " + reqSeguro +
                " Cilindrada: " + cilindrada);
    }
    
    //Registrar Informacion
    @Override
    public void registrarInformacion() {
    // Solicitar información general del vehículo
    System.out.println("Codigo: ");
    codigo = leer.nextLine();
    setCodigo(codigo);
    
    System.out.println("Modelo: ");
    modelo = leer.nextLine();
    setModelo(modelo);
    
    System.out.println("Año: ");
    año = leer.nextInt();
    setAño(año);
    
    System.out.println("Dias Renta: ");
    diasRenta = leer.nextInt();
    
    System.out.println("Kilometraje: ");
    kilometraje = leer.nextDouble();
    setKilometraje(kilometraje);

    // Validar la entrada para el requerimiento de seguro
    boolean validInput = false; // Variable para controlar la validez de la entrada
    while (!validInput) { // Bucle que se repetirá hasta obtener una entrada válida
        System.out.println("Requiere Seguro [True: Si | False: No]: ");
        String input = leer.next(); // Leer la entrada
        leer.nextLine(); // Limpiar el buffer

        // Verificar si la entrada es "true"
        if (input.equalsIgnoreCase("true")) {
            reqSeguro = true; // Establecer reqSeguro a verdadero
            validInput = true; // Marcar la entrada como válida
        } 
        // Verificar si la entrada es "false"
        else if (input.equalsIgnoreCase("false")) {
            reqSeguro = false; // Establecer reqSeguro a falso
            validInput = true; // Marcar la entrada como válida
        } 
        // Si la entrada no es válida, mostrar un mensaje de error
        else {
            System.out.println("Entrada no válida. Por favor, ingrese 'True' o 'False'.");
        }
    }

    // Solicitar información adicional específica para el tipo de vehículo
    System.out.println("Cilindraje: ");
    cilindrada = leer.nextInt();
    setCilindrada(cilindrada);
    }
    
    
    
    @Override
    public double costo_dias_alquiler(int dias) {
        //Aplica un cargo si la cilindrada es mayor a 600
        double costo = TARIFA_BASE_ALQUILER * dias ;
        if (cilindrada > 600){
            costo = costo * 1.8;
        }
        return costo;
    }
    
    
    
    
    
    
    
    
    
}
