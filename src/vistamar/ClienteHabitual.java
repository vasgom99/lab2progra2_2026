package vistamar;

public class ClienteHabitual extends Cliente {

    private double descuento;

    public ClienteHabitual(String idCliente, String nombre, String dpi, String telefono, double descuento) {
        super(idCliente, nombre, dpi, telefono);
        this.descuento = descuento;
    }

    @Override
    public double obtenerDescuento() {
        return descuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}