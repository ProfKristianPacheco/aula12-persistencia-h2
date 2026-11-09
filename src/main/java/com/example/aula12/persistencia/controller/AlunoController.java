package com.example.aula12.persistencia.controller;

import com.example.aula12.persistencia.model.Aluno;
import com.example.aula12.persistencia.service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlunoController {
    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping("/alunos")
    public List<Aluno> consultarAlunos(){
        return alunoService.consultarAlunos();
    }

    @GetMapping("/alunos/pesquisar")
    public Aluno consultarAlunosPorNome(@RequestParam String nome){
        return alunoService.consultarPorNome(nome);
    }

    @GetMapping("/alunos/pesquisarpartenome")
    public List<Aluno> consultarPorParteNome(@RequestParam String nome){
        return alunoService.consultarPorParteNome(nome);
    }

    @PostMapping("/alunos")
    public void inserirAluno(@RequestBody Aluno aluno){
        alunoService.inserirAluno(aluno);
    }
    @DeleteMapping("/alunos/{id}")
    public void deletarAluno(@PathVariable int id){
        alunoService.deleteAluno(id);
    }
}
