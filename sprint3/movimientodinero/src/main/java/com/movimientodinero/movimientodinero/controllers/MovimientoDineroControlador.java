package com.movimientodinero.movimientodinero.controllers;

import com.movimientodinero.movimientodinero.domain.entities.movimientoDinero;
import com.movimientodinero.movimientodinero.services.IServicioMovimientoDinero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("enterprises")
public class MovimientoDineroControlador {
    @Autowired
    IServicioMovimientoDinero servicioMovimientoDinero;

    //Get
    @RequestMapping(value = "{id}/movements", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody

    public movimientoDinero findById(@PathVariable long id){
        return servicioMovimientoDinero.getByID(id);
    }
    //Post
    @RequestMapping(value = "{id}/movements", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody

    public movimientoDinero create(@RequestBody movimientoDinero movdin){
        return servicioMovimientoDinero.create(movdin);
    }
    //Patch
    @RequestMapping(value = "{id}/movements", method = RequestMethod.PATCH, produces = "application/json")
    @ResponseBody

    public movimientoDinero update(@PathVariable long id, @RequestBody movimientoDinero movdin){
        return servicioMovimientoDinero.update(id, movdin);
    }
    //Delete
    @RequestMapping(value = "{id}/movements", method = RequestMethod.DELETE, produces = "application/json")
    @ResponseBody
    @ResponseStatus(HttpStatus.NO_CONTENT)

    public void delete(@PathVariable long id){
        servicioMovimientoDinero.delete(id);
    }


}
