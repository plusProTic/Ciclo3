public class MovimientodeDinero {
    // Declaración de Atributos de la Clase MovimientodeDinero
    private double monto;
    private String tipoMonto;
    private String conceptoMov;
    private String NombreUsuario;

    // Declaración del Método Constructor de la Clase MovimientodeDinero
    public MovimientodeDinero(double monto, String tipoMonto, String conceptomov, String NombreUsuario){
        this.monto = monto;
        this.tipoMonto = tipoMonto;
        this.conceptoMov = conceptomov;
        this.NombreUsuario = NombreUsuario;
    }

    // Declaración de los Métodos Set y Get de la Clase MovimientodeDinero
    public double getmonto()
    {
        return monto;
    }
    public void setmonto(double monto)
    {
        this.monto = monto;
    }

    public String getTipoMonto()
    {
        return tipoMonto;
    }
    public void setTipoMonto(String tipoMonto)
    {
        this.tipoMonto = tipoMonto;
    }
    public String getconceptoMov()
    {
        return conceptoMov;
    }
    public void setconceptomov(String conceptomov)
    {
        this.conceptoMov = conceptomov;
    }
    public String getNombreUsuario()
    {
        return NombreUsuario;
    }
    public void setNombreUsuario(String NombreUsuario)
    {
        this.NombreUsuario = NombreUsuario;
    }
}
