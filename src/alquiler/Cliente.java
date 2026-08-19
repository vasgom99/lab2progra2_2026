package alquiler;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String codigo;
    private String dni;
    private String nombre;
    private String direccion;
    private String telefono;
    private Cliente avaladoPor;
    private List<Cliente> avalados;
    private List<Reservacion> reservaciones;

    public Cliente(String codigo, String dni, String nombre, String direccion, String telefono) {
        this.codigo = codigo;
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.avalados = new ArrayList<>();
        this.reservaciones = new ArrayList<>();
    }

    public void serAvaladoPor(Cliente cliente) {
        this.avaladoPor = cliente;
        cliente.getAvalados().add(this);
    }

    public void agregarReservacion(Reservacion reservacion) {
        reservaciones.add(reservacion);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Cliente getAvaladoPor() {
        return avaladoPor;
    }

    public void setAvaladoPor(Cliente avaladoPor) {
        this.avaladoPor = avaladoPor;
    }

    public List<Cliente> getAvalados() {
        return avalados;
    }

    public void setAvalados(List<Cliente> avalados) {
        this.avalados = avalados;
    }

    public List<Reservacion> getReservaciones() {
        return reservaciones;
    }

    public void setReservaciones(List<Reservacion> reservaciones) {
        this.reservaciones = reservaciones;
    }
}