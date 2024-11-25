// Parqueadero.java
import java.util.ArrayList;
import java.util.List;

public class Parqueadero {
    private String nombre;
    private String direccion;
    private String numeroPisos;
    private String telefono;
    private String horario;
    private List<Piso> pisos; // Lista de pisos en el parqueadero

    public Parqueadero(String nombre, String direccion, String numeroPisos, String telefono, String horario) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroPisos = numeroPisos;
        this.telefono = telefono;
        this.horario = horario;
        this.pisos = new ArrayList<>();
    }

    // Método para agregar un piso
    public void agregarPiso(Piso piso) {
        pisos.add(piso);
    }

    // Método para eliminar un piso
    public void eliminarPiso(Piso piso) {
        pisos.remove(piso);
    }

    // Método para listar los pisos disponibles
    public void listarPisos() {
        for (Piso piso : pisos) {
            System.out.println(piso.getCodigo());
        }
    }

    // Método para buscar plaza por vehículo
    public Plaza buscarPlazaPorVehiculo(Vehiculo vehiculo) {
        for (Piso piso : pisos) {
            Plaza plaza = piso.buscarPlazaDisponible(vehiculo);
            if (plaza != null) {
                return plaza;
            }
        }
        return null; // Si no hay plaza disponible
    }
}
