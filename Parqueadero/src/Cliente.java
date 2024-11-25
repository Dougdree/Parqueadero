public class Cliente {
    // Atributos comunes de la clase Cliente
    private String nombre;
    private String cedula;
    private String telefono;
    private String tipoCliente; // Atributo privado

    // Constructor de la clase Cliente
    public Cliente(String nombre, String cedula, String telefono, String tipoCliente) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.tipoCliente = tipoCliente; // Asigna tipoCliente al objeto Cliente
    }

    // Métodos getter y setter para tipoCliente
    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    // Getters y Setters para los otros atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Vehiculo getVehiculo() {
        return null;
    }

    // Otros métodos comunes que pueden ir aquí, si es necesario...
}
