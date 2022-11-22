package kr.kwangan2.jpatest.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.ToString;

@Data
@Entity
@ToString(exclude="propessor")
public class Student {
	
	@Id
	@GeneratedValue
	private Long sid;
	private String name;
	private Integer age;
	private String addr;
	private Date regDate;
	
	@ManyToOne
	@JoinColumn(name="PROFESSOR_ID", nullable = false)
	private Propessor propessor;
	
	public void setPropessor(Propessor propessor) {
		this.propessor = propessor;
		propessor.getStudentList().add(this);
	}
}
