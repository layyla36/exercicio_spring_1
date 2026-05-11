package com.maju.exercicio_spring.controller;

import com.maju.exercicio_spring.model.Aluno;
import org.springframework.http.ResponseEntity;
import com.maju.exercicio_spring.service.AlunoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.apache.coyote.Response;
import java.util.List;

@RestController
@RequestMapping("/alunos")
@RequiredArgsConstructor

public class AlunoController {

        private final AlunoService service;

    @GetMapping
    public List<Aluno> listar(){
        return service.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Aluno> buscar(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @PostMapping
        public ResponseEntity<Aluno> salvar(@RequestBody Aluno aluno){
            return ResponseEntity.ok(service.salvar(aluno));
        }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir (@PathVariable Long id) {
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
