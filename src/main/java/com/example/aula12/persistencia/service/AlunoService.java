package com.example.aula12.persistencia.service;

import com.example.aula12.persistencia.model.Aluno;
import com.example.aula12.persistencia.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public void inserirAluno(Aluno aluno){
        alunoRepository.save(aluno);
    }

    public void atualizarAluno(Aluno aluno){
        if(alunoRepository.existsById(aluno.getId())){
            alunoRepository.save(aluno);
        }
    }

    public void deleteAluno(int id){
        alunoRepository.deleteById(id);
    }

    public Aluno consultarPorNome(String nome){
        return alunoRepository.findByNome(nome);
    }

    public List<Aluno> consultarPorParteNome(String nome){
        return alunoRepository.findByNomeContaining(nome);
    }
    public List<Aluno> consultarAlunos(){
        return alunoRepository.findAll();
    }
}
