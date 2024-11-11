package com.api.idiomas.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

import com.api.idiomas.entities.pks.AlunoTurmaPK;
import com.api.idiomas.enums.StatusMatricula;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Matricula entity.
 * @author Rodrigo Capri Margarido
 * @version 1.0
 */

@Entity
@Table(name = "tb_matricula")

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Matricula implements Serializable{

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private AlunoTurmaPK id = new AlunoTurmaPK(); //Id composto, deve-se iniciar com o new AlunoTurmaPK();

    private StatusMatricula statusMatricula;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant dataMatricula;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant dataCancelamento;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant dataConfirmacao;

    private Date inicioAula;

    public Matricula(Aluno aluno, Turma turma, StatusMatricula statusMatricula, Instant dataMatricula, Instant dataCancelamento, Instant dataConfirmacao, Date inicioAula) {

        this.id.setAluno(aluno);
        this.id.setTurma(turma);

        this.statusMatricula = statusMatricula;
        this.dataMatricula = dataMatricula;
        this.dataCancelamento = dataCancelamento;
        this.dataConfirmacao = dataConfirmacao;
        this.inicioAula = inicioAula;

    }

}
