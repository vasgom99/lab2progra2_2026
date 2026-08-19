package militar;

import java.util.ArrayList;
import java.util.List;

public class Compania {

    private int idCompania;
    private String actividadPrincipal;
    private List<Cuartel> cuarteles;
    private List<Soldado> soldados;

    public Compania(int idCompania, String actividadPrincipal) {
        this.idCompania = idCompania;
        this.actividadPrincipal = actividadPrincipal;
        this.cuarteles = new ArrayList<>();
        this.soldados = new ArrayList<>();
    }

    public int getIdCompania() {
        return idCompania;
    }

    public void setIdCompania(int idCompania) {
        this.idCompania = idCompania;
    }

    public String getActividadPrincipal() {
        return actividadPrincipal;
    }

    public void setActividadPrincipal(String actividadPrincipal) {
        this.actividadPrincipal = actividadPrincipal;
    }

    public List<Cuartel> getCuarteles() {
        return cuarteles;
    }

    public void setCuarteles(List<Cuartel> cuarteles) {
        this.cuarteles = cuarteles;
    }

    public List<Soldado> getSoldados() {
        return soldados;
    }

    public void setSoldados(List<Soldado> soldados) {
        this.soldados = soldados;
    }
}