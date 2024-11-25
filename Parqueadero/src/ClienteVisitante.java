public class ClienteVisitante extends Cliente {
    private static final String tipoCliente = "Visitante";
    // Atributos específicos del cliente visitante
    private String duracionEstancia; // Duración de la estancia del cliente visitante

    // Constructor para inicializar un cliente visitante
    public ClienteVisitante(String nombre, String cedula, String telefono) {
        super(nombre, cedula, telefono, tipoCliente); // Llamada al constructor de Cliente
        this.duracionEstancia = duracionEstancia; // Asigna la duración de la estancia
    }

    // Métodos getter y setter para duracionEstancia
    public String getDuracionEstancia() {
        return duracionEstancia;
    }

    public void setDuracionEstancia(String duracionEstancia) {
        this.duracionEstancia = duracionEstancia;
    }

    // Otros métodos específicos del ClienteVisitante...
}
