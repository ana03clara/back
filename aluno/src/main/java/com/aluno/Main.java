package com.aluno;

import com.aluno.service.AlunoService;
import com.aluno.entity.Aluno;
import org.springframework.stereotype.Component;
import org.springframework.boot.CommandLineRunner;
import com.aluno.entity.Aluno;

import java.util.Scanner;

@Component
public class Main implements CommandLineRunner {

    private final AlunoService alunoSevice;

    public Main(AlunoService alunoSevice) {
        this.alunoSevice = alunoSevice;
    }

    @Override
    public void run(String... args) throws Exception {
        Aluno aluno1 = alunoSevice.criarAluno(
                 "Jonas",
                 9.5
        );

        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getNota());

        Scanner scanner= new Scanner(System.in);
        System.out.println("digite nome;");
        String nome = scanner.nextLine();
        System.out.println("digite nota;");
        double nota = new scanner.nextDouble();

        Aluno aluno2 = alunoService.criarAluno(nome,nota);
    }
}
