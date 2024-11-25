// importo Date
import java.util.Date;

// atributos
public class Factura {
    private Cliente cliente;
    private TipoFactura tipoFactura;
    private Date fecha;
    private double monto;
    private boolean estadoPago;

    // Constructor
    public Factura(Cliente cliente, TipoFactura tipoFactura, Date fecha, double monto) {
        this.cliente = cliente;
        this.tipoFactura = tipoFactura;
        this.fecha = fecha;
        this.monto = monto;
        this.estadoPago = false; // Al principio, la factura no está pagada
    }

    // Mostrar detalles de la factura
    public void mostrarFactura() {
        System.out.println("Factura de " + cliente.getNombre());
        System.out.println("Tipo de Factura: " + tipoFactura.getNombre());
        System.out.println("Monto: " + monto);
        System.out.println("Estado de Pago: " + (estadoPago ? "Pagada" : "Pendiente"));
    }

    // Getters y Setters
    public double getMonto() {
        return monto;
    }

    public void setEstadoPago(boolean estadoPago) {
        this.estadoPago = estadoPago;
    }
}

