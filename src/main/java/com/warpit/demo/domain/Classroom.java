package com.warpit.demo.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="CLASSROOM")
public class Classroom {

	 @Id
	 @GeneratedValue
	 private Integer Id;
	 
	 @Column
	 private String name;
	 
	 
	 @Column
	 @NotNull
     private LocalDateTime startDateTime;

     @Column
     @NotNull
	 private LocalDateTime endDateTime;
	
	 @OneToOne(cascade=CascadeType.ALL)
	 @JoinColumn
	 private Course course;

	
	 @OneToMany(cascade=CascadeType.ALL)
	 @JoinColumn
	 private Set<QRCode> qrCodes = new HashSet<>();


	public Classroom(String name, Course course, Set<QRCode> qrCodes) {
		super();
		this.name = name;
		this.course = course;
		this.qrCodes = qrCodes;
	}
	
	
	
	
	 
	 public Classroom(String name, @NotNull LocalDateTime startDateTime, @NotNull LocalDateTime endDateTime,
			Course course, Set<QRCode> qrCodes) {
		super();
		this.name = name;
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
		this.course = course;
		this.qrCodes = qrCodes;
	}





	protected Classroom() {
		 
	 }



	public Integer getClassroomID() {
		return Id;
	}



	public void setClassroomID(Integer classroomID) {
		this.Id = classroomID;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Course getCourse() {
		return course;
	}



	public void setCourse(Course course) {
		this.course = course;
	}



	public Set<QRCode> getQrCodes() {
		return qrCodes;
	}



	public void setQrCodes(Set<QRCode> qrCodes) {
		this.qrCodes = qrCodes;
	}





	public Integer getId() {
		return Id;
	}





	public void setId(Integer id) {
		Id = id;
	}





	public LocalDateTime getStartDateTime() {
		return startDateTime;
	}





	public void setStartDateTime(LocalDateTime startDateTime) {
		this.startDateTime = startDateTime;
	}





	public LocalDateTime getEndDateTime() {
		return endDateTime;
	}





	public void setEndDateTime(LocalDateTime endDateTime) {
		this.endDateTime = endDateTime;
	}





	@Override
	public String toString() {
		return "Classroom [Id=" + Id + ", name=" + name + ", startDateTime=" + startDateTime + ", endDateTime="
				+ endDateTime + ", course=" + course + ", qrCodes=" + qrCodes + "]";
	}



	
	 
	 
}
