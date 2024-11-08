package com.api.idiomas.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.idiomas.entities.Aluno;
import com.api.idiomas.entities.dtos.AlunoDTO;
import com.api.idiomas.services.AlunoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


/**
 * Resource for Aluno entities.
 * @author Rodrigo Capri Margarido
 * @version 1.0
 */

@RestController
@RequestMapping(value = "/alunos")
public class AlunoResource {

    @Autowired
    private AlunoService service;

    /**
     * Handles HTTP GET requests for retrieving all Aluno entities.
     * 
     * @return a ResponseEntity containing a list of AlunoDTO objects 
     *         representing all Aluno entities in the database.
     */
    @GetMapping
    public ResponseEntity< List<AlunoDTO> > findAll() {

        // Pega todos os alunos
        List<Aluno> alunos = service.findAll();

        // Converte para AlunoDTO
        List<AlunoDTO> list = alunos.stream().map(obj -> new AlunoDTO(obj)).collect(Collectors.toList());

        // Retorna uma lista de AlunoDTO
        return ResponseEntity.ok().body(list);
    }
    
    /**
     * Handles HTTP GET requests for retrieving a single Aluno entity by its ID.
     * 
     * @param id the ID of the Aluno entity to retrieve
     * @return a ResponseEntity containing the Aluno entity with the given ID
     * @throws ResourceNotFoundException if no Aluno entity with the given ID exists
     */
    @GetMapping("/{id}")
    public ResponseEntity< Aluno > findById(@PathVariable Long id) {

        return ResponseEntity.ok().body(service.findById(id));
        
    }
    

}
