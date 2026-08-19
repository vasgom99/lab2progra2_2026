package militar;

import java.time.LocalDate;

public class DetalleServicio {

    private LocalDate fechaRealizado;
    private Soldado soldado;
    private Servicios servicio;

    public DetalleServicio(LocalDate fechaRealizado, Soldado soldado, Servicios servicio) {
        this.fechaRealizado = fechaRealizado;
        this.soldado = soldado;
        this.servicio = servicio;
    }

    public LocalDate getFechaRealizado() {
        return fechaRealizado;
    }

    public void setFechaRealizado(LocalDate fechaRealizado) {
        this.fechaRealizado = fechaRealizado;
    }

    public Soldado getSoldado() {
        return soldado;
    }

    public void setSoldado(Soldado soldado) {
        this.soldado = soldado;
    }

    public Servicios getServicio() {
        return servicio;
    }

    public void setServicio(Servicios servicio) {
        this.servicio = servicio;
    }
}