package com.warpit.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.warpit.demo.domain.Person;
import com.warpit.demo.domain.QRCode;
import com.warpit.demo.domain.Student;
import com.warpit.demo.repo.ClassroomRepository;
import com.warpit.demo.repo.CourseRepository;
import com.warpit.demo.repo.QRCodeRepository;
import com.warpit.demo.repo.StudentRepository;


@SpringBootApplication
public class SpringDemoApp implements CommandLineRunner {
	
	
	
	
	

	
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		//qrcodes
	//	QRCode qrCode1 = qrCodeRepository.saveAndFlush(new QRCode("QAZWSX"));
	//	QRCode qrCode2 = qrCodeRepository.saveAndFlush(new QRCode("QAZWSX123"));
	//	QRCode qrCode3 = qrCodeRepository.saveAndFlush(new QRCode("QAZWSX12345"));
		
	//	Student student1 = studentRepository.save(new Student(new Person("Stefan","Alex"), new QRCode("QAZWSX")));
	//	Student student2 = studentRepository.save(new Student(new Person("Stefania","Alex"), new QRCode("QAZWSX123")));
	//	Student student3 = studentRepository.save(new Student(new Person("Bogdan","Alex"), new QRCode("QAZWSX12345")));
	}


}
