package militar;

import java.util.ArrayList;
import java.util.List;

public class Cuartel {

    private int idCuartel;
    private String nombre;
    private String ubicacion;
    private List<Compania> companias;

    public Cuartel(int idCuartel, String nombre, String ubicacion) {
        this.idCuartel = idCuartel;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.companias = new ArrayList<>();
    }

    public void agregarCompania(Compania compania) {
        companias.add(compania);
        compania.getCuarteles().add(this);
    }

    public int getIdCuartel() {
        return idCuartel;
    }

    public void setIdCuartel(int idCuartel) {
        this.idCuartel = idCuartel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<Compania> getCompanias() {
        return companias;
    }

    public void setCompanias(List<Compania> companias) {
        this.companias = companias;
    }
}