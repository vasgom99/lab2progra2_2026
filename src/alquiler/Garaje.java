package alquiler;

public class Garaje {

    private int idGaraje;
    private java.util.List<Vehiculo> vehiculos;

    public Garaje(int idGaraje) {
        this.idGaraje = idGaraje;
        this.vehiculos = new java.util.ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculo.setGaraje(this);
        vehiculos.add(vehiculo);
    }

    public int getIdGaraje() {
        return idGaraje;
    }

    public void setIdGaraje(int idGaraje) {
        this.idGaraje = idGaraje;
    }

    public java.util.List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(java.util.List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
}