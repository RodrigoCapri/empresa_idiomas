package com.api.idiomas.enums;

/**
 * StatusMatricula enum.
 * @author Rodrigo Capri Margarido
 * @version 1.0
 */

public enum StatusMatricula {

    PENDENTE("Pendente", 1),
    CONFIRMADA("Confirmada", 2),
    CANCELADA("Cancelada", 3);

    private String descricao;
    private int nivel;

    StatusMatricula(String descricao, int nivel) {
        this.descricao = descricao;
        this.nivel = nivel;
    }

    /**
     * Returns the description of the StatusMatricula enum.
     * @return the description
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Returns the level of the StatusMatricula enum.
     * @return the level
     */
    public int getNivel() {
        return nivel;
    }

}
