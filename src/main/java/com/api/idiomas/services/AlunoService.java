package com.api.idiomas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.idiomas.entities.Aluno;
import com.api.idiomas.repositories.AlunoRepository;
import com.api.idiomas.services.exceptions.ResourceNotFoundException;

/**
 * Service for Aluno entities.
 * @author Rodrigo Capri Margarido
 * @version 1.0
 */

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    /**
     * Finds all Alunos in the database.
     *
     * @return a list of Alunos
     */
    public List<Aluno> findAll() {

        return alunoRepository.findAll();
        
    }

    /**
     * Finds an Aluno by its ID.
     *
     * @param id the Aluno ID
     * @return the Aluno with the given ID
     * @throws ResourceNotFoundException if no Aluno with the given ID exists
     */
    public Aluno findById(Long id) {

        Optional<Aluno> obj = alunoRepository.findById(id);

        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

}
