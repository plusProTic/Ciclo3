package com.movimientodinero.movimientodinero.services;
import com.movimientodinero.movimientodinero.domain.entities.movimientoDinero;

public interface IServicioMovimientoDinero {
    //get
    public abstract movimientoDinero getByID(long id);
    //post
    public abstract movimientoDinero create(movimientoDinero movimientoDinero);
    //patch
    public abstract movimientoDinero update(long id, movimientoDinero movimientoDinero);
    //delete
    public boolean delete(long id);

}
