package com.warpit.demo.repo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.warpit.demo.domain.Course;
import com.warpit.demo.domain.Person;
import com.warpit.demo.domain.QRCode;
import com.warpit.demo.domain.Student;

@DataJpaTest
class StudentRepositoryTest {

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
	}
	
	@Test
	void createStudent() {
		QRCode qrCode = new QRCode("QAZWSX");
		qrCodeRepository.save(qrCode);
		Student student = new Student(new Person("Stefan","Alex"),qrCode);
		studentRepository.save(student);
		assertThat(studentRepository.findById(student.getId())).hasValue(student);
	}
	
	
	@Test
	void createStudentWithCourses() {
		
		Course course = new Course("Mathematics");
		courseRepository.save(course);
		
	
		QRCode qrCode1 = new QRCode("QAZWSX");
		qrCodeRepository.save(qrCode1);
		Student student1 = new Student(new Person("Stefan","Alex"),qrCode1);
		student1.setCourses(Arrays.asList(course));
		studentRepository.save(student1);
		
		
		QRCode qrCode2 = new QRCode("QAZWSX1234");
		qrCodeRepository.save(qrCode2);
		Student student2 = new Student(new Person("Stefan","Alex"),qrCode2);
		
		student2.setCourses(Arrays.asList(course));
		
		studentRepository.save(student2);
		
		assertThat(studentRepository.findAllByCourseName(course.getName()).size()).isEqualTo(2);
	}
	
	
}
