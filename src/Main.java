public class Main {
    public static void main(String[] args) {

        Empresa objEmpresa = new Empresa("ProTic","Cra 80 22-55","5569998","12345");
        // Leer nombre
        System.out.println(objEmpresa.getNombre());

        Empleado objEmpleado = new Empleado("Juana", "juana@gmail.com", "Ruta N", "Programadora");
        System.out.println("El nombre del empleado es: " + objEmpleado.getNombreEmpleado());
        objEmpleado.setRolEmpleado("Analista");
        System.out.println("Actualización Rol Empleado: " + objEmpleado.getRolEmpleado());
    }
}
