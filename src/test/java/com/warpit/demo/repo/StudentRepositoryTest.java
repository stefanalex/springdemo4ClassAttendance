package com.warpit.demo.repo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.*;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.warpit.demo.domain.Person;
import com.warpit.demo.domain.QRCode;
import com.warpit.demo.domain.Student;

@DataJpaTest
class StudentRepositoryTest {

	@Autowired
	private QRCodeRepository qrCodeRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	

	@Test
	public void injectedComponentsAreNotNull(){
		  assertThat(qrCodeRepository).isNotNull();
		  assertThat(studentRepository).isNotNull();
	}
	
	@Test
	void createStudent() {
		QRCode qrCode = new QRCode("QAZWSX");
		qrCodeRepository.save(qrCode);
		Student student = new Student(new Person("Stefan","Alex"),qrCode);
		studentRepository.save(student);
		assertThat(studentRepository.findById(student.getId())).hasValue(student);
	}
	
	
	
	
}
