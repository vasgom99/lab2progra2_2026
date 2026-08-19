package alquiler;

public class Agencia {

    private int idAgencia;
    private java.util.List<Reservacion> reservaciones;

    public Agencia(int idAgencia) {
        this.idAgencia = idAgencia;
        this.reservaciones = new java.util.ArrayList<>();
    }

    public void agregarReservacion(Reservacion reservacion) {
        reservacion.setAgencia(this);
        reservaciones.add(reservacion);
    }

    public int getIdAgencia() {
        return idAgencia;
    }

    public void setIdAgencia(int idAgencia) {
        this.idAgencia = idAgencia;
    }

    public java.util.List<Reservacion> getReservaciones() {
        return reservaciones;
    }

    public void setReservaciones(java.util.List<Reservacion> reservaciones) {
        this.reservaciones = reservaciones;
    }
}