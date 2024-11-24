public class Supervisor extends Empleado {

    // Constructor
    public Supervisor(String nombre, String cedula, String telefono, String cargo) {
        super(nombre, cedula, telefono, cargo);
    }

    // El supervisor verifica el pago de un cliente
    @Override
    public void verificarPago(Cliente cliente) {
        super.verificarPago(cliente);  // Llamamos a la verificación en la clase padre
    }
}
