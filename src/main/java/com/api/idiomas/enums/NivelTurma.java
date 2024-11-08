package com.api.idiomas.enums;

/**
 * NivelTurma enum.
 * @author Rodrigo Capri Margarido
 * @version 1.0
 */

public enum NivelTurma {

    BASICO("Básico", 1),
    INTERMEDIARIO("Intermediário", 2),
    AVANCADO("Avançado", 3);

    private String descricao;
    private int nivel;

    NivelTurma(String descricao, int nivel) {
        this.descricao = descricao;
        this.nivel = nivel;
    }

    /**
     * Returns the description of the NivelTurma enum.
     * @return the description
     */
    public String getDescricao() {
        return descricao;
    }   

    /**
     * Returns the level of the NivelTurma enum.
     * @return the level
     */
    public int getNivel() { 
        return nivel;
    }

}
