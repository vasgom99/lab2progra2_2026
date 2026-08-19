package hotel;

public class ClienteEsporadico extends Cliente {

    private double tarifaNormal;

    public ClienteEsporadico(String idCliente, String nombre, String dpi, String telefono, double tarifaNormal) {
        super(idCliente, nombre, dpi, telefono);
        this.tarifaNormal = tarifaNormal;
    }

    @Override
    public double obtenerDescuento() {
        return 0.0;
    }

    public double getTarifaNormal() {
        return tarifaNormal;
    }

    public void setTarifaNormal(double tarifaNormal) {
        this.tarifaNormal = tarifaNormal;
    }
}
