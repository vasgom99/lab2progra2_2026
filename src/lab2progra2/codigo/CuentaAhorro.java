package lab2progra2.codigo;

public class CuentaAhorro extends Cuenta {

    private double tasaIteresAplicable;

    public CuentaAhorro(int id, String noCuenta, double saldo, String fechaApertura, String estado, double tasaIteresAplicable) {
        super(id, noCuenta, saldo, fechaApertura, estado);
        this.tasaIteresAplicable = tasaIteresAplicable;
    }

    public double getTasaIteresAplicable() {
        return tasaIteresAplicable;
    }

    public void setTasaIteresAplicable(double tasaIteresAplicable) {
        this.tasaIteresAplicable = tasaIteresAplicable;
    }
}
