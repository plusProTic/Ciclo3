package com.UdeA.Sprint3.Servicios;

import ch.qos.logback.core.net.server.Client;
import com.UdeA.Sprint3.Entidades.Usuarios;
import com.UdeA.Sprint3.Repositorio.RepositorioUsuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

// Método que clasifica esta clase ServicioImpUsuario como un Servivio
@Service
public class ServicioImpUsuario implements ServicioUsuario
{
    @Autowired
    private RepositorioUsuarios repositorioUsuarios;

    @Override
    public List<Usuarios> consultarUsuarios()
    {
        return repositorioUsuarios.findAll();
    }
    @Override
    public Usuarios consultaIDUsuarios(Integer cedula)
    {
        return repositorioUsuarios.findById(cedula).get();
    }
    @Override
    public Usuarios crearUsuarios(Usuarios usuarios)
    {
        return repositorioUsuarios.save(usuarios);
    }
    @Override
    public Usuarios editarUsuarios(Usuarios usuarios)
    {
        return repositorioUsuarios.save(usuarios);
    }
    @Override
    public void eliminarUsuarios(Integer cedula)
    {
        repositorioUsuarios.deleteById(cedula);
    }

    @Override
    public Usuarios ActualizarId(Integer cedula, Map<Object, Object> objectMap)
    {
        // Devuelve todo el objeto completo del diccionario repositorioUsuarios y se guarda en el objeto objUsuarios
        Usuarios objUsuarios = repositorioUsuarios.findById(cedula).get();
        objectMap.forEach((key,value)->
        {
            Field field = ReflectionUtils.findField(Usuarios.class, (String) key);
            field.setAccessible(true);
            ReflectionUtils.setField(field, objUsuarios, value);
        });
        return repositorioUsuarios.save(objUsuarios);
    }
}
