package com.warpit.demo.repo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.warpit.demo.domain.Person;
import com.warpit.demo.domain.QRCode;
import com.warpit.demo.domain.Student;

@DataJpaTest
class QRCodeRepositoryTest {
	
	@Autowired
	private QRCodeRepository qrCodeRepository;
	
	@Autowired
	private StudentRepository studentRepository;

	@Test
	public void injectedComponentsAreNotNull(){
		  assertThat(qrCodeRepository).isNotNull();
	}
	
	@Test
	public void createQRCode() {
		QRCode qrCode = new QRCode("QAZWSX");
		qrCodeRepository.save(qrCode);
		assertThat(qrCodeRepository.findById(qrCode.getId())).hasValue(qrCode);
	}

	
	@Test
	public void findByQrCodeKey() {
		QRCode qrCode = new QRCode("QAZWSX");
		qrCodeRepository.save(qrCode);
		assertThat(qrCodeRepository.findByQrCodeKey("QAZWSX")).hasValue(qrCode);
	}
	
	@Test
	public void findQrCodeByStudentName() {
		QRCode qrCode = new QRCode("QAZWSX");
		qrCodeRepository.save(qrCode);
		Student student = new Student(new Person("Stefan","Alex"),qrCode);
		studentRepository.save(student);
		assertThat(qrCodeRepository.findByStudentAttendeeFirstName("Stefan")).hasValue(qrCode);
	}
	
}
