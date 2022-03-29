package com.warpit.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warpit.demo.domain.Course;
import com.warpit.demo.domain.Person;
import com.warpit.demo.domain.QRCode;
import com.warpit.demo.domain.Student;
import com.warpit.demo.exceptions.CourseNotFoundException;
import com.warpit.demo.exceptions.QRCodeNotRegisterException;
import com.warpit.demo.exceptions.StudentNotFoundException;
import com.warpit.demo.repo.CourseRepository;
import com.warpit.demo.repo.QRCodeRepository;
import com.warpit.demo.repo.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private QRCodeRepository qrCodeRepository;
	
	@Autowired
	private CourseRepository courseRepository;
	
	
	public Student createStudent(String firstName , String  lastName,String qrCodeKey) {
		
		QRCode qrCode = qrCodeRepository.findByQrCodeKey(qrCodeKey).orElseThrow(()-> new QRCodeNotRegisterException("QRCode not register: " + qrCodeKey));
		Student student = new Student(new Person(firstName, lastName), qrCode);
		return studentRepository.save(student);
	}
	
	
      public Student findStudentByFirstName(String firstName) {
		
    	 return  studentRepository.findByAttendeeFirstName(firstName).orElseThrow(()-> new StudentNotFoundException("Student not found: " + firstName));
		
      }
      
      public List<Student> findAllStudentsForCourse(String courseName) {
  		
     	 return  studentRepository.findAllByCourseName(courseName);
 		
       }
	
}
