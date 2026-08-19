package militar;

public class CuerpoEjercito {

    private String tipoCuerpo;
    private String denominacion;

    public CuerpoEjercito(String tipoCuerpo, String denominacion) {
        this.tipoCuerpo = tipoCuerpo;
        this.denominacion = denominacion;
    }

    public String getTipoCuerpo() {
        return tipoCuerpo;
    }

    public void setTipoCuerpo(String tipoCuerpo) {
        this.tipoCuerpo = tipoCuerpo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
}