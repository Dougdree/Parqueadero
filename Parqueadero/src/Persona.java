// Clase base para representar a cualquier persona
public class Persona {
    // Atributos básicos de una persona
    private String nombre; // Nombre de la persona
    private String cedula; // Cédula o identificación
    private String telefono; // Número de teléfono

    // Constructor para inicializar los atributos de Persona
    public Persona(String nombre, String cedula, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    // Métodos getter para obtener los valores de los atributos
    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    // Métodos setter para modificar los valores de los atributos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
