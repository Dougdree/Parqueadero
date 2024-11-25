// Plaza.java
public class Plaza {
    private String codigo;
    private String ubicacion;
    private String tipo;
    private boolean estado; // true = libre, false = ocupada
    private Vehiculo vehiculo; // Vehículo asignado a la plaza

    public Plaza(String codigo) {
        this.codigo = codigo;
        this.ubicacion = ubicacion;
        this.tipo = tipo;
        this.estado = true; // Se asume que la plaza está libre por defecto
    }

    // Métodos para marcar el estado de la plaza
    public void marcarComoOcupada() {
        this.estado = false;
    }

    public void marcarComoLibre() {
        this.estado = true;
    }

    public void marcarComoReservada() {
        // Código para marcar como reservada
    }

    // Métodos para obtener información de la plaza
    public String getCodigo() {
        return codigo;
    }

    public boolean isDisponible() {
        return estado;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void asignarVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        marcarComoOcupada();
    }
}
