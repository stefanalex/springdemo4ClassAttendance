package com.warpit.demo.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.warpit.demo.domain.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

	Optional<Student> findByAttendeeFirstName(String firsName);
	
	List<Student> findAllByCourseName(String courseName);
}
