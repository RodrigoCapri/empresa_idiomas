package com.api.idiomas.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.idiomas.entities.Turma;
import com.api.idiomas.entities.dtos.TurmaDTO;
import com.api.idiomas.services.TurmaService;


/**
 * Resource for Turma entities.
 * @author Rodrigo Capri Margarido
 * @version 1.0
 */

@RestController
@RequestMapping(value = "/turmas")
public class TurmaResource {

    @Autowired
    private TurmaService service;

    /**
     * Handles HTTP GET requests for retrieving all Turma entities.
     * 
     * @return a ResponseEntity containing a list of TurmaDTO objects 
     *         representing all Turma entities in the database.
     */
    @GetMapping
    public ResponseEntity< List<TurmaDTO> > findAll() {

        // Pega todos as turmas
        List<Turma> turmas = service.findAll();

        // Converte para TurmaDTO  
        List<TurmaDTO> list = turmas.stream().map(obj -> new TurmaDTO(obj)).collect(Collectors.toList());

        // Retorna uma lista de TurmaDTO
        return ResponseEntity.ok().body(list);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Turma> findById(@PathVariable Long id) {

        return ResponseEntity.ok().body(service.findById(id));
        
    }
    

}
