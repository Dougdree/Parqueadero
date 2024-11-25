# Sistema de Parqueadero

## Introducción

Este sistema de parqueadero ha sido diseñado para gestionar las operaciones de un parqueadero que permite registrar vehículos, asignar plazas, generar facturas y gestionar pagos. 

De acuerdo al diagrama de clases (UML), generado en APE - parqueadero, implementar  en un lenguaje de programación(JAVA), la solución que entregaron, tomando en cuenta lo siguiente:

- Utilizar un repositorio GitHub
- Utilizar gitflow debe tener como mínimo las ramas main(o master) y develop
- Se va revisar la rama master(debe tener tags)
- Debe coincidir con el diagrama de clases.
- Debe estar el diagrama de clases en el readme (debe mostrarse)
- En caso de modificación del diagrama de clases original, especificar los principales cambio

## Diagrama de Clases

![Parqueadero](https://github.com/user-attachments/assets/90e5ea42-bee3-4208-b353-e33ee0ecd945)

## Código

Clase Main:
[Main](https://github.com/Dougdree/Parqueadero/blob/develop/Parqueadero/src/Main.java)

Clase Automóvil:
[Automovil](https://github.com/Dougdree/Parqueadero/blob/develop/Parqueadero/src/Automovil.java)

Clase Bicicleta:
[Bicicleta](https://github.com/Dougdree/Parqueadero/blob/develop/Parqueadero/src/Bicicleta.java)

Clase Cajero:
[Cajero](https://github.com/Dougdree/Parqueadero/blob/develop/Parqueadero/src/Cajero.java)

Clase Cliente:
[Cliente](https://github.com/Dougdree/Parqueadero/blob/develop/Parqueadero/src/Cliente.java)

Clase ClienteRegular:
[ClienteRegular](https://github.com/Dougdree/Parqueadero/blob/develop/Parqueadero/src/ClienteRegular.java)

Clase ClienteVisitante:
[ClienteVisitante](https://github.com/Dougdree/Parqueadero/blob/develop/Parqueadero/src/ClienteVisitante.java)

Clase Contrato:
[Contrato](https://github.com/Dougdree/Parqueadero/blob/develop/Parqueadero/src/Contrato.java)

Clase Empleado:
[Empleado](https://github.com/Dougdree/Parqueadero/blob/develop/Parqueadero/src/Empleado.java)

Clase EstadoReserva:
[EstadoReserva](https://github.com/Dougdree/Parqueadero/blob/develop/Parqueadero/src/EstadoReserva.java)

Clase Factura:
[Factura](https://github.com/Dougdree/Parqueadero/blob/develop/Parqueadero/src/Factura.java)

Clase Motocicleta:
[Motocicleta](https://github.com/Dougdree/Parqueadero/blob/develop/Parqueadero/src/Motocicleta.java)

Clase Parqueadero:
[Parqueadero](https://github.com/Dougdree/Parqueadero/blob/develop/Parqueadero/src/Parqueadero.java)

Clase Persona:
[Persona](https://github.com/Dougdree/Parqueadero/blob/develop/Parqueadero/src/Persona.java)

Clase Piso:
[Piso](https://github.com/Dougdree/Parqueadero/blob/develop/Parqueadero/src/Piso.java)

Clase Plaza:
[Plaza](https://github.com/Dougdree/Parqueadero/blob/develop/Parqueadero/src/Plaza.java)

Clase Reserva:
[Reserva](https://github.com/Dougdree/Parqueadero/blob/develop/Parqueadero/src/Reserva.java)

Clase Subcripcion:
[Subcripcion](https://github.com/Dougdree/Parqueadero/blob/develop/Parqueadero/src/Subcripcion.java)

Clase Supervisor:
[Supervisor](https://github.com/Dougdree/Parqueadero/blob/develop/Parqueadero/src/Supervisor.java)

Clase Tarifa:
[Tarifa](https://github.com/Dougdree/Parqueadero/blob/develop/Parqueadero/src/Tarifa.java)

Clase TipoFactura:
[TipoFactura](https://github.com/Dougdree/Parqueadero/blob/develop/Parqueadero/src/TipoFactura.java)

Clase Vehiculo:
[Vehiculo](https://github.com/Dougdree/Parqueadero/blob/develop/Parqueadero/src/Vehiculo.java)

## Reflexión

Al desarrollar este sistema de parqueadero, he tenido la oportunidad de aplicar varios conceptos de programación orientada a objetos, como la herencia, la composición y la abstracción. La creación de clases como `Vehiculo`, `Cliente`, `Empleado` y `Factura` no solo permitió organizar el código de manera modular, sino que también facilitó la implementación de relaciones entre las entidades del sistema, como la relación entre clientes y vehículos, y empleados con la gestión de pagos.

A lo largo del desarrollo, aprendí a cómo gestionar distintas funcionalidades dentro de un sistema, desde la creación de objetos y el manejo de colecciones hasta la generación de reportes y la interacción con el usuario. También me permitió mejorar mis habilidades en la implementación de lógica de negocio y en la escritura de código limpio y bien estructurado.

