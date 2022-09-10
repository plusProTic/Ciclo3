package com.movimientodinero.movimientodinero.repositories;

import com.movimientodinero.movimientodinero.domain.entities.movimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;

public interface IRepositoryDinero extends JpaRepository <movimientoDinero,Long> {

        //Get
    @Query(value="select * from Transaction where empresa_id= ?1", nativeQuery=true)
    public abstract ArrayList<movimientoDinero> findByEmpresa(long id);

    //post DUDA
    public abstract boolean saveByEmpresa(long id, movimientoDinero movimientoDinero);
    @Query(value="insert into MovimientoDinero(id, concepto,monto, empresa_id, empleado_id) values(?1,?2,?3,?4,?5)", nativeQuert=true)
    public abstract ArrayList<movimientoDinero> findByempresa(long id);

    //Patch
    public abstract movimientoDinero patchByEmpresa(long id, movimientoDinero movimientoDinero);
    @Query(value="update movimientoDinero set id=?1, concepto=?2, monto=?3, empresa_id=?4, empleado_id=?5 where empresa_id=?6", nativeQuert=true)
    public abstract void queryPatchMovimientoDinero(long id, String concepto, float monto, long nuevaempresa, long empleado_id,long empresa_id)

    //Delete
    @Query(value ="delete from movimientoDinero where empresa_id=?1", nativeQuery = true)
    public abstract boolean deleteByEmpresa(long id);
}
