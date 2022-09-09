package com.movimientodinero.movimientodinero.services;

import com.movimientodinero.movimientodinero.domain.entities.movimientoDinero;
import com.movimientodinero.movimientodinero.repositories.IRepositoryDinero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplServicioMovimientoDinero implements IServicioMovimientoDinero {
 //Inyecta dependencias
 @Autowired
 IRepositoryDinero repositoryDinero;

 @Override
 public movimientoDinero getByID(long id) {

 }

 @Override
 public movimientoDinero create(movimientoDinero movimientoDinero) {
   return repositoryDinero.save(movimientoDinero);
 }

 @Override
 public movimientoDinero update(long id, movimientoDinero movimientoDinero) {

 }

 @Override
 public boolean delete(long id) {

 }
}
