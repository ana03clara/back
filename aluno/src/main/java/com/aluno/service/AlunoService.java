package com.aluno.service;


import com.aluno.entity.Aluno;
import com.aluno.repository.AlunoRepository;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public Aluno criarAluno(String nome, double nota){
        Aluno alunoEntity = new Aluno(nome, nota);
        alunoRepository.salvar(alunoEntity);
        return alunoEntity;
    }
}
