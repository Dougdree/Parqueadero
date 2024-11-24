import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Mensaje de bienvenida
        System.out.println("Bienvenido al sistema de parqueadero!");

        // Creamos vehículos con matrícula, modelo y color específico
        Vehiculo auto = new Automovil("ABC123", "Toyota", "Rojo"); // Un automóvil Toyota con matrícula ABC123 y color rojo
        Vehiculo moto = new Motocicleta("XYZ456", "Suzuki", "Negra"); // Una motocicleta Suzuki con matrícula XYZ456 y color negro
        Vehiculo bici = new Bicicleta("BIKE789", "Makuro", "Azul"); // Una bicicleta Makuro con matrícula BIKE789 y color azul

        // Creamos clientes
        Cliente cliente1 = new ClienteRegular("Juan Perez", "1234567890", "juan@correo.com", "Regular");
        Cliente cliente2 = new ClienteVisitante("Maria Lopez", "987654321", "maria@correo.com");

        // Creamos empleados
        Empleado supervisor = new Supervisor("Carlos García", "12345", "carlos@correo.com", "Supervisor");
        Empleado cajero = new Cajero("Ana Gómez", "67890", "ana@correo.com", "Cajero");

        // Creamos tipos de factura
        TipoFactura tipoFactura1 = TipoFactura.NORMAL;
        TipoFactura tipoFactura2 = TipoFactura.DETALLADA;

        // Creamos una suscripción para un cliente regular
        Subcripcion suscripcion = new Subcripcion(cliente1, new Date(), new Date(System.currentTimeMillis() + 86400000L), "Premium", true);

        // Creamos una reserva de plaza para el cliente1
        Plaza plaza1 = new Plaza("P1-M1");
        Reserva reserva1 = new Reserva(cliente1, plaza1, new Date());

        // Verificamos disponibilidad y confirmamos la reserva
        if (reserva1.verificarDisponibilidad()) {
            reserva1.confirmarReserva(); // Confirmamos la reserva
        } else {
            System.out.println("La plaza P1-M1 no está disponible.");
        }

        // Creamos una factura para el cliente1
        Factura factura1 = new Factura(cliente1, tipoFactura1, new Date(), 500.00);

        // Mostramos los detalles de la factura
        factura1.mostrarFactura();

        // Realizamos pago de factura (solo para cliente regular)
        if (cliente1 instanceof ClienteRegular) {
            ((ClienteRegular) cliente1).pagarFactura(factura1); // Cliente regular paga la factura
        }

        // Confirmamos el pago y el cobro
        cajero.cobrar(factura1); // El cajero cobra la factura
        supervisor.verificarPago(cliente1); // El supervisor verifica el pago

        // Se muestra el estado de la reserva después de confirmación
        System.out.println("Estado de la reserva: " + reserva1.getEstadoReserva());

        // Mensaje de despedida
        System.out.println("¡Gracias por utilizar el sistema de parqueadero!");
    }
}
