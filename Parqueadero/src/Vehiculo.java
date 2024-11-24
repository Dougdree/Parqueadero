// Clase abstracta Vehiculo
public abstract class Vehiculo {
    // Atributos comunes de los vehículos
    private String matricula; // Matrícula del vehículo
    private String modelo; // Modelo del vehículo
    private String color; // Color del vehículo

    // Constructor para inicializar los atributos
    public Vehiculo(String matricula, String modelo, String color) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
    }

    // Getters y Setters para los atributos
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
