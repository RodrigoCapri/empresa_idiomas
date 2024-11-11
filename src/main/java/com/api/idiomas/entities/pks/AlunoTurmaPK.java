package com.api.idiomas.entities.pks;

import java.io.Serializable;

import com.api.idiomas.entities.Aluno;
import com.api.idiomas.entities.Turma;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * AlunoTurmaPK entity.
 * @author Rodrigo Capri Margarido
 * @version 1.0
 */

@Embeddable

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class AlunoTurmaPK implements Serializable{

    private static final long serialVersionUID = 1L;

    @OneToOne
    @JoinColumn(name = "aluno_id")
    private Aluno  aluno;

    @ManyToOne
    @JoinColumn(name = "turma_id")
    private Turma turma;

    //Uma classe associativa não pode ter construtores

}
