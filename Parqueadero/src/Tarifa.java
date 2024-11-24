// Clase Tarifa para calcular los costos de los vehículos
public class Tarifa {
    // Atributos de la tarifa
    private String tipoVehiculo; // Tipo de vehículo (Automóvil, Motocicleta, etc.)
    private double costoPorHora; // Costo por hora
    private double costoPorDia; // Costo por día
    private double costoMensual; // Costo mensual

    // Constructor para inicializar la tarifa
    public Tarifa(String tipoVehiculo, double costoPorHora, double costoPorDia, double costoMensual) {
        this.tipoVehiculo = tipoVehiculo;
        this.costoPorHora = costoPorHora;
        this.costoPorDia = costoPorDia;
        this.costoMensual = costoMensual;
    }

    // Métodos getter y setter para los atributos
    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public double getCostoPorHora() {
        return costoPorHora;
    }

    public void setCostoPorHora(double costoPorHora) {
        this.costoPorHora = costoPorHora;
    }

    public double getCostoPorDia() {
        return costoPorDia;
    }

    public void setCostoPorDia(double costoPorDia) {
        this.costoPorDia = costoPorDia;
    }

    public double getCostoMensual() {
        return costoMensual;
    }

    public void setCostoMensual(double costoMensual) {
        this.costoMensual = costoMensual;
    }

    // Método para calcular el costo basado en el tipo de vehículo
    public double calcularCosto() {
        System.out.println("Calculando el costo basado en el tipo de vehículo: " + tipoVehiculo);
        return costoPorHora; // Valor de ejemplo
    }

    // Método para mostrar información de la tarifa
    public String mostrarTarifa() {
        return "Tipo de Vehículo: " + tipoVehiculo + ", Costo por Hora: " + costoPorHora +
                ", Costo por Día: " + costoPorDia + ", Costo Mensual: " + costoMensual;
    }
}
