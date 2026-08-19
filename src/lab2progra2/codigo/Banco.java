package lab2progra2.codigo;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private int id;
    private String nombre;
    private String direccion;
    private List<Empleado> empleados;
    private List<Cliente> clientes;

    public Banco(int id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.empleados = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleado.setBanco(this);
        empleados.add(empleado);
    }

    public void agregarCliente(Cliente cliente) {
        cliente.setBanco(this);
        clientes.add(cliente);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
}
