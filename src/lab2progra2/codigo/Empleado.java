package lab2progra2.codigo;

import java.util.ArrayList;
import java.util.List;

public class Empleado {

    private String id;
    private String nombre;
    private Banco banco;
    private List<Cliente> clientesAtendidos;

    public Empleado(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.clientesAtendidos = new ArrayList<>();
    }

    public void atenderCliente(Cliente cliente) {
        clientesAtendidos.add(cliente);
    }

    public void recibirDinero(Cuenta cuenta, double monto) {
        cuenta.depositar(monto);
    }

    public void gestionarDeposito(Cuenta cuenta, double monto) {
        cuenta.depositar(monto);
    }

    public void abrirCuenta(Cuenta cuenta) {
        cuenta.setEstado("Activa");
    }

    public void cerrarCuenta(Cuenta cuenta) {
        cuenta.setEstado("Cerrada");
    }

    public void procesarSolicitudPrestamo(Prestamo prestamo, boolean aprobar) {
        if (aprobar) {
            prestamo.aprobar();
        } else {
            prestamo.rechazar();
        }
    }

    public void proporcionarInformacion(Cliente cliente) {
        System.out.println("informacion del cliente " + cliente.getNombre()
                + " con id " + cliente.getId()
                + " y telefono " + cliente.getNumeroTelefono());
    }

    public void emitirTarjeta(Cliente cliente) {
        System.out.println("se le emitio una tarjeta al cliente " + cliente.getNombre());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public List<Cliente> getClientesAtendidos() {
        return clientesAtendidos;
    }

    public void setClientesAtendidos(List<Cliente> clientesAtendidos) {
        this.clientesAtendidos = clientesAtendidos;
    }
}
