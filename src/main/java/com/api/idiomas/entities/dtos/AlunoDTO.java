package com.api.idiomas.entities.dtos;

import com.api.idiomas.entities.Aluno;

/**
 * AlunoDTO entity.
 * @author Rodrigo Capri Margarido
 * @version 1.0
 */

public class AlunoDTO {

    private Long id;
    private String nome;
    private String email;
    private String telefone;

    public AlunoDTO() {

    }

    public AlunoDTO(Aluno aluno) {
        this.id = aluno.getId();
        this.nome = aluno.getNome();
        this.email = aluno.getEmail();
        this.telefone = aluno.getTelefone();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "AlunoDTO [id=" + id + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone + "]";
    }

}
