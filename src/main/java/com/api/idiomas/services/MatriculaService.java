package com.api.idiomas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.idiomas.entities.Matricula;
import com.api.idiomas.entities.dtos.MatriculaDTO;
import com.api.idiomas.repositories.MatriculaRepository;
import com.api.idiomas.services.exceptions.ResourceNotFoundException;


/**
 * Service for Matricula entities.
 * @author Rodrigo Capri Margarido
 * @version 1.0
 */
@Service
public class MatriculaService {

    @Autowired
    private MatriculaRepository matriculaRepository;

/**
 * Retrieves all Matricula entities from the database and converts them
 * into a list of MatriculaDTO objects.
 * 
 * @return a list of MatriculaDTO objects representing all Matricula entities.
 */
    public List<Matricula> findAll() { 
        
        return matriculaRepository.findAll();
        
    }

    /**
     * Finds a Matricula by its ID.
     * 
     * @param id the Matricula ID
     * @return the Matricula with the given ID
     * @throws ResourceNotFoundException if no Matricula with the given ID exists
     */
    public Matricula findById(Long id) {

        return matriculaRepository.findById(id).orElseThrow( () -> new ResourceNotFoundException(id) );
        
    }

}
