package com.UdeA.Sprint3.Controladores;

import com.UdeA.Sprint3.Entidades.Usuarios;
import com.UdeA.Sprint3.Servicios.ServicioImpUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;

// Método que genera la dirección del bloque que contiene todos las peticiones o el conjunto de peticiones de los Métodos HTTP
@RequestMapping("/usuarios")
// Método que me realiza las peticiones de los Métodos HTTP(GET, PUT, PATCH, POST, DELETE, etc)
@RestController
public class ControladorUsuarios
{
    // Declaración de Atributos de Tipo Servicio
    @Autowired
    private ServicioImpUsuario siu;

    @GetMapping()
    public List<Usuarios> Consultar()
    {
        return siu.consultarUsuarios();
    }
    @GetMapping("/{id}")
    public Usuarios consultaIDUsuarios(@PathVariable("id") Integer id)
    {
        return siu.consultaIDUsuarios(id);
    }
    @PostMapping
    public void crearUsuarios(@RequestBody Usuarios usuarios)
    {
        siu.crearUsuarios(usuarios);
    }
    @PatchMapping("/{id}")
    public Usuarios actualizarId(@PathVariable("id") Integer id, @RequestBody Map<Object, Object> objectMap)
    {
        return siu.ActualizarId(id, objectMap);
    }
    @PutMapping
    public Usuarios editarUsuarios(@RequestBody Usuarios usuarios)
    {
        return siu.editarUsuarios(usuarios);
    }
    @DeleteMapping("/{id}")
    public void eliminarUsuarios(@PathVariable("id") Integer id)
    {
        siu.eliminarUsuarios(id);
    }
}
