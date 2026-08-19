package lab2progra2.codigo;

public class Prestamo {

    private int id;
    private String tipoPrestamo;
    private double montoSolicitado;
    private double tasaInteres;
    private int plazoMeses;
    private String fechaSolicitud;
    private String estado;
    private Cuenta cuentaAsociada;
    private double saldoPendiente;

    public Prestamo(int id, String tipoPrestamo, double montoSolicitado, double tasaInteres, int plazoMeses, String fechaSolicitud, Cuenta cuentaAsociada) {
        this.id = id;
        this.tipoPrestamo = tipoPrestamo;
        this.montoSolicitado = montoSolicitado;
        this.tasaInteres = tasaInteres;
        this.plazoMeses = plazoMeses;
        this.fechaSolicitud = fechaSolicitud;
        this.cuentaAsociada = cuentaAsociada;
        this.estado = "Solicitado";
        this.saldoPendiente = montoSolicitado;
    }

    public void aprobar() {
        estado = "Aprobado";
    }

    public void rechazar() {
        estado = "Rechazado";
    }

    public double calcularCuotaMensual() {
        if (plazoMeses <= 0) {
            return montoSolicitado;
        }
        double tasaMensual = (tasaInteres / 100.0) / 12.0;
        if (tasaMensual == 0) {
            return montoSolicitado / plazoMeses;
        }
        double factor = Math.pow(1 + tasaMensual, plazoMeses);
        return montoSolicitado * (tasaMensual * factor) / (factor - 1);
    }

    public void abonar(double monto) {
        if (monto > 0 && saldoPendiente >= monto) {
            saldoPendiente -= monto;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoPrestamo() {
        return tipoPrestamo;
    }

    public void setTipoPrestamo(String tipoPrestamo) {
        this.tipoPrestamo = tipoPrestamo;
    }

    public double getMontoSolicitado() {
        return montoSolicitado;
    }

    public void setMontoSolicitado(double montoSolicitado) {
        this.montoSolicitado = montoSolicitado;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public int getPlazoMeses() {
        return plazoMeses;
    }

    public void setPlazoMeses(int plazoMeses) {
        this.plazoMeses = plazoMeses;
    }

    public String getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(String fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cuenta getCuentaAsociada() {
        return cuentaAsociada;
    }

    public void setCuentaAsociada(Cuenta cuentaAsociada) {
        this.cuentaAsociada = cuentaAsociada;
    }

    public double getSaldoPendiente() {
        return saldoPendiente;
    }

    public void setSaldoPendiente(double saldoPendiente) {
        this.saldoPendiente = saldoPendiente;
    }
}
