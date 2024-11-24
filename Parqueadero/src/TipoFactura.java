public enum TipoFactura {
    NORMAL("Factura Normal", 1),
    DETALLADA("Factura Detallada", 2);

    private String nombre;
    private int tipo;

    // Constructor
    TipoFactura(String nombre, int tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    // Getter
    public String getNombre() {
        return nombre;
    }

    // Getter
    public int getTipo() {
        return tipo;
    }
}

