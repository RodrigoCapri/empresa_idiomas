package com.api.idiomas.entities.dtos;

import com.api.idiomas.entities.Turma;
import com.api.idiomas.enums.Idiomas;

/**
 * Turma DTO.
 * @author Rodrigo Capri Margarido
 * @version 1.0
 */

public class TurmaDTO {

    private Long id;
    private String nome;
    private Idiomas idioma;

    public TurmaDTO() {

    }

    public TurmaDTO(Turma turma) {
        this.id = turma.getId();
        this.nome = turma.getNome();
        this.idioma = turma.getIdioma();
    }

    /**
     * Returns the ID of this TurmaDTO.
     * @return the ID of this TurmaDTO
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the ID of this TurmaDTO.
     * @param id the ID to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Returns the name of this TurmaDTO.
     * @return the name of this TurmaDTO
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the name of this TurmaDTO.
     * @param nome the name to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Returns the language of this TurmaDTO.
     * @return the language of this TurmaDTO
     */
    public Idiomas getIdioma() {
        return idioma;
    }

    /**
     * Sets the language of this TurmaDTO.
     * @param idioma the language to set
     */
    public void setIdioma(Idiomas idioma) {
        this.idioma = idioma;
    }

/**
 * Returns a string representation of the TurmaDTO object.
 * 
 * @return a string containing the id, nome, and idioma of the TurmaDTO
 */
    @Override
    public String toString() {
        return "TurmaDTO [id=" + id + ", nome=" + nome + ", idioma=" + idioma + "]";
    }

}
