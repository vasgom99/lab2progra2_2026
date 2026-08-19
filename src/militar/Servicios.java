package militar;

public class Servicios {

    private String codigoServicio;
    private String descripcion;
    private java.util.List<DetalleServicio> detalles;

    public Servicios(String codigoServicio, String descripcion) {
        this.codigoServicio = codigoServicio;
        this.descripcion = descripcion;
        this.detalles = new java.util.ArrayList<>();
    }

    public String getCodigoServicio() {
        return codigoServicio;
    }

    public void setCodigoServicio(String codigoServicio) {
        this.codigoServicio = codigoServicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public java.util.List<DetalleServicio> getDetalles() {
        return detalles;
    }

    public void setDetalles(java.util.List<DetalleServicio> detalles) {
        this.detalles = detalles;
    }
}