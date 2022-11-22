package kr.kwangan2.jpatest.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.ToString;

@Data
@Entity
@ToString(exclude="studentList")
public class Propessor {
	
	@Id
	@Column(name="PROPESSOR_ID", nullable = false)
	private String id;
	private String name;
	
	@OneToMany(mappedBy = "propessor", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Student> studentList = new ArrayList<Student>();
	
}
