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
  movimientoDinero movdin = repositoryDinero.findById(id).orElse(null);
  return movdin;
 }

 @Override
 public movimientoDinero create(movimientoDinero movimientoDinero) {

  return repositoryDinero.save(movimientoDinero);
 }

 @Override
 public movimientoDinero update(long id, movimientoDinero movimientoDinero) {
  movimientoDinero movdin = repositoryDinero.findById(id).orElse(null);
  movdin.setMonto(movdin.getMonto());
  movdin.setUpdateAt(movdin.getUpdateAt());
  movdin.setConcepto(movdin.getConcepto());
  movdin.setUsuario(movdin.getUsuario());
  movdin.setCreatedAt(movdin.getCreatedAt());
  repositoryDinero.save(movdin);
  return movdin;
 }

 @Override
 public void delete(long id) {
  repositoryDinero.deleteById(id);
 }
}
