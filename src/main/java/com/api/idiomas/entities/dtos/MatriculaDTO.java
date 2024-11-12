package com.api.idiomas.entities.dtos;

import com.api.idiomas.entities.Matricula;
import com.api.idiomas.enums.StatusMatricula;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Matricula DTO.
 * @author Rodrigo Capri Margarido
 * @version 1.0
 */

@Getter
@Setter
@NoArgsConstructor
@ToString
public class MatriculaDTO {

    private Long id_aluno;
    private Long id_turma;
    private StatusMatricula statusMatricula;

    public MatriculaDTO(Matricula matricula) {

        this.id_aluno = matricula.getId().getAluno().getId();
        this.id_turma = matricula.getId().getTurma().getId();

        this.statusMatricula = matricula.getStatusMatricula();
        
    }

}
