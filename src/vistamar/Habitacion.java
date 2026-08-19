package vistamar;

import java.time.LocalDate;
import java.util.List;

public class Habitacion {

    private int idHabitacion;
    private String estado;
    private String fotografia;
    private TipoHabitacion tipo;

    public Habitacion(int idHabitacion, String estado, String fotografia) {
        this.idHabitacion = idHabitacion;
        this.estado = estado;
        this.fotografia = fotografia;
    }

    public boolean estaDisponible() {
        return "Disponible".equalsIgnoreCase(estado);
    }

    public boolean puedeReservarse(LocalDate fechaIngreso, LocalDate fechaSalida, List<Reservacion> reservaciones) {
        if (!estaDisponible() && !"Reservada".equalsIgnoreCase(estado)) {
            return false;
        }
        for (Reservacion r : reservaciones) {
            if (r.getHabitacion() == this
                    && !"Cancelada".equalsIgnoreCase(r.getEstado())
                    && r.getFechaIngreso().isBefore(fechaSalida)
                    && fechaIngreso.isBefore(r.getFechaSalida())) {
                return false;
            }
        }
        return true;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFotografia() {
        return fotografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }

    public TipoHabitacion getTipo() {
        return tipo;
    }

    public void setTipo(TipoHabitacion tipo) {
        this.tipo = tipo;
    }
}