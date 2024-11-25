// Reserva.java
import java.util.Date;

public class Reserva {
    private Cliente cliente; // Cliente que realiza la reserva
    private Plaza plaza; // Plaza reservada
    private Date fechaReserva; // Fecha en que se realiza la reserva
    private EstadoReserva estadoReserva; // Estado de la reserva (CONFIRMADA, PENDIENTE, CANCELADA)

    public Reserva(Cliente cliente, Plaza plaza, Date fechaReserva) {
        this.cliente = cliente;
        this.plaza = plaza;
        this.fechaReserva = fechaReserva;
        this.estadoReserva = EstadoReserva.PENDIENTE; // Al principio está pendiente
    }

    // Método para confirmar la reserva
    public void confirmarReserva() {
        if (plaza.isDisponible()) {
            plaza.asignarVehiculo(cliente.getVehiculo()); // Asignamos el vehículo de cliente a la plaza
            estadoReserva = EstadoReserva.CONFIRMADA;
            System.out.println("Reserva confirmada para el cliente " + cliente.getNombre());
        } else {
            System.out.println("La plaza no está disponible para la reserva.");
        }
    }

    // Método para cancelar la reserva
    public void cancelarReserva() {
        if (estadoReserva == EstadoReserva.CONFIRMADA) {
            plaza.marcarComoLibre(); // Libera la plaza
            estadoReserva = EstadoReserva.CANCELADA;
            System.out.println("Reserva cancelada para el cliente " + cliente.getNombre());
        } else {
            System.out.println("No se puede cancelar una reserva que no ha sido confirmada.");
        }
    }

    // Método para verificar si la reserva está disponible (si la plaza está libre)
    public boolean verificarDisponibilidad() {
        return plaza.isDisponible();
    }

    // Getters y Setters
    public Cliente getCliente() {
        return cliente;
    }

    public Plaza getPlaza() {
        return plaza;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public EstadoReserva getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(EstadoReserva estadoReserva) {
        this.estadoReserva = estadoReserva;
    }
}
