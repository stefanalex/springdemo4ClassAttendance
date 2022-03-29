package com.warpit.demo.domain;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

/**
 * Courses / activities
 *
 */

@Entity
@Table(name="COURSE")
public class Course {

	 @Id
	 @GeneratedValue
	 private Integer Id;
	 
	 @Column
	 @NotNull
	 private String name;
	 
	 
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn
	@NotFound(action=NotFoundAction.IGNORE)
	private Student student;

	 
	 @OneToOne(cascade = CascadeType.ALL,mappedBy ="course" )
	 private Classroom classroom;


	public Course(@NotNull String name,	Student student, Classroom classroom) {
		super();
		this.name = name;
		this.student = student;
		this.classroom = classroom;
	}
	


	 protected Course() {
		 
	 }



	public Integer getId() {
		return Id;
	}



	public void setId(Integer id) {
		this.Id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}




	public Student getStudent() {
		return student;
	}



	public void setStudent(Student student) {
		this.student = student;
	}



	public Classroom getClassroom() {
		return classroom;
	}



	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}



	@Override
	public String toString() {
		return "Course [Id=" + Id + ", name=" + name + ", student=" + student + ", classroom=" + classroom + "]";
	}



	
	
	 
	
	
}
