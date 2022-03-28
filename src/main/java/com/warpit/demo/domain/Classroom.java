package com.warpit.demo.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="CLASSROOM")
public class Classroom {

	 @Id
	 @GeneratedValue
	 private Integer Id;
	 
	 @Column
	 private String name;
	 
	
	 @OneToOne(cascade=CascadeType.ALL)
	 @JoinColumn
	 private Course course;

	
	 @OneToMany(cascade=CascadeType.ALL)
	 @JoinColumn
	 private List<QRCode> qrCodes = new ArrayList<>();


	public Classroom(String name, Course course, List<QRCode> qrCodes) {
		super();
		this.name = name;
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



	public List<QRCode> getQrCodes() {
		return qrCodes;
	}



	public void setQrCodes(List<QRCode> qrCodes) {
		this.qrCodes = qrCodes;
	}



	@Override
	public String toString() {
		return "Classroom [classroomID=" + Id + ", name=" + name + ", course=" + course + ", qrCodes="
				+ qrCodes + "]";
	}
	
	 
	 
}
