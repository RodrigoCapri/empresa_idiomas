package com.api.idiomas.config;

import java.util.Arrays;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.api.idiomas.entities.Aluno;
import com.api.idiomas.entities.Turma;
import com.api.idiomas.enums.Idiomas;
import com.api.idiomas.enums.NivelTurma;
import com.api.idiomas.repositories.AlunoRepository;
import com.api.idiomas.repositories.TurmaRepository;
import com.api.idiomas.utils.Utils;

/**
 * Configuration class for database initialization.
 * @author Rodrigo Capri Margarido
 * @version 1.0
 */

@Configuration
public class Instantiation implements CommandLineRunner{

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private TurmaRepository turmaRepository;

    /**
     * Initializes the database by creating three Aluno entities and three Turma entities
     * if the database is empty.
     * @param args the command line arguments
     * @throws Exception if an exception occurs during the initialization process
     */
    @Override
    public void run(String... args) throws Exception {
        
        Locale.setDefault(Locale.US);
        System.setProperty("file.encoding", "UTF-8");

        alunoRepository.deleteAll();
        turmaRepository.deleteAll();

        if (alunoRepository.count() == 0) {

            Aluno aluno1 = new Aluno(null, "Luan Santana", Utils.formataCpf("00011133344"), "luan@gmail.com", Utils.formataCelular("42999999999"), "Rua das Bananeiras, 123", "São Paulo", "SP", Utils.formataCep("00000000"), "Centro");

            Aluno aluno2 = new Aluno(null, "Igor Pereira", Utils.formataCpf("11122233344"), "igor@gmail.com", Utils.formataCelular("41299997777"), "Rua Cereja, 772", "Resende", "RJ", Utils.formataCep("11111111"), "Contorno");

            Aluno aluno3 = new Aluno(null, "Maria Brown", Utils.formataCpf("44455566677"), "maria@gmail.com", Utils.formataCelular("11955555555"), "Marginal Tietê, 007", "São Paulo", "SP", Utils.formataCep("99999999"), "Penha");

            alunoRepository.saveAll(Arrays.asList(aluno1,aluno2,aluno3));
            
        }

        if(turmaRepository.count() == 0) {

            Turma turma1 = new Turma(null, "Turma 1", "Turma do barulho", NivelTurma.AVANCADO, Idiomas.INGLES);
            Turma turma2 = new Turma(null, "Turma 2", "Os desempregados", NivelTurma.BASICO, Idiomas.FRANCES);
            Turma turma3 = new Turma(null, "Turma 3", "Os sobreviventes", NivelTurma.INTERMEDIARIO, Idiomas.ESPANHOL);

            turmaRepository.saveAll(Arrays.asList(turma1, turma2, turma3));
            
        }

    }

}
