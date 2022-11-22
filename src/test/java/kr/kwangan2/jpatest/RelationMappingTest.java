package kr.kwangan2.jpatest;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import kr.kwangan2.jpatest.domain.Propessor;
import kr.kwangan2.jpatest.domain.Student;
import kr.kwangan2.jpatest.repository.PropessorRepository;
import kr.kwangan2.jpatest.repository.StudentRepository;
import lombok.extern.log4j.Log4j2;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log4j2
public class RelationMappingTest {
	@Autowired
	private StudentRepository studentRepo;
	
	@Autowired
	private PropessorRepository propessorRepo;
	
//	@Test
//	public void testInsert() {
//		Propessor propessor1 = new Propessor();
//		propessor1.setName("김교수");
//		propessor1.setId("propessor1");
//		
//		Propessor propessor2 = new Propessor();
//		propessor2.setName("황교수");
//		propessor2.setId("propessor2");
//
//		Propessor propessor3 = new Propessor();
//		propessor3.setName("박교수");
//		propessor3.setId("propessor3");
//		
//		for(int i = 0 ; i <2 ; i++) {
//			Student student = new Student();
//			student.setPropessor(propessor1);
//			student.setAge(20+i);
//			student.setAddr("강남구 "+i);
//			student.setRegDate(new Date());
//			student.setName("모범생 " + i);
//		}
//		propessorRepo.save(propessor1);
//		
//		for(int i = 0 ; i <2 ; i++) {
//			Student student = new Student();
//			student.setPropessor(propessor2);
//			student.setAge(30+i);
//			student.setAddr("분당구 "+i);
//			student.setRegDate(new Date());
//			student.setName("양아치 " + i);
//		}
//		propessorRepo.save(propessor2);
//		
//		for(int i = 0 ; i <2 ; i++) {
//			Student student = new Student();
//			student.setPropessor(propessor3);
//			student.setAge(10+i);
//			student.setAddr("강서구 "+i);
//			student.setRegDate(new Date());
//			student.setName("체육인" + i);
//		}
//		propessorRepo.save(propessor3);
//		
//	}
	
	@Test
	public void testDelete() {
		propessorRepo.deleteById("propessor1");
	}
	
}
