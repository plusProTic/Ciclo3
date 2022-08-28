public class Empresa
{
    // Declaración de Atributos de la Clase Empresa
    private String nombreEmpresa;
    private String direccionEmpresa;
    private String telefonoEmpresa;
    private String NITEmpresa;

    // Declaración del Método Constructor de la Clase Empresa
    public Empresa(String nombreEmpresa, String direccionEmpresa, String telefonoEmpresa, String NITEmpresa)
    {
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.NITEmpresa = NITEmpresa;
    }

    // Declaración de los Métodos Set y Get de la Clase Empresa

    public String getNombreEmpresa()
    {
        return nombreEmpresa;
    }
    public void setNombreEmpresa(String nombreEmpresa)
    {
        this.nombreEmpresa = nombreEmpresa;
    }
    public String getDireccionEmpresa()
    {
        return direccionEmpresa;
    }
    public void setDireccionEmpresa(String direccionEmpresa)
    {
        this.direccionEmpresa = direccionEmpresa;
    }
    public String getTelefonoEmpresa()
    {
        return telefonoEmpresa;
    }
    public void setTelefonoEmpresa(String telefonoEmpresa)
    {
        this.telefonoEmpresa = telefonoEmpresa;
    }
    public String getNITEmpresa()
    {
        return NITEmpresa;
    }
    public void setNITEmpresa(String NITEmpresa)
    {
        this.NITEmpresa = NITEmpresa;
    }
}
