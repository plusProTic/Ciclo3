import java.sql.SQLOutput;

public class ClasePrincipal
{
    public static void main(String[] args)
    {
            // Se Instancia la Clase Empresa
        Empresa objEmpresa = new Empresa("Grupo de Desarrollo SAS","Cra 80 # 22 - 55","556 99 98","12345-5");
        // Se hace el llamado de los Métodos Get y Set
        System.out.println(" ");
        // --------
        System.out.println("Nombre Inicial de la Empresa: " + objEmpresa.getNombreEmpresa());
        objEmpresa.setNombreEmpresa("Grupo de Desarrollo Udea");
        System.out.println("    Modificación Nombre de la Empresa: " + objEmpresa.getNombreEmpresa());
        // --------
        System.out.println("Dirección Inicial de la Empresa: " + objEmpresa.getDireccionEmpresa());
        objEmpresa.setDireccionEmpresa("Cll 25 # 58A - 93");
        System.out.println("    Modificación Dirección de la Empresa: " + objEmpresa.getDireccionEmpresa());
        // --------
        System.out.println("Teléfono Inicial de la Empresa: " + objEmpresa.getTelefonoEmpresa());
        objEmpresa.setTelefonoEmpresa("305 798 54 63");
        System.out.println("    Modificación Teléfono de la Empresa: " + objEmpresa.getTelefonoEmpresa());
        // --------
        System.out.println("NIT Inicial de la Empresa: " + objEmpresa.getNITEmpresa());
        objEmpresa.setNITEmpresa("98787-12");
        System.out.println("    Modificación NIT de la Empresa: " + objEmpresa.getNITEmpresa());

            // Se Instancia la Clase Empleado
        Empleado objEmpleado = new Empleado("Juana", "juana@gmail.com", "Ruta N", "Programadora", "Desarrolladores Team", "Calle 25 Sur b 38", "355 55 87", "2987-487");
        // Se hace el llamado de los Métodos Get y Set
        System.out.println(" ");
        // --------
        System.out.println("Nombre Inicial del Empleado: " + objEmpleado.getNombreEmpleado());
        objEmpleado.setNombreEmpleado("Maria");
        System.out.println("    Modificación Nombre del Empleado: " + objEmpleado.getNombreEmpleado());
        // --------
        System.out.println("Correo Inicial del Empleado: " + objEmpleado.getCorreoEmpleado());
        objEmpleado.setCorreoEmpleado("maria@gmail.com");
        System.out.println("    Modificación Correo del Empleado: " + objEmpleado.getCorreoEmpleado());
        // --------
        System.out.println("Empresa Inicial a la que Pertenece el Empleado: " + objEmpleado.getEmpresaqueperteneceEmpleado());
        objEmpleado.setEmpresaqueperteneceEmpleado("EPM");
        System.out.println("    Modificación Empresa a la que Pertenece el Empleado: " + objEmpleado.getEmpresaqueperteneceEmpleado());
        // --------
        System.out.println("Rol Inicial del Empleado: " + objEmpleado.getRolEmpleado());
        objEmpleado.setRolEmpleado("Analista de Datos");
        System.out.println("    Modificación Rol del Empleado: " + objEmpleado.getRolEmpleado());


            // Se Instancia la Clase MovimientodeDinero
        MovimientodeDinero objMovimientodeDinero = new MovimientodeDinero(500000, "Positivo", "N", "Ramón");
        // Se hace el llamado de los Métodos Get y Set
        System.out.println(" ");
        // --------
        System.out.println("Monto del Movimiento Inicial: " + objMovimientodeDinero.getmonto());
        objMovimientodeDinero.setmonto(1000000);
        System.out.println("    Modificación Monto del Movimiento: " + objMovimientodeDinero.getmonto());
        // --------
        System.out.println("Tipo de Monto Inicial: " + objMovimientodeDinero.getTipoMonto());
        objMovimientodeDinero.setTipoMonto("Negativo");
        System.out.println("    Modificación Tipo de Monto: " + objMovimientodeDinero.getTipoMonto());
        // --------
        System.out.println("Concepto del Movimiento Inicial: " + objMovimientodeDinero.getconceptoMov());
        objMovimientodeDinero.setconceptomov("S");
        System.out.println("    Modificación Concepto del Movimiento: " + objMovimientodeDinero.getconceptoMov());
        // --------
        System.out.println("Usuario Encargado de Generar el Movimiento: " + objMovimientodeDinero.getNombreUsuario());
    }
}

