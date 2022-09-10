
package com.movimientodinero.movimientodinero.domain.entities;
import java.util.Date;
import javax.persistence.*;

//entidad a base de una clase
@Entity
@Table(name="movimientoDinero")
public class movimientoDinero {
    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String concepto;
    private float monto;
    private Date createdAt;
    private Date updateAt;

    @ManyToOne
    @JoinColumn(name = "empleado_id")
    private Empleado usuario;

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;

    //constructor
    public movimientoDinero() {}
    public movimientoDinero(long id, String concepto, float monto, Date createdAt, Date updateAt, Empleado usuario) {
        this.id = id;
        this.concepto = concepto;
        this.monto = monto;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
        this.usuario = usuario;
    }


    //getters and setters

    public long getId() {
        return id;
    }

    public String getConcepto() {
        return concepto;
    }

    public float getMonto() {
        return monto;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public Empleado getUsuario() {
        return usuario;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public void setUsuario(Empleado usuario) {
        this.usuario = usuario;
    }

    //metodos u operaciones



}

