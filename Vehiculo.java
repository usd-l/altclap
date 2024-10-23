
/**
 *
 * @author criss
 */
public abstract class Vehiculo implements Alquiler{
    
    protected String codigo; // Código del vehículo
    protected String modelo; // Modelo del vehículo
    protected int año; // Año de fabricación
    protected int diasRenta; // Días de alquiler
    protected double kilometraje; // Kilometraje actual
    protected boolean reqSeguro; // Indica si se requiere seguro

    // Constructor por defecto
    public Vehiculo() {
    }

    // Constructor con parámetros
    public Vehiculo(String codigo, String modelo, int año, int diasRenta, double kilometraje, boolean reqSeguro) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.año = año;
        this.diasRenta = diasRenta;
        this.kilometraje = kilometraje;
        this.reqSeguro = reqSeguro;
    }
    
    // Métodos getters y setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getDiasRenta() {
        return diasRenta;
    }

    public void setDiasRenta(int diasRenta) {
        this.diasRenta = diasRenta;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public boolean isReqSeguro() {
        return reqSeguro;
    }

    public void setReqSeguro(boolean reqSeguro) {
        this.reqSeguro = reqSeguro;
    }
    // Métodos abstractos a implementar en clases derivadas

    public abstract void mostrarInformacion();
    
    public abstract void registrarInformacion();
    
}
