package com.api.idiomas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.idiomas.entities.Matricula;
import com.api.idiomas.entities.pks.AlunoTurmaPK;

/**
 * Repository for Matricula entity.
 * @author Rodrigo Capri Margarido
 * @version 1.0
 */

public interface MatriculaRepository extends JpaRepository<Matricula, AlunoTurmaPK> {

}
