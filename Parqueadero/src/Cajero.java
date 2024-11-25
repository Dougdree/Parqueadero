public class Cajero extends Empleado {

    // Constructor
    public Cajero(String nombre, String cedula, String telefono, String cargo) {
        super(nombre, cedula, telefono, cargo);
    }

    // El cajero puede cobrar una factura, ya está implementado en Empleado
}
