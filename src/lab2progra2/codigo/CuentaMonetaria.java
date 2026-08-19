package lab2progra2.codigo;

public class CuentaMonetaria extends Cuenta {

    private double limiteSobregiroAutorizado;

    public CuentaMonetaria(int id, String noCuenta, double saldo, String fechaApertura, String estado, double limiteSobregiroAutorizado) {
        super(id, noCuenta, saldo, fechaApertura, estado);
        this.limiteSobregiroAutorizado = limiteSobregiroAutorizado;
    }

    @Override
    public void retirar(double monto) {
        if (esActiva() && monto > 0 && saldo + limiteSobregiroAutorizado >= monto) {
            saldo -= monto;
        }
    }

    public double getLimiteSobregiroAutorizado() {
        return limiteSobregiroAutorizado;
    }

    public void setLimiteSobregiroAutorizado(double limiteSobregiroAutorizado) {
        this.limiteSobregiroAutorizado = limiteSobregiroAutorizado;
    }
}
