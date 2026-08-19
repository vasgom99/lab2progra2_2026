package vistamar;

import java.util.List;

public class Recepcionista extends Empleado {

    public Recepcionista(String idEmpleado, String nombre, String usuario) {
        super(idEmpleado, nombre, usuario);
    }

    public void consultarHabitacionesDisponibles(List<Habitacion> habitaciones) {
        System.out.println("las habitaciones libres en este momento son:");
        for (Habitacion h : habitaciones) {
            if (h.estaDisponible()) {
                System.out.println("  numero " + h.getIdHabitacion()
                        + " tipo " + h.getTipo().getNombre()
                        + " precio " + h.getTipo().getPrecioNoche());
            }
        }
    }

    public void registrarReservacion(Reservacion reservacion) {
        reservacion.getCliente().agregarReservacion(reservacion);
        reservacion.getHabitacion().setEstado("Reservada");
        reservacion.setEstado("Registrada");
        System.out.println("quedo registrada la reservacion " + reservacion.getIdReservacion());
    }

    public void buscarReservacion(String idReservacion, List<Reservacion> reservaciones) {
        for (Reservacion r : reservaciones) {
            if (r.getIdReservacion().equals(idReservacion)) {
                System.out.println("la reservacion " + idReservacion
                        + " esta " + r.getEstado()
                        + " y su total es " + r.getTotal());
                return;
            }
        }
        System.out.println("no encontre ninguna reservacion con el codigo " + idReservacion);
    }

    public double calcularTotalEstadia(Reservacion reservacion) {
        reservacion.aplicarDescuento();
        return reservacion.getTotal();
    }

    public void cancelarReservacion(Reservacion reservacion) {
        reservacion.setEstado("Cancelada");
        reservacion.getHabitacion().setEstado("Disponible");
        System.out.println("se cancelo la reservacion " + reservacion.getIdReservacion()
                + " y la habitacion quedo disponible");
    }

    public void registrarIngreso(Reservacion reservacion) {
        reservacion.getHabitacion().setEstado("Ocupada");
        System.out.println("el cliente ya entro a la habitacion " + reservacion.getHabitacion().getIdHabitacion());
    }

    public void registrarSalida(Reservacion reservacion) {
        reservacion.getHabitacion().setEstado("Disponible");
        reservacion.setEstado("Finalizada");
        System.out.println("el cliente salio y la habitacion " + reservacion.getHabitacion().getIdHabitacion()
                + " quedo disponible");
    }
}