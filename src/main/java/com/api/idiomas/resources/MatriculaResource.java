package com.api.idiomas.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.idiomas.entities.Matricula;
import com.api.idiomas.services.MatriculaService;


@RestController
@RequestMapping(value = "/matriculas")
public class MatriculaResource {

    @Autowired
    private MatriculaService matriculaService;

    @GetMapping
    public ResponseEntity< List<Matricula> > findAll(){

        // Pega todos as matriculas
        List<Matricula> matriculas = matriculaService.findAll();

        // Converte para MatriculaDTO
        //List<MatriculaDTO> list = matriculas.stream().map(obj -> new MatriculaDTO(obj)).collect(Collectors.toList());

        // Retorna uma lista de MatriculaDTO
        return ResponseEntity.ok().body(matriculas);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity< Matricula > findById(@PathVariable Long id){

        Matricula matricula = matriculaService.findById(id);
        return ResponseEntity.ok().body(matricula);
        
    }

}
