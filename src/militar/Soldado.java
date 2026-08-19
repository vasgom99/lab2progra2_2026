package militar;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Soldado {

    private String idSoldado;
    private String nombre;
    private String graduacion;
    private String ubicacion;
    private Cuartel cuartel;
    private CuerpoEjercito cuerpo;
    private Compania compania;
    private List<DetalleServicio> serviciosRealizados;

    public Soldado(String idSoldado, String nombre, String graduacion, String ubicacion) {
        this.idSoldado = idSoldado;
        this.nombre = nombre;
        this.graduacion = graduacion;
        this.ubicacion = ubicacion;
        this.serviciosRealizados = new ArrayList<>();
    }

    public void asignarCuartel(Cuartel cuartel) {
        this.cuartel = cuartel;
    }

    public void asignarCuerpo(CuerpoEjercito cuerpo) {
        this.cuerpo = cuerpo;
    }

    public void asignarCompania(Compania compania) {
        this.compania = compania;
        compania.getSoldados().add(this);
    }

    public void realizarServicio(Servicios servicio, LocalDate fechaRealizado) {
        DetalleServicio detalle = new DetalleServicio(fechaRealizado, this, servicio);
        serviciosRealizados.add(detalle);
        servicio.getDetalles().add(detalle);
    }

    public String getIdSoldado() {
        return idSoldado;
    }

    public void setIdSoldado(String idSoldado) {
        this.idSoldado = idSoldado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGraduacion() {
        return graduacion;
    }

    public void setGraduacion(String graduacion) {
        this.graduacion = graduacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Cuartel getCuartel() {
        return cuartel;
    }

    public void setCuartel(Cuartel cuartel) {
        this.cuartel = cuartel;
    }

    public CuerpoEjercito getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(CuerpoEjercito cuerpo) {
        this.cuerpo = cuerpo;
    }

    public Compania getCompania() {
        return compania;
    }

    public void setCompania(Compania compania) {
        this.compania = compania;
    }

    public List<DetalleServicio> getServiciosRealizados() {
        return serviciosRealizados;
    }

    public void setServiciosRealizados(List<DetalleServicio> serviciosRealizados) {
        this.serviciosRealizados = serviciosRealizados;
    }
}