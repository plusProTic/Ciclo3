public class Empleado extends Empresa
{

    // Declaración de Atributos de la Clase Empleado
    private String nombreEmpleado;
    private String correoEmpleado;
    private String empresaqueperteneceEmpleado;
    private String rolEmpleado;

    // Declaración del Método Constructor de la Clase Empleado
    public Empleado(String nombreEmpleado, String correo, String empresaQuePertenece, String rolEmpleado, String nombreEmpresa, String direccionEmpresa, String telefonoEmpresa, String NITEmpresa)
    {
        super(nombreEmpresa, direccionEmpresa, telefonoEmpresa, NITEmpresa);
        this.nombreEmpleado = nombreEmpleado;
        this.correoEmpleado = correo;
        this.empresaqueperteneceEmpleado = empresaQuePertenece;
        this.rolEmpleado = rolEmpleado;
    }

    // Declaración de los Métodos Set y Get de la Clase Empleado
    public String getNombreEmpleado()
    {
        return nombreEmpleado;
    }
    public void setNombreEmpleado(String nombreEmpleado)
    {
        this.nombreEmpleado = nombreEmpleado;
    }
    public String getCorreoEmpleado()
    {
        return correoEmpleado;
    }
    public void setCorreoEmpleado(String correoEmpleado)
    {
        this.correoEmpleado = correoEmpleado;
    }
    public String getEmpresaqueperteneceEmpleado()
    {
        return empresaqueperteneceEmpleado;
    }
    public void setEmpresaqueperteneceEmpleado(String empresaqueperteneceEmpleado)
    {
        this.empresaqueperteneceEmpleado = empresaqueperteneceEmpleado;
    }
    public String getRolEmpleado()
    {
        return rolEmpleado;
    }
    public void setRolEmpleado(String rolEmpleado)
    {
        this.rolEmpleado = rolEmpleado;
    }
}

