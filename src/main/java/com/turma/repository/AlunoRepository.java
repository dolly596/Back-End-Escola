package com.turma.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turma.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{

}