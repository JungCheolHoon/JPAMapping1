package kr.kwangan2.jpatest.repository;

import org.springframework.data.repository.CrudRepository;

import kr.kwangan2.jpatest.domain.Propessor;

public interface PropessorRepository extends CrudRepository<Propessor, String> {
}
