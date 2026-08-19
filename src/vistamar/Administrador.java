package vistamar;

import java.util.List;

public class Administrador extends Empleado {

    public Administrador(String idEmpleado, String nombre, String usuario) {
        super(idEmpleado, nombre, usuario);
    }

    public void agregarHabitacion(TipoHabitacion tipo, Habitacion habitacion) {
        tipo.agregarHabitacion(habitacion);
        System.out.println("se agrego la habitacion " + habitacion.getIdHabitacion()
                + " al tipo " + tipo.getNombre());
    }

    public void modificarPrecioTipo(TipoHabitacion tipo, double precio) {
        tipo.setPrecioNoche(precio);
        System.out.println("el tipo " + tipo.getNombre() + " ahora cuesta " + precio + " por noche");
    }

    public void cambiarPorcentajeDescuento(ClienteHabitual cliente, double descuento) {
        cliente.setDescuento(descuento);
        System.out.println("el cliente " + cliente.getNombre() + " ahora tiene " + descuento + " de descuento");
    }

    public void consultarIngresosMensuales(int mes, int anio, List<Reservacion> reservaciones) {
        double ingresos = 0;
        for (Reservacion r : reservaciones) {
            if ("Finalizada".equalsIgnoreCase(r.getEstado())
                    && r.getFechaIngreso().getMonthValue() == mes
                    && r.getFechaIngreso().getYear() == anio) {
                ingresos += r.getTotal();
            }
        }
        System.out.println("los ingresos de ese mes fueron " + ingresos + " quetzales");
    }
}