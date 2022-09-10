package com.UdeA.Sprint3.Repositorio;

import com.UdeA.Sprint3.Entidades.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioUsuarios extends JpaRepository<Usuarios, Integer>
{

}
