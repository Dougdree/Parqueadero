public class ClienteRegular extends Cliente {
    private static final String tipoCliente = "Regular";
    // Atributos específicos del cliente regular
    private Subcripcion suscripcion; // Relación con la clase Subcripción
    private String metodoPago; // Método de pago preferido

    // Constructor para inicializar un cliente regular
    public ClienteRegular(String nombre, String cedula, String telefono, String regular) {
        super(nombre, cedula, telefono, tipoCliente); // Llamada al constructor de Cliente
        this.suscripcion = suscripcion; // Se asigna la suscripción
    }

    // Métodos getter y setter para suscripción
    public Subcripcion getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(Subcripcion suscripcion) {
        this.suscripcion = suscripcion;
    }

    // Métodos getter y setter para metodoPago
    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void pagarFactura(Factura factura1) {
        return;
    }
}
