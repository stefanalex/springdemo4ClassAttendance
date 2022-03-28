package com.warpit.demo.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name="QRCODE")
public class QRCode {

	@Id
	@GeneratedValue
	private Integer Id;
	
	@Column
	private String qrCodeKey;   //unique
		
	@OneToOne(cascade = CascadeType.ALL,mappedBy ="qrCode" )
	private Student student;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Classroom classroom;


	public QRCode(String qrCodeKey) {
		super();
		this.qrCodeKey = qrCodeKey;
	}
	
	
	
	protected QRCode() {
		
	}



	public Integer getQrCodeId() {
		return Id;
	}



	public void setQrCodeId(Integer qrCodeId) {
		this.Id = qrCodeId;
	}



	public String getQrCodeKey() {
		return qrCodeKey;
	}



	public void setQrCodeKey(String qrCodeKey) {
		this.qrCodeKey = qrCodeKey;
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
		return "QRCode [qrCodeId=" + Id + ", qrCodeKey=" + qrCodeKey + ", student=" + student + ", classroom="
				+ classroom + "]";
	}
	
	
	
}
