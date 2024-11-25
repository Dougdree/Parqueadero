// Piso.java
import java.util.ArrayList;
import java.util.List;

public class Piso {
    private String codigo;
    private int numeroPlazas;
    private String tipo;
    private List<Plaza> plazas;

    public Piso(String codigo, int numeroPlazas, String tipo) {
        this.codigo = codigo;
        this.numeroPlazas = numeroPlazas;
        this.tipo = tipo;
        this.plazas = new ArrayList<>();
    }

    // Método para agregar plaza
    public void agregarPlaza(Plaza plaza) {
        plazas.add(plaza);
    }

    // Método para eliminar plaza
    public void eliminarPlaza(Plaza plaza) {
        plazas.remove(plaza);
    }

    // Método para verificar si hay plazas disponibles
    public boolean verificarDisponibilidad() {
        for (Plaza plaza : plazas) {
            if (plaza.isDisponible()) {
                return true;
            }
        }
        return false;
    }

    // Método para obtener plazas disponibles
    public List<Plaza> obtenerPlazasDisponibles() {
        List<Plaza> plazasDisponibles = new ArrayList<>();
        for (Plaza plaza : plazas) {
            if (plaza.isDisponible()) {
                plazasDisponibles.add(plaza);
            }
        }
        return plazasDisponibles;
    }

    // Método para buscar plaza disponible
    public Plaza buscarPlazaDisponible(Vehiculo vehiculo) {
        for (Plaza plaza : plazas) {
            if (plaza.isDisponible() && plaza.getVehiculo().getClass().equals(vehiculo.getClass())) {
                return plaza;
            }
        }
        return null; // Si no hay plaza disponible
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }
}
