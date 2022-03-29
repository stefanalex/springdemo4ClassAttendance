package com.warpit.demo.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.warpit.demo.exceptions.QRCodeNotRegisterException;

@SpringBootTest
class StudentServiceTest {
	
	@Autowired
	private StudentService studentService;
	
	@Test
	public void injectedComponentsAreNotNull(){
		  assertThat(studentService).isNotNull();
	}

	@Test
	void createStudentWithoutQR() {
		
		assertThatExceptionOfType(QRCodeNotRegisterException.class)
                                 .isThrownBy(()-> studentService.createStudent("Stefan","Alex","XXX"));
		
	}

}
