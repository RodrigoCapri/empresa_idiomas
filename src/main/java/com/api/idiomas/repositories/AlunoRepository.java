package com.api.idiomas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.idiomas.entities.Aluno;

/**
 * Repository for Aluno entity.
 * @author Rodrigo Capri Margarido
 * @version 1.0
 */

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
