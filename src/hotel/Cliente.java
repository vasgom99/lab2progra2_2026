package hotel;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {

    private String idCliente;
    private String nombre;
    private String dpi;
    private String telefono;
    private List<Reservacion> reservaciones;

    public Cliente(String idCliente, String nombre, String dpi, String telefono) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.dpi = dpi;
        this.telefono = telefono;
        this.reservaciones = new ArrayList<>();
    }

    public abstract double obtenerDescuento();

    public void agregarReservacion(Reservacion reservacion) {
        reservaciones.add(reservacion);
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Reservacion> getReservaciones() {
        return reservaciones;
    }

    public void setReservaciones(List<Reservacion> reservaciones) {
        this.reservaciones = reservaciones;
    }
}
