package com.api.idiomas.config;

import java.time.Instant;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.api.idiomas.entities.Aluno;
import com.api.idiomas.entities.Matricula;
import com.api.idiomas.entities.Turma;
import com.api.idiomas.enums.Idiomas;
import com.api.idiomas.enums.NivelTurma;
import com.api.idiomas.enums.StatusMatricula;
import com.api.idiomas.repositories.AlunoRepository;
import com.api.idiomas.repositories.MatriculaRepository;
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

    @Autowired
    private MatriculaRepository matriculaRepository;

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

        matriculaRepository.deleteAll();
        alunoRepository.deleteAll();
        turmaRepository.deleteAll();

        //Criando e salvando alunos na base de dados
        Aluno aluno1 = new Aluno(null, "Luan Santana", Utils.formataCpf("00011133344"), "luan@gmail.com", Utils.formataCelular("42999999999"), "Rua das Bananeiras, 123", "São Paulo", "SP", Utils.formataCep("00000000"), "Centro");

        Aluno aluno2 = new Aluno(null, "Igor Pereira", Utils.formataCpf("11122233344"), "igor@gmail.com", Utils.formataCelular("41299997777"), "Rua Cereja, 772", "Resende", "RJ", Utils.formataCep("11111111"), "Contorno");

        Aluno aluno3 = new Aluno(null, "Maria Brown", Utils.formataCpf("44455566677"), "maria@gmail.com", Utils.formataCelular("11955555555"), "Marginal Tietê, 007", "São Paulo", "SP", Utils.formataCep("99999999"), "Penha");

        alunoRepository.saveAll(Arrays.asList(aluno1,aluno2,aluno3));

        //Criando e salvando turmas na base de dados
        Turma turma1 = new Turma(null, "Turma 1", "Turma do Barulho",NivelTurma.BASICO, Idiomas.INGLES);
        Turma turma2 = new Turma(null, "Turma 2", "Galera do Job",NivelTurma.AVANCADO, Idiomas.FRANCES);

        Matricula matricula1 = new Matricula(aluno1, turma1, StatusMatricula.PENDENTE, Utils.formatData("2020-06-20"), null, null, Utils.formatData("2020-06-20"));

        Matricula matricula2 = new Matricula(aluno2, turma2, StatusMatricula.CONFIRMADA, Utils.formatData("2023-12-03"), null, Utils.formatData("2024-02-18"), Utils.formatData("2021-06-14"));

        Matricula matricula3 = new Matricula(aluno3, turma1, StatusMatricula.CANCELADA, Utils.formatData("2022-07-25"), Utils.formatData("2022-08-01"), null, Utils.formatData("2023-12-08"));
        
        turmaRepository.saveAll(Arrays.asList(turma1,turma2));
        matriculaRepository.saveAll(Arrays.asList(matricula1,matricula2,matricula3));

    }

}
