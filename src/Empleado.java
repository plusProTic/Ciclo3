public class Empleado {

    // Atributos
    private String nombreEmpleado;
    private String correo;
    private String empresaQuePertenece;
    private String rolEmpleado;

    // Constructor
    public Empleado(String nombreEmpleado, String correo, String empresaQuePertenece, String rolEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.correo = correo;
        this.empresaQuePertenece = empresaQuePertenece;
        this.rolEmpleado = rolEmpleado;
    }

    // Métodos Get y Set
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }
    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getEmpresaQuePertenece() {
        return empresaQuePertenece;
    }
    public void setEmpresaQuePertenece(String empresaQuePertenece) {
        this.empresaQuePertenece = empresaQuePertenece;
    }
    public String getRolEmpleado() {
        return rolEmpleado;
    }
    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }
}
