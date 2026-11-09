package com.example.aula12.persistencia.repository;

import com.example.aula12.persistencia.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
    public Aluno findByNome(String nome);
    public Aluno findByMatricula(String matricula);
    public List<Aluno> findByNomeContaining(String nome);
}
