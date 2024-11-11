package com.api.idiomas.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.api.idiomas.enums.Idiomas;
import com.api.idiomas.enums.NivelTurma;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Turma entity.
 * @author Rodrigo Capri Margarido
 * @version 1.0
 */

@Entity
@Table(name = "tb_turma")

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode

public class Turma implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    private NivelTurma nivelTurma;
    private Idiomas idioma;

    @OneToMany(mappedBy = "id.turma")
    private Set<Matricula> matriculas = new HashSet<>();

    public Turma(Long id, String nome, String descricao, NivelTurma nivelTurma, Idiomas idioma) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.nivelTurma = nivelTurma;
        this.idioma = idioma;
    }

    @JsonIgnore
    public Set<Matricula> getMatriculas() {
        return matriculas;
    }

}
