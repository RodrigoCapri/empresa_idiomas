package com.api.idiomas.entities;

import java.io.Serializable;

import com.api.idiomas.enums.Idiomas;
import com.api.idiomas.enums.NivelTurma;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

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
@AllArgsConstructor
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

}
