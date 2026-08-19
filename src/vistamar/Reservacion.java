package vistamar;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reservacion {

    private String idReservacion;
    private LocalDate fechaIngreso;
    private LocalDate fechaSalida;
    private int cantidadNoches;
    private double precioNoche;
    private double descuento;
    private double total;
    private String estado;
    private Cliente cliente;
    private Habitacion habitacion;

    public Reservacion(String idReservacion, Cliente cliente, Habitacion habitacion, LocalDate fechaIngreso, LocalDate fechaSalida) {
        this.idReservacion = idReservacion;
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.cantidadNoches = (int) ChronoUnit.DAYS.between(fechaIngreso, fechaSalida);
        this.precioNoche = habitacion.getTipo().getPrecioNoche();
        this.descuento = cliente.obtenerDescuento();
        this.total = precioNoche * cantidadNoches * (1 - descuento / 100.0);
        this.estado = "Registrada";
    }

    public void aplicarDescuento() {
        this.descuento = cliente.obtenerDescuento();
        this.total = precioNoche * cantidadNoches * (1 - descuento / 100.0);
    }

    public void recalcularTotal() {
        this.total = precioNoche * cantidadNoches * (1 - descuento / 100.0);
    }

    public String getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservacion(String idReservacion) {
        this.idReservacion = idReservacion;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getCantidadNoches() {
        return cantidadNoches;
    }

    public void setCantidadNoches(int cantidadNoches) {
        this.cantidadNoches = cantidadNoches;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
}