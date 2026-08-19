package hotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MainHotel {

    public static void main(String[] args) {

        TipoHabitacion simple = new TipoHabitacion("simple", 250.0);
        TipoHabitacion doble = new TipoHabitacion("doble", 400.0);
        TipoHabitacion matrimonial = new TipoHabitacion("matrimonial", 500.0);

        Habitacion h101 = new Habitacion(101, "Disponible", "foto101.jpg");
        Habitacion h102 = new Habitacion(102, "Disponible", "foto102.jpg");
        Habitacion h103 = new Habitacion(103, "Disponible", "foto103.jpg");
        Habitacion h201 = new Habitacion(201, "Disponible", "foto201.jpg");
        Habitacion h301 = new Habitacion(301, "Mantenimiento", "foto301.jpg");

        simple.agregarHabitacion(h101);
        simple.agregarHabitacion(h102);
        doble.agregarHabitacion(h201);
        matrimonial.agregarHabitacion(h301);

        Administrador admin = new Administrador("A01", "Luis Soto", "luis");
        admin.modificarPrecioTipo(simple, 275.0);
        admin.agregarHabitacion(simple, h103);

        Recepcionista recep = new Recepcionista("R01", "Marta Diaz", "marta");

        ClienteHabitual cliHab = new ClienteHabitual("C01", "Juan Perez", "123456789", "5555-0001", 10.0);
        ClienteEsporadico cliEsp = new ClienteEsporadico("C02", "Sofia Ruiz", "987654321", "5555-0002", 1.0);

        List<Habitacion> habitaciones = new ArrayList<>();
        habitaciones.add(h101);
        habitaciones.add(h102);
        habitaciones.add(h103);
        habitaciones.add(h201);
        habitaciones.add(h301);

        List<Reservacion> reservaciones = new ArrayList<>();

        Reservacion r1 = new Reservacion("R001", cliHab, h101,
                LocalDate.parse("2026-03-10"), LocalDate.parse("2026-03-13"));
        reservaciones.add(r1);
        recep.registrarReservacion(r1);
        System.out.println("el total de la reservacion de juan con descuento es " + recep.calcularTotalEstadia(r1));

        Reservacion r2 = new Reservacion("R002", cliEsp, h201,
                LocalDate.parse("2026-03-15"), LocalDate.parse("2026-03-17"));
        reservaciones.add(r2);
        recep.registrarReservacion(r2);
        System.out.println("el total de la de sofia sin descuento es " + recep.calcularTotalEstadia(r2));

        Reservacion r3 = new Reservacion("R003", cliEsp, h301,
                LocalDate.parse("2026-04-01"), LocalDate.parse("2026-04-03"));
        if (h301.puedeReservarse(r3.getFechaIngreso(), r3.getFechaSalida(), reservaciones)) {
            reservaciones.add(r3);
            recep.registrarReservacion(r3);
        } else {
            System.out.println("no se pudo reservar la 301 porque esta en mantenimiento");
        }

        Reservacion r4 = new Reservacion("R004", cliEsp, h101,
                LocalDate.parse("2026-03-12"), LocalDate.parse("2026-03-14"));
        if (h101.puedeReservarse(r4.getFechaIngreso(), r4.getFechaSalida(), reservaciones)) {
            reservaciones.add(r4);
            recep.registrarReservacion(r4);
        } else {
            System.out.println("no se pudo reservar la 101 porque esas fechas ya chocan con otra reservacion");
        }

        Reservacion r5 = new Reservacion("R005", cliEsp, h101,
                LocalDate.parse("2026-03-20"), LocalDate.parse("2026-03-22"));
        if (h101.puedeReservarse(r5.getFechaIngreso(), r5.getFechaSalida(), reservaciones)) {
            reservaciones.add(r5);
            recep.registrarReservacion(r5);
        }

        recep.registrarIngreso(r1);
        recep.registrarSalida(r1);

        recep.cancelarReservacion(r5);

        admin.consultarIngresosMensuales(3, 2026, reservaciones);

        recep.buscarReservacion("R001", reservaciones);
        recep.consultarHabitacionesDisponibles(habitaciones);
    }
}
