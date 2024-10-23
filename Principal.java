import java.util.Scanner;

/**
 * Clase Principal que sirve como punto de entrada para la aplicación de gestión de vehículos.
 * Esta clase presenta un menú que permite al usuario interactuar con el sistema para agregar vehículos,
 * mostrar información y calcular costos totales de alquiler.
 * 
 * @author criss
 */
public class Principal {
    
    public static void main(String[] args) {
        
        // Crear una instancia de la clase Gestionar para manejar los vehículos
        Gestionar gestion = new Gestionar();
        // Crear un escáner para la entrada del usuario
        Scanner leer = new Scanner(System.in);
        int opc; // Variable para almacenar la opción seleccionada por el usuario
   
        do {
            // Mostrar el menú principal
            System.out.println("===Menu Autos===");
            System.out.println("[1] Agregar Auto");
            System.out.println("[2] Agregar Moto");
            System.out.println("[3] Agregar Bici");
            System.out.println("[4] Mostrar Totales");
            System.out.println("[5] Salir");

            // Leer la opción seleccionada
            opc = leer.nextInt();
            
            // Procesar la opción seleccionada por el usuario
            switch (opc) {
                case 1:
                    // Agregar un nuevo automóvil
                    System.out.println("Ingresar Informacion Vehiculo");
                    Auto nuevoAuto = new Auto();
                    nuevoAuto.registrarInformacion(); // Registrar la información del nuevo auto
                    gestion.AgregarVehiculo(nuevoAuto); // Agregar el auto a la lista de vehículos
                    break;
                case 2:
                    // Agregar una nueva motocicleta
                    System.out.println("Ingresando Informacion Moto");
                    Motocicleta nuevaMoto = new Motocicleta();
                    nuevaMoto.registrarInformacion(); // Registrar la información de la nueva moto
                    gestion.AgregarVehiculo(nuevaMoto); // Agregar la moto a la lista de vehículos
                    break;
                case 3:
                    // Agregar una nueva bicicleta
                    System.out.println("Ingresando Informacion Bicicleta");
                    Bicicletas nuevaBici = new Bicicletas();
                    nuevaBici.registrarInformacion(); // Registrar la información de la nueva bici
                    gestion.AgregarVehiculo(nuevaBici); // Agregar la bici a la lista de vehículos
                    break;
                case 4:
                    // Mostrar información de todos los vehículos registrados
                    System.out.println("Mostrando informacion de todos los Registros");
                    gestion.MostrarInformacion(); // Mostrar la información de los vehículos
                    System.out.println("El costo total es: " + gestion.CostoTotal()); // Calcular y mostrar el costo total
                    break;
                case 5:
                    // Opción para salir del programa
                    System.out.println("Saliendo");
                    break;
                default:
                    // Manejar entradas inválidas
                    System.out.println("Error: Opción inválida.");
            }
            
        } while (opc != 5); // Repetir hasta que el usuario elija salir
        
        // Cerrar el escáner al finalizar
        leer.close();
    }
}
