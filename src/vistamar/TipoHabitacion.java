package vistamar;

import java.util.ArrayList;
import java.util.List;

public class TipoHabitacion {

    private String nombre;
    private double precioNoche;
    private List<Habitacion> habitaciones;

    public TipoHabitacion(String nombre, double precioNoche) {
        this.nombre = nombre;
        this.precioNoche = precioNoche;
        this.habitaciones = new ArrayList<>();
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitacion.setTipo(this);
        habitaciones.add(habitacion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }
}