
/**
 *
 * @author criss
 */
import java.util.Scanner;

public class Auto extends Vehiculo{

    //Clase hija de Vehiculo
    Scanner leer = new Scanner(System.in);
    
    private int numAsientos;// Número de asientos en el auto
    
    
    // Constructor por defecto
    public Auto() {
    }
    
    // Constructor con parámetros
    public Auto(int numAsientos, String codigo, String modelo, int año, int diasRenta, double kilometraje, boolean reqSeguro) {
        super(codigo, modelo, año, diasRenta, kilometraje, reqSeguro);
        this.numAsientos = numAsientos;
    }
    
    // Métodos getters y setters
    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public Auto(int numAsientos) {
        this.numAsientos = numAsientos;
    }
    
    
    //Metodo para mostrar info incorporado del padre
    @Override
    public void mostrarInformacion() {
        System.out.println("Codigo: "+ codigo +
                " Modelo: "+ modelo +
                " Año: "+ año +
                " Dias Renta"+ diasRenta +
                " Kilometraje"+ kilometraje +
                " Seguro: "+ reqSeguro +
                " Cantidad Asientos: "+ numAsientos);
    }
    
    //Registrar informacion del Auto 
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
    // Leer el kilometraje directamente como un double
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
    System.out.println("Cantidad de Asientos: ");
    numAsientos = leer.nextInt();
    setNumAsientos(numAsientos);
    }
    
    
    
    //Metodo para conseguir los precios
    @Override
    public double costo_dias_alquiler(int dias) {
        double costo = TARIFA_BASE_ALQUILER * dias;
        //Aplica un cargo si el auto tiene mas de 5 asientos y es relativamente nuevo
        if (this.getNumAsientos() > 5 &&  (2024 - this.getAño() < 5) ) {
            costo = costo * 1.10;
        }
        return costo;
    }
    
    
    
    
}
