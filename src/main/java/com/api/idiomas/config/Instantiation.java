package com.api.idiomas.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.api.idiomas.entities.Aluno;
import com.api.idiomas.repositories.AlunoRepository;

/**
 * Configuration class for database initialization.
 * @author Rodrigo Capri Margarido
 * @version 1.0
 */

@Configuration
public class Instantiation implements CommandLineRunner{

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public void run(String... args) throws Exception {
        
        if (alunoRepository.count() == 0) {

            Aluno aluno1 = new Aluno(null, "Luan Santana", "i8iDZ@example.com", "luan@gmail.com", "Rua das Bananeiras, 123", "São Paulo", "SP", "00000-000", "Centro", "12345678");

            Aluno aluno2 = new Aluno(null, "João da Silva", "jXqgN@example.com", "joao@gmail.com", "Avenida dos Girassóis, 456", "Rio de Janeiro", "RJ", "00000-000", "Copacabana", "12345678");

            Aluno aluno3 = new Aluno(null, "Maria Oliveira", "jXqgN@example.com", "maria@gmail.com", "Rua das Flores, 789", "Belo Horizonte", "MG", "00000-000", "Centro", "12345678");

            alunoRepository.saveAll(Arrays.asList(aluno1, aluno2, aluno3));
            
        }

    }

}
