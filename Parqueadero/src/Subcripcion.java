import java.util.Date;

public class Subcripcion {
    private Cliente cliente;
    private Date fechaInicio;
    private Date fechaExpiracion;
    private String tipoSuscripcion;
    private boolean estado;

    // Constructor
    public Subcripcion(Cliente cliente, Date fechaInicio, Date fechaExpiracion, String tipoSuscripcion, boolean estado) {
        this.cliente = cliente;
        this.fechaInicio = fechaInicio;
        this.fechaExpiracion = fechaExpiracion;
        this.tipoSuscripcion = tipoSuscripcion;
        this.estado = estado;
    }

    // Métodos getter y setter
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getTipoSuscripcion() {
        return tipoSuscripcion;
    }

    public void setTipoSuscripcion(String tipoSuscripcion) {
        this.tipoSuscripcion = tipoSuscripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
