package lab2progra2.codigo;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nombre;
    private String id;
    private String direccion;
    private String numeroTelefono;
    private Banco banco;
    private List<Cuenta> cuentas;
    private List<Prestamo> prestamos;

    public Cliente(String nombre, String id, String direccion, String numeroTelefono) {
        this.nombre = nombre;
        this.id = id;
        this.direccion = direccion;
        this.numeroTelefono = numeroTelefono;
        this.cuentas = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }

    public void consultar() {
        System.out.println("el cliente " + nombre + " hizo una consulta");
    }

    public void depositar(Cuenta cuenta, double monto) {
        cuenta.depositar(monto);
    }

    public void retirar(Cuenta cuenta, double monto) {
        cuenta.retirar(monto);
    }

    public void abrirCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
        cuenta.setEstado("Activa");
    }

    public void cerrarCuenta(Cuenta cuenta) {
        cuenta.setEstado("Cerrada");
    }

    public void solicitarPrestamo(Prestamo prestamo) {
        prestamo.setEstado("Solicitado");
        prestamos.add(prestamo);
    }

    public void solicitarTarjeta() {
        System.out.println("el cliente " + nombre + " pidio una tarjeta");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
}
