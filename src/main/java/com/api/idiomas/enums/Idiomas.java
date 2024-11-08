package com.api.idiomas.enums;

/**
 * Idiomas enum.
 * @author Rodrigo Capri Margarido
 * @version 1.0
 */

public enum Idiomas {

    INGLES("Inglês", 1),
    ESPANHOL("Espanhol", 2),
    FRANCES("Francês", 3);

    private String descricao;
    private int nivel;

    Idiomas(String descricao, int nivel) {
        this.descricao = descricao;
        this.nivel = nivel;
    }

    /**
     * Returns the description of the language.
     *
     * @return the description of the language
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Returns the proficiency level of the language.
     *
     * @return the proficiency level of the language
     */
    public int getNivel() {
        return nivel;
    }

}
