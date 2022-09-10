package com.UdeA.Sprint3.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// Declaración de la Entidad Usuario con sus respectivos Atributos
@Entity
@Table(name="Usuarios")
public class Usuarios
{
    // Declaración de Llave Primaria Y Declaración de Atributos de la Clase Usuario
    @Id
    private int cedula;

    @Column(nullable = false, length = 30, unique = true)
    private String nombreEmpleado;

    @Column(nullable = false, unique = true)
    private String correoEmpleado;

    @Column(nullable = false, unique = false)
    private String empresaqueperteneceEmpleado;

    @Column(nullable = false, unique = false)
    private String rolEmpleado;


    // Declaración del Método Constructor de la Clase Usuario
    public Usuarios(int cedula, String nombreEmpleado, String correoEmpleado, String empresaqueperteneceEmpleado, String rolEmpleado)
    {
        this.cedula = cedula;
        this.nombreEmpleado = nombreEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.empresaqueperteneceEmpleado = empresaqueperteneceEmpleado;
        this.rolEmpleado = rolEmpleado;
    }

    // Declaración del Método Constructor Vacío
    public Usuarios()
    {
    }

    // Declaración de Métodos Get y Set de la Clase Usuario
    public int getCedula()
    {
        return cedula;
    }
    public void setCedula(int cedula)
    {
        this.cedula = cedula;
    }
    public String getNombreEmpleado()
    {
        return nombreEmpleado;
    }
    public void setNombreEmpleado(String nombreEmpleado)
    {
        this.nombreEmpleado = nombreEmpleado;
    }
    public String getCorreoEmpleado() {
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
