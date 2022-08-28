public class MovimientoDinero {

    //Atributos
    private double monto;
    private String conceptomov;
    private String NombreUsuario;

    public MovimientoDinero(double monto, String conceptomov, String NombreUsuario){
        this.monto = monto;
        this.conceptomov = conceptomov;
        this.NombreUsuario = NombreUsuario;
    }

    public double getmonto() {
        return monto;
    }

    public void setmonto(double monto) {
        this.monto = monto;
    }

    public String getconceptoMov() {
        return conceptomov;
    }

    public void setconceptomov(String conceptomov) {
        this.conceptomov = conceptomov;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }
}
