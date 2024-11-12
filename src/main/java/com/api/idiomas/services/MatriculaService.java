package com.api.idiomas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.idiomas.entities.Aluno;
import com.api.idiomas.entities.Matricula;
import com.api.idiomas.entities.Turma;
import com.api.idiomas.entities.pks.AlunoTurmaPK;
import com.api.idiomas.repositories.AlunoRepository;
import com.api.idiomas.repositories.MatriculaRepository;
import com.api.idiomas.repositories.TurmaRepository;
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

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private TurmaRepository turmaRepository;

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
     * Retrieves a Matricula entity from the database by its primary key.
     * @param id1
     * @param id2
     * @return
     */
    public Matricula findById(Long id1, Long id2) {

        Aluno aluno = alunoRepository.findById(id1).orElseThrow( () -> new ResourceNotFoundException(id1) );
        Turma turma = turmaRepository.findById(id2).orElseThrow( () -> new ResourceNotFoundException(id2) );

        return matriculaRepository.findById(new AlunoTurmaPK(aluno, turma)).orElseThrow( () -> new ResourceNotFoundException(id1+","+id2) );
        
    }

}
