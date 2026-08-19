package alquiler;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Reservacion {

    private String idReserva;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;
    private double precioTotal;
    private Cliente cliente;
    private Agencia agencia;
    private List<DetalleReserva> detalles;

    public Reservacion(String idReserva, Cliente cliente, LocalDate fechaInicio, LocalDate fechaFinal) {
        this.idReserva = idReserva;
        this.cliente = cliente;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.detalles = new ArrayList<>();
        this.precioTotal = 0.0;
    }

    public void agregarDetalle(DetalleReserva detalle) {
        detalles.add(detalle);
        calcularPrecioTotal();
    }

    public void calcularPrecioTotal() {
        precioTotal = 0.0;
        for (DetalleReserva d : detalles) {
            precioTotal += d.getPrecioAlquiler();
        }
    }

    public boolean todosEntregados() {
        if (detalles.isEmpty()) {
            return false;
        }
        for (DetalleReserva d : detalles) {
            if (!d.isEntregado()) {
                return false;
            }
        }
        return true;
    }

    public String getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public List<DetalleReserva> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleReserva> detalles) {
        this.detalles = detalles;
    }
}