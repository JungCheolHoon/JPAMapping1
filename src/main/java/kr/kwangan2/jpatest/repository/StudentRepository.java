package kr.kwangan2.jpatest.repository;

import org.springframework.data.repository.CrudRepository;

import kr.kwangan2.jpatest.domain.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
