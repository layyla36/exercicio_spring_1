package com.maju.exercicio_spring.service;


import com.maju.exercicio_spring.model.Aluno;
import com.maju.exercicio_spring.repository.AlunoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AlunoService {

    private final AlunoRepository repository;

        public List<Aluno> listar(){

            return repository.findAll();
        }

        public Aluno buscarPorId(Long id){
            return repository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
        }

        public Aluno salvar(Aluno aluno){
            return repository.save(aluno);
        }

        public Aluno excluir(Long id){
            repository.deleteAllById(Collections.singleton(id));
            return null;
        }
}
