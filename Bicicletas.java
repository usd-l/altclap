/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author criss
 */
public class Bicicletas extends Vehiculo{
    //Clase hija de Vehiculo
    private String cipobici; // Tipo de bicicleta
    
    Scanner leer = new Scanner(System.in);
    
    // Constructor por defecto
    public Bicicletas() {
    }
    // Métodos getters y setters
    public String getCipobici() {
        return cipobici;
    }

    public void setCipobici(String cipobici) {
        this.cipobici = cipobici;
    }
    
    
    // Constructor con parámetros
    public Bicicletas(String tipobici, String codigo, String modelo, int año, int diasRenta, double kilometraje, boolean reqSeguro) {
        super(codigo, modelo, año, diasRenta, kilometraje, reqSeguro);
        this.cipobici = cipobici;
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
                " Tipo bicicleta: " + cipobici);
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
    System.out.println("Tipo Bici: ");
    cipobici = leer.nextLine();
    setCipobici(cipobici);
    }
    
    
    
    @Override
    public double costo_dias_alquiler(int dias) {
        double costo = TARIFA_BASE_ALQUILER * dias;
        // Aplica un descuento si la bicicleta es de tipo montaña
        if (cipobici.equalsIgnoreCase("montaña")){
            costo = costo *  0.95;
        }
        return costo;
    }
    
    
    
    
    
    
}
