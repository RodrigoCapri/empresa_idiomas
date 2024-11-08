package com.api.idiomas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.idiomas.entities.Turma;
import com.api.idiomas.repositories.TurmaRepository;
import com.api.idiomas.services.exceptions.ResourceNotFoundException;

/**
 * Service for Turma entities.
 * @author Rodrigo Capri Margarido
 * @version 1.0
 */

@Service
public class TurmaService {

    @Autowired
    private TurmaRepository turmaRepository;

    /**
     * Finds all Turmas in the database.
     * 
     * @return a list of Turmas
     */
    public List<Turma> findAll() {
        return turmaRepository.findAll();
    }

    /**
     * Finds a Turma by its ID.
     * 
     * @param id the Turma ID
     * @return the Turma with the given ID
     * @throws ResourceNotFoundException if no Turma with the given ID exists
     */
    public Turma findById(Long id) {
        
        Optional<Turma> obj = turmaRepository.findById(id);

        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

}
