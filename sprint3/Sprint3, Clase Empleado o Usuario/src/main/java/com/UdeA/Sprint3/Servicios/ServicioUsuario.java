package com.UdeA.Sprint3.Servicios;


import com.UdeA.Sprint3.Entidades.Usuarios;
import java.util.List;
import java.util.Map;

public interface ServicioUsuario
{
    // Creación de Lista de Objetos para recopilar el conjunto de Usuarios
    public List<Usuarios> consultarUsuarios();
    // Métodos que realizan un CRUD (Agrupación de cuatro acciones que gestionan los datos almacenados)
    public Usuarios consultaIDUsuarios(Integer cedula);
    public Usuarios crearUsuarios(Usuarios usuarios);
    public Usuarios editarUsuarios(Usuarios usuarios);
    public void eliminarUsuarios(Integer cedula);
    public Usuarios ActualizarId(Integer cedula, Map<Object,Object> objectMap);
}
