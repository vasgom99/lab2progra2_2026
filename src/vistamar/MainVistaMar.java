package vistamar;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MainVistaMar {

    public static void main(String[] args) {

        TipoHabitacion sencilla = new TipoHabitacion("sencilla", 300.0);
        TipoHabitacion doble = new TipoHabitacion("doble", 450.0);
        TipoHabitacion suite = new TipoHabitacion("suite", 700.0);

        Habitacion h1 = new Habitacion(1, "Disponible", "foto1.jpg");
        Habitacion h2 = new Habitacion(2, "Disponible", "foto2.jpg");
        Habitacion h3 = new Habitacion(3, "Disponible", "foto3.jpg");
        Habitacion h4 = new Habitacion(4, "Mantenimiento", "foto4.jpg");

        sencilla.agregarHabitacion(h1);
        sencilla.agregarHabitacion(h2);
        doble.agregarHabitacion(h3);
        suite.agregarHabitacion(h4);

        Habitacion h5 = new Habitacion(5, "Disponible", "foto5.jpg");

        Administrador admin = new Administrador("A10", "Rosa Marin", "rosa");
        admin.modificarPrecioTipo(sencilla, 320.0);
        admin.agregarHabitacion(doble, h5);

        Recepcionista recep = new Recepcionista("R10", "Jose Arana", "jose");

        ClienteHabitual turista = new ClienteHabitual("C10", "Luis Batz", "123456789", "5555-0100", 15.0);
        ClienteEsporadico negocios = new ClienteEsporadico("C11", "Gloria Chan", "987654321", "5555-0101", 1.0);

        List<Habitacion> habitaciones = new ArrayList<>();
        habitaciones.add(h1);
        habitaciones.add(h2);
        habitaciones.add(h3);
        habitaciones.add(h4);
        habitaciones.add(h5);

        List<Reservacion> reservaciones = new ArrayList<>();

        Reservacion r1 = new Reservacion("VR001", turista, h1,
                LocalDate.parse("2026-05-01"), LocalDate.parse("2026-05-05"));
        reservaciones.add(r1);
        recep.registrarReservacion(r1);
        System.out.println("total de luis con descuento de habitual es " + recep.calcularTotalEstadia(r1));

        Reservacion r2 = new Reservacion("VR002", negocios, h3,
                LocalDate.parse("2026-05-10"), LocalDate.parse("2026-05-12"));
        reservaciones.add(r2);
        recep.registrarReservacion(r2);
        System.out.println("total de gloria sin descuento es " + recep.calcularTotalEstadia(r2));

        Reservacion r3 = new Reservacion("VR003", negocios, h4,
                LocalDate.parse("2026-05-20"), LocalDate.parse("2026-05-22"));
        if (h4.puedeReservarse(r3.getFechaIngreso(), r3.getFechaSalida(), reservaciones)) {
            reservaciones.add(r3);
            recep.registrarReservacion(r3);
        } else {
            System.out.println("no se pudo reservar la 4 porque esta en mantenimiento");
        }

        Reservacion r4 = new Reservacion("VR004", turista, h1,
                LocalDate.parse("2026-05-03"), LocalDate.parse("2026-05-06"));
        if (h1.puedeReservarse(r4.getFechaIngreso(), r4.getFechaSalida(), reservaciones)) {
            reservaciones.add(r4);
            recep.registrarReservacion(r4);
        } else {
            System.out.println("no se pudo reservar la 1 en esas fechas para no sobre-reservar");
        }

        recep.registrarIngreso(r1);
        recep.registrarSalida(r1);

        admin.consultarIngresosMensuales(5, 2026, reservaciones);
        recep.buscarReservacion("VR001", reservaciones);
        recep.consultarHabitacionesDisponibles(habitaciones);
    }
}