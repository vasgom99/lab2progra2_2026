package lab2progra2.codigo;

public class Cuenta {

    protected int id;
    protected String noCuenta;
    protected double saldo;
    protected String fechaApertura;
    protected String estado;

    public Cuenta(int id, String noCuenta, double saldo, String fechaApertura, String estado) {
        this.id = id;
        this.noCuenta = noCuenta;
        this.saldo = saldo;
        this.fechaApertura = fechaApertura;
        this.estado = estado;
    }

    public void depositar(double monto) {
        if (esActiva() && monto > 0) {
            saldo += monto;
        }
    }

    public void retirar(double monto) {
        if (esActiva() && monto > 0 && saldo >= monto) {
            saldo -= monto;
        }
    }

    public boolean esActiva() {
        return "Activa".equalsIgnoreCase(estado);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(String noCuenta) {
        this.noCuenta = noCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
