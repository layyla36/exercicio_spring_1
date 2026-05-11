package com.maju.exercicio_spring.repository;

import com.maju.exercicio_spring.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
