package alquiler;

public class DetalleReserva {

    private double precioAlquiler;
    private double litrosGasolina;
    private boolean entregado;
    private Vehiculo vehiculo;

    public DetalleReserva(double precioAlquiler, double litrosGasolina, boolean entregado, Vehiculo vehiculo) {
        this.precioAlquiler = precioAlquiler;
        this.litrosGasolina = litrosGasolina;
        this.entregado = entregado;
        this.vehiculo = vehiculo;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public double getLitrosGasolina() {
        return litrosGasolina;
    }

    public void setLitrosGasolina(double litrosGasolina) {
        this.litrosGasolina = litrosGasolina;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}