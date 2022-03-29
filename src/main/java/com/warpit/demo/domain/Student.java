package com.warpit.demo.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")
public class Student {

	@Id
	@GeneratedValue
	private Integer Id;
	
		
	@Embedded
	private Person attendee;   
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn
	private QRCode qrCode;
	
	
	@OneToMany
	@JoinColumn
	private List<Course> courses = new ArrayList<>();


	public Student(Person attendee, QRCode qrCode) {
		super();
		this.attendee = attendee;
		this.qrCode = qrCode;
	}


	protected Student() {
		
	}


	public Integer getId() {
		return Id;
	}


	public void setId(Integer id) {
		Id = id;
	}


	public Person getAttendee() {
		return attendee;
	}


	public void setAttendee(Person attendee) {
		this.attendee = attendee;
	}


	public QRCode getQrCode() {
		return qrCode;
	}


	public void setQrCode(QRCode qrCode) {
		this.qrCode = qrCode;
	}


	public List<Course> getCourses() {
		return courses;
	}


	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + Id + ", attendee=" + attendee + ", qrCode=" + qrCode + ", courses="
				+ courses + "]";
	}
	
	
	
	
	
}
