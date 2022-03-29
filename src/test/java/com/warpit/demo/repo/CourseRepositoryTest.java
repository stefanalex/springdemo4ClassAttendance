package com.warpit.demo.repo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.warpit.demo.domain.Course;
import com.warpit.demo.domain.Person;
import com.warpit.demo.domain.QRCode;
import com.warpit.demo.domain.Student;

@DataJpaTest
class CourseRepositoryTest {

	@Autowired
	private QRCodeRepository qrCodeRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private CourseRepository courseRepository;
	

	@Test
	public void injectedComponentsAreNotNull(){
		  assertThat(qrCodeRepository).isNotNull();
		  assertThat(studentRepository).isNotNull();
		  assertThat(courseRepository).isNotNull();
	}
	
	
	@Test
	void createCourse() {
		Course course = new Course("Mathematics");
		courseRepository.save(course);
		assertThat(courseRepository.findById(course.getId())).hasValue(course);
	}
	
	@Test
	void findByName() {
		Course course = new Course("Mathematics");
		courseRepository.save(course);
		assertThat(courseRepository.findByName("Mathematics")).hasValue(course);
	}
	
	@Test
	void findByStudentAttendeeFirstName() {
		
		QRCode qrCode = new QRCode("QAZWSX");
		qrCodeRepository.save(qrCode);
		Student student = new Student(new Person("Stefan","Alex"),qrCode);
		studentRepository.save(student);
		
		Course course = new Course("Mathematics",student);
		courseRepository.save(course);
		assertThat(courseRepository.findByStudentAttendeeFirstName("Stefan")).hasValue(course);
	}

}
