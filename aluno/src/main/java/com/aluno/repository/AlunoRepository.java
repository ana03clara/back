package com.aluno.repository;


import com.aluno.entity.Aluno;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AlunoRepository {
    private final JdbcTemplate jdbcTemplate;

    public AlunoRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    public void salvar(Aluno aluno){
        String sql = """
                INSERT INTO alunos(nome, nota)
                VALUES (?,?)
                """ ;
        jdbcTemplate.update(
                sql,
                aluno.getNome(),
                aluno.getNota());
    }
}
