package com.api.idiomas.entities.dtos;

import com.api.idiomas.entities.Matricula;
import com.api.idiomas.entities.pks.AlunoTurmaPK;

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

    private AlunoTurmaPK id;
    private AlunoDTO aluno;
    private TurmaDTO turma;

    public MatriculaDTO(Matricula matricula) {

        this.aluno = new AlunoDTO(matricula.getId().getAluno());
        this.turma = new TurmaDTO(matricula.getId().getTurma());
    }

}
