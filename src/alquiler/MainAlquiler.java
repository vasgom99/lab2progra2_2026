package alquiler;

import java.time.LocalDate;

public class MainAlquiler {

    public static void main(String[] args) {

        Garaje garaje1 = new Garaje(1);
        Garaje garaje2 = new Garaje(2);

        Vehiculo auto1 = new Vehiculo("P-123ABC", "Corolla", "blanco", "Toyota");
        Vehiculo auto2 = new Vehiculo("P-456DEF", "Civic", "negro", "Honda");
        Vehiculo auto3 = new Vehiculo("P-789GHI", "Tucson", "gris", "Hyundai");

        garaje1.agregarVehiculo(auto1);
        garaje1.agregarVehiculo(auto2);
        garaje2.agregarVehiculo(auto3);

        System.out.println("el auto " + auto1.getModelo() + " con matricula " + auto1.getMatricula()
                + " esta en el garaje " + auto1.getGaraje().getIdGaraje());

        Cliente cliente1 = new Cliente("C001", "12345678A", "Ana Lopez", "Ciudad", "5555-2000");
        Cliente cliente2 = new Cliente("C002", "87654321B", "Luis Perez", "Zona 1", "5555-2001");
        cliente2.serAvaladoPor(cliente1);

        System.out.println("el cliente " + cliente2.getNombre() + " es avalado por " + cliente2.getAvaladoPor().getNombre());

        Agencia agencia = new Agencia(101);

        Reservacion reserva = new Reservacion("R100", cliente1,
                LocalDate.parse("2026-06-01"), LocalDate.parse("2026-06-08"));
        agencia.agregarReservacion(reserva);
        cliente1.agregarReservacion(reserva);

        DetalleReserva det1 = new DetalleReserva(350.0, 30.0, false, auto1);
        DetalleReserva det2 = new DetalleReserva(500.0, 45.0, false, auto3);
        reserva.agregarDetalle(det1);
        reserva.agregarDetalle(det2);

        System.out.println("la reserva " + reserva.getIdReserva() + " del cliente "
                + reserva.getCliente().getNombre() + " se hizo en la agencia "
                + reserva.getAgencia().getIdAgencia());
        System.out.println("el precio total de la reserva es " + reserva.getPrecioTotal());
        System.out.println("todos los coches entregados? " + reserva.todosEntregados());

        det1.setEntregado(true);
        det2.setEntregado(true);
        System.out.println("despues de entregarlos todos? " + reserva.todosEntregados());
    }
}