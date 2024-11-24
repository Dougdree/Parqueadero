public abstract class Empleado extends Persona {
    private String cargo;

    // Constructor
    public Empleado(String nombre, String cedula, String telefono, String cargo) {
        super(nombre, cedula, telefono);
        this.cargo = cargo;
    }

    // Método para cobrar la factura
    public void cobrar(Factura factura) {
        System.out.println("Empleado " + getNombre() + " está cobrando la factura de " + factura.getMonto() + "...");
        // Lógica de cobro
        factura.setEstadoPago(true); // Marcar la factura como cobrada
        System.out.println("Factura cobrada.");
    }

    // Método para verificar el pago de un cliente
    public void verificarPago(Cliente cliente) {
        if (cliente instanceof ClienteRegular) {
            ClienteRegular clienteRegular = (ClienteRegular) cliente;
            if (clienteRegular.getSuscripcion() != null) {
                System.out.println("Pago verificado para el cliente " + cliente.getNombre());
            } else {
                System.out.println("No se ha encontrado suscripción activa.");
            }
        }
    }
}
